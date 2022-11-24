package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_browser_tast {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.browserstack.com/users/sign_up");
		
		driver.findElement(By.id("user_full_name")).sendKeys("darshan1");
		driver.findElement(By.id("user_email_login")).sendKeys("darshan1@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Password");
		 Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
     	driver.findElement(By.xpath("(//input[@name='commit'])[1]")).click();
     	
     Alert ale=	driver.switchTo().alert();
     
     ale.accept();
  
		
	}

}
