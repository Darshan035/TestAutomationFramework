package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_wait_implicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS); //implicit
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("darshan");
		driver.findElement(By.name("LastName")).sendKeys("Gowda");
		driver.findElement(By.name("Email")).sendKeys("dars1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Password");
	
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		driver.close();
	}

}
