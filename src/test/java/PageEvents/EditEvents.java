package PageEvents;

import org.testng.Assert;


import Locators.EditElements;
import Locators.commonElements;
import utils.CommonUtilityMethods;
import utils.DriverFactory;

public class EditEvents {

	public static EditElements element()
	{
		return new EditElements(DriverFactory.getDriver());
	}
	public static commonElements commonElement() {
		return new commonElements(DriverFactory.getDriver());
	}
	
	public static void editListingPage() throws InterruptedException
	{
	//element().searchbarr.sendKeys("MDMC2000936");	MDMC2000900
	commonElement().searchbarr.sendKeys("MDMC2000996");
	CommonUtilityMethods.waitForFewSeconds(4);
	CommonUtilityMethods.clickAnElementUsingJs(commonElement().edit);
	CommonUtilityMethods.waitForFewSeconds(9);
	CommonUtilityMethods.clickAnElementUsingJs(element().grounRent);
	CommonUtilityMethods.waitForFewSeconds(6);
    element().groundRentExists.click();
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.clear(element().groundYearTextField);
	System.out.println("data cleared");
	CommonUtilityMethods.waitForFewSeconds(2);
    element().groundYearTextField.sendKeys("999");
    CommonUtilityMethods.waitForFewSeconds(4);
    System.out.println("passed values");
	CommonUtilityMethods.clickAnElementUsingJs(commonElement().clicklistingOptionss);
	System.out.println("clicklistingOptionss");
	CommonUtilityMethods.clickAnElementUsingJs(element().save);
	System.out.println("Successfully saved");
	CommonUtilityMethods.waitForFewSeconds(2);
	String text = element().groundYearTextField.getAttribute("value");
	System.out.println("the value is " + text);
	CommonUtilityMethods.waitForFewSeconds(2);
	DriverFactory.getDriver().navigate().back();
	System.out.println("navigated back to listing page");
	CommonUtilityMethods.waitForFewSeconds(4);
	CommonUtilityMethods.clickAnElementUsingJs(element().publishChanges);
	CommonUtilityMethods.waitForFewSeconds(6);
	CommonUtilityMethods.clickAnElementUsingJs(element().publish);
	CommonUtilityMethods.waitForFewSeconds(14);
	CommonUtilityMethods.clickAnElementUsingJs(element().close);
	CommonUtilityMethods.waitForFewSeconds(4);
	CommonUtilityMethods.clickAnElementUsingJs(commonElement().edit);
	CommonUtilityMethods.waitForFewSeconds(6);
	CommonUtilityMethods.clickAnElementUsingJs(element().grounRent);
	CommonUtilityMethods.waitForFewSeconds(3);
	String text1 = element().groundYearTextField.getAttribute("value");
	System.out.println("the value of the groundyear after reopening the listing is " + text1);
	Assert.assertEquals(text1,text); 
	
	}

	
}
