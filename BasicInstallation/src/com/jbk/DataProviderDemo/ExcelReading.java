package com.jbk.DataProviderDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReading {

	public static void main(String[] args) throws Exception {
		FileInputStream fis= new FileInputStream("testdata.xls");
		Workbook wb= Workbook.getWorkbook(fis);
		//Sheet sh= wb.getSheet("Sheet1");
		
		String[] sh1=wb.getSheetNames();
		
		for (int k=0;k<sh1.length;k++) {
			if (sh1[k].equals("Sheet 2")) {
				Sheet sh=wb.getSheet(sh1[k]);
				int rows=sh.getRows();
				int col=sh.getColumns();
				for (int i=0;i<rows;i++) {
			
					for (int j=0;j<col;j++) {
						Cell cell=sh.getCell(j, i);
						String content=cell.getContents();
						System.out.print(content);
						System.out.print(" ");
				
					}
					System.out.println();
				}
		

			}

		}
	}
}
