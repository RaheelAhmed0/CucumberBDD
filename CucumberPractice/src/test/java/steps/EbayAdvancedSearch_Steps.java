package steps;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps {
	
	Common_Actions common_actions;
	EbayAdvancedSearch_Actions ebayadvancedsearch_actions;
	

	public EbayAdvancedSearch_Steps(Common_Actions common_actions, EbayAdvancedSearch_Actions ebayadvancedsearch_actions) {
		this.common_actions = common_actions;
		this.ebayadvancedsearch_actions = ebayadvancedsearch_actions;
	}
	
	@Given("I am on Ebay Advance search page")
	public void i_am_on_ebay_advance_search_page() {
		
		//driver.get("https://www.ebay.com/sch/ebayadvsearch");
		common_actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
		
		
	}
	@When("I advance search an item")
	public void i_advance_search_an_item(DataTable dataTable) {
		
		//driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1, 0));
		//driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
		//driver.findElement(By.xpath("//input[@name=\"_udlo\"]")).sendKeys(dataTable.cell(1, 2));
		//driver.findElement(By.xpath("//input[@name=\"_udhi\"]")).sendKeys(dataTable.cell(1, 3));
		
		ebayadvancedsearch_actions.enterSearchString(dataTable.cell(1, 0));
		ebayadvancedsearch_actions.enterExcludeString(dataTable.cell(1, 1));
		ebayadvancedsearch_actions.enterMinPrice(dataTable.cell(1, 2));
		ebayadvancedsearch_actions.enterMaxPrice(dataTable.cell(1, 3));
		
		//driver.findElement(By.xpath("//div[@class='adv-form__actions']//button[@type='submit'][normalize-space()='Search']")).click();
		ebayadvancedsearch_actions.clickSearchBtn();
	}

}
