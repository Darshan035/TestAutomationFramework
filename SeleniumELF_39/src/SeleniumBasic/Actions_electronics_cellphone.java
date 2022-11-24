package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_electronics_cellphone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://demowebshop.tricentis.com/");
      	WebElement electronics=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(electronics).build().perform();
	    Thread.sleep(1000);
	    action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[1]"))).click().perform(); 
	   
	    
 /*	    WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		Actions action1=new Actions(driver);
		action1.moveToElement(computers).build().perform();
		
		action1.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Accessories')])[1]"))).click().perform();
	*/	
	    
	    
	}

	

}

