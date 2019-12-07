package com.cl.flights.tests;

import java.util.HashMap;

import org.junit.Test;

import com.cl.components.Flights;
import com.cl.pages.HomePage;
import com.cl.pages.ListOfFlights;
import com.cl.utils.ExcelUtils;

import junit.framework.TestCase;

public class TestSuite1 extends BaseClass {

	@Test
	public void test001() throws Exception {
		ExcelUtils.loadTestData(getName());
		HomePage.verifyHomepage();
		Flights.serachFlights();
		Thread.sleep(5000);
		ListOfFlights.ListverifyListOfFlightsPage();
		
	}

	@Test
	public void test002() throws Exception {
		ExcelUtils.loadTestData(getName());
		HomePage.verifyHomepage();
		Flights.serachFlights();
		Thread.sleep(5000);
		ListOfFlights.ListverifyListOfFlightsPage();
	}
	
	@Test
	public void test004() throws Exception {
		ExcelUtils.loadTestData(getName());
		HomePage.verifyHomepage();
		Flights.serachFlights();
		Thread.sleep(5000);
		ListOfFlights.ListverifyListOfFlightsPage();
	}


}
