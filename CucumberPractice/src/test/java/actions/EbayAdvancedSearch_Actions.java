package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayAdvancedSearch_Elements;
import steps.Common_Steps;

public class EbayAdvancedSearch_Actions {
	
	private WebDriver driver;
	EbayAdvancedSearch_Elements ebayadvancedsearch_elements;
	
	public EbayAdvancedSearch_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		ebayadvancedsearch_elements = new EbayAdvancedSearch_Elements(driver);
	}
	
	public void enterSearchString(String string) {
		ebayadvancedsearch_elements.searchKeyword.sendKeys(string);;
	}
	
	public void enterExcludeString(String string) {
		ebayadvancedsearch_elements.excludeKeyword.sendKeys(string);
	}
	
	public void enterMinPrice(String string) {
		ebayadvancedsearch_elements.minValue.sendKeys(string);
	}
	
	public void enterMaxPrice(String string) {
		ebayadvancedsearch_elements.maxValue.sendKeys(string);
	}
	
	public void clickSearchBtn() {
		ebayadvancedsearch_elements.submitBtn.click();	}

}
