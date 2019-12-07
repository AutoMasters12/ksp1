package com.cl.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import static com.cl.flights.tests.BaseClass.*;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelUtils {

	public static void loadTestData(String testname) throws Exception, IOException {
		File file = new File("F:\\java1\\GGG\\src\\test\\resources\\testdata\\data_xls.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet s = workbook.getSheet(0);
		int rows = s.getRows();
		int testrowno = 0;
		loop: for (int i = 0; i < rows; i++) {
			String test = s.getCell(0, i).getContents().trim();
			if (testname.equals(test)) {
				testrowno = i;
				break loop;
			}
		} 

			data= new HashMap<String, String>();
			int cols=s.getColumns();
			for(int j=0;j<cols;j++) {
				String key=s.getCell(j, 0).getContents().trim();
				String value=s.getCell(j, testrowno).getContents().trim();
				data.put(key, value);
			}
			System.out.println(data);

		

	}

}
