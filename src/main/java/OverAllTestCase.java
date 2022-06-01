



	import java.io.IOException;
	import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.SauceDemo.POMClassesPACK1.BillingPage;
import com.SauceDemo.POMClassesPACK1.CartPagePom;
import com.SauceDemo.POMClassesPACK1.CustomerInfo;
import com.SauceDemo.POMClassesPACK1.HomePagePomClass;
	import com.SauceDemo.POMClassesPACK1.LOginPagePomClass;
import com.SauceDemo.TestClassesPACK2.TestBaseClass;
import com.SauceDemo.UtilityClassesPACK3.ScreenshotClass;

	public class OverAllTestCase extends TestBaseClass 
	{
		WebDriver driver;
	  //going to execute this cls

		@Test
		public  void  LoginFunctionalityTest() throws IOException, InterruptedException
		{
		String expectedtittel = "SWAG LABS";
		String actualTittel = driver.getTitle();
		
		System.out.println("verify the test case");
		
		if(expectedtittel.equals(actualTittel))
		{
			System.out.println("test case is passed");
		}
		else 
		{
			System.out.println("test case is failed");
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
		  
		  Assert.assertEquals(actualURL,  expectebURL);
		  }
		  
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
          
		   }
		   @Test
			public void MultipleProductAddToCart ()
			{
			   HomePagePomClass Hp = new HomePagePomClass(driver);
		       Hp.addAllProduct();
			   System.out.println("all product are added");
			   
			   System.out.println("appy validation");
			   
			  String actualResult= Hp.getTextfromcartButton();
			   String expectedResult="6";
			   
			   Assert.assertEquals(actualResult, expectedResult);
			}
			   
		 @Test
		  public void aboutButton() throws IOException, InterruptedException
		  {
		     
		HomePagePomClass Hp = new HomePagePomClass(driver);
		       Hp.clickMenuButton();
		      System.out.println("click on menu Button");
		      ScreenshotClass.takeScreenshot(driver);
		      Thread.sleep(3000);
		      
		      Hp.clickAbout();
		      System.out.println("click on about button");
		      ScreenshotClass.takeScreenshot(driver);
		      Thread.sleep(3000);
		      
		      driver.navigate().back();
		  }
		    	  
		      
		      @Test
		      public void AbleProCheckout () throws InterruptedException, IOException
		      {
		      	HomePagePomClass Hp = new HomePagePomClass (driver);
		      	Hp.addAllProduct();
		      	System.out.println("add all product");
		      	ScreenshotClass.takeScreenshot(driver);
		      	Thread.sleep(3000);
		      	
		      	
		      	
		      	Hp.Shoppingcart();
		      	System.out.println("click on shoppingcart");
		      	ScreenshotClass.takeScreenshot(driver);
		      	Thread.sleep(3000);
		         
		      	
		      	Hp.clickcheckoutButton();
		        System.out.println("click on checkeout Button");
		        ScreenshotClass.takeScreenshot(driver);
		        Thread.sleep(3000);
		        
		      }

		      @Test
		      public void SeeCusInformation()throws IOException, InterruptedException
		      {
		   	   HomePagePomClass Hp = new HomePagePomClass (driver);
		   		Hp.addAllProduct();
		   		System.out.println("add all product");
		   		ScreenshotClass.takeScreenshot(driver);
		   		Thread.sleep(3000);
		       
		   		Hp.Shoppingcart();
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
		      

		   
	 {


		  
		  
		  
		  }

	
	
	
	
	
	
	
	
	
	 
		  
		
		
		
		  
		
		
		
		
		{
		
		
		
		
		

	






		}

}
