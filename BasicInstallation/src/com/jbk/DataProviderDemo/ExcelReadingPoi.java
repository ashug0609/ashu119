package com.jbk.DataProviderDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingPoi {

	public static void main(String[] args) throws Exception {
		String fname="testdata.xls";
		FileInputStream fis= new FileInputStream(fname);
		Workbook wb=null;
		String extension= fname.substring(fname.indexOf("."));
		System.out.println(extension);
		if (extension.equals(".xls")) {
			wb=new HSSFWorkbook(fis);
			
		}
		else {
			wb=new XSSFWorkbook(fis);
			
		}
		Sheet sh= wb.getSheet("Sheet 2");
		int totalrows=sh.getLastRowNum()-sh.getFirstRowNum();
		for (int i=0;i<totalrows+1;i++) {
			Row row=sh.getRow(i);
			for( int j=0;j<row.getLastCellNum();j++) {
				System.out.println(row.getCell(j).getStringCellValue());
				
			}
		}
	}

}
