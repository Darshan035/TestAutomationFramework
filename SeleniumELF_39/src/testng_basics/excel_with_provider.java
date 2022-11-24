package testng_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excel_with_provider {
	
@Test          
	public void excel_demo() throws IOException {
		//File path
		String File_path="./Test_Data/TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(File_path);
				
		Workbook book = new XSSFWorkbook(fis); //create an object for Excel //upcasting interface obj.=new class()
		
		                                            
	   Sheet sheet=book.getSheet("Sheet1");//access the sheet
	   int row_count=sheet.getPhysicalNumberOfRows();
	   int col_count =sheet.getRow(0).getPhysicalNumberOfCells();
	   System.out.println(row_count);
	   System.out.println(col_count);
	   
	   
	   Object[][] data=new Object[row_count-1][col_count];
	   
	    for(int row=1;row<row_count;row++) { 
	    	 for(int col=0;col<col_count;col++) {
	    		 
			data[row-1][col]=	sheet.getRow(row).getCell(col).getStringCellValue();
				
			}
			System.out.println();
	   }
	                 // print the value present in data object
	        /*       for(int i=0;i<=data.length-1;i++) {
	            	 for(int j=0;j<=data[i].length-1;j++) {
	            		 System.out.println(data[i][j]);
	            	 }
	             } */
}

}
