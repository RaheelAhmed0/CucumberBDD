package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCart_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@id='nav-logo-sprites']") public WebElement amazonLogo;
	
	public AmazonCart_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	

}
