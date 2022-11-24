package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dependent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label/input[@value='radio1']")).click();
		driver.findElement(By.xpath("(//fieldset)[2]/input[@id='autocomplete']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]/../input")).sendKeys("india");
		driver.findElement(By.xpath("(//option)[1]/..")).click();
		driver.findElement(By.xpath("//select/option[2]")).click();
		driver.findElement(By.xpath("//label/input[@value='option1']")).click();
		
		
		
	    
	    
		
		
	}

}
