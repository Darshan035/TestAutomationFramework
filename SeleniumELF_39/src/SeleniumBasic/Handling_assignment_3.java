package SeleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_assignment_3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Desktop/html/MultipleWindow%20(3).html");
		String parent_window=driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(1000);
		
	Set<String> total_window=driver.getWindowHandles();
	
	
	for(String child_window:total_window) {
		
		driver.switchTo().window(child_window);
		if(driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
			
			driver.close();
		}
		
		}
	
	

}
}