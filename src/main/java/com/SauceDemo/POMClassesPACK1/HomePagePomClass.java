package com.SauceDemo.POMClassesPACK1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePomClass 
{
   private WebDriver driver;


  //shopingcart  bag
  @FindBy(xpath="//div[@id='shopping_cart_container']")
  private WebElement Shoppingcart;
  public  void Shoppingcart()
  {
	  Shoppingcart.click();
  }
  
  //get text()method
  public String getTextfromcartbutton()
  {
	  String totalproduct=Shoppingcart.getText();
	  return totalproduct;
  }
  
  //get text()method for 1 
  public String getTextfromcartButton()
  {
	  String singleProduct=Shoppingcart.getText();  
      return singleProduct;
  }
  
  
  //MenuButton
  @FindBy(xpath="//button[@id='react-burger-menu-btn']")
  private WebElement MenuButton;
  public void clickMenuButton()
  {
	  MenuButton.click();
  }
  
  @FindBy(xpath="//a[@id='logout_sidebar_link']")
  private WebElement logout;
  public void clicklogout()
  {
  	  logout.click();
  }

   //dropdown button
  
 private Select s ;
  
  @FindBy(xpath="//select[@class='product_sort_container']")
  private WebElement filterButton;
  public void clickOnfilterButton()
  {
	  filterButton.click(); 
	  s.selectByVisibleText("Name (A to Z)");
 }
//  
//  @FindBy(xpath="//a[@id='inventory_sidebar_link']")
//  private WebElement Allitems;
//  public void clickAllitems()
//  {
//	  Allitems.click();
//  }
//  
  @FindBy(xpath="//a[@id='about_sidebar_link']")
 private WebElement About;
  public void clickAbout()
  {
	  About.click();
  }
//  
//  @FindBy(xpath="//a[@id='logout_sidebar_link']")
//  private WebElement logout;
//  public void clicklogout()
//  {
//	  logout.click();
//  }
//  
//  @FindBy(xpath="//a[@id='reset_sidebar_link']")
//  private WebElement ResetAppSet;
//  public void clickResetAppSet()
//  {
//	  ResetAppSet.click();
//  }
  
  //single product
  
  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
  private WebElement BagProdAddTOCart;
  public void clickBagProdAddTOCart()
  {
	  BagProdAddTOCart.click();
  }
  
//continue
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	public void clickcontinueButton()
	{
		continueButton.click();
	}

	//checkout
  @FindBy(xpath="//button[@id='checkout']")
  private WebElement checkoutButton;
  public void clickcheckoutButton()
  {
	  checkoutButton.click();
  }
  
  //constructor
  public HomePagePomClass(WebDriver driver)
{   
 this.driver = driver;
  
  PageFactory.initElements(driver, this);
 s = new Select(filterButton);
  
  }
  
//multiple element by using driver.findElements
@FindBy(xpath="//button[text()='Add to cart']")
private List<WebElement> multipleAddTocart;

public void addAllProduct()
{
	for(int i=0; i<multipleAddTocart.size();i++)
	{
		multipleAddTocart.get(i).click();
	}

	

	




}

}




