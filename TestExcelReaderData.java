package com.generic;

public class TestExcelReaderData {

	public static void main(String[] args) {
		ExcelReaderUtility.loadExcelFile(System.getProperty("user.dir")+"/src/main/resources/resources/excel/Automation_exterbal_testData_input.xlsx","TC_ID_01");
        String strTestData="";
        
        for(int intRow=0;intRow<4;intRow++)
        {
        	for(int intcolm=0; intcolm<4; intcolm++)
        	{
        	strTestData=ExcelReaderUtility.getCellDataFromExcel(intRow, intcolm);
        	System.out.println("Print test data:"+strTestData);
            }
	    }
        System.out.println("=====================================");
        System.out.println("Excel data:"+ExcelReaderUtility.getCellDataFromExcel(2, 2));
	}
}