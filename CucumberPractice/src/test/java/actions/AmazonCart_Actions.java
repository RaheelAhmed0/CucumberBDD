package actions;

import org.openqa.selenium.WebDriver;

import elements.AmazonCart_Elements;
import steps.Common_Steps;

public class AmazonCart_Actions {
	
	private WebDriver driver;
	AmazonCart_Elements amazoncart_elements;
	
	
	public AmazonCart_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		amazoncart_elements = new AmazonCart_Elements(driver);
	}
	
	public void clickOnAmazonLogo() {
		amazoncart_elements.amazonLogo.click();
	}
	

}
