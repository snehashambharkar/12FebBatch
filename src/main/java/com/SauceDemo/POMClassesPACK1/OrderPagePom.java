package com.SauceDemo.POMClassesPACK1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPagePom 
{
	private WebDriver driver;

   @FindBy(xpath="//button[@id='back-to-products']")
  private WebElement BackHome;
public void clickBackHome()
{
	BackHome.click();
}
   
public OrderPagePom(WebDriver driver)
{
	this.driver = driver;

PageFactory.initElements(driver, this);


}






}
