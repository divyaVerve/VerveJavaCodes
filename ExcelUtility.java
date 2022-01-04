package com.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;



public class ExcelUtility {

	public static void main(String[] args) {
	
		try{
			File file=new File("C:\\Users\\ADMIN$\\Downloads\\eMedicareSyncTAF\\eMedicareSyncTAF\\src\\test\\resources\\downloads\\Side By Side Compare Report_01032022  04-25-34-929.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("2022 SOT");
			
			//XSSFCellStyle cs=sh.getRow(1).getCell(1).getCellStyle();
			XSSFRow row = sh.getRow(1);
			String ColorOrange =row.getCell(1).getCellStyle().getFillForegroundColorColor().getARGBHex();
			System.out.println("color of highlight:"+ColorOrange);
			//String strOrangeCode="FFFF7F50";
			//Assert.assertEquals(ColorOrange,strOrangeCode );
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}