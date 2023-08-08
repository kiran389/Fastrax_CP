package testScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericmethods.Base;
import com.genericmethods.eventlist;

import objectRepo.StartnewPermitPage;
@Listeners(eventlist.class)
public class StartnewPermittest extends Base{

	@Test(priority = 1)
	public void newPermitMainPage() throws InterruptedException {
		StartnewPermitPage page = new StartnewPermitPage(driver);
		page.getClicknewPermit().click();
		Thread.sleep(2000);
		page.getClickdropdown().click();
		Thread.sleep(2000);
		page.getSelectpermittype().click();
		Thread.sleep(2000);
		page.getStartDate().click();
		Thread.sleep(2000);
		page.getMonthyear().click();
		Thread.sleep(2000);
		page.getSelectYear().click();
		Thread.sleep(2000);
		page.getSelectMonth().click();
		Thread.sleep(2000);
		page.getCalenderDate().click();
		Thread.sleep(2000);
		page.getCheckbox().click();
		Thread.sleep(2000);
		page.getNextMainPage().click();	
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void companyPage() throws InterruptedException {
		StartnewPermitPage page = new StartnewPermitPage(driver);
		Thread.sleep(2000);
		page.getCompanyname().clear();
		Thread.sleep(2000);
		page.getCompanyname().sendKeys("zibtek");
		//	Thread.sleep(2000);
		page.getAddress().sendKeys("Bengalure");
		//	Thread.sleep(2000);
		page.getCity().sendKeys("Channsandra");
		//	Thread.sleep(2000);
		page.getState().sendKeys("Karnataka");
		//	Thread.sleep(2000);
		page.getZipcode().sendKeys("560009");
		//	Thread.sleep(2000);
		page.getName().sendKeys("Praveen Kumar");
		//	Thread.sleep(2000);
		page.getPhone().sendKeys("9108649098");
		//	Thread.sleep(2000);
		page.getEmail().sendKeys("kiran@zibtek.in");
		//	Thread.sleep(2000);
		page.getRefNote().sendKeys("Hey! this is the automation script for Comapny Details Page");
		//	Thread.sleep(2000);
		page.getNextcompanypage().click();
	}
	@Test(priority = 3)
	public void loadPage() throws InterruptedException {
		StartnewPermitPage page = new StartnewPermitPage(driver);
		page.getLoaddes().clear();
		Thread.sleep(2000);
		page.getLoaddes().sendKeys("Kiran Kumar");
		Thread.sleep(2000);
		page.getSelectsavedUnits().click();
		Thread.sleep(2000);
		page.getSavedUnits().click();
		Thread.sleep(2000);
		page.getConfirm().click();
		Thread.sleep(2000);
		page.getLenFeet().sendKeys("222");
		//	Thread.sleep(2000);
		page.getLenInches().sendKeys("22");
		//	Thread.sleep(2000);
		page.getWidFeet().sendKeys("200");
		//	Thread.sleep(2000);
		page.getWidInches().sendKeys("200");
		//	Thread.sleep(2000);
		page.getHeigtFeet().sendKeys("250");
		//	Thread.sleep(2000);
		page.getHeigtInch().sendKeys("25");
		//	Thread.sleep(2000);
		page.getTrailerLen().sendKeys("300");
		//	Thread.sleep(2000);
		page.getTrailerInch().sendKeys("30");
		//	Thread.sleep(2000);
		page.getFrontFeet().sendKeys("400");
		//	Thread.sleep(2000);
		page.getFrontInches().sendKeys("40");
		//	Thread.sleep(2000);
		page.getRearFeet().sendKeys("500");
		//	Thread.sleep(2000);
		page.getRearInches().sendKeys("50");
		Thread.sleep(2000);
		page.getNumberofaxle().sendKeys("3");
		Thread.sleep(2000);
		page.getGroup1().sendKeys("2");
		//		Thread.sleep(2000);
		page.getWeight1().sendKeys("10");
		page.getGroup2().sendKeys("3");
		page.getWeight2().sendKeys("20");
		page.getGroup3().sendKeys("4");
		page.getWeight3().sendKeys("30");
		WebElement totalaxle =page.getTotalNumofaxle();
		String noofaxles = totalaxle.getAttribute("value");
		System.out.println("Total number of axles is:"+noofaxles);

		WebElement totalgrossweight = page.getTotalgrosswight();
		String grossweight = totalgrossweight.getAttribute("value");
		System.out.println("Total gross weight is:"+grossweight);

		page.getAxlFeet1().sendKeys("1");
		page.getAxlInch1().sendKeys("1");
		page.getAxlFeet2().sendKeys("2");
		page.getAxlInch2().sendKeys("2");
		page.getAxlFeet3().sendKeys("3");
		page.getAxlInch3().sendKeys("3");
		page.getAxlFeet4().sendKeys("4");
		page.getAxlInch4().sendKeys("4");
		page.getAxlFeet5().sendKeys("5");
		page.getAxlInch5().sendKeys("5");
		page.getAxlFeet6().sendKeys("6");
		page.getAxlInch6().sendKeys("6");
		page.getAxlFeet7().sendKeys("7");
		page.getAxlInch7().sendKeys("7");
		page.getAxlFeet8().sendKeys("8");
		page.getAxlInch8().sendKeys("8");
		Thread.sleep(3000);
		//page.getNextLoad().click();
		
		WebElement nextButton = page.getNextLoad();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", nextButton);
		

	}
	
	@Test(priority = 4)
	public void routePage() throws InterruptedException {
		StartnewPermitPage page = new StartnewPermitPage(driver);
	    page.getRouteNotes().clear();
	    Thread.sleep(2000);
		page.getRouteNotes().sendKeys("Hey! this is the automation script for Route Page");
		Thread.sleep(2000);
		
		page.getCreatemanual().click();
		Thread.sleep(2000);
		
		page.getSavedroutes().click();
		Thread.sleep(2000);
		page.getSelectSavedRoute().click();
		Thread.sleep(2000);
		page.getConfirmRoute().click();
		Thread.sleep(3000);
		page.getNextRoute().click();
		Thread.sleep(8000);
		
		WebElement svetodraft = page.getSavetopermitDraft();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].click();", svetodraft);
		
		//page.getSavetopermitDraft().click();
		Thread.sleep(4000);
		page.getPermitDrafts().click();
		Thread.sleep(4000);
		page.getViewfirstpermit().click();
	
		Thread.sleep(2000);
		JavascriptExecutor je1 = (JavascriptExecutor)driver;
		WebElement down =page.getScrollDown();
		je1.executeScript("arguments[0].scrollIntoView()", down);
		Thread.sleep(2000);
		WebElement up = page.getScrollUp();
		Thread.sleep(2000);
		je.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'end' });", up);
		Thread.sleep(3000);
		page.getCloseDraft().click();
		Thread.sleep(3000);
		page.getDraftfirstdata().click();
		Thread.sleep(4000);
		page.getDraftmainPage().click();
		Thread.sleep(3000);
		page.getDraftNextmainpage().click();
		Thread.sleep(3000);
	    page.getNextcompanypage().click();
	    Thread.sleep(5000);
	  
//		page.getDraftNextloadpage().click();
//		Thread.sleep(3000);
		
		WebElement nextload = page.getDraftNextloadpage();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", nextload);
		
		page.getDraftCreateManual().click();
		Thread.sleep(3000);
		page.getDraftNextroutepage().click();
		Thread.sleep(8000);
		
		JavascriptExecutor je2 = (JavascriptExecutor)driver;
		WebElement addcart = page.getAddToCart();
		je2.executeScript("arguments[0].scrollIntoView()", addcart);
		Thread.sleep(3000);
		page.getAddToCart().click();
		
			
	}
}
