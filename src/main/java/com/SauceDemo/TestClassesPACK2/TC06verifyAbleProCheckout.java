package com.SauceDemo.TestClassesPACK2;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.POMClassesPACK1.HomePagePomClass;
import com.SauceDemo.UtilityClassesPACK3.ScreenshotClass;

public class TC06verifyAbleProCheckout extends TestBaseClass 
{

@Test
public void AbleProCheckout () throws InterruptedException, IOException
{
	HomePagePomClass hp = new HomePagePomClass (driver);
	hp.addAllProduct();
	System.out.println("add all product");
	ScreenshotClass.takeScreenshot(driver);
	Thread.sleep(3000);
	
	
	
	hp.Shoppingcart();
	System.out.println("click on shoppingcart");
	ScreenshotClass.takeScreenshot(driver);
	Thread.sleep(3000);
   
	
	hp.clickcheckoutButton();
  System.out.println("click on checkeout Button");
  ScreenshotClass.takeScreenshot(driver);
  Thread.sleep(3000);
  
}













}
