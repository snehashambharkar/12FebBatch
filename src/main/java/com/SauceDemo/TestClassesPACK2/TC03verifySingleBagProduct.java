package com.SauceDemo.TestClassesPACK2;

import org.testng.annotations.Test;

import com.SauceDemo.POMClassesPACK1.HomePagePomClass;

public class TC03verifySingleBagProduct extends TestBaseClass
{

   @Test
   public void SingleBagProduct() throws InterruptedException
   {
	
	   HomePagePomClass hp = new HomePagePomClass (driver);
	   hp.clickBagProdAddTOCart();
	   System.out.println("product is added to the bag");
       Thread.sleep(2000);
   System.out.println("apply the validation");
   
   String actualResult=hp.getTextfromcartbutton();
   String ExpectedResult ="1";
   if(actualResult.equals(ExpectedResult))
   {
	   System.out.println("test case is pass");
   }
   else
   {
	   System.out.println("Test case is failed");
   }
   
   driver.quit();
   System.out.println("browser closed");
   
   
   
   
   }
   







}
