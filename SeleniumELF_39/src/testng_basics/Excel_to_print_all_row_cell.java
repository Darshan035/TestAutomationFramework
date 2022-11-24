package testng_basics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_to_print_all_row_cell {
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
	   
	   
	  
	   for(int row=1;row<row_count;row++) {  
			
			for(int col=0;col<col_count;col++) {
				
				System.out.print(sheet.getRow(row).getCell(col).getStringCellValue()+" ");
			}
			System.out.println();
	   }
	   
	    
}
}




