package com.SauceDemo.PracticePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice1 
{
	//second
//   @Test
//public void loginTestCase()
//{
//	System.out.println("login Test Case");   
//}
//
//   //first
//   @BeforeMethod
//   public void beforeMethod1()
//   {
//	   System.out.println("before method");
//   }
//   
//   //third
//   @AfterMethod
//   public void afterMethod()
//   {
//	   System.out.println("after method");
//   }
//   
  //execution will not happen in sequence 
   //it will happen to annotation
   
   
   @BeforeMethod        //precondition
   
   public void setUpMethod()
   {
	   System.out.println("browser ,URL,Login");
   }
   
   @Test            //maintest
   public void verifyLoginFunctionality()
   {
	   System.out.println("login functionality verify");
   }
   
   @AfterMethod              //postcondition
   
   public void tearDown()
   {
	   System.out.println("browser closed");
   }
   
   
   
   
   
   
   
   
   
   
   




}


