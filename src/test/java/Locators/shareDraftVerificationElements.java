package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shareDraftVerificationElements {

	public shareDraftVerificationElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//span[contains(text(),'Transaction Participants')])[1]")
	public WebElement transactionParticipants;
	
	@FindBy(xpath="//span[contains(text(),'Share Draft')]")
	public WebElement shareDraft;
	
	@FindBy(xpath="//span[contains(text(),'Listing Options')]")
	public WebElement listingOptions;
	
	@FindBy(xpath="//span[contains(text(),'DELETE')]")
	public WebElement delete;
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	public WebElement yes;
	
	@FindBy(xpath="//span[contains(text(),'ADD')]")
	public WebElement add;
	
	@FindBy(xpath="(//input[contains(@class,'edit-form-web-component_new_owners_details')])[1]")
	public WebElement ownerName;
	
	@FindBy(xpath="(//input[contains(@class,'edit-form-web-component_new_owners_details')])[2]")
	public WebElement ownerEmail;
	
	@FindBy(xpath="(//input[contains(@class,'edit-form-web-component_new_owners_details')])[3]")
	public WebElement ownerPhoneNumber;
	
	@FindBy(xpath="(//span[@class='edit-form-web-component_new_owners_details-MuiButton-label'])[2]")
	public WebElement save;
	
	@FindBy(xpath="//h2[@data-testid='modal-dialog-heading']")
	public WebElement childWindowHeader;
	
	@FindBy(xpath="(//span[@class='edit-form-web-component_share_draft-MuiIconButton-label'])[2]")
	public WebElement checkbox;
	
	@FindBy(xpath="(//div[contains(@class,'edit-form-web-component_share_draft-MuiGrid-root')])[3]")
	public WebElement successmsg;
}
