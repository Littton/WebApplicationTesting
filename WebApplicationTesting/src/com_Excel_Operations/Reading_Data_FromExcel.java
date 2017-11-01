package com_Excel_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class Reading_Data_FromExcel {

	public static void main(String[] args) throws IOException 
	
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Fahima\\Desktop\\Selenium Class\\TestData.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("sheet1");
		
	Row	r =ws.getRow(0);
	Cell c= r.getCell(0);
	
	String TestData=c.getStringCellValue();
	
	System.out.println(TestData);
	
        
        
		
	}

}
