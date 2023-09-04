package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvancedSearch_Elements {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='_nkw']") public WebElement searchKeyword;
	
	@FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeKeyword;
	
	@FindBy(xpath = "//input[@name=\"_udlo\"]") public WebElement minValue;
	
	@FindBy(xpath = "//input[@name=\"_udhi\"]") public WebElement maxValue;
	
	@FindBy(xpath = "//div[@class='adv-form__actions']//button[@type='submit'][normalize-space()='Search']") 
	public WebElement submitBtn;
	
	public EbayAdvancedSearch_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

}
