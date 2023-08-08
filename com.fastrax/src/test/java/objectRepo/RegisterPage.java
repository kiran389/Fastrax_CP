package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Create an Account']")
	private WebElement createnewacc;

	@FindBy(linkText ="Create motor carrier account")
	private WebElement tocheckmotor;

	@FindBy(linkText = "Create motor carrier account")
	private WebElement clickonmotoracc;

	@FindBy(css = "*[class='btn btn-primary nextBtn']")
	private WebElement clickonnextbutton;

	//company details
	@FindBy(xpath = "//input[@id='companyName']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@id='dot']")
	private WebElement dotNumber;

	@FindBy(xpath = "//input[@id='address']")
	private WebElement companyaddress;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement companycity;

	@FindBy(xpath = "//input[@id='state']")
	private WebElement companystate;

	@FindBy(xpath = "//input[@id='zipCode']")
	private WebElement companyzipcode;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement CompanyNextbutton;

	//user details
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement userFirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement userLastName;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement userEmail;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement userPassword;

	@FindBy(xpath = "//input[@id='confirmPassword']")
	private WebElement userConfirmPassword;

	@FindBy(xpath = "//button[text()='Continue to sign in']")
	private WebElement clickcontinutoSignin;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCreatenewacc() {
		return createnewacc;
	}

	public void setCreatenewacc(WebElement createnewacc) {
		this.createnewacc = createnewacc;
	}

	public WebElement getTocheckmotor() {
		return tocheckmotor;
	}

	public void setTocheckmotor(WebElement tocheckmotor) {
		this.tocheckmotor = tocheckmotor;
	}

	public WebElement getClickonmotoracc() {
		return clickonmotoracc;
	}

	public void setClickonmotoracc(WebElement clickonmotoracc) {
		this.clickonmotoracc = clickonmotoracc;
	}

	public WebElement getClickonnextbutton() {
		return clickonnextbutton;
	}

	public void setClickonnextbutton(WebElement clickonnextbutton) {
		this.clickonnextbutton = clickonnextbutton;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public void setCompanyName(WebElement companyName) {
		this.companyName = companyName;
	}

	public WebElement getDotNumber() {
		return dotNumber;
	}

	public void setDotNumber(WebElement dotNumber) {
		this.dotNumber = dotNumber;
	}

	public WebElement getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(WebElement companyaddress) {
		this.companyaddress = companyaddress;
	}

	public WebElement getCompanycity() {
		return companycity;
	}

	public void setCompanycity(WebElement companycity) {
		this.companycity = companycity;
	}

	public WebElement getCompanystate() {
		return companystate;
	}

	public void setCompanystate(WebElement companystate) {
		this.companystate = companystate;
	}

	public WebElement getCompanyzipcode() {
		return companyzipcode;
	}

	public void setCompanyzipcode(WebElement companyzipcode) {
		this.companyzipcode = companyzipcode;
	}

	public WebElement getCompanyNextbutton() {
		return CompanyNextbutton;
	}

	public void setCompanyNextbutton(WebElement companyNextbutton) {
		CompanyNextbutton = companyNextbutton;
	}

	public WebElement getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(WebElement userFirstName) {
		this.userFirstName = userFirstName;
	}

	public WebElement getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(WebElement userLastName) {
		this.userLastName = userLastName;
	}

	public WebElement getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(WebElement userEmail) {
		this.userEmail = userEmail;
	}

	public WebElement getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(WebElement userPassword) {
		this.userPassword = userPassword;
	}

	public WebElement getUserConfirmPassword() {
		return userConfirmPassword;
	}

	public void setUserConfirmPassword(WebElement userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}

	public WebElement getClickcontinutoSignin() {
		return clickcontinutoSignin;
	}

	public void setClickcontinutoSignin(WebElement clickcontinutoSignin) {
		this.clickcontinutoSignin = clickcontinutoSignin;
	}
	

}
