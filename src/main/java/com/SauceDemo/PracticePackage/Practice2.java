package com.SauceDemo.PracticePackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice2 
{

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
  
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test ");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class ");
	}
	
	@BeforeMethod 
  public void beforeMethod()
  {
	  System.out.println("Before Method");
  }
	
		@Test 
  public void testCase1()
  {
	  System.out.println("Test case 1");
  }
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
  @AfterTest
  public void afterTest()
  {
	  System.out.println("After Test");
  }
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}
	
	
}
