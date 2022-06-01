package com.SauceDemo.POMClassesPACK1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePom
{
  private WebDriver driver;

//@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
//private WebElement remove;
//public void clickremove()
//{
//	remove.click();
//}

@FindBy(xpath="//button[@id='continue-shopping']")
private WebElement continueButton;
public void clickcontinueButton()
{
	continueButton.click();
}

@FindBy(xpath="//button[@id='checkout']")
private WebElement checkout;
public void clickcheckout()
{
	checkout.click();
}

  public CartPagePom(WebDriver driver)
  {
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
  }








}


