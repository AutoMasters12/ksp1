package com.cl.pages;

import static com.cl.flights.tests.BaseClass.driver;

import org.openqa.selenium.By;

public class ListOfFlights {
	public static By lnk_modifysearch = By.xpath("//div[@id='ResultContainer_1_1']//a[@id='modifySearchLink']");

	public static void ListverifyListOfFlightsPage() {

		if (driver.findElement(lnk_modifysearch).isDisplayed()) {
			System.out.println("i am into list of flights page");
		} else {
			System.out.println("i am not into list of flights page ");
		}

	}

}
