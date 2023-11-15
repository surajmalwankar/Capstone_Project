package com.sportyshoe.SeleniumCucumberScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetupCheck {
	
	@Test
	public void testsetup_Selenium() 
		{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:9010");
		
		driver.close();
		
	}
}
