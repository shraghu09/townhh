package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	public WebDriver driver;
	
//	@BeforeSuite
//	public void setup()
//	{
		
	@BeforeMethod
	public void openapp()
	{
		WebDriverManager.chromedriver().version("79.0").setup();
//		}
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hometown.in/");
		
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
