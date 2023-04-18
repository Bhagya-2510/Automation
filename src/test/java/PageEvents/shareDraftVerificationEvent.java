package PageEvents;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import Locators.commonElements;
import Locators.shareDraftVerificationElements;
import utils.CommonUtilityMethods;
import utils.DriverFactory;


public class shareDraftVerificationEvent {

	public static shareDraftVerificationElements element()
	{
		return new shareDraftVerificationElements(DriverFactory.getDriver());
	}
	
	public static commonElements commonElement()
	{
		return new commonElements(DriverFactory.getDriver());
	}
	
	
	public static void ShareDraftVerication() 
	{
		commonElement().searchbarr.sendKeys("MDMC2001062");	
		CommonUtilityMethods.waitForFewSeconds(5);
		CommonUtilityMethods.clickAnElementUsingJs(commonElement().edit);
		CommonUtilityMethods.waitForFewSeconds(10);
		CommonUtilityMethods.clickAnElementUsingJs(element().transactionParticipants);
		CommonUtilityMethods.waitForFewSeconds(2);
		String parentWindow;
		parentWindow = DriverFactory.getDriver().getWindowHandle();

		if(element().add.isDisplayed())
		{
			System.out.println("directly clicking on add");
			CommonUtilityMethods.clickAnElementUsingJs(element().add);
			CommonUtilityMethods.switchToChildWindow(parentWindow);
			System.out.println("switched to child window");
			String header = element().childWindowHeader.getText();
			String header1= "Add Owner 1 Information";
			Assert.assertEquals(header, header1);
			System.out.println("success");
			CommonUtilityMethods.webDriverWait(12);
			element().ownerName.sendKeys("Bhagyasri");
			element().ownerEmail.sendKeys("bhagyasri.kurmadasu@3pillarglobal.com");
			element().ownerPhoneNumber.sendKeys("7661874769");
			CommonUtilityMethods.waitForFewSeconds(3);
			CommonUtilityMethods.clickAnElementUsingJs(element().save);
			CommonUtilityMethods.waitForFewSeconds(3);
		}
		
		
		
		else if(element().delete.isDisplayed())
			{
				CommonUtilityMethods.clickAnElementUsingJs(element().delete);
				CommonUtilityMethods.waitForFewSeconds(3);
				CommonUtilityMethods.clickAnElementUsingJs(element().yes);
				CommonUtilityMethods.waitForFewSeconds(3);
				CommonUtilityMethods.clickAnElementUsingJs(element().add);
				CommonUtilityMethods.waitForFewSeconds(3);
				element().ownerName.sendKeys("Bhagyasri");
				element().ownerEmail.sendKeys("bhagyasri.kurmadasu25@gmail.com");
				element().ownerPhoneNumber.sendKeys("7661874769");
				CommonUtilityMethods.waitForFewSeconds(3);
				CommonUtilityMethods.clickAnElementUsingJs(element().save);
				CommonUtilityMethods.waitForFewSeconds(3);
				
			}
			else
			{
				System.out.println("abcd");
			}
		
//		CommonUtilityMethods.clickAnElementUsingJs(element().listingOptions);
//		CommonUtilityMethods.waitForFewSeconds(3);
//		CommonUtilityMethods.clickAnElementUsingJs(element().shareDraft);
//		CommonUtilityMethods.waitForFewSeconds(3);
//		CommonUtilityMethods.clickAnElementUsingJs(element().checkbox);
//		CommonUtilityMethods.waitForFewSeconds(3);
//		String msg =element().successmsg.getText();
		
	}
	
}
