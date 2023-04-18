package PageEvents;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import Locators.LoginPageElements;


import java.io.IOException;

import org.json.*;
import utils.CommonUtilityMethods;
import utils.DriverFactory;
import utils.JsonManager;

public class LoginPageEvents {
	private static JSONObject data;
	public static LoginPageElements element()
	{
		return new LoginPageElements(DriverFactory.getDriver());
	}
	
	public static void LoginInToPortal() throws InterruptedException, IOException, ParseException
	{
		Thread.sleep(2000);
		element().username.sendKeys("4567216");
		element().password.sendKeys("Dev112233!!");
//		data = JsonManager.fetchData("jsonPath", "validCredentialsForDev");
//		CommonUtilityMethods.waitUntilElementIsVisible(element().username);
//		CommonUtilityMethods.sendKeysJson(element().username, data.get("username"));
//		CommonUtilityMethods.waitUntilElementIsVisible(element().password);
//		CommonUtilityMethods.sendKeysJson(element().password, data.get("password"));
		CommonUtilityMethods.clickAnElementUsingJs(element().logIN);
		CommonUtilityMethods.waitUntilElementIsVisible(element().closepopup,44);
		CommonUtilityMethods.clickAnElementUsingJs(element().closepopup);
	}
	
}
