package utils;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import Locators.LoginPageElements;
import locatorsFactory.PageLocatorsFactory;


public class CommonUtilityMethods {
		protected static Wait<WebDriver> wait;
	
	public static LoginPageElements element()
	{
		return new LoginPageElements(DriverFactory.getDriver());
	}

	public static void clickAnElementUsingJs(WebElement element) {
		waitUntilElementIsVisible(element);
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getDriver();
		executor.executeScript("arguments[0].click();", PageLocatorsFactory.getAnElement(element));
		waitForFewSeconds(2);
	}

	/**
	 * Method will wait until an element is visible.
	 */
	public static void waitUntilElementIsVisible(WebElement element, Integer... time) {
		int value = 0;
		if (time.length == 0) {
			value = 30; // Updated default wait time to 30 seconds as the scripts were failing. Need to
						// discuss.
		} else {
			value = time[0];
		}
		wait = webDriverWait(value);
		wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(PageLocatorsFactory.getAnElement(element))));
	}

	/**
	 * Method will wait for a desired time
	 */
	public static void waitForFewSeconds(int time) {
		CommonUtilityMethods.waitForVisibilityAndMove(element().wait, time);
		CommonUtilityMethods.waitForInVisibilityAndMove(element().wait, time);
	}

	/**
	 * Method will wait until an element is visible and will move further without
	 * exception
	 */
	public static void waitForVisibilityAndMove(WebElement element, Integer... time) {
		int value = 0;
		if (time.length == 0) {
			value = 5;
		} else {
			value = time[0];
		}
		wait = webDriverWait(value);
		try {
			wait.until(ExpectedConditions.visibilityOf(PageLocatorsFactory.getAnElement(element)));
		} catch (Exception exception) {
		}
	}	

		/**
		 * Method will wait until an element gets invisible and move further without
		 * throwing exception
		 */
		public static void waitForInVisibilityAndMove(WebElement element, Integer... time) {
			int value = 0;
			if (time.length == 0) {
				value = 5;
			} else {
				value = time[0];
			}
			wait = webDriverWait(value);
			try {
				wait.until(ExpectedConditions.invisibilityOf(PageLocatorsFactory.getAnElement(element)));
			} catch (Exception exception) {
			}
		}
		
		/**
		 * Method will return WebDriver wait with desired wait limit
		 */
		public static Wait<WebDriver> webDriverWait(Integer value) {
			wait = new FluentWait<WebDriver>(DriverFactory.getDriver()).withTimeout(Duration.ofSeconds(value))
					.pollingEvery(Duration.ofMillis(5)).ignoring(WebDriverException.class);
			return wait;
		}
		
		public static void clear(WebElement element)
		{
			element.clear();
		}
		
		public static void switchToChildWindow(String parentWindow) {
			Set<String> A = DriverFactory.getDriver().getWindowHandles();
			for (String Child_Window : A) {
				if (!Child_Window.equals(parentWindow))
					DriverFactory.getDriver().switchTo().window(Child_Window);
			}
			System.out.print("Switched to child window" + '\n');
		}
		
		/**
		 * Method will send text to webElement using ISON
		 */
		public static void sendKeysJson(WebElement element, Object text) {
			waitUntilElementIsVisible(PageLocatorsFactory.getAnElement(element));
			PageLocatorsFactory.getAnElement(element).sendKeys(text.toString());
}
		

		public static void scrollToAnElement(WebElement element) {
			((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
					PageLocatorsFactory.getAnElement(element));
		}
		
		
		public static void clickAnElement(WebElement element) {
			int elem_width = element.getSize().getWidth();
			Actions act = new Actions(DriverFactory.getDriver());
			act.moveToElement(element).moveByOffset((elem_width / 2) - 2, 0).click().perform();
		}

		
		}
		
		
		
		
		










