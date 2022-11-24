package PG_FrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Utility_methods;

public class Pg_Search extends Pg_Base_Test {
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException{
		Object [][] data=Utility_methods.TestData_excel("Google_Search");
		//data[0][0]="books";
		return data;
	}
	@Test(dataProvider="Testdata")
	public void Google_Search(String  Sch) {
		
	WebElement search =	driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	Pg_Utility_Method.Enter_value_in_edit_field(search,Sch );
	Pg_Utility_Method.click_button(search);
	
	
	WebElement mouse_hover =driver.findElement(By.xpath("//p[text()='sarees new collection']"));
	Pg_Utility_Method.Action_class(driver, mouse_hover);
	Pg_Utility_Method.click_button(mouse_hover);
	
	WebElement click_saree =driver.findElement(By.xpath("//p[text()='Jivika Refined Sarees']"));
	Pg_Utility_Method.click_button(click_saree);
	
	WebElement add_to_cart =driver.findElement(By.xpath("//span[text()='Add to Cart']"));
	Pg_Utility_Method.click_button(add_to_cart);
	
	}
		
	

}
