package com.genericmethods;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.PageFactory;

import objectRepo.CheckoutPage;
import objectRepo.LoginPage;
import objectRepo.RegisterPage;
import objectRepo.StartnewPermitPage;

public class Base {
	public	static WebDriver driver;
	public Properties prop;
	public Properties dataProp;

	public String path="C:\\Users\\ZIBTEK\\eclipse-workspace\\com.MoldNinja\\config.properties";
	public String path1="C:\\Users\\ZIBTEK\\eclipse-workspace\\com.MoldNinja\\testdata.properties";
	
	public void loadPropertiesFile() {
		
	LoginPage login = new LoginPage(driver);
	StartnewPermitPage page = new StartnewPermitPage(driver);
	CheckoutPage cart = new CheckoutPage(driver);
	RegisterPage register = new RegisterPage(driver);
	
		
		prop=new Properties();
			File propFile = new File(path);
	                                  
			dataProp= new Properties();
			File dataPropFile = new File(path1);
			
			try {
				FileInputStream	fis = new FileInputStream(dataPropFile);
				dataProp.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				FileInputStream	fis1 = new FileInputStream(propFile);
				prop.load(fis1);
			} catch (IOException e) { 
				e.printStackTrace();
			}

		}

		public WebDriver initializeAndOpenBrowser(String browserName) throws InterruptedException {
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-gpu");
			options.addArguments("--remote-allow-origins=*");
			FirefoxOptions options1 = new FirefoxOptions();
			InternetExplorerOptions options2 = new InternetExplorerOptions();
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver(options);
			}else if(browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver(options1);
			}else if (browserName.equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver(options2);	
			}
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			StartnewPermitPage page = PageFactory.initElements(driver, StartnewPermitPage.class);
			CheckoutPage cart = PageFactory.initElements(driver, CheckoutPage.class);
			RegisterPage register =PageFactory.initElements(driver, RegisterPage.class);
			return driver;
			
		}
}
