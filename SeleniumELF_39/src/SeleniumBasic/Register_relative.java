package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_relative {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("darshann");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("m");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("darshan1@text.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		
		
	}

}
