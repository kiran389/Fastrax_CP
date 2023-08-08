package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartnewPermitPage {
	private WebDriver driver;

	@FindBy(xpath = "//button[contains(text(),' Start New Permit ')]")
	private WebElement clicknewPermit;

	@FindBy(xpath = "//mat-select[@formcontrolname='permitType']")
	private WebElement clickdropdown;

	@FindBy(xpath =  "//mat-option[@id='mat-option-47']")
	private WebElement selectpermittype;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	private WebElement startDate;

	@FindBy(xpath = "//button[@aria-label='Choose month and year']")
	private WebElement monthyear;

	@FindBy(xpath = "//td[@aria-label='2023']")
	private WebElement selectYear;

	@FindBy(xpath = "//td[@aria-label='July 2023']")
	private WebElement selectMonth;

	@FindBy(xpath = "//td[@aria-label='July 25, 2023']")
	private WebElement calenderDate;

	//	@FindBy(xpath = "//div[6]/textarea[@formcontrolname='acknowledgement']")
	//	private WebElement acknowledgment;

	@FindBy(xpath = "//input[@id='flexCheckDefault']")
	private WebElement checkbox;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement nextMainPage;

	//companyPage
	@FindBy(xpath = "//input[@formcontrolname='companyName']")
	private WebElement companyname;

	@FindBy(xpath = "//*[@formcontrolname='street']")
	private WebElement address;

	@FindBy(xpath = "//*[@formcontrolname='city']")
	private WebElement city;

	@FindBy(xpath = "//*[@formcontrolname='state']")
	private WebElement state;

	@FindBy(xpath = "//*[@formcontrolname='zipCode']")
	private WebElement zipcode;

	@FindBy(xpath = "//*[@formcontrolname='name']")
	private WebElement name;

	@FindBy(xpath = "//*[@formcontrolname='phone']")
	private WebElement phone;

	@FindBy(xpath = "//*[@formcontrolname='email']")
	private WebElement email;

	@FindBy(name = "refrenceNote")
	private WebElement refNote;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement nextcompanypage;

	//LoadPage
	@FindBy(xpath ="//input[@formcontrolname='loadDescription']")
	private WebElement loaddes;

	@FindBy(xpath = "//a[text()=' Select Saved Units ']")
	private WebElement selectsavedUnits;

	@FindBy(xpath = "//tbody/tr/td[contains(text(),'India')]")
	private WebElement savedUnits;

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	private WebElement confirm;

	@FindBy(xpath = "//input[@id='lengthFeet']")
	private WebElement lenFeet;
	@FindBy(xpath = "//input[@id='lengthInches']")
	private WebElement lenInches;

	@FindBy(xpath = "//input[@id='widthFeet']")
	private WebElement widFeet;
	@FindBy(xpath = "//input[@id='widthInches']")
	private WebElement widInches;

	@FindBy(xpath = "//input[@id='heightFeet']")
	private WebElement heigtFeet;
	@FindBy(xpath = "//input[@id='heightInches']")
	private WebElement heigtInch;

	@FindBy(xpath = "//input[@id='trailerLengthFeet']")
	private WebElement trailerLen;
	@FindBy(xpath = "//input[@id='trailerLengthInches']")
	private WebElement trailerInch;

	@FindBy(xpath = "//input[@id='frontOverhangFeet']")
	private WebElement frontFeet;
	@FindBy(xpath = "//input[@id='frontOverhangInches']")
	private WebElement frontInches;
	
	@FindBy(xpath = "//input[@id='rearOverhangFeet']")
	private WebElement rearFeet;
	@FindBy(xpath = "//input[@id='rearOverhangInches']")
	private WebElement rearInches;
	
	@FindBy(xpath = "//input[@id='noOfAxile']")
	private WebElement numberofaxle;
	
	@FindBy(xpath = "(//input[@formcontrolname='nAxles'])[1]")
	private WebElement group1;
	@FindBy(xpath = "(//input[@formcontrolname='weight'])[1]")
	private WebElement weight1;
	
	@FindBy(xpath = "(//input[@formcontrolname='nAxles'])[2]")
	private WebElement group2;
	@FindBy(xpath = "(//input[@formcontrolname='weight'])[2]")
	private WebElement weight2;
	
	@FindBy(xpath = "(//input[@formcontrolname='nAxles'])[3]")
	private WebElement group3;
	@FindBy(xpath = "(//input[@formcontrolname='weight'])[3]")
	private WebElement weight3;
	
	@FindBy(xpath = "//input[@formcontrolname='totalAxies']")
	private WebElement totalNumofaxle;
	
	@FindBy(xpath = "//input[@formcontrolname='totalweight']")
	private WebElement totalgrosswight;
	
	@FindBy(xpath = "(//input[@id='axelFeet'])[1]")
	private WebElement axlFeet1;
	@FindBy(xpath = "(//input[@id='axelInches'])[1]")
	private WebElement axlInch1;
	
	@FindBy(xpath = "(//input[@id='axelFeet'])[2]")
	private WebElement axlFeet2;
	@FindBy(xpath = "(//input[@id='axelInches'])[2]")
	private WebElement axlInch2;
	
	@FindBy(xpath = "(//input[@id='axelFeet'])[3]")
	private WebElement axlFeet3;
	@FindBy(xpath = "(//input[@id='axelInches'])[3]")
	private WebElement axlInch3;
	
	@FindBy(xpath = "(//input[@id='axelFeet'])[4]")
	private WebElement axlFeet4;
	@FindBy(xpath = "(//input[@id='axelInches'])[4]")
	private WebElement axlInch4;
	
	@FindBy(xpath = "(//input[@id='axelFeet'])[5]")
	private WebElement axlFeet5;
	@FindBy(xpath = "(//input[@id='axelInches'])[5]")
	private WebElement axlInch5;
	
	@FindBy(xpath = "(//input[@id='axelFeet'])[6]")
	private WebElement axlFeet6;
	@FindBy(xpath = "(//input[@id='axelInches'])[6]")
	private WebElement axlInch6;
	
	@FindBy(xpath = "(//input[@id='axelFeet'])[7]")
	private WebElement axlFeet7;
	@FindBy(xpath = "(//input[@id='axelInches'])[7]")
	private WebElement axlInch7;
	
	@FindBy(xpath = "(//input[@id='axelFeet'])[8]")
	private WebElement axlFeet8;
	@FindBy(xpath = "(//input[@id='axelInches'])[8]")
	private WebElement axlInch8;
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement nextLoad;
	
	
	@FindBy(xpath = "//textarea[@formcontrolname='referenceNote']")
	private WebElement routeNotes;
	
	@FindBy(xpath = "//button[text()='Create Manual Route']")
	private WebElement createmanual;
	
	@FindBy(xpath = "//a[contains(text(),' Saved Routes')]")
	private WebElement Savedroutes;
	
	@FindBy(xpath = "//tbody/tr/td[contains(text(),'Kiran Route')]")
	private WebElement selectSavedRoute;
	
	@FindBy(xpath = "(//button[contains(text(),'Confirm')])[1]")
	private WebElement confirmRoute;
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
    private WebElement 	nextRoute;
	
	@FindBy(xpath = "//button[contains(text(),'Save to Drafts')]")
	private WebElement savetopermitDraft;
	
	@FindBy(xpath = "//button[contains(text(),' Permit Drafts ')]")
    private WebElement permitDrafts;
	
	@FindBy(xpath = "//tbody/tr[1]/td[contains(text(),'View')]")
	 private WebElement viewfirstpermit;
	
	@FindBy(xpath = "//label[contains(text(),'Permit Cost')]")
	private WebElement scrollDown;
	
	@FindBy(xpath = "//label[contains(text(),'Permit Details')]")
	private WebElement scrollUp;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'close')]")
	private WebElement closeDraft;
	
	//to get 1st data
	@FindBy(xpath = "//tbody/tr[1]/td[contains(text(),'Continue')]")
	private WebElement draftfirstdata;
	
	@FindBy(xpath = "(//a[text()='Main Page'])[2]")
	private WebElement draftmainPage;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement draftNextmainpage;
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement draftNextcompanypage;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement draftNextloadpage;
	
	@FindBy(xpath = "//button[text()='Create Manual Route']")
	private WebElement draftCreateManual;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement draftNextroutepage;
	
	@FindBy(xpath = "//button[contains(text(),' Add to Cart ')]")
	private WebElement addToCart;
	
	
	
	
	
	
	
	
	
	
	
	
	

	public StartnewPermitPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	
	public WebElement getViewfirstpermit() {
		return viewfirstpermit;
	}


	public void setViewfirstpermit(WebElement viewfirstpermit) {
		this.viewfirstpermit = viewfirstpermit;
	}


	public WebElement getDraftfirstdata() {
		return draftfirstdata;
	}


	public void setDraftfirstdata(WebElement draftfirstdata) {
		this.draftfirstdata = draftfirstdata;
	}


	public WebElement getFirstdata() {
		return draftfirstdata;
	}



	public void setFirstdata(WebElement firstdata) {
		this.draftfirstdata = firstdata;
	}
	
	public WebElement getAddToCart() {
		return addToCart;
	}



	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}




	public WebElement getDraftmainPage() {
		return draftmainPage;
	}



	public void setDraftmainPage(WebElement draftmainPage) {
		this.draftmainPage = draftmainPage;
	}



	public WebElement getDraftNextmainpage() {
		return draftNextmainpage;
	}



	public void setDraftNextmainpage(WebElement draftNextmainpage) {
		this.draftNextmainpage = draftNextmainpage;
	}



	public WebElement getDraftNextcompanypage() {
		return draftNextcompanypage;
	}



	public void setDraftNextcompanypage(WebElement draftNextcompanypage) {
		this.draftNextcompanypage = draftNextcompanypage;
	}



	public WebElement getDraftNextloadpage() {
		return draftNextloadpage;
	}



	public void setDraftNextloadpage(WebElement draftNextloadpage) {
		this.draftNextloadpage = draftNextloadpage;
	}



	public WebElement getDraftCreateManual() {
		return draftCreateManual;
	}



	public void setDraftCreateManual(WebElement draftCreateManual) {
		this.draftCreateManual = draftCreateManual;
	}



	public WebElement getDraftNextroutepage() {
		return draftNextroutepage;
	}



	public void setDraftNextroutepage(WebElement draftNextroutepage) {
		this.draftNextroutepage = draftNextroutepage;
	}



	public WebElement getSavetopermitDraft() {
		return savetopermitDraft;
	}
	public void setSavetopermitDraft(WebElement savetopermitDraft) {
		this.savetopermitDraft = savetopermitDraft;
	}
	
	public WebElement getPermitDrafts() {
		return permitDrafts;
	}
	public void setPermitDrafts(WebElement permitDrafts) {
		this.permitDrafts = permitDrafts;
	}

	

	public WebElement getScrollDown() {
		return scrollDown;
	}
	public void setScrollDown(WebElement scrollDown) {
		this.scrollDown = scrollDown;
	}

	public WebElement getScrollUp() {
		return scrollUp;
	}
	public void setScrollUp(WebElement scrollUp) {
		this.scrollUp = scrollUp;
	}

	public WebElement getCloseDraft() {
		return closeDraft;
	}
	public void setCloseDraft(WebElement closeDraft) {
		this.closeDraft = closeDraft;
	}


	public WebElement getSavedroutes() {
		return Savedroutes;
	}
	public void setSavedroutes(WebElement savedroutes) {
		Savedroutes = savedroutes;
	}



	public WebElement getRouteNotes() {
		return routeNotes;
	}
	public void setRouteNotes(WebElement routeNotes) {
		this.routeNotes = routeNotes;
	}



	public WebElement getCreatemanual() {
		return createmanual;
	}



	public void setCreatemanual(WebElement createmanual) {
		this.createmanual = createmanual;
	}


	public WebElement getSelectSavedRoute() {
		return selectSavedRoute;
	}



	public void setSelectSavedRoute(WebElement selectSavedRoute) {
		this.selectSavedRoute = selectSavedRoute;
	}



	public WebElement getConfirmRoute() {
		return confirmRoute;
	}



	public void setConfirmRoute(WebElement confirmRoute) {
		this.confirmRoute = confirmRoute;
	}



	public WebElement getNextRoute() {
		return nextRoute;
	}



	public void setNextRoute(WebElement nextRoute) {
		this.nextRoute = nextRoute;
	}



	public WebElement getNextLoad() {
		return nextLoad;
	}

	public void setNextLoad(WebElement nextLoad) {
		this.nextLoad = nextLoad;
	}



	public WebElement getTotalgrosswight() {
		return totalgrosswight;
	}
	public void setTotalgrosswight(WebElement totalgrosswight) {
		this.totalgrosswight = totalgrosswight;
	}



	public WebElement getLenFeet() {
		return lenFeet;
	}



	public void setLenFeet(WebElement lenFeet) {
		this.lenFeet = lenFeet;
	}



	public WebElement getLenInches() {
		return lenInches;
	}



	public void setLenInches(WebElement lenInches) {
		this.lenInches = lenInches;
	}



	public WebElement getWidFeet() {
		return widFeet;
	}



	public void setWidFeet(WebElement widFeet) {
		this.widFeet = widFeet;
	}



	public WebElement getWidInches() {
		return widInches;
	}



	public void setWidInches(WebElement widInches) {
		this.widInches = widInches;
	}



	public WebElement getHeigtFeet() {
		return heigtFeet;
	}



	public void setHeigtFeet(WebElement heigtFeet) {
		this.heigtFeet = heigtFeet;
	}



	public WebElement getHeigtInch() {
		return heigtInch;
	}



	public void setHeigtInch(WebElement heigtInch) {
		this.heigtInch = heigtInch;
	}



	public WebElement getTrailerLen() {
		return trailerLen;
	}



	public void setTrailerLen(WebElement trailerLen) {
		this.trailerLen = trailerLen;
	}



	public WebElement getTrailerInch() {
		return trailerInch;
	}



	public void setTrailerInch(WebElement trailerInch) {
		this.trailerInch = trailerInch;
	}



	public WebElement getFrontFeet() {
		return frontFeet;
	}



	public void setFrontFeet(WebElement frontFeet) {
		this.frontFeet = frontFeet;
	}



	public WebElement getFrontInches() {
		return frontInches;
	}



	public void setFrontInches(WebElement frontInches) {
		this.frontInches = frontInches;
	}



	public WebElement getRearFeet() {
		return rearFeet;
	}



	public void setRearFeet(WebElement rearFeet) {
		this.rearFeet = rearFeet;
	}



	public WebElement getRearInches() {
		return rearInches;
	}



	public void setRearInches(WebElement rearInches) {
		this.rearInches = rearInches;
	}



	public WebElement getNumberofaxle() {
		return numberofaxle;
	}



	public void setNumberofaxle(WebElement numberofaxle) {
		this.numberofaxle = numberofaxle;
	}



	public WebElement getGroup1() {
		return group1;
	}



	public void setGroup1(WebElement group1) {
		this.group1 = group1;
	}



	public WebElement getWeight1() {
		return weight1;
	}



	public void setWeight1(WebElement weight1) {
		this.weight1 = weight1;
	}



	public WebElement getGroup2() {
		return group2;
	}



	public void setGroup2(WebElement group2) {
		this.group2 = group2;
	}



	public WebElement getWeight2() {
		return weight2;
	}



	public void setWeight2(WebElement weight2) {
		this.weight2 = weight2;
	}



	public WebElement getGroup3() {
		return group3;
	}



	public void setGroup3(WebElement group3) {
		this.group3 = group3;
	}



	public WebElement getWeight3() {
		return weight3;
	}



	public void setWeight3(WebElement weight3) {
		this.weight3 = weight3;
	}



	public WebElement getTotalNumofaxle() {
		return totalNumofaxle;
	}



	public void setTotalNumofaxle(WebElement totalNumofaxle) {
		this.totalNumofaxle = totalNumofaxle;
	}
	
	public WebElement getAxlFeet1() {
		return axlFeet1;
	}



	public void setAxlFeet1(WebElement axlFeet1) {
		this.axlFeet1 = axlFeet1;
	}



	public WebElement getAxlInch1() {
		return axlInch1;
	}



	public void setAxlInch1(WebElement axlInch1) {
		this.axlInch1 = axlInch1;
	}



	public WebElement getAxlFeet2() {
		return axlFeet2;
	}



	public void setAxlFeet2(WebElement axlFeet2) {
		this.axlFeet2 = axlFeet2;
	}



	public WebElement getAxlInch2() {
		return axlInch2;
	}



	public void setAxlInch2(WebElement axlInch2) {
		this.axlInch2 = axlInch2;
	}



	public WebElement getAxlFeet3() {
		return axlFeet3;
	}



	public void setAxlFeet3(WebElement axlFeet3) {
		this.axlFeet3 = axlFeet3;
	}



	public WebElement getAxlInch3() {
		return axlInch3;
	}



	public void setAxlInch3(WebElement axlInch3) {
		this.axlInch3 = axlInch3;
	}



	public WebElement getAxlFeet4() {
		return axlFeet4;
	}



	public void setAxlFeet4(WebElement axlFeet4) {
		this.axlFeet4 = axlFeet4;
	}



	public WebElement getAxlInch4() {
		return axlInch4;
	}



	public void setAxlInch4(WebElement axlInch4) {
		this.axlInch4 = axlInch4;
	}



	public WebElement getAxlFeet5() {
		return axlFeet5;
	}



	public void setAxlFeet5(WebElement axlFeet5) {
		this.axlFeet5 = axlFeet5;
	}



	public WebElement getAxlInch5() {
		return axlInch5;
	}



	public void setAxlInch5(WebElement axlInch5) {
		this.axlInch5 = axlInch5;
	}



	public WebElement getAxlFeet6() {
		return axlFeet6;
	}



	public void setAxlFeet6(WebElement axlFeet6) {
		this.axlFeet6 = axlFeet6;
	}



	public WebElement getAxlInch6() {
		return axlInch6;
	}



	public void setAxlInch6(WebElement axlInch6) {
		this.axlInch6 = axlInch6;
	}



	public WebElement getAxlFeet7() {
		return axlFeet7;
	}



	public void setAxlFeet7(WebElement axlFeet7) {
		this.axlFeet7 = axlFeet7;
	}



	public WebElement getAxlInch7() {
		return axlInch7;
	}



	public void setAxlInch7(WebElement axlInch7) {
		this.axlInch7 = axlInch7;
	}



	public WebElement getAxlFeet8() {
		return axlFeet8;
	}



	public void setAxlFeet8(WebElement axlFeet8) {
		this.axlFeet8 = axlFeet8;
	}



	public WebElement getAxlInch8() {
		return axlInch8;
	}



	public void setAxlInch8(WebElement axlInch8) {
		this.axlInch8 = axlInch8;
	}



	public WebElement getLoaddes() {
		return loaddes;
	}



	public void setLoaddes(WebElement loaddes) {
		this.loaddes = loaddes;
	}



	public WebElement getSelectsavedUnits() {
		return selectsavedUnits;
	}



	public void setSelectsavedUnits(WebElement selectsavedUnits) {
		this.selectsavedUnits = selectsavedUnits;
	}



	public WebElement getSavedUnits() {
		return savedUnits;
	}



	public void setSavedUnits(WebElement savedUnits) {
		this.savedUnits = savedUnits;
	}



	public WebElement getConfirm() {
		return confirm;
	}



	public void setConfirm(WebElement confirm) {
		this.confirm = confirm;
	}



	public WebElement getState() {
		return state;
	}



	public void setState(WebElement state) {
		this.state = state;
	}



	public WebElement getZipcode() {
		return zipcode;
	}



	public void setZipcode(WebElement zipcode) {
		this.zipcode = zipcode;
	}



	public WebElement getName() {
		return name;
	}



	public void setName(WebElement name) {
		this.name = name;
	}



	public WebElement getPhone() {
		return phone;
	}



	public void setPhone(WebElement phone) {
		this.phone = phone;
	}



	public WebElement getEmail() {
		return email;
	}



	public void setEmail(WebElement email) {
		this.email = email;
	}



	public WebElement getRefNote() {
		return refNote;
	}



	public void setRefNote(WebElement refNote) {
		this.refNote = refNote;
	}



	public WebElement getNextcompanypage() {
		return nextcompanypage;
	}



	public void setNextcompanypage(WebElement nextcompanypage) {
		this.nextcompanypage = nextcompanypage;
	}



	public WebElement getCompanyname() {
		return companyname;
	}



	public void setCompanyname(WebElement companyname) {
		this.companyname = companyname;
	}



	public WebElement getAddress() {
		return address;
	}



	public void setAddress(WebElement address) {
		this.address = address;
	}



	public WebElement getCity() {
		return city;
	}



	public void setCity(WebElement city) {
		this.city = city;
	}



	public WebElement getCheckbox() {
		return checkbox;
	}



	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}


	public WebElement getNextMainPage() {
		return nextMainPage;
	}


	public void setNextMainPage(WebElement nextMainPage) {
		this.nextMainPage = nextMainPage;
	}



	public WebElement getMonthyear() {
		return monthyear;
	}



	public void setMonthyear(WebElement monthyear) {
		this.monthyear = monthyear;
	}



	public WebElement getSelectYear() {
		return selectYear;
	}



	public void setSelectYear(WebElement selectYear) {
		this.selectYear = selectYear;
	}



	public WebElement getSelectMonth() {
		return selectMonth;
	}



	public void setSelectMonth(WebElement selectMonth) {
		this.selectMonth = selectMonth;
	}



	public WebElement getCalenderDate() {
		return calenderDate;
	}



	public void setCalenderDate(WebElement calenderDate) {
		this.calenderDate = calenderDate;
	}



	public WebElement getSelectpermittype() {
		return selectpermittype;
	}



	public void setSelectpermittype(WebElement selectpermittype) {
		this.selectpermittype = selectpermittype;
	}



	public WebElement getStartDate() {
		return startDate;
	}



	public void setStartDate(WebElement startDate) {
		this.startDate = startDate;
	}



	public WebElement getClickdropdown() {
		return clickdropdown;
	}

	public void setClickdropdown(WebElement clickdropdown) {
		this.clickdropdown = clickdropdown;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getClicknewPermit() {
		return clicknewPermit;
	}

	public void setClicknewPermit(WebElement clicknewPermit) {
		this.clicknewPermit = clicknewPermit;
	}

	public WebElement getDropdown() {
		return clickdropdown;
	}

	public void setDropdown(WebElement dropdown) {
		this.clickdropdown = dropdown;
	}


}
