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
public class HandleIFrame  extends Init {
	@Test
	public void IframeDemo() throws Exception{
		driver.get("https://anhtester.com/contact");
		int sizeIFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Tổng "+sizeIFrame);
		driver.switchTo().frame(0);
		//driver.switchTo().frame("iframe1");
		// //là tương đối không quan tâm những thẻ trước nó
		WebElement e = driver.findElement(By.xpath("//strong"));
		e.click();
		 //1. Switch to Parent WindowHandle
        driver.switchTo().parentFrame();

		
	}
}
