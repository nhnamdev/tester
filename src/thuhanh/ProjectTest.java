package thuhanh;

import org.testng.annotations.Test;
 
public class ProjectTest extends SetupBrower {
	
	@Test
	public void loginPage() throws Exception {
		driver.get(objReponsitory.urlPage);
		Helpers.delay(1);
		helpers.sendText(objReponsitory.username, "admin");
		helpers.sendText(objReponsitory.password, "123456");
		helpers.clickElement(objReponsitory.loginBth);
	}
}
