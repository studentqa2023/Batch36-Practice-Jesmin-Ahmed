package com.testng.practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestngAnnotations {

	@Test
	public void test() {
		System.out.println("This is @Test");
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest");
}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is @BeforeMethod");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is @AfterTest");
		
	}
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("This is @AfterSuite");
		
	}
}
