package Locators;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditElements {

	public EditElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="(//span[contains(text(),'Ground Rent')])[1]")
	public WebElement grounRent;
	
	@FindBy(xpath="(//input[@class='x-form-cb-input'])[4]")
	public WebElement groundRentExists;
	
	@FindBy(xpath="(//input[@role='spinbutton'])[3]")
	public WebElement groundYearTextField;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	public WebElement save;
	
	@FindBy(xpath="//span[contains(text(),'Publish Changes')]")
	public WebElement publishChanges;
	
	@FindBy(xpath="(//span[contains(text(),'Publish')])[2]")
	public WebElement publish;
	
	@FindBy(xpath="//span[contains(text(),'Close')]")
	public WebElement close;
	
	
}
