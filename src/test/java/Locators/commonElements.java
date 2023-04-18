package Locators;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class commonElements {
	public commonElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(tagName = "app-web-component")
//	public WebElement shadowHost;
//	
	@FindBy(tagName = "media-manager-web-component")
	public WebElement shadowHostManagePhotos;
	
	@FindBy(id="mediaCenterManageMediaWebComponent")
	public WebElement shadowHostAddPhotos;
	
	@FindBy(xpath="//input[@placeholder='Search for recent listings by Address, ML#, Status, Agent Name or ID']")
	public WebElement searchbarr;
	
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	public WebElement edit;
	
	@FindBy(xpath="//span[contains(text(),'Listing Options')]")
	public WebElement clicklistingOptionss;
	
	@FindBy(xpath="//span[contains(text(),'Preview Draft')]")
	public WebElement clickPreviewDraft;
	
	@FindBy(id="reactWebComponent")
	public WebElement shadowRootResidentialProperty;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	public WebElement save;
	
	public static WebElement getShadowDom(WebElement element, WebDriver driver) {
		List<WebElement> eleList = (List<WebElement>) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot.children", element);
		return eleList.get(0);
    }
}
