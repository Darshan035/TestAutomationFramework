package SeleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_assignment_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String parent_window =driver.getWindowHandle();
		System.out.println(parent_window);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		
		Set<String> total_window =driver.getWindowHandles();
		System.out.println(total_window);
		
		for(String child_window:total_window) {
			System.out.println(child_window);
			
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
			
			}
		if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
			
			driver.close();
			
		
			}
		
	    driver.switchTo().window(parent_window);
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		
	
	
	
	}

}
