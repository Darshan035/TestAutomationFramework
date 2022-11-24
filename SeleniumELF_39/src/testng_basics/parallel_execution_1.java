package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel_execution_1 {
	@Test(invocationCount = 1,threadPoolSize = 1)
	public void Paralelldemo() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("Books");
		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		driver.close();
		}

}
