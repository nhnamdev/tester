package TestNG;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {
	public WebDriver driver = null;

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void LoginPage() throws Exception {
		driver.navigate().to("https://autoxugiare.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[1]")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void EditProfile() throws Exception {
		driver.navigate().to("https://autoxugiare.com/");
		Thread.sleep(5000);
	
	}

	@AfterTest
	public void TearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
