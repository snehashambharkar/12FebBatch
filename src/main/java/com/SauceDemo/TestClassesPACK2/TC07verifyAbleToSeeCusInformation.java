package com.SauceDemo.TestClassesPACK2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassesPACK1.BillingPage;
import com.SauceDemo.POMClassesPACK1.CartPagePom;
import com.SauceDemo.POMClassesPACK1.CustomerInfo;
import com.SauceDemo.POMClassesPACK1.HomePagePomClass;
import com.SauceDemo.UtilityClassesPACK3.ScreenshotClass;

public class TC07verifyAbleToSeeCusInformation extends TestBaseClass 
{
   @Test
   public void SeeCusInformation() throws InterruptedException, IOException
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
	   
		CartPagePom cp =new CartPagePom(driver);
         cp.clickcheckout();
          System.out.println("click on checout ");
          ScreenshotClass.takeScreenshot(driver);
  		Thread.sleep(3000);

  		CustomerInfo ci=new CustomerInfo(driver);
        ci.clickFirstname();
   System.out.println("insert first name");
   Thread.sleep(3000);
   
   ci.clicklastname();
   System.out.println("insert last name");
   Thread.sleep(3000);
   
   ci.clickpostalcode();
   System.out.println("insert postal code");
   Thread.sleep(3000);
   
   ci.clickcontinuebutton();
   System.out.println("click on continue button");
   
   String actual=driver.getCurrentUrl();
   String expected="https://www.saucedemo.com/checkout-step-one.html";
   if(actual.equals(expected))
   {
	   System.out.println("Test case pass");
       System.out.println("user can buy product");
   }
   else
   {
	   System.out.println("Test case failed");
   }
   
   
   BillingPage bp=new BillingPage(driver);
   bp.clickfinish();
   System.out.println("click on finish button");
   Thread.sleep(3000);
   
   bp.clickBackButton();
   System.out.println("click on back button");
   
   
   
   
   }
   }
