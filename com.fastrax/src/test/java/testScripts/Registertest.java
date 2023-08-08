package testScripts;

import org.testng.annotations.Test;

import com.genericmethods.Base;

import objectRepo.RegisterPage;

public class Registertest extends Base {
	
	@Test(priority = 2)
	public void registerpage() throws InterruptedException {
		RegisterPage register= new RegisterPage(driver);
		register.getCreatenewacc().click();
		Thread.sleep(2000);
		register.getClickonmotoracc().click();
		Thread.sleep(2000);
	}
	
	
	

}
