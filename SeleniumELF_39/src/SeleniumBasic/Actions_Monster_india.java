package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Monster_india {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.monsterindia.com/");
		WebElement monster =driver.findElement(By.xpath("(//a[@data-check='menutab'])[1]"));
	    Actions action=new Actions(driver);
		action.moveToElement(monster).build().perform();
		Thread.sleep(1000);
	    action.moveToElement(driver.findElement(By.xpath("//a[text()='Jobs by Skills']"))).build().perform();
	    action.moveToElement(driver.findElement(By.xpath("(//a[@href='https://www.monsterindia.com/search/java-jobs'])[1]"))).click().perform();
	    
	    
}
}