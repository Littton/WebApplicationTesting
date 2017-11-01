package com_Excel_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xslf.usermodel.XSLFSlideShowFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_From_Excel {

	public static void main(String[] args) throws IOException 
	
	{
		
		FileInputStream  file = new FileInputStream("C:\\Users\\Fahima\\Desktop\\Selenium Class\\TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet ws = wb.getSheet("sheet2");
	Row	 r= ws.createRow(0);
	
	Cell c=r.createCell(1);
	c.setCellValue("Ayaan");
	FileOutputStream  file1 = new FileOutputStream("C:\\Users\\Fahima\\Desktop\\Selenium Class\\TestData.xlsx");
	
	wb.write(file1);
		

	}

}
