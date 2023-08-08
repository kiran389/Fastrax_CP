package testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericmethods.Base;
import com.genericmethods.eventlist;

import objectRepo.LoginPage;
@Listeners(eventlist.class)

public class Logintest extends Base{
	private WebDriver driver;
	
	@BeforeMethod
	public void browsersetup() throws InterruptedException {
		loadPropertiesFile();
		driver = initializeAndOpenBrowser(prop.getProperty("browser"));
	}

	@AfterMethod
	public void quitt() throws InterruptedException {
		Thread.sleep(3000);
		//driver.quit();
	} 
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority = 1)
	public void validEmailPasswordloginpage() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		Thread.sleep(4000);
		login.getValidEmail().sendKeys(prop.getProperty("validemail"));
		Thread.sleep(2000);
		login.getValidPassword().sendKeys(prop.getProperty("validpassword"));
		Thread.sleep(2000);
		
		 try {
	            // Create a Robot instance to simulate keyboard inputs.
	            Robot robot = new Robot();
	            robot.keyPress(KeyEvent.VK_CONTROL);

	            // Simulate pressing the "Minus" key twice.
	            robot.keyPress(KeyEvent.VK_MINUS);
	            robot.keyRelease(KeyEvent.VK_MINUS);
	            robot.keyPress(KeyEvent.VK_MINUS);
	            robot.keyRelease(KeyEvent.VK_MINUS);

	            // Simulate releasing the "Ctrl" key.
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
		 Thread.sleep(3000);
		login.getCheckboxLogin().click();
		Thread.sleep(3000);
		JavascriptExecutor je1 = (JavascriptExecutor)driver;
		WebElement down =login.getContinueLogin();
		je1.executeScript("arguments[0].scrollIntoView()", down);
		Thread.sleep(3000);
		login.getContinueLogin().click();
		
	}
	
	

}
