package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_testNG_basics {
	
	@Test
	public void Demo() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("books");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.close();
		
		}
	


}
