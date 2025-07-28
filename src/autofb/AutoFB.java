package autofb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Initiation.Init;

public class AutoFB extends Init {
	@Test
	public void autofb() throws Exception {
		driver.get("https://dkmh.hcmuaf.edu.vn/");
		WebElement usernameInput = driver.findElement(By.xpath("/html/body/app-root/div/div/div[2]/div/div/div/div/div[1]/form/div/div[1]/input"));
		usernameInput.sendKeys("22130173");
		
		WebElement passInput = driver.findElement(By.xpath("/html/body/app-root/div/div/div[2]/div/div/div/div/div[1]/form/div/div[2]/input"));
		passInput.sendKeys("12345678");
		
		
		WebElement submitFormLogin = driver.findElement(By.xpath("/html/body/app-root/div/div/div[2]/div/div/div/div/div[4]/button"));
		submitFormLogin.click();
		
	
		
	}
}
