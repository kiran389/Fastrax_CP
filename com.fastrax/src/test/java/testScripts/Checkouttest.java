package testScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericmethods.Base;

import objectRepo.CheckoutPage;


public class Checkouttest extends Base{
	
	@Test
	public void checkout() throws InterruptedException {
		CheckoutPage cart = new CheckoutPage(driver);
		Thread.sleep(3000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement checkout = cart.getCheckout();
		je.executeScript("arguments[0].scrollIntoView()",checkout );
		Thread.sleep(4000);
		cart.getCheckout().click();
		Thread.sleep(3000);
		cart.getCheckbox().click();
		Thread.sleep(3000);
		cart.getConfirmPaymentCheckout().click();
		
		
		
	}

}
