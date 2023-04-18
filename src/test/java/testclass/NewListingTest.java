package testclass;

import java.io.IOException;
import org.testng.annotations.Test;
import org.json.simple.parser.ParseException;

import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import PageEvents.NewListingEvents;
import utils.CommonUtilityMethods;
import utils.MainClass;

public class NewListingTest extends MainClass{

	@Test

	public void NewListingTest() throws InterruptedException, IOException, ParseException
	{
		LoginPageEvents.LoginInToPortal();
		HomePageEvents.clickListingDropDown();
		CommonUtilityMethods.waitForFewSeconds(40);
		NewListingEvents.NewListing();
	}
	
	
}
