package testclass;

import java.io.IOException;


import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import PageEvents.AddPhotoEvent;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import utils.CommonUtilityMethods;
import utils.MainClass;

public class AddPhotoTest extends MainClass
{
	
	@Test
	public void managePhotos() throws InterruptedException, IOException, ParseException
	{
	LoginPageEvents.LoginInToPortal();
	HomePageEvents.clickListingDropDown();
	CommonUtilityMethods.waitForFewSeconds(60);
	AddPhotoEvent.clickManagePhotos();
}
}