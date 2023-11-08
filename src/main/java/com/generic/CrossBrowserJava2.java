package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserJava2 {
	
	WebDriver driver;
	public void crossBrowserLogin(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("Brwser opened="+browser);
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("Brwser opened="+browser);
		}
		else {
			System.out.println("Not found any browser");
		}
        driver.manage().window().maximize();
		
		driver.navigate().to("https://www.costco.com/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		Actions ac =new Actions(driver);
		
	    ac.moveToElement(mpf.getServices()).perform();
	}
      public static void main(String[] args) {
    	  CrossBrowserJava2 obj=new CrossBrowserJava2();
    	  obj.crossBrowserLogin("firefox");
    	  
    
}
}
