package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_double_click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement dbl_click =driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
      Actions action =new Actions(driver);
      action.doubleClick(dbl_click).build().perform();
}
}














