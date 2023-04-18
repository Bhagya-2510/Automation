package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {


	public LoginPageElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id= 'password']")
	public WebElement password;
	
	@FindBy(xpath = "//span[text()= 'LOG IN']")
	public WebElement logIN;
	
	@FindBy(className = "wait")
	public WebElement wait;
	
	@FindBy(xpath = "//button[@id='close-modal-btn']")
	public WebElement closepopup;
	
}
