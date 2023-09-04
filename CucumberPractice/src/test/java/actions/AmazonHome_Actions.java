package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elements.AmazonHome_Elements;
import steps.Common_Steps;

public class AmazonHome_Actions {
	
	private WebDriver driver;
	AmazonHome_Elements amazonhome_elements;
	
	public AmazonHome_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		amazonhome_elements = new AmazonHome_Elements(driver);
	}
	
	public void clickOnCartLink() {
		amazonhome_elements.cartLink.click();
	}
	
	public void searchString(String string) {
		amazonhome_elements.searchBar.sendKeys(string);
		amazonhome_elements.searchBtn.click();
	}
	
	public String resultNum() {
		return amazonhome_elements.searchNumber.getText();
	}
	
	public void clickOnLinkByText(String string) {
		driver.findElement(By.linkText(string)).click();
	}

}
