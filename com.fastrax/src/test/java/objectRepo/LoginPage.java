package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@id=\"exampleInputEmail1\"]")
	private WebElement validEmail;
	
	@FindBy(xpath = "//input[@id=\"exampleInputPassword1\"]")
	private WebElement validPassword;
	
	@FindBy(xpath = "//input[@id='exampleCheck1']")
	private WebElement checkboxLogin;
	
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement ContinueLogin;
	
			//button[contains(text(),'Continue')]
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getValidEmail() {
		return validEmail;
	}

	public void setValidEmail(WebElement validEmail) {
		this.validEmail = validEmail;
	}

	public WebElement getValidPassword() {
		return validPassword;
	}

	public void setValidPassword(WebElement validPassword) {
		this.validPassword = validPassword;
	}

	public WebElement getCheckboxLogin() {
		return checkboxLogin;
	}

	public void setCheckboxLogin(WebElement checkboxLogin) {
		this.checkboxLogin = checkboxLogin;
	}

	public WebElement getContinueLogin() {
		return ContinueLogin;
	}

	public void setContinueLogin(WebElement continueLogin) {
		ContinueLogin = continueLogin;
	}
	
	

}
