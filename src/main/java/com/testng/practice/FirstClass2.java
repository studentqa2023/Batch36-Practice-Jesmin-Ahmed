package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.generic.CostcoPractice;
import com.generic.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass2 { 
	ExtentReports extent;
	ExtentTest test;
	
@BeforeTest
public void setupReport() {
	
	
	
	
	
}
@Test
public void getMouseHover() {

	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.costco.com/");
	
	MasterPageFactory mpf = new MasterPageFactory(driver);
	Actions ac =new Actions(driver);
	
	 ac.moveToElement(mpf.getServices()).perform();
		
}

public static void main(String[] args) {
	CostcoPractice obj=new CostcoPractice();
	obj.getMouseHover();
	
}

	
}
