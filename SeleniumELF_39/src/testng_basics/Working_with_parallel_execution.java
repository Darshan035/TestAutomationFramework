package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_parallel_execution {
	
	@Test(invocationCount = 5,threadPoolSize = 4)
	public void Paralelldemo() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.close();
		}

}
