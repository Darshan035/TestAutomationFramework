package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_frame_switch_to_parent_window {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Desktop/selenium.skype/iframe%20(1).html");
		
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);                      //implicit
		 driver.switchTo().frame(0);                                                        // using indexing
		 driver.findElement(By.xpath("//a[text()='Log in']")).click();
		 
		 // switch back to default content
		 driver.switchTo().defaultContent();// if we have only one parent window  
		      
		      //   or 
		  
		//   driver.switchTo().parentFrame();  // if we have parent & child class
		  
		 driver.findElement(By.linkText("Google")).click();
	}

}
