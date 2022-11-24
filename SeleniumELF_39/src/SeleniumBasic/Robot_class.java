package SeleniumBasic;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_class {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Desktop/selenium.skype/demo%20(2).html");
		
		WebElement file_button =driver.findElement(By.id("resume"));
		Actions action =new Actions(driver);
		action.moveToElement(file_button).click().perform();
		 Thread.sleep(1000);
		 
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_T);
		 robot.keyPress(KeyEvent.VK_E);
		 robot.keyPress(KeyEvent.VK_S);
		 robot.keyPress(KeyEvent.VK_T);
		 
		 for(int i=0;i<=2;i++) {
			 Thread.sleep(1000);
			 robot.keyPress(KeyEvent.VK_TAB);	 
			 
		 }
		 Thread.sleep(1000);
	 robot.keyPress(KeyEvent.VK_ENTER);
		 
		    
		  
		 
		
		 
		
	}

}
