package com.generic;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderUtility {

	private static XSSFWorkbook workbook;
	
	private static XSSFSheet excelSheet;
	
	private static XSSFRow row;
	
	private static XSSFCell cell;
	
	public static void loadExcelFile(String excelFilePath,String strSheetName)
	{
		try{
			FileInputStream excelFile=new FileInputStream(excelFilePath);
			workbook=new XSSFWorkbook(excelFile);
			excelSheet=workbook.getSheet(strSheetName);
		}catch(Exception exception){
			System.out.println("While loading from excel getting error:"+exception.getMessage());
			exception.printStackTrace();
		}
	}
	public static String getCellDataFromExcel(int rowNum,int cellNum)
	{
		try{
			cell= excelSheet.getRow(rowNum).getCell(cellNum);
			String strCellData=cell.getStringCellValue();
			return strCellData;
		}catch(Exception exception){
			System.out.println("Getting error while reading excel data:"+exception.getMessage());
			exception.printStackTrace();
			return "";
		}
	}
	
	
}
