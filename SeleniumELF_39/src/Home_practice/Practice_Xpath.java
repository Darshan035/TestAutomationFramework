package Home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
	/*	driver.findElement(By.xpath("//a[@class='ico-register']")).click();       //[login using xpath]
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("darshan");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("gowda");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("darshan101@text.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@id='register-button']")).click(); */
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();     //[select and vote]
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		
		
		
		
		
		
	}

}
