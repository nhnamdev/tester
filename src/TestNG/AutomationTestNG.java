package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AutomationTestNG {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1 Maximize browser của mình
		driver.manage().window().maximize();
		// 1/2 Chuyên qua chế độ fullscreen
		driver.manage().window().fullscreen();
		// 1/3 Lấy Title và in ra console
		System.out.println(driver.getTitle());
		// Quit Browser
		driver.quit();
	}

}