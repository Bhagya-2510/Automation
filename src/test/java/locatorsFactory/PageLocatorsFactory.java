package locatorsFactory;

import java.util.List;

import org.openqa.selenium.WebElement;

public class PageLocatorsFactory {
	public static final ThreadLocal<WebElement> webelement = new ThreadLocal<WebElement>();

	
	public synchronized static WebElement getAnElement(WebElement element) {
		webelement.set(element);
		return webelement.get();
	}
	
	public synchronized static WebElement getAnElement(List<WebElement> elements) {
		webelement.set((WebElement) elements);
		return webelement.get();
	}
}
