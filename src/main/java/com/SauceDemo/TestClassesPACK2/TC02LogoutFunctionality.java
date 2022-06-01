package com.SauceDemo.TestClassesPACK2;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassesPACK1.HomePagePomClass;
import com.SauceDemo.POMClassesPACK1.LOginPagePomClass;

public class TC02LogoutFunctionality extends TestBaseClass 
{
	
  @Test
  public void LogOutFunctionality() throws InterruptedException
  {
	  //homePage
	  HomePagePomClass hp = new HomePagePomClass(driver);
	  hp.clickMenuButton();
	  System.out.println("click on menubutton");
	  Thread.sleep(3000);
	  
	  hp.clicklogout();
	  System.out.println("click on logout button");
	  Thread.sleep(3000);
	  
	  
	  System.out.println("Apply validation");
  
  String expectebURL = "https://www.saucedemo.com/";
  String actualURL =driver.getCurrentUrl();
  
  
  }
  
  
  
  
  
  
  
  
  }


