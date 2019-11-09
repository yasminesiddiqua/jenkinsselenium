package com.ust;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestCase {
	
	static WebDriver driver = null;
	
	@BeforeClass
	public static void setup(){
		System.setProperty("webdriver.chrome.driver","/Users/puneetvashisht/Downloads/chromedriver");
		driver = new ChromeDriver();

	}

	@Test
	public void test() {
		
//		System.setProperty("webdriver.chrome.driver","/Users/puneetvashisht/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.14.0/selenium-chrome-driver-3.14.0.jar");
	
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		assertTrue(true);
	}
	
	
	@AfterClass
	public static void afterTest() {
		driver.quit();			
	}	

}
