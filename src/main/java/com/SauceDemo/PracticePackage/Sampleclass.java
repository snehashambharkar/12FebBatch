package com.SauceDemo.PracticePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

  
@Listeners(com.SauceDemo.UtilityClassesPACK3.Listeners.class)
public class Sampleclass 
{
	
	public WebDriver driver;
	
//  @Test
//   public void verifyLoginUrl()
//   {
//	  
//	  Assert.assertTrue(true);
//  // System.out.println("Url test is passed");
//   }

//  
	
	@Test
    public void verifyTitel()
    {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertTrue(false);
		
    }





}



