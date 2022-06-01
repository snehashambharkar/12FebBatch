package com.SauceDemo.POMClassesPACK1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOginPagePomClass 
{
  //webelement find
	//action on webelement

 // 1.webdriver declered

 private  WebDriver driver;
 private Actions act;
     
    // driver.findelement----> we will not use
     
    // Annotation--->@-->its method only --->functionality

    //find the element by @FindBy
  @FindBy(xpath="//input[@id='user-name']")
  private WebElement username;

  //actions on element  -method
  public void sendUsername()
  {
	   username.sendKeys("standard_user");
  }
  
  @FindBy(xpath="//input[@id='password']")
 private WebElement password;
  
  public void sendPassword()
  {
	 password.sendKeys("secret_sauce"); 
  }
  
  @FindBy(xpath="//input[@id='login-button']")
  private WebElement Loginbutton;
  
  public void clickLoginButton()
  {
	 // Loginbutton.click();
	  act.click(Loginbutton).perform();
  }
  
//  @FindBy(xpath="//a[@id='about_sidebar_link']")
//private WebElement About;
//public void clickAbout()
//{
//	  About.click();
//}
//
//@FindBy(xpath="//a[@id='logout_sidebar_link']")
//private WebElement logout;
//public void clicklogout()
//{
//	  logout.click();
//}
//
//  
  
  
  
  
  
  
  // constructor with argument
  
public LOginPagePomClass(WebDriver driver)  
{
	//global  =   local
	this.driver = driver;

	//selenium class
	PageFactory.initElements(driver, this);

	act =new Actions(driver);
}
  
  
  
  
  
  
  






}
