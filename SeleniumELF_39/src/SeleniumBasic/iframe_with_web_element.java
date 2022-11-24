package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_with_web_element {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Desktop/selenium.skype/iframe%20(1).html");
		
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS); //implicit
		 driver.switchTo().frame( driver.findElement(By.name("frame1"))); // using web
		 
		 driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

}
