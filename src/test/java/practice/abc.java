package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class abc {
	public static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://login.dev.brightmls.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("4566877");
		WebElement password = driver.findElement(By.xpath("//input[@id= 'password']"));
		password.sendKeys("deV112233@@!!!");
		WebElement signIn = driver.findElement(By.xpath("//span[text()= 'LOG IN']"));
		signIn.click();
		Thread.sleep(42000);
		WebElement closePopup = driver.findElement(By.xpath("//button[@id='close-modal-btn']"));
		closePopup.click();
		Thread.sleep(10000);
		WebElement listingDropdown = driver.findElement(By.xpath("(//a[contains(text(),'Listings')])[1]"));
		listingDropdown.click();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		System.out.println("now it should click listing option");
		WebElement listingDropdown1 = driver.findElement(By.xpath("(//a[contains(text(),'Listings')])[1]"));
		listingDropdown1.click();
		Thread.sleep(3000);
		System.out.println("now it clicked listing option");
		WebElement addEditListingOption = driver.findElement(By.xpath("//a[contains(text(),'Add & Edit Listings')]"));
		addEditListingOption.click();
		Thread.sleep(60000);
		WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search for recent listings by Address, ML#, Status, Agent Name or ID']"));
		searchBar.sendKeys("PAMC2000164");
		Thread.sleep(8000);
		WebElement editt = driver.findElement(By.xpath("//div[contains(text(),'Edit')]"));
		editt.click();
		Thread.sleep(8000);
		WebElement photoAndTour = driver.findElement(By.xpath("//span[contains(text(),'Photos & Tours')]"));
		photoAndTour.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    WebElement addPhoto =(WebElement) jse.executeScript("return document.querySelector('media-manager-web-component').shadowRoot.querySelector('div > div > button > span')");
	   ((JavascriptExecutor) driver).executeScript("arguments[0].click();" , addPhoto);
		System.out.println("add photo go clicked"); 
		System.out.println("success"); 
	   Thread.sleep(3000);
		driver.quit();
		
	}
}




	
	
	
	
	
	
	
	

 