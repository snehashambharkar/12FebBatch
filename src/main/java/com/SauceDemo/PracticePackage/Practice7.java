package com.SauceDemo.PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Practice7 

{
   @Test (priority=2)
  public void LoginTest()
  {
	   System.out.println("Login Test case");
     Assert.assertTrue(false);
  }

   @Test (dependsOnMethods= {"LoginTest"},priority=1)
  public void SingleProduct()
  {
	   System.out.println("Single Product Tese case");
  }

}
