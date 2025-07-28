package Initiation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Init {
	public static WebDriver driver = null;

	@BeforeTest
	public static void Setup() {

		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	
	@AfterTest
	public static void TearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
