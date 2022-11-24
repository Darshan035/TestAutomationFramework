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

public class Tc2_Login extends Base_test{
	@DataProvider(name="Logindata")

	public Object[] testlog() throws IOException{

	Object[][]data=Utility_methods.TestData_excel("Login");

//	data[0][0]="darshu666@gmail.com";
	//data[0][1]="Password";

	return data;
	}
		
		@Test(dataProvider="Logindata",priority=2)
		public void login(String Email, String Password) {
			
			WebElement Log_Click=driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
			//clicked(Log_Click);
			Utility_methods.click_button(Log_Click);
			
			//driver.findelement(by.cssselector("input[id=\"email\"]")).sendkeys("darshan1@gmail.com");
			//enter_value_in_editfield(username,"darshan1@gmail.com" );
			WebElement username=driver.findElement(By.cssSelector("input[id=\"Email\"]"));
			Utility_methods.Enter_value_in_edit_field(username,Email );
			
			
			//driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("Password");
		    //Enter_value_in_editfield(password,"Password" );
		    WebElement password=driver.findElement(By.cssSelector("input[id=\"Password\"]"));
		    Utility_methods.Enter_value_in_edit_field(password,Password );
		    
			WebElement Submit=driver.findElement(By.xpath("(//input[@class=\"button-1 login-button\"])"));
				Utility_methods.click_button(Submit);
			
				WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
				Utility_methods.click_button(logout);
			
		}
}


