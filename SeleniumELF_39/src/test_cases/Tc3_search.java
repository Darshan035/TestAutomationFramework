package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class Tc3_search extends Base_test {
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException{
		Object [][] data=Utility_methods.TestData_excel("Search");
		//data[0][0]="books";
		return data;
	}
	@Test(dataProvider="Testdata")
	public void Demo(String Booksss) {
		
		WebElement Search=driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
	     Utility_methods.Enter_value_in_edit_field(Search,Booksss );
		WebElement Done=driver.findElement(By.cssSelector("input[value=\"Search\"]"));
		Utility_methods.click_button(Done);
	}
}
	
	


