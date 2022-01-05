package com.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class Utility {

private static XSSFWorkbook workbook;
	
	private static XSSFSheet excelSheet;
	
	private static XSSFRow row;
	
	private static XSSFCell cell;
	
    
	public static String getColorOfCell(int rowNum,int colNum)
	{

		try{
			File file=new File("C:\\Users\\ADMIN$\\Downloads\\eMedicareSyncTAF\\eMedicareSyncTAF\\src\\test\\resources\\downloads\\Side By Side Compare Report_01032022  04-25-34-929.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("2022 SOT");
			//XSSFCellStyle cs=sh.getRow(1).getCell(1).getCellStyle();
			XSSFRow row = sh.getRow(rowNum);
			String cellColor =row.getCell(colNum).getCellStyle().getFillForegroundColorColor().getARGBHex();
			//System.out.println("color of highlight:"+cellColor);
			return cellColor;
		    }catch(Exception e){
			return "";
			}
		}
	public void readHighlightFromExcel() throws Exception{
		
		try {
			File file=new File("C:\\Users\\ADMIN$\\Downloads\\eMedicareSyncTAF\\eMedicareSyncTAF\\src\\test\\resources\\downloads\\Side By Side Compare Report_01032022  04-25-34-929.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("2022 SOT");
		    int rowNum,colNum;
	    	rowNum = sh.getLastRowNum(); 
		    System.out.println("Last row"+rowNum);
		    colNum= sh.getRow(1).getLastCellNum(); 
		    for(int i = 1;i <=rowNum ;i++){ 
		    for(int j=0; j < colNum; j++) { 
			   String strColorCode=getColorOfCell(i, j);
			  /* if(strColorCode.equals("FFFF7F50")||strColorCode.equals("FFFFC0CB"))
			   {
				System.out.println("Highlighted Cell at "+i+" "+j+" Color code : "+strColorCode);
				
			   }*/
			   if(strColorCode.equals("FFFF7F50"))
			   {
				   System.out.println("Highlighted Cell at "+i+" "+j+" Color code : "+strColorCode);
				   Assert.assertEquals(strColorCode,"FFFF7F50");
			   }
			   else if(strColorCode.equals("FFFFC0CB"))
			   {
				   System.out.println("Highlighted Cell at "+i+" "+j+" Color code : "+strColorCode);
				   Assert.assertEquals(strColorCode,"FFFFC0CB");
			   }
		    }
		}
		}
		catch (Exception e) {
		  e.printStackTrace();
		}
      }
	
	
}
