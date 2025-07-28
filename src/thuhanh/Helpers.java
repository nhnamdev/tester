package thuhanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {
	WebDriver driver;

	public Helpers(WebDriver driver) {
		this.driver = driver;
	}

	public void clickElement(By by) {
		// Set timeout for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Chời đại để click
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		// Click
		driver.findElement(by).click();

	}
	public void sendText(By input, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(input));
		
		driver.findElement(input).sendKeys(text);
	}
	

	public static void delay(int second) throws Exception {
		Thread.sleep(second * 1000);
	}
}
