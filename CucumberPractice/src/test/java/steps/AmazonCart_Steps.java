package steps;

import org.junit.Assert;
import actions.AmazonCart_Actions;
import actions.Common_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonCart_Steps {
	
	Common_Actions common_actions;
	AmazonCart_Actions amazoncart_actions;
	
	public AmazonCart_Steps(Common_Actions common_actions, AmazonCart_Actions amazoncart_actions) {
		this.common_actions = common_actions;
		this.amazoncart_actions = amazoncart_actions;
	}
	
	@Given("I am Amazon Cart Page")
	public void i_am_amazon_cart_page() {
		
		//driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		common_actions.goToUrl("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
	}

	@When("I click on Amazon Logo")
	public void i_click_on_amazon_logo() throws InterruptedException {
		
		//driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		amazoncart_actions.clickOnAmazonLogo();

	}

	@Then("I am navigated to Amazon Home Page")
	public void i_am_navigated_to_amazon_home_page() {
		
		String expUrl = "https://www.amazon.in/ref=nav_logo";
		//String actUrl = driver.getCurrentUrl();
		String actUrl = common_actions.getCurrentPageUrl();
		
		if (!expUrl.equals(actUrl)) {
			Assert.fail("URL mismatch");
		}
		
		common_actions.quitDriver();
		
	}


}
