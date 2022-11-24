package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Darshan");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Gowda");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Test yantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Banglore");
		
		
	}

}
