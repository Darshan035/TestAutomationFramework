package test_cases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class Tc5_mouse_hover extends Base_test {
	
	
	

	@Test
	
	public void MouseHover() {
	

	Actions action=new Actions(driver);
	
	WebElement mouse_hover=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
	
	action.moveToElement(mouse_hover).build().perform();
	
	 WebElement click=driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
	 Utility_methods.click_button(click);
	
	//driver.close();
	
	}
	
	
	

}
