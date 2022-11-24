package SeleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_assignment_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Desktop/html/MultipleWindow%20(3).html");
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(1000);
		String parent_window =driver.getWindowHandle();
		System.out.println(parent_window);
		
		
		Set<String> total_window=driver.getWindowHandles();
		//System.out.println(total_window);
		
		
		for(String child_class:total_window) {
			//System.out.println(child_class);
		
	    driver.switchTo().window(child_class);
			
			System.out.println(driver.getTitle());
			driver.close();
			
		}
	
		
		
		
		
		
	
		

}
}