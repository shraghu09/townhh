package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hometownwlcome {
	public WebDriver driver;
	
	@FindBy(xpath="//img[@class='Img-sc-1au8jwx-0 cAcHIh']")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='Furniture']")
	private WebElement furnibutton;
	
	@FindBy(xpath="//a[text()='Home Furnishings']")
	private WebElement furnishbutton;
	
	@FindBy(xpath="//a[text()='Home Décor']")
	private WebElement decorbutton;
	
	@FindBy(xpath="//a[contains(text(),'Tableware')]")
	private WebElement tablewarebutton;
	
	@FindBy(xpath="//a[contains(text(),'Kitchenware')]")
	private WebElement kitchenwarebutton;
	
	@FindBy(xpath="//a[text()='Bath']")
	private WebElement bathbutton;
	
	
	public Hometownwlcome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void mouseoverlogin() throws InterruptedException
	{ 
		
		Actions act=new Actions(driver);
		act.moveToElement(login).build().perform();
		Thread.sleep(3000);
		
	}
	
	public void mouseoverfurniture()
	{
		Actions act=new Actions(driver);
		act.moveToElement(furnibutton).build().perform();
	}
	public void mouseoverfurnishing()
	{
		Actions act =new Actions(driver);
		act.moveToElement(furnishbutton).build().perform();
		
		
	}
	public void mouseoverDecor()
	{
		Actions act=new Actions(driver);
				act.moveToElement(decorbutton);
		
	}
	public void mouseovertableware()
	{
		Actions act=new Actions(driver)
				;
		act.moveToElement(tablewarebutton);
	}
	public void mouseoverkitchenware()
	{
		Actions act =new Actions(driver);
		act.moveToElement(kitchenwarebutton);
	}
      public void mouseoverbath()
      {
    	  Actions act =new Actions(driver);
    	  act.moveToElement(bathbutton);
      }
}