package alertPopupFrame;
import java.awt.dnd.DragGestureEvent;
import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Initiation.Init;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class AlertHandle extends Init {
	
	@Test
	public void handleAlert() throws Exception {
		//driver.switchTo().alert(). dismiss|  accept |  getText | sendKeys
		   driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	        Thread.sleep(2);

	        //Mở Alert Message, click vào nút "Click me!" thứ nhất
	        driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
	        Thread.sleep(2);
	        //Khởi tạo class Alert thứ nhất
	        Alert alert1 = driver.switchTo().alert();
	        alert1.accept();
	        Thread.sleep(2);
	}
}
