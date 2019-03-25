package com.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic.Basetest;
import com.pages.Hometownwlcome;

public class Logintest extends Basetest {
	
	@Test(priority=0,expectedExceptions=ArithmeticException.class)
	public void runtest() throws InterruptedException
	{
		//driver.findElement(By.id("onesignal-popover-cancel-button")).click();
		Hometownwlcome home=new Hometownwlcome(driver);
		 Thread.sleep(5000);
	     home.mouseoverlogin();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//a[text()='Log In']")).click();
	     Thread.sleep(4000);
	}
	
	

}
