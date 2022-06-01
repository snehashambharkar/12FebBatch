package com.SauceDemo.TestClassesPACK2;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMClassesPACK1.LOginPagePomClass;

public class TestBaseClass 
{
	WebDriver driver ;
	Logger log;
	@BeforeMethod
	public void setUp()
	{
		log=Logger.getLogger("AAA");
		 PropertyConfigurator.configure("log4j.properties");
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

 driver = new ChromeDriver();

log.info("brower is opend");


driver.manage().window().maximize();
log.info("maximize window");

driver.get("https://www.saucedemo.com/");
log.info("URL open");

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
log.info("Implicity wait applied");

//login

LOginPagePomClass lp = new LOginPagePomClass(driver);

lp.sendUsername();        //username
log.info("Enter the username");

lp.sendPassword();       //password
log.info("enter the password");

lp.clickLoginButton();    //loginclick
log.info("click on loginbutton");
	}
	
	@AfterMethod
	public void tearDown() throws IOException, InterruptedException
	{
	//logout
	driver.quit();
	log.info("browser closed");
	
		

}
}