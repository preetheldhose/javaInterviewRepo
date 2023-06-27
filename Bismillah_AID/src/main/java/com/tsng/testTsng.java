package com.tsng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testTsng {
	
	@BeforeTest
	public void setUp() {
		
		System.out.println("BeforeTest : setUp method");
	}
	
	@Test
	public void test() {
		System.out.println("Actual Test : Test method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest : code ");
		
	}

}
