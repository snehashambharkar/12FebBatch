package com.SauceDemo.POMClassesPACK1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfo 
{
  private WebDriver driver;

 @FindBy(xpath="//input[@id='first-name']")
private WebElement Firstname;
public void clickFirstname()
{
	Firstname.sendKeys("sneha");
	
}

@FindBy(xpath="//input[@id='last-name']")
private WebElement lastname;
public void clicklastname()
{
	lastname.sendKeys("shambharkar");
}

@FindBy(xpath="//input[@id='postal-code']")
private WebElement postalcode;
public void clickpostalcode()
{
	postalcode.sendKeys("123456789");
	
}

@FindBy(xpath="//button[@id='cancel']")
private WebElement cancle;
public void clickcancle()
{
	cancle.click();
}

@FindBy(xpath="//input[@id='continue']")
private WebElement continuebutton;
public void clickcontinuebutton()
{
	continuebutton.click();
}


  public CustomerInfo(WebDriver driver)
  {
	  this.driver = driver;
  
  PageFactory.initElements(driver, this);
  
  
  }









}
