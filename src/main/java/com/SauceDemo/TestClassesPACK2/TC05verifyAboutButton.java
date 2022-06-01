package com.SauceDemo.TestClassesPACK2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassesPACK1.HomePagePomClass;
import com.SauceDemo.UtilityClassesPACK3.ScreenshotClass;

public class TC05verifyAboutButton extends TestBaseClass
{

    //verify weather we are able to check the 'about'
	   
   @Test
  public void aboutButton() throws IOException, InterruptedException
  {
     
	  
	   
	HomePagePomClass hp = new HomePagePomClass(driver);
       hp.clickMenuButton();
      System.out.println("click on menu Button");
      ScreenshotClass.takeScreenshot(driver);
      Thread.sleep(3000);
      
      hp.clickAbout();
      System.out.println("click on about button");
      ScreenshotClass.takeScreenshot(driver);
      Thread.sleep(3000);
      
    driver.navigate().back();
  
  
  
  
  
  }


}
