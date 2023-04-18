package PageEvents;

import Locators.HomePageElements;
import utils.CommonUtilityMethods;
import utils.DriverFactory;

public class HomePageEvents {

	public static HomePageElements element()
	{
		return new HomePageElements(DriverFactory.getDriver());
	}
	
	
	public static void clickListingDropDown() throws InterruptedException
	{
		CommonUtilityMethods.waitUntilElementIsVisible(element().listingDropDown,10);
		CommonUtilityMethods.waitForFewSeconds(6);
		element().listingDropDown.click();
		CommonUtilityMethods.waitForFewSeconds(6);
		element().addEditListingOption.click();
		
	}
	
}
