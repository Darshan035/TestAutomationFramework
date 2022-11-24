package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class drop_down_utility extends Base_test {
		@Test
	public void drop_down() throws InterruptedException {
	
	WebElement button1=driver.findElement(By.linkText("Books"));
	Utility_methods.click_button(button1);
	
	//WebElement books=driver.findElement(By.id("products-orderby"));
	//Select sel=new Select(books);
	
	Thread.sleep(2000);
	Utility_methods.drop_down(driver.findElement(By.id("products-orderby")), 3);
     
	
 	//WebElement display=driver.findElement(By.name("products-pagesize"));
	//Select sel1=new Select(display);
	//sel1.selectByVisibleText("12");
	Thread.sleep(2000);
	Utility_methods.drop_down(driver.findElement(By.xpath("//select[@name='products-pagesize']")), 2);
	
	Thread.sleep(2000);
	Utility_methods.drop_down(driver.findElement(By.xpath("//select[@name='products-viewmode']")), 0);
	
	
	
	
	
	/* WebElement view=driver.findElement(By.name("products-viewmode"));
	
	Select sel2=new Select(view);
	sel2.selectByVisibleText("List");
	} */
		
		}
}
		
		


