package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Furniture {
	public WebDriver driver;
	@FindBy(xpath="//a[text()='Furniture']")
	private WebElement furlink;
	
	@FindBy(xpath="//a[text()='Living Room Furniture'and @title='Living Room Furniture']")
    private WebElement livingroomlink; 
	
	@FindBy(xpath="//a[text()='Sofas' and  @title='Sofas']")
	private WebElement sofalink;
	
	public Furniture(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void furimp()
	{
		Actions act=new Actions(driver);
		act.moveToElement(furlink).build().perform();
		
	}
	public void livingimp()
	{
		livingroomlink.click();
	}
	public void sofaimp()
	{
		sofalink.click();
	}
	

}
