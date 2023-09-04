package steps;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Steps {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		
		//driver = new EdgeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		
		if(scenario.isFailed()) {
			final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr, "image/png", scenario.getName());
		}
		
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public int retInt(String txt) {
		txt = txt.replace(",", "");
		String[] txtSplit = txt.split(" ");
		int num = 0;
		for(int i = 0; i < txtSplit.length; i++) {
			try {
				num = Integer.parseInt(txtSplit[i]);
			}catch (NumberFormatException e) {
				continue;
			}
		} return num;
		
	}
}
