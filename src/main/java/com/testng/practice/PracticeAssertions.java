package com.testng.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssertions {
	int a=5;
	int b=3;
	@Test(priority=0)
	public void getSum() {
		System.out.println(a+b);
		Assert.assertEquals(a+b,8);//hard assert
		
	}
	
@Test(priority=1)
public void getMultiply() {
	System.out.println(a*b);//15
	
	
	
}
}
