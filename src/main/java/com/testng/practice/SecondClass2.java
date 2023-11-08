package com.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondClass2 {
	@Test
	public class AutomationLogin {
		public void getLogin() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			
			driver.navigate().to("https://automationexercise.com");
			driver.manage().window().maximize();
			
			MasterPageFactory mpf = new MasterPageFactory(driver);
		    mpf.getLogIn2().click();
		    
			//driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		    //driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("jesmin.ahmed.moni@gmail.com");
			//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("amma01716AE");
			//driver.findElement(By.xpath("(//*[@class ='btn btn-default'])[1]")).click();
			//driver.findElement(By.xpath("//*button[contains(text(),'Login']")).click();
			}
	}}
			
			
			
			

		

	

