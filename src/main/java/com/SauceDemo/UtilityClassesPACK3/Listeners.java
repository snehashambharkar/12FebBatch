package com.SauceDemo.UtilityClassesPACK3;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.SauceDemo.PracticePackage.Sampleclass;

public class Listeners implements ITestListener
{
	
	WebDriver driver;

public void onTestSuccess(ITestResult result)
{
	System.out.println("Test case is succefully pass");
}
  public void onTestFailure(ITestResult result)
  {
	  System.out.println("Test case is failed and hence taking the screenshot");
  
     this.driver =((Sampleclass)result.getInstance()).driver;

    		 Date d =new Date();
    	DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
    	      String f=d1.format(d);
	  
	  TakesScreenshot ts= (TakesScreenshot)driver;
	    File scource= ts.getScreenshotAs(OutputType.FILE);
	   File destfile = new File("./screenShot/sauceDemoLoginPage"+f+".jpg");
	 try 
	   {
		FileHandler.copy(scource, destfile);
	  } 
	 catch (IOException e) 
	 {
		e.printStackTrace();
	}
	 System.out.println("screenshot login page is taken");
	 
  
  
  
  
  
  
  }

  public void onTestStart(ITestResult result)
  {
	  System.out.println("Test is start");
  }
  
  
}
