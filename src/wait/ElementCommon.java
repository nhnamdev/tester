package wait;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Initiation.Init;

public class ElementCommon extends Init {
	public static WebElement elementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
		
	}
}
