package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterTest;

public class AutomationTestNG1 {
	public static WebDriver driver = null;



	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void Demo1() {
		driver.navigate().to("https://google.com");
	}
	@Test
	public void Demo2() {
		driver.navigate().to("https://nam.com");
	}

	@Test
	public void Demo3() {
		driver.navigate().to("https://hi.com");
	}


	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) {

	}

}
