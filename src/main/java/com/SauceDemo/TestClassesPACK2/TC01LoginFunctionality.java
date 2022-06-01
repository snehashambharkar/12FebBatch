package com.SauceDemo.TestClassesPACK2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.POMClassesPACK1.HomePagePomClass;
import com.SauceDemo.POMClassesPACK1.LOginPagePomClass;
import com.SauceDemo.UtilityClassesPACK3.ScreenshotClass;



public class TC01LoginFunctionality extends TestBaseClass 
{

  //going to execute this cls

	@Test
	public  void  LoginFunctionalityTest() throws IOException, InterruptedException
	{
	String expectedtittel = "SWAG LABS";
	String actualTittel = driver.getTitle();
	
	System.out.println("verify the test case");
	
	 if(actualTittel.equals(expectedtittel))
	  {
		  System.out.println("Test case is passed");
	  }
	  else
	  {
		  System.out.println("Test case is failed");
	  }
	  
	//logout
    ScreenshotClass.takeScreenshot(driver);
	
	HomePagePomClass hp = new HomePagePomClass(driver);
	  hp.clickMenuButton();
	  System.out.println("click on menubutton");
	  Thread.sleep(3000);
	  
	 hp.clicklogout();
	  System.out.println("click on logout button");
	  Thread.sleep(3000);
     
	
	}
	
	
		
	
	
	{
	
	
	
	
	}

}
