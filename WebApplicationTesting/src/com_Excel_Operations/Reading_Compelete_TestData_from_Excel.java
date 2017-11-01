package com_Excel_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Compelete_TestData_from_Excel {

	public static void main(String[] args) throws IOException 
	
	{
		
		FileInputStream file  = new FileInputStream("C:\\Users\\Fahima\\Desktop\\Selenium Class\\TestData.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet ws= wb.getSheet("sheet1");
		
	 int RowCount	=ws.getLastRowNum();
	 
	 for(int i=0;i<=RowCount;i++) // Row
	 {
	Row	r=ws.getRow(i); 
		int CellCount=r.getLastCellNum();
	// int CellCount=r.getLastCellNum();
		
		 for(int j=0;j<CellCount;j++) // Cell
		{
		
			Cell C =r.getCell(j);
		String TestData	=C.getStringCellValue();
		System.out.print(TestData+"   ");
			
		}
		System.out.println();
		
	 }
		
	}

}
