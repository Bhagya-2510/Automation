package utils;

import org.openqa.selenium.MutableCapabilities;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	/**
	 * This class sets driver's instance and provides a thread.
	 */
	public class DriverFactory extends MainClass {

		private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
		static boolean sauceLabs;
		static MutableCapabilities capabilities;

		/**
		 * This methods sets a driver's instance for the desired browser.
		 */
		public synchronized static void setDesiredDriver(String browser, String method) {
			String platform = property.getProperty("platform");
			switch (browser) {
			case "chrome":
				if (platform.equals("web")) {
					WebDriverManager.chromedriver().setup();
					threadDriver.set(new ChromeDriver());
				}
		
			break;
			case "edge":
				if (platform.equals("web")) {
						WebDriverManager.edgedriver().setup();
						threadDriver.set(new EdgeDriver());
				}
				break;
			case "firefox":
				if (platform.equals("web")) {
						WebDriverManager.firefoxdriver().setup();
						threadDriver.set(new FirefoxDriver());
				}
				break;
			case "safari":
				if (platform.equals("web")) {
						threadDriver.set(new SafariDriver());
				}
				break;
		}
		}

		/**
		 * This methods gets a driver's instance for the desired browser.
		 */
		public synchronized static WebDriver getDriver() {
			return (WebDriver) threadDriver.get();
		}

}
