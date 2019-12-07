package com.cl.components;
import static com.cl.flights.tests.BaseClass.*;
import com.cl.pages.SearchFlights;

public class Flights {

	public static void serachFlights() {
		SearchFlights.selectTritptype();
		SearchFlights.setFromloc();
		SearchFlights.setToloc();
		SearchFlights.selectDate();
		SearchFlights.selectAdults();
		SearchFlights.submit();
		
		
	}

}
