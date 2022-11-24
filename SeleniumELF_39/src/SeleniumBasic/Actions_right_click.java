package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_right_click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click =driver.findElement(By.xpath("//span[contains(text(),'right')]"));
	      Actions action =new Actions(driver);
	      action.contextClick(right_click).build().perform();
	}
}
 