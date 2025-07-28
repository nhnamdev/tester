package actionRobotClass;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import Initiation.Init;

public class Action extends Init {
	@Test
	public void TestAction() throws Exception {

		driver.get("https://www.fb.com/");
		WebElement element = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));

		Actions action = new Actions(driver);

		action.sendKeys(element, "Anh hi").build().perform();

		action.doubleClick(element).build().perform();
		action.clickAndHold().moveToElement(null).sendKeys(null).build();// build dung de xac nhan chuoi cac hanh dong
		// Right click to element
		action.contextClick(element).build().perform();
		// Move to element (di chuyển tới title Kiến thức Automation Testing)
		action.moveToElement(element).build().perform();

		// Bắt element cần kéo
		WebElement From = driver.findElement(By.xpath("//div[@id='box6']"));
		// Bắt element cần thả đến
		WebElement To = driver.findElement(By.xpath("//div[@id='countries']//div[1]"));

		Thread.sleep(1);
		// Kéo và thả
		action.dragAndDrop(From, To).build().perform();

	}
	public boolean dragAndDropHTML5(WebElement fromElement, WebElement toElement) {
		  try {
			  //Robot không phải của sele mà là của Java
			  // keyPress(keyevent) sử dụng unikey của máy luôn
		    Robot robot = new Robot();
		    robot.mouseMove(0, 0);

		    int X1 = fromElement.getLocation().getX() + (fromElement.getSize().getWidth() / 2);
		    int Y1 = fromElement.getLocation().getY() + (fromElement.getSize().getHeight() / 2);
		    System.out.println(X1 + " , " + Y1);

		    int X2 = toElement.getLocation().getX() + (toElement.getSize().getWidth() / 2);
		    int Y2 = toElement.getLocation().getY() + (toElement.getSize().getHeight() / 2);
		    System.out.println(X2 + " , " + Y2);

		    //Chổ này lấy toạ độ hiện tại cộng thêm 120px là phần header của browser (1920x1080 current window)
		    //Header: chrome is being controlled by automated test software
		 
		    robot.mouseMove(X1, Y1 + 190); //Tuỳ độ phân giải của màn hình
		    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

	
		    robot.mouseMove(X2, Y2 + 150);
		 
		    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		    return true;
		  } catch (Exception e) {
		    System.out.println(e.getMessage());
		    return false;
		  }
		}

		@Test
		public void demoDragAndDropHTML5() {
		  driver.get("https://ui.vision/demo/webtest/dragdrop/");
		

		  // Bắt element cần kéo
		  WebElement From = driver.findElement(By.xpath("//a[@id='one']"));
		  // Bắt element cần thả đến
		  WebElement To = driver.findElement(By.xpath("//div[@id='bin']"));

	
		  //Gọi lại hàm dragAndDropHTML5 đã xây dựng riêng
		  dragAndDropHTML5(From, To);

	
		}
}
