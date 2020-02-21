package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Basepage;

public class Bath_linen extends Basepage {
	public WebDriver driver;
	
	@FindBy(xpath="utton[@class='Buttons__Button-sc-1t83isl-0 ctqcjH'and @color='#656565' and text()='Category']]")
	private WebElement catmouse;
	
	
	public Bath_linen(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void catlink()
	{
		Actions act=new Actions(driver);
		act.moveToElement(catmouse).build().perform();
	}

}
