package com.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.generic.Basetest;
import com.pages.Hometownwlcome;

public class Logintest extends Basetest {
	
	@Test(priority=0,expectedExceptions=Exception.class)
	public void runtest() throws InterruptedException, IOException
	{
		//driver.findElement(By.id("onesignal-popover-cancel-button")).click();
		Hometownwlcome home=new Hometownwlcome(driver);
		 Thread.sleep(5000);
	     home.mouseoverlogin();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//a[text()='Log In']")).click();
	     Thread.sleep(4000);
	     TakesScreenshot src = (TakesScreenshot)driver;
	     File src1=src.getScreenshotAs(OutputType.FILE);
	     File dest=new File(src1,"d:/actitime.png");
	     FileUtils.copyFile(src1, dest);
	     
	}
	
	

}
