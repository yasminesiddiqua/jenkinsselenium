package com.ust.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {
	
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().version("79.0.3945.16").setup();
		
		System.setProperty("webdriver.chrome.driver","/Users/puneetvashisht/Downloads/chromedriver");
		
//		WebDriver 78.0.3904.97
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
