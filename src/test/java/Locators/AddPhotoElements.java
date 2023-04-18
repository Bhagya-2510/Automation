package Locators;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverFactory;



public class AddPhotoElements {
	public AddPhotoElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	
	@FindBy(xpath = "//span[contains(text(),'Photos & Tours')]")
	public WebElement photosAndTour;
	
	@FindBy(tagName = "media-manager-web-component")
	public WebElement shadowHost;
	
//	public static WebElement getShadowDom(WebElement element, WebDriver driver) {
//        JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getDriver();
//        WebElement shadowDom = (WebElement) executor.executeScript("return arguments[0].shadowRoot", element);
//        return shadowDom;
//    }
	
	public static WebElement getShadowDom(WebElement element, WebDriver driver) {
		List<WebElement> eleList = (List<WebElement>) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot.children", element);
		return eleList.get(0);
    }
	
	
	@FindBy(xpath="//div[@class='listing-preview-web-component-jss14']")
	public WebElement lastSaved;
	
	
	
//	
//	JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
//    WebElement addPhoto =(WebElement) jse.executeScript("return document.querySelector('media-manager-web-component').shadowRoot.querySelector('div > div > button > span')");
	//WebElement addPhoto =(WebElement) jse.executeScript("return document.querySelector('mediaCenterInlineDisplayWebComponent").shadowRoot.querySelector("add_photo_button_image_gallery_id > span")");"
  
   // ((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();" , addPhoto);

	
	
	
	
	
}
