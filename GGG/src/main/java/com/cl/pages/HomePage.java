package com.cl.pages;

import static com.cl.flights.tests.BaseClass.*;

import org.openqa.selenium.By;

public class HomePage {

	public static By txt_serachflights = By.xpath("//h1[contains(text(),'Search flights')]");

	public static void verifyHomepage() {
		if (driver.findElement(txt_serachflights).isDisplayed()) {
			System.out.println("i am into home page of app");
		} else {
			System.out.println("i am not into home page of app");
		}

	}

}
