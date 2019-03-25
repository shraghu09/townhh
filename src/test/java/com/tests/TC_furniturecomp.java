package com.tests;

import org.testng.annotations.Test;

import com.generic.Basetest;
import com.pages.Furniture;

public class TC_furniturecomp extends Basetest {
	@Test(priority=2)
	public void executetc() throws InterruptedException
	{
		
	
	Furniture fur =new Furniture(driver);
//	Thread.sleep(3000);
	fur.furimp();
	fur.sofaimp();
//	Thread.sleep(10000);

}
}