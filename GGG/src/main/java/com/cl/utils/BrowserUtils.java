package com.cl.utils;

import static com.cl.flights.tests.BaseClass.*;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	public static void openBrowser() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
		
	}

	public static void launchApp() {
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
	}

	public static void closeBrowser() {
		driver.quit();
		
	}

}
