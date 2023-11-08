package com.testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTng2 {
	
	@Test
	@Parameters("myName")
	public void practiceParam(String myName) {
	System.out.println(myName);
		
	}

}
