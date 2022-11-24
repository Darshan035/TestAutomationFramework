package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_with_Excel {
	@Test
	public void excel_demo() throws IOException {
		//File path
		String File_path="./Test_Data/TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(File_path);
				
		Workbook book = new XSSFWorkbook(fis); // create an object for Excel
		
		                                            
	   Sheet sheet=book.getSheet("Sheet1");  //access the sheet
	   
	   String value=sheet.getRow(0).getCell(0).getStringCellValue();
	   System.out.println(value);
	   
	   System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	   
	   }

}
