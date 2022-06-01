package com.SauceDemo.TestClassesPACK2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassesPACK1.HomePagePomClass;
import com.SauceDemo.POMClassesPACK1.LOginPagePomClass;



public class TC04MultipleProductAddToCart extends TestBaseClass 
{
	
	@Test
	public void MultipleProductAddToCart ()
	{
	   HomePagePomClass hp = new HomePagePomClass(driver);
       hp.addAllProduct();
	   System.out.println("all product are added");
	   
	   System.out.println("appy validation");
	   
	  String actualResult =hp.getTextfromcartbutton();
	  String expectedResult="3";
	
	if(actualResult.equals(expectedResult))
	{
		System.out.println("Test case is pass");
	}
	else
	{
		System.out.println("Test case is failed");
	}
	
	driver.quit();
	System.out.println("browser closed");
	
	}
	}   

