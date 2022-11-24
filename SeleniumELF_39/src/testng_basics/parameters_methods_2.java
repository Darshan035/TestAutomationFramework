package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters_methods_2 {
	@Parameters({"URL","product"})
	@Test
	public void Parameter(String link,String search) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get(link);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys(search);
		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		driver.close();
		}

}
