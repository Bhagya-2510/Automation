package PageEvents;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;

import Locators.AddPhotoElements;
import Locators.CopyPageElements;
import Locators.commonElements;
import utils.CommonUtilityMethods;
import utils.DriverFactory;

public class AddPhotoEvent {

	public static AddPhotoElements element()
	{
		return new AddPhotoElements(DriverFactory.getDriver());
	}
	
	public static commonElements commonElement() {
		return new commonElements(DriverFactory.getDriver());
	}
	public static void clickManagePhotos() throws InterruptedException {
	
	commonElement().searchbarr.sendKeys("MDMC2000996");	
	Thread.sleep(4000);
	CommonUtilityMethods.clickAnElementUsingJs(commonElement().edit);
	CommonUtilityMethods.waitForFewSeconds(8);
	CommonUtilityMethods.clickAnElementUsingJs(element().photosAndTour);
    WebElement shadowDom = AddPhotoElements.getShadowDom(commonElement().shadowHostManagePhotos,DriverFactory.getDriver());
    shadowDom.findElement(By.id("add_photo_button_image_gallery_id")).click();
    System.out.println("successfully clicked the manage photos button");
    CommonUtilityMethods.waitForFewSeconds(8);
    WebElement addPhotos = AddPhotoElements.getShadowDom(commonElement().shadowHostAddPhotos,DriverFactory.getDriver());
    addPhotos.findElement(By.id("add_photo_button_top_id")).click();
    System.out.println("successfully add photos button clicked");
    CommonUtilityMethods.waitForFewSeconds(8);
    addPhotos.findElement(By.id("unique_id_notice_dialog_actions_accept")).click();    
    System.out.println("successfully clicked accept button");
    CommonUtilityMethods.waitForFewSeconds(8);
    addPhotos.findElement(By.cssSelector("div:nth-child(1) > button:nth-child(1) > img")).click();
    CommonUtilityMethods.waitForFewSeconds(15);
    System.out.println("successfully clicked computer button ");
    addPhotos.findElement(By.cssSelector("div.media-manager-web-component-add-edit-jss14 > button")).click();
    CommonUtilityMethods.waitForFewSeconds(10);
    CommonUtilityMethods.clickAnElementUsingJs(commonElement().clicklistingOptionss);
    CommonUtilityMethods.clickAnElementUsingJs(commonElement().clickPreviewDraft);
    String parentWindow;
	parentWindow = DriverFactory.getDriver().getWindowHandle();
    CommonUtilityMethods.switchToChildWindow(parentWindow);
    String Title =  DriverFactory.getDriver().getTitle();
    System.out.print("the title of validation report is : " + Title + '\n' );
    CommonUtilityMethods.waitForFewSeconds(14);
    CommonUtilityMethods.waitUntilElementIsVisible(element().lastSaved,10);
    String lastSaved = element().lastSaved.getText();
    System.out.println("last saved date \n" + lastSaved );
    DriverFactory.getDriver().switchTo().window(parentWindow);
    CommonUtilityMethods.waitForFewSeconds(10);
    String Title1 =  DriverFactory.getDriver().getTitle();
    System.out.print("the title of validation report is : " + Title1 + '\n' );
    }	
}
