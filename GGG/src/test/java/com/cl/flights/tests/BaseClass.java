package com.cl.flights.tests;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.cl.utils.BrowserUtils;

import junit.framework.TestCase;
import jxl.Sheet;
import jxl.Workbook;

public class BaseClass extends TestCase{
	public static WebDriver driver;
	public static HashMap<String,String> data;
	public static Workbook workbook;
	public static Sheet sheet;
	@Before
	public void setUp() throws Exception {
		BrowserUtils.openBrowser();
		BrowserUtils.launchApp();
	}

	@After
	public void tearDown() throws Exception {
		BrowserUtils.closeBrowser();
	}

}
