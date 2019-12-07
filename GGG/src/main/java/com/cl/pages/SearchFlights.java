package com.cl.pages;

import static com.cl.flights.tests.BaseClass.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SearchFlights {

	public static By rd_oneway = By.xpath("//input[@id='OneWay']");
	public static By rd_roundtrip = By.xpath("//input[@id='OneWay']");
	public static By rd_multitrip = By.xpath("//input[@id='OneWay']");
	public static By edit_fromloc = By.xpath("//input[@id='FromTag']");
	public static By edit_toloc = By.xpath("//input[@id='ToTag']");
	public static By date_icon = By
			.xpath("//dl[@class='vertical']//i[@class='icon ir datePicker'][contains(text(),'Cal')]");
	public static By date_value = By
			.xpath("//div[@class='monthBlock first']//a[contains(@class,'ui-state-default')][contains(text(),'10')]");
	public static By dd_adults = By.xpath("//select[@id='Adults']");
	public static By btn_submit = By.xpath("//input[@id='SearchBtn']");

	public static void selectTritptype() {
		String triptype=data.get("triptype");
		switch (triptype) {
		case "oneway":
			driver.findElement(rd_oneway).click();
			break;
		case "roundtrip":
			driver.findElement(rd_roundtrip).click();
			break;
		case "multitrip":
			driver.findElement(rd_multitrip).click();
			break;
		default:
			System.out.println("please enter valid trip type");
			break;
		}	

	}

	public static void setFromloc() {
		driver.findElement(edit_fromloc).sendKeys(data.get("fromloc"));

	}

	public static void setToloc() {
		driver.findElement(edit_toloc).sendKeys(data.get("toloc"));

	}

	public static void selectDate() {
		driver.findElement(date_icon).click();
		By date_value=By
		.xpath("//div[@class='monthBlock first']//a[contains(@class,'ui-state-default')][contains(text(),'"+data.get("fromdate")+"')]");
		driver.findElement(date_value).click();

	}

	public static void selectAdults() {
	new Select(driver.findElement(dd_adults)).selectByVisibleText(data.get("adults"));;

	}

	public static void submit() {
		driver.findElement(btn_submit).click();

	}

}
