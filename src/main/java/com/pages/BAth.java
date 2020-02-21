package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BAth {
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Bath']")
	private WebElement bathlink;
	
	
	@FindBy(xpath="(//a[text()='Bath Linen'])[1]")
	                 
	private WebElement bathlien;
	
	public BAth(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void bath()
	{
		Actions act=new Actions(driver);
		act.moveToElement(bathlink).perform();
	}
	public void bathlinen()
	{
		bathlien.click();
	}
	
	
	

}
