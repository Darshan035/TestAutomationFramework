package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class Tc4_mobile_advance_search extends Base_test {
	@DataProvider(name="advancesearch")
	
	public Object[][] testadvancesearch() throws IOException{
		
		Object[][]data=Utility_methods.TestData_excel("Advance");
		
	/*	data[0][0]="computers";
	   data[0][1]="Books";  // select by visible text
	//	 data[0][1]="1";       // select by value
	//	data[0][1]="2";        // select  by index
		
		 
	//    data[0][2]="Tricentis";  // select by text
		 data[0][2]="3";           // select by value
		data[0][3]="1000";
		data[0][4]="90000";  */
		
		return data;
	}
	@Test(dataProvider="advancesearch")
	
	public void AdvanceSearch(String search, String search_book,String search_tri, String from, String to )  {
		
	
	WebElement search_comp=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	 Utility_methods.Enter_value_in_edit_field(search_comp,search );
	
	 WebElement search_click =driver.findElement(By.xpath("//input[@value='Search']"));
	    Utility_methods.click_button(search_click);
	
	    WebElement search_click1=driver.findElement(By.xpath("//input[@id=\'As\']"));
	    Utility_methods.click_button(search_click1);
	    
	
	//WebElement category=driver.findElement(By.id("Cid"));
	//Select sel=new Select(category);
   // sel.selectByVisibleText("Computers");
	    
	//Utility_methods.drop_down(driver.findElement(By.id("Cid")), search_book);      // int serach_book   // by index
	Utility_methods.drop_down_visible_text(driver.findElement(By.id("Cid")), search_book);     // by text
	//Utility_methods.drop_down_value(driver.findElement(By.id("Cid")), search_book);                  // by value
	
	
	
	WebElement click2=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
	Utility_methods.click_button(click2);
	
	
	//WebElement mfr=driver.findElement(By.id("Mid"));
     //Select sel1=new Select(mfr);
     //sel1.selectByVisibleText("Tricentis");
	
//	Utility_methods.drop_down(driver.findElement(By.id("Mid")), search_tri);
	//Utility_methods.drop_down_visible_text(driver.findElement(By.id("Mid")), search_tri);
	Utility_methods.drop_down_value(driver.findElement(By.id("Mid")),search_tri );
	
	WebElement enter_key=driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
	Utility_methods.Enter_value_in_edit_field(enter_key,from);
	
	WebElement enter_to=driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));//sendKeys(to);
	 Utility_methods.Enter_value_in_edit_field(enter_to, to);
	
	
	 WebElement click3=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
	 Utility_methods.click_button(click3);
	
	//driver.close();
	
	}
	
	
	
	
		
		
	}


