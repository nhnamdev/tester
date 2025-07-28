package thuhanh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SetupBrower {
	public WebDriver driver;
	public JavascriptExecutor js;
	public Helpers helpers;
	public ObjectReponsitoryHRM objReponsitory ;
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Started Driver");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		helpers = new Helpers(driver);
		 objReponsitory = new ObjectReponsitoryHRM();
	}

	@AfterClass
	public void closeDriver() {
		driver.quit();
		System.out.println("Closed Driver");
	}
}
