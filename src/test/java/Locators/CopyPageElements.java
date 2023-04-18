package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CopyPageElements {

	public CopyPageElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//	@FindBy(xpath = "//div[@data-ref='inputWrap']/input[@role='textbox']")
//	public WebElement searchbar;
//	
//	@FindBy(xpath="(//div[contains(text(),'Edit')])[1]")
//	public WebElement editt;
	
	
	@FindBy(xpath="//div[@class='x-component actionButton copyButton x-box-item x-component-default']")
	public WebElement copyListing;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	public WebElement continueButton;
	
	
}
