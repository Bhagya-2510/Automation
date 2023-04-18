package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements
{
	public HomePageElements(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	
	
	@FindBy(xpath = "(//a[contains(text(),'Listings')])[1]")
	public WebElement listingDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Add & Edit Listings')]")
	public WebElement addEditListingOption;

}
