package wait;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Initiation.Init;

public class ExplicitWait extends Init {
	@Test
	public void ExplicitWait() throws Exception {
		
		driver.get("https://anhtester.com/");

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3 [contains(text(), 'Website Testing"))); // đợi
																												// thấy
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))); // đợi click được
		String xPathButtonClick = "//*[@id=\"bg-header\"]/div[1]/div/div[2]/div/div/div[1]/div";
		Thread.sleep(5000);
//		WaitAndClick(xPathButtonClick, 5);
		ElementCommon.elementByXpath("//*[@id=\"bg-header\"]/div[1]/div/div[2]/div/div/div[1]/div").click();
	}

	public void WaitAndClick(String xpath, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))); // đợi click được
		driver.findElement(By.xpath(xpath)).click();
		
		
	}
	

}
