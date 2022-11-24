package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_assignment_end_to_end {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
	WebElement right_click=driver.findElement(By.xpath("//span"));
	Actions action=new Actions(driver);

	
	
	  List<WebElement> select_all = driver.findElements(By.xpath("//span[text()='Edit']/../../li/span"));
	  
     for(int i=0;i<=select_all.size()-1;i++) {
    	 action.contextClick(right_click).build().perform();
    	  select_all.get(i).click();
    	  Thread.sleep(1000);
    	 Alert ale= driver.switchTo().alert();
    	 Thread.sleep(1000);
    	 ale.accept();
    	 Thread.sleep(1000);
    	 
	}
	}

}
