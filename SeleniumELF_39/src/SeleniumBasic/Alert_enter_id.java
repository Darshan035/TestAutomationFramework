package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_enter_id {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);
		
		Alert ale=driver.switchTo().alert();
		Thread.sleep(1000);
		ale.accept();
		Thread.sleep(1000);
		ale.accept();
		
		
		
	}

}
