package utils;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.lang.reflect.Method;
	import java.time.Duration;
	import java.util.Properties;
	import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
	import org.json.simple.JSONObject;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	/** This is the MainClass and is being inherited in all the logic pages. */
	public class MainClass {

		protected static Properties property;
		protected static String workingDir = System.getProperty("user.dir");
		protected static Logger logger = Logger.getLogger(MainClass.class);
		protected static Wait<WebDriver> wait;
		private static String browser;
		private FileInputStream input;
		protected static JSONObject data;

		/**
		 * A method to get the driver ready for a particular browser. Default would be
		 * Chrome browser
		 */
		@Parameters({ "browser", "platform", "device" })
		@BeforeSuite(alwaysRun = true)
		public void setUpMethod(@Optional String value, @Optional String platform, @Optional String device) {
			try {
				input = new FileInputStream(workingDir + "//src//test//java//Resources/GlobalData.properties");
				property = new Properties();
				try {
					property.load(input);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException fileException) {
				logger.info("File not found" + fileException);
			}
			logger.info("Config file has been uploaded successfully for use");
			if (value == null) {
				browser = property.getProperty("defaultBrowser");
			} else {
				browser = value;
				property.setProperty("browserName", browser);
				property.setProperty("platformName", platform);
				property.setProperty("device", device);
				logger.info("Test cases are being executed on " + browser + " browser");
			}
			if (platform == null) {
				property.setProperty("platform", property.getProperty("defaultPlatform"));
			} else {
				property.setProperty("platform", platform);
			}
			String envValue = System.getProperty("env");
			if (envValue != null) {
				property.setProperty("env", envValue);
			} else {
				property.setProperty("env", property.getProperty("defaultEnv"));
			}
			String group = System.getProperty("groups");
			if (group != null) {
				property.setProperty("group", group);
			}
		}

		/** A method to set the driver for SauceLabs and local execution */
		@BeforeMethod(alwaysRun = true)
		public void setup(Method method) {
			DriverFactory.setDesiredDriver(browser, method.getName());
			wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(50));
			if (property.getProperty("platform").equals("web")) {
				DriverFactory.getDriver().manage().window().maximize();
				DriverFactory.getDriver().get(Constants.url);
			}
			wait = new FluentWait<WebDriver>(DriverFactory.getDriver()).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofMillis(5)).ignoring(WebDriverException.class);
			}
		

		/** A method to close the driver's instance */
		@AfterMethod(alwaysRun = true)
		public void tearDown(Method method) {
			//DriverFactory.getDriver().quit();
			logger.info("Test Ended => " + method.getName());
			logger.info("========================================\n");
		}

}
