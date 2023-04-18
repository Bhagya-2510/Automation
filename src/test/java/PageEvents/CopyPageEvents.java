package PageEvents;

import Locators.CopyPageElements;

import Locators.commonElements;
import utils.CommonUtilityMethods;
import utils.DriverFactory;

public class CopyPageEvents {

	
	public static CopyPageElements element()
	{
		return new CopyPageElements(DriverFactory.getDriver());
		
	}
	
	public static commonElements commonElements()
	{
		return new commonElements(DriverFactory.getDriver());
	}
	
	public static void clickCopyandContinue() throws InterruptedException
	{
		commonElements().searchbarr.sendKeys("MDMC2000996");
		CommonUtilityMethods.waitForFewSeconds(3);
		element().copyListing.click();
		Thread.sleep(5000);
		element().continueButton.click();
		Thread.sleep(10000);
		
	}
	}
