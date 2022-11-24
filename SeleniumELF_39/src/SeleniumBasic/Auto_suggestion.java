package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[text()='India'])[1]/parent::li")).click();
		driver.findElement(By.xpath("(//div[text()='India'])[1]")).click();
	}

}
