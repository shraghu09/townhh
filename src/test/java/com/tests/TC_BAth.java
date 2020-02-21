package com.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.generic.Basetest;
import com.pages.BAth;

public class TC_BAth extends Basetest{
	
	@Test(priority=3)
	public void Selectbath() throws InterruptedException, IOException
	{
		BAth b=new BAth(driver);
		b.bath();
		b.bathlinen();
		
		Thread.sleep(4000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("d:/crm/act.png"+System.currentTimeMillis()));
		
				
	}

}
