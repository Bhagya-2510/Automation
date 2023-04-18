package testclass;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import PageEvents.EditEvents;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import utils.MainClass;

public class EditTest extends MainClass{

	@Test
	public void editListing() throws InterruptedException, IOException, ParseException
	{
		LoginPageEvents.LoginInToPortal();
		HomePageEvents.clickListingDropDown();
		Thread.sleep(60000);
		EditEvents.editListingPage();
		
	}
	
	
	
}
