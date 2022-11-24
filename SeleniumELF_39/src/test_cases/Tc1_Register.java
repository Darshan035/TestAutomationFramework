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

public class Tc1_Register extends Base_test {
	@DataProvider(name="Testdata")
	public Object[][] test_data() throws IOException{
		Object[][] data=Utility_methods.TestData_excel("Register");
	/*	data[0][0]="Darshan";
		data[0][1]="gowda";
		data[0][2]="darshu666@gmail.com";
		data[0][3]="Password";
		data[0][4]="Password";  */
		return data;
	}

@Test(dataProvider = "Testdata")
	public void Demo(String FName,String LName,String Email,String Password,String CPassword) {
 WebElement Register=driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
	Utility_methods.click_button(Register);
	
	WebElement Male=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
	 Utility_methods.click_button(Male);
	
	
 WebElement FirstName=driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
 Utility_methods.Enter_value_in_edit_field(FirstName,FName );
 
 WebElement LastName=driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
 Utility_methods.Enter_value_in_edit_field(LastName,LName );
 
 WebElement Email1=driver.findElement(By.xpath("//input[@id=\"Email\"]"));
 Utility_methods.Enter_value_in_edit_field(Email1,Email);
 
 
 
 WebElement Pass=driver.findElement(By.xpath("(//input[@class=\"text-box single-line password\"])[1]"));
 Utility_methods.Enter_value_in_edit_field(Pass,Password );
 
 WebElement Pass1=driver.findElement(By.xpath("(//input[@class=\"text-box single-line password\"])[2]"));
 Utility_methods.Enter_value_in_edit_field(Pass1,CPassword );
 
 WebElement Reg=driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
 Utility_methods.click_button(Reg);
}
}

	
	
	


