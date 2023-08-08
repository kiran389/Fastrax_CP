package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//button[contains(@class,\"checkOut\")]")
	private WebElement checkout;
	
	@FindBy(xpath = "(//tbody/tr/td/input[@type='checkbox'])[1]")
	private WebElement checkbox;
	
	@FindBy(xpath = "(//button[contains(text(),'Confirm Payment')])[1]")
	private WebElement confirmPaymentCheckout;
	
	public WebElement getCheckbox() {
		return checkbox;
	}


	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}


	public WebElement getConfirmPaymentCheckout() {
		return confirmPaymentCheckout;
	}


	public void setConfirmPaymentCheckout(WebElement confirmPaymentCheckout) {
		this.confirmPaymentCheckout = confirmPaymentCheckout;
	}


	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	
}
