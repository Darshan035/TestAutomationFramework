package PG_FrameWork;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	public class Pg_Utility_Method {
		 
		
		// utility methods for send key
			public static void Enter_value_in_edit_field(WebElement element ,String value) {
				element.sendKeys(value);
			}
				// utility methods for click
				public static void click_button(WebElement element) {
					element.click();
					}
				//utility for drop_down
				public static void  drop_down(WebElement element ,int index) {
					Select sel=new Select(element);
					sel.selectByIndex(index);   // select by index
				}
				public static void  drop_down_visible_text(WebElement element ,String value) {
					Select sel=new Select(element);
					sel.selectByVisibleText(value);  // select by visible text
				}
				public static void  drop_down_value(WebElement element ,String value) {
					Select sel=new Select(element);
					sel.selectByValue(value);  // select by value
				}
				// utility method for test_configuration
				public static String Test_configuration() throws IOException {
					String Filepath="./Test_configuration/Test_configuration.properties";
					FileInputStream fis=new FileInputStream(Filepath);
					
					// creating an object for properties class
					Properties prop=new Properties();
					prop.load(fis);
					String url=prop.getProperty("URL");
					return url;
				}
				
				
		// utility method for Testdata_excel
				@Test
				public static  Object[][]  TestData_excel(String sheetname) throws IOException {
					String File_path="./Test_Data/TestData.xlsx";
					
					FileInputStream fis=new FileInputStream(File_path);
							
					Workbook book = new XSSFWorkbook(fis); //create an object for Excel //upcasting interface obj.=new class()
					
					                                            
				   Sheet sheet=book.getSheet(sheetname);//access the sheet
				   int row_count=sheet.getPhysicalNumberOfRows();
				   int col_count =sheet.getRow(0).getPhysicalNumberOfCells();
				   System.out.println(row_count);
				   System.out.println(col_count);
				   
				   
				   Object[][] data=new Object[row_count-1][col_count];
				   
				    for(int row=1;row<row_count;row++) { 
				    	 for(int col=0;col<col_count;col++) {
				    		 
						data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
							
						}
						 }
				    book.close(); // it close worksheet after excute and not get trash
				    return data;
				    }
				
				
				// utility method for Action class
				 @Test
				 public static void Action_class(WebDriver driver,WebElement element ) {
					 Actions action=new Actions(driver);
					 action.moveToElement(element).build().perform();
					 
					 
				 }

	}



