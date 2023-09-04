package steps;

import org.junit.Assert;
import actions.AmazonHome_Actions;
import actions.Common_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonHome_Steps {
	
	Common_Actions common_actions;
	AmazonHome_Actions amazonhome_actions;
	
	public AmazonHome_Steps(Common_Actions common_actions, AmazonHome_Actions amazonhome_actions) {
		this.common_actions = common_actions;
		this.amazonhome_actions = amazonhome_actions;
	}
	
	@Given("I am on Amazon Home Page")
	public void i_am_on_amazon_home_page() {
		
		//driver.get("https://www.amazon.in/");
		common_actions.goToUrl("https://www.amazon.in/");
	}

	@When("I click on Cart Navigation Link")
	public void i_click_on_cart_navigation_link() {
		//driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		amazonhome_actions.clickOnCartLink();
	}

	@Then("I navigate to Cart Page")
	public void i_navigate_to_cart_page() {
		String expUrl = "https://www.amazon.in/gp/cart/view.html?ref_=nav_cart";
		//String actUrl = driver.getCurrentUrl();
		String actUrl = common_actions.getCurrentPageUrl();
		if(!expUrl.equals(actUrl)) {
			Assert.fail("URL mismatch");
		}
		//driver.quit();
		common_actions.quitDriver();
		}
	
	@When("I search for {string}")
	public void i_search_for_i_phone14(String str) {
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(str);
		//driver.findElement(By.xpath("//div[@class=\"nav-right\"]")).click();
		amazonhome_actions.searchString(str);
	}

	@Then("I validate that at least {int} results are present")
	public void i_validate_that_at_least_results_are_present(int count) {
		
		//String txt = driver.findElement(By.xpath("//h1[@class=\"a-size-base s-desktop-toolbar a-text-normal\"]/div/div[1]/div/div"))
		//		.getText();
		String txt = amazonhome_actions.resultNum();
				
		Common_Steps number = new Common_Steps();
		
		if(number.retInt(txt) < count) {
			Assert.fail("Not more");
		}
		//driver.quit();
		common_actions.quitDriver();
	}
	
	@When("I click on {string}")
	public void i_click_on(String link) {
		
		//driver.findElement(By.linkText(link)).click();
		amazonhome_actions.clickOnLinkByText(link);
	}

	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
		
		//String actUrl = driver.getCurrentUrl();
		//String actTitle = driver.getTitle();
		String actUrl = common_actions.getCurrentPageUrl();
		String actTitle = common_actions.getCurrentPageTitle();
		
		if(!actUrl.equals(url)) {
			Assert.fail("Page doesn't navigate to correct URL");
		}
		if(!actTitle.contains(title)) {
			Assert.fail("Title doesn't contain "+ title);
		}
	}


}
