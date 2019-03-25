package com.tests;

import org.testng.annotations.Test;

import com.generic.Basetest;
import com.pages.Hometownwlcome;

public class TC_furniture extends Basetest {
	
	@Test(priority=1)
	public void runfurtestcase() throws InterruptedException
	{
		Hometownwlcome home=new Hometownwlcome(driver);
		home.mouseoverfurniture();
		Thread.sleep(2000);
	}

}
