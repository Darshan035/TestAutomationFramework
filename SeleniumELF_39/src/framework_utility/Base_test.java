package framework_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base_test {
   public static WebDriver driver;
	
	@BeforeClass
	public void browsersetup() throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String url=Utility_methods.Test_configuration();
		driver.navigate().to(url);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		}
	@AfterClass
	public void Teardown() {
		driver.close();
	}
	
}
