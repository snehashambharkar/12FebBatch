package com.SauceDemo.POMClassesPACK1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage 
{

private WebDriver driver;

@FindBy(xpath="//button[@id='cancel']")
private WebElement cancle;
public void clickcancle()
{
	cancle.click();
}

@FindBy(xpath="//button[@id='finish']")
private WebElement finish; 
public void clickfinish()
{
	finish.click();
}

//backbutton
@FindBy(xpath="//button[@id='back-to-products']")
private WebElement BackButton;
public void clickBackButton()
{
	BackButton.click();
}

public BillingPage(WebDriver driver)
{
	this.driver = driver;

	PageFactory.initElements(driver, this);
}






}
