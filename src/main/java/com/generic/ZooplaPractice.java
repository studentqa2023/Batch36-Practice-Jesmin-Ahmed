package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZooplaPractice {
	WebDriver driver;
	WebDriverWait wait;
	
	
	public void getLogin() {
		DriverManager dm =new DriverManager();
		driver= dm.getDriver(driver); 
		
		driver.navigate().to("https://www.zoopla.co.uk/");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		// Accept CookiesBtn
		if(mpf.getAcceptCookiesBtn().size()>0) {
			wait=new WebDriverwait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(mpf.getAcceptCookiesBtn().get(0)));
			mpf.getAcceptCookiesBtn().get(0).click();
			
		}
		//click on Login
		
		mpf.getZooplaLoginBtn().click();
		// Enter email 
		mpf.getZooplaEmail().sendKeys(null);
		//Enter Password
		mpf.getZooplaPassword().sendKeys(null);
		//Enter Login2
		mpf.getZooplaLoginBtn2().click();
		}

	public static void main(String[] args) {
		ZooplaPractice obj =new ZooplaPractice();
		obj.getLogin();
	}
}
