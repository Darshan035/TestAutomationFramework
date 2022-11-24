package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_mouse_hover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement mouse=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse).build().perform();
	   
	}
}
