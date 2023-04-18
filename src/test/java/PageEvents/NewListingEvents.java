package PageEvents;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Locators.NewListingLocators;
import Locators.commonElements;
import utils.CommonUtilityMethods;
import utils.DriverFactory;

public class NewListingEvents {

	public static NewListingLocators ele()
	{
		return new NewListingLocators(DriverFactory.getDriver());
	}
	
	public static commonElements commonElement()
	{
		return new commonElements(DriverFactory.getDriver());	
	}
	
	public static void NewListing()
	{
	CommonUtilityMethods.clickAnElementUsingJs(ele().newListingButton);
	CommonUtilityMethods.waitForFewSeconds(4);
	WebElement residential = commonElements.getShadowDom(commonElement().shadowRootResidentialProperty, DriverFactory.getDriver());
	residential.findElement(By.cssSelector("div.MuiBox-root.jss23.content > h3")).click();
	System.out.println("successfully clicked the residential property");
	residential.findElement(By.cssSelector("div.MuiGrid-root.jss14.MuiGrid-container > a > button > span")).click();
	CommonUtilityMethods.waitForFewSeconds(5);
	residential.findElement(By.cssSelector("#addressSearch")).sendKeys("avenue");
	CommonUtilityMethods.waitForFewSeconds(10);
	residential.findElement(By.cssSelector("#addressSearch-option-0")).click();
	CommonUtilityMethods.waitForFewSeconds(5);
	residential.findElement(By.cssSelector("#record_0_Checkbox_id")).click();
	CommonUtilityMethods.waitForFewSeconds(5);
	residential.findElement(By.id("laCsAddValuesToListing")).click();
	CommonUtilityMethods.waitForFewSeconds(20);
	residential.findElement(By.id("laCsAddValuesToListing")).click();
	CommonUtilityMethods.waitForFewSeconds(6);
	CommonUtilityMethods.clickAnElementUsingJs(ele().listingAgreement);
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.clickAnElementUsingJs(DriverFactory.getDriver().findElement(By.xpath("//span[text()='Status']")));
	CommonUtilityMethods.waitForFewSeconds(6);
	System.out.println("status dropdown is clicked");
	CommonUtilityMethods.clickAnElementUsingJs(DriverFactory.getDriver().findElement(By.xpath("(//div[@class='x-boundlist-item enabled'])[1]")));
	CommonUtilityMethods.waitForFewSeconds(6);
	System.out.println("active option is clicked");
	ele().listPrice.sendKeys("1234567");
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.clickAnElementUsingJs(DriverFactory.getDriver().findElement(By.xpath("//span[contains(text(),'Listing Agreement Type')]")));
	CommonUtilityMethods.waitForFewSeconds(3);
	System.out.println("listing agreement dropdown is clicked");
	CommonUtilityMethods.clickAnElementUsingJs(DriverFactory.getDriver().findElement(By.xpath("(//ul[@class=\"x-list-plain\"]/div[@data-recordindex=\"0\"])[2]")));
	System.out.println("listing agreement dropdown value got clicked");
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	Date date = new Date();  
	ele().listingTermBegins.sendKeys(formatter.format(date));
	ele().expirationDate.sendKeys("04-20-2028");	
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.clickAnElementUsingJs(commonElement().clicklistingOptionss);
	CommonUtilityMethods.clickAnElementUsingJs(commonElement().save);
	Actions act = new Actions(DriverFactory.getDriver());
	act.moveToElement(ele().ownershipInterest);
	act.perform();
	CommonUtilityMethods.waitForFewSeconds(6);
	ele().ownershipInterest.click();
	CommonUtilityMethods.waitForFewSeconds(4);
	CommonUtilityMethods.clickAnElementUsingJs(DriverFactory.getDriver().findElement(By.xpath("(//div[@class='x-boundlist-list-ct x-unselectable x-scroller']//div[contains(text(),'Other')])[1]")));
	CommonUtilityMethods.waitForFewSeconds(4);
	CommonUtilityMethods.scrollToAnElement(ele().ownershipInterest);
	CommonUtilityMethods.waitForFewSeconds(5);
	CommonUtilityMethods.clickAnElement(ele().shortsaleRadiobutton);
	System.out.println("short sale element is clicked");
	CommonUtilityMethods.clickAnElement(ele().ReoNo);
	CommonUtilityMethods.clickAnElement(ele().saleType);
	CommonUtilityMethods.clickAnElement(ele().saleTypeOption);
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.scrollToAnElement(ele().listingTerms);
	CommonUtilityMethods.clickAnElementUsingJs(ele().listingServiceType);
	CommonUtilityMethods.clickAnElementUsingJs(ele().listingServiceTypeOption);
	CommonUtilityMethods.clickAnElement(ele().dualAgencyNo);
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.scrollToAnElement(ele().otherEquipment);
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.clickAnElementUsingJs(ele().possesion);
	ele().possesionDropdown.click();
	System.out.println("successfully added the value in possession");
	CommonUtilityMethods.clickAnElement(commonElement().clicklistingOptionss);
	CommonUtilityMethods.clickAnElement(commonElement().save);
	CommonUtilityMethods.waitForFewSeconds(5);
	CommonUtilityMethods.clickAnElement(commonElement().clicklistingOptionss);
	CommonUtilityMethods.clickAnElement(commonElement().save);
	CommonUtilityMethods.clickAnElementUsingJs(ele().buyerAgencyCompensation);
	CommonUtilityMethods.clickAnElement(ele().buyerAgencyOption);
	ele().buyerAgencydollarField.sendKeys("123");
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.scrollToAnElement(ele().buyerAgencyCompensation);
	CommonUtilityMethods.clickAnElement(ele().subAgencyCompensation);
	CommonUtilityMethods.clickAnElement(ele().subAgencyCompensationOption);
	ele().SubAgencyCompensationdollarField.sendKeys("123");
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.clickAnElement(ele().transactionBrokerCompensation);
	ele().transactionBrokerCompensation.sendKeys(Keys.ARROW_DOWN);
	ele().transactionBrokerCompensation.sendKeys(Keys.ARROW_DOWN);
	ele().transactionBrokerCompensation.sendKeys(Keys.ENTER);
	ele().TransactionBrokerCompensationDollarField.sendKeys("123");
	CommonUtilityMethods.clickAnElement(ele().dualVariableCompensation);
	CommonUtilityMethods.clickAnElement(ele().location);
	ele().streetNumber.clear();
	ele().streetNumber.sendKeys("TEST @1");
	CommonUtilityMethods.scrollToAnElement(ele().streetDirectionSuffix);
	ele().directions.sendKeys("directions");
	CommonUtilityMethods.clickAnElement(ele().areasAndSchool);
	CommonUtilityMethods.waitForFewSeconds(4);
	ele().subDivision.click();
	ele().subDivision.sendKeys("APPENZELL ESTATES");
	CommonUtilityMethods.waitForFewSeconds(3);
	//ele().subDivision.sendKeys(Keys.ARROW_DOWN);
	ele().subDivision.sendKeys(Keys.ENTER);
	CommonUtilityMethods.waitForFewSeconds(4);
	CommonUtilityMethods.clickAnElement(ele().associationCommunity);
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().hoaNo.click();
	ele().condoCoopAssociation.click();
	CommonUtilityMethods.scrollToAnElement(ele().hoaCondoCoopAmenities);
	CommonUtilityMethods.clickAnElement(ele().seniorCommunity);
	CommonUtilityMethods.scrollToAnElement(ele().taxes);
	ele().taxAssessedValue.sendKeys("20000");
	CommonUtilityMethods.clickAnElement(ele().taxBill);
	CommonUtilityMethods.waitForFewSeconds(4);
	CommonUtilityMethods.scrollToAnElement(ele().municiaplTrashPayement);
	ele().taxYear.sendKeys("2020");
	ele().taxAnnualAmount.sendKeys("2000");
	CommonUtilityMethods.waitForFewSeconds(4);
	ele().buildingAndUtility.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	CommonUtilityMethods.clickAnElement(ele().newConstruction);
	ele().yearBuilt.sendKeys("2007");
	CommonUtilityMethods.waitForFewSeconds(4);
	ele().structureType.click();
	ele().structureTypeOption.click();
	CommonUtilityMethods.waitForFewSeconds(4);
	ele().style.click();
	CommonUtilityMethods.clickAnElement(ele().styleOption);
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.clickAnElement(commonElement().clicklistingOptionss);
	CommonUtilityMethods.clickAnElement(commonElement().save);
	CommonUtilityMethods.clickAnElement(ele().constructionMaterials);
	ele().constructionMaterialOption.click();
	CommonUtilityMethods.waitForFewSeconds(1);
	ele().constructionDetails.click();
	CommonUtilityMethods.waitForFewSeconds(3);
	CommonUtilityMethods.scrollToAnElement(ele().flooringType);
	CommonUtilityMethods.waitForFewSeconds(1);
	ele().levelsAndStories.sendKeys("1");
    ele().levelsAndStories.sendKeys(Keys.ENTER);
	CommonUtilityMethods.waitForFewSeconds(2);
	CommonUtilityMethods.clickAnElement(ele().utilities);
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().waterSource.click();
	ele().waterSourceOption.click();
	ele().utilities.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().sewerSeptic.click();
	ele().sewerSepticOption.click();
	ele().utilities.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	CommonUtilityMethods.scrollToAnElement(ele().electricService);
	CommonUtilityMethods.waitForFewSeconds(5);
	ele().hotWater.click();
	ele().hotWaterOption.click();
	 CommonUtilityMethods.waitForFewSeconds(2);
	ele().utilities.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().coolingType.click();
	ele().coolingTypeOption.click();
	ele().utilities.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().coolingFuel.click();
	ele().coolingFuelOption.click();
	ele().utilities.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().heatingType.click();
	ele().heatingTypeOption.click();
	ele().utilities.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().heatingFuel.click();
	ele().heatingFuelOption.click();
	ele().utilities.click();
	CommonUtilityMethods.waitForFewSeconds(3);
	ele().basementAndFoundation.click();
	CommonUtilityMethods.waitForFewSeconds(3);
	ele().basementAndFoundationRadio.click();
	ele().FoundationDetails.click();
	ele().FoundationDetailsOption.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().featuresAndRooms.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().bed.sendKeys("10");
	ele().baths.sendKeys("10");
	CommonUtilityMethods.waitForFewSeconds(1);
	ele().interiorFeatures.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	CommonUtilityMethods.clickAnElement(ele().assessbilityFeatures);
	ele().assessbilityFeaturesOption.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().exteriorFeatures.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().pool.click();
	ele().poolOption.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().lotAndParking.click();
	ele().parking.click();
	CommonUtilityMethods.waitForFewSeconds(4);
	ele().typeOfParking.click();
	ele().typeOfParkingOption.click();
	CommonUtilityMethods.waitForFewSeconds(4);
	ele().photosAndTour.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().photoOption.click();
	ele().listerUpload.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().showing.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().showingRequirements.click();
	ele().showingRequirementsOption.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().showingContctHeader.click();
	ele().showingMethod.click();
	ele().showingMethodOption.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().showingContctHeader.click();
	ele().showingContactType.click();
	ele().showingContactTypeOption.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().showingContctHeader.click();
	ele().showingContactName.sendKeys("Bhagya");
	ele().showingContactPhoneNumber.sendKeys("9876543210");
	CommonUtilityMethods.waitForFewSeconds(2);
	ele().lockBox.click();
	ele().lockBoxType.click();
	ele().lockBoxTypeOption.click();
	CommonUtilityMethods.waitForFewSeconds(2);
	CommonUtilityMethods.clickAnElement(commonElement().clicklistingOptionss);
	CommonUtilityMethods.clickAnElement(commonElement().save);
	
	
	
	
	
	
	
	}
}