package testclass;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import PageEvents.HomePageEvents;
import PageEvents.CopyPageEvents;
import PageEvents.LoginPageEvents;
import utils.CommonUtilityMethods;
import utils.MainClass;

public class CopyTest extends MainClass{

	@Test
    public void copyListing() throws InterruptedException, IOException, ParseException
	{
		LoginPageEvents.LoginInToPortal();
		System.out.print("finally logged in");
		HomePageEvents.clickListingDropDown();
		CommonUtilityMethods.waitForFewSeconds(43);
		CopyPageEvents.clickCopyandContinue();
		
		
		
		
		
	}
	
	
	
}
