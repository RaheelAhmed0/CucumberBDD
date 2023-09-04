package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome_Elements {
	
	WebDriver driver;

	
	@FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']") public WebElement cartLink;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']") public WebElement searchBar;
	
	@FindBy(xpath = "//div[@class=\"nav-right\"]") public WebElement searchBtn;
	
	@FindBy(xpath = "//h1[@class=\"a-size-base s-desktop-toolbar a-text-normal\"]/div/div[1]/div/div") 
	public WebElement searchNumber;
		
	public AmazonHome_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
