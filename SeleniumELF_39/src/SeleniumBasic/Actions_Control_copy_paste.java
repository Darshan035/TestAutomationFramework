package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Control_copy_paste {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		WebElement seacrh=driver.findElement(By.id("small-searchterms"));
		Actions action=new Actions(driver);
		action.moveToElement(seacrh).click().perform();
		Thread.sleep(1000);
		action.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).perform();// to paste
		Thread.sleep(1000);
		action.keyDown(Keys.LEFT_SHIFT).sendKeys("mobile").keyUp(Keys.LEFT_SHIFT).perform();//to do uppercase using shift button
		
		
}
}