package testclass;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import PageEvents.shareDraftVerificationEvent;
import utils.CommonUtilityMethods;
import utils.MainClass;

public class shareDraftVerificationTest extends MainClass{

	@Test
	public void shareDraftVerification() throws InterruptedException, IOException, ParseException
	{
		
		LoginPageEvents.LoginInToPortal();
		HomePageEvents.clickListingDropDown();
		CommonUtilityMethods.waitForFewSeconds(60);
		shareDraftVerificationEvent.ShareDraftVerication();
		
	}
	
}
