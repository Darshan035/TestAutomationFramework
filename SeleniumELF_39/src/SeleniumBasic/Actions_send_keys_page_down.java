package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_send_keys_page_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		WebElement seacrh=driver.findElement(By.id("small-searchterms"));
		Actions action=new Actions(driver);
		
		action.moveToElement(seacrh).click().sendKeys("mobiles").perform(); // 2 ways (1st way)
		
		// action.sendKeys(seacrh,"mobiles").perform();                     // (2nd way)
 		 
		 Thread.sleep(2000);
	     action.sendKeys(Keys.PAGE_DOWN).perform();	
	     
	     Thread.sleep(1000);
	     action.sendKeys(Keys.PAGE_UP).perform();
	   
	     }

	
}
