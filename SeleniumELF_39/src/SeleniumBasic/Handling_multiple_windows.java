package SeleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multiple_windows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String Parent_window=driver.getWindowHandle();
		System.out.println(Parent_window);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> total_window=driver.getWindowHandles();
		System.out.println(total_window);
		
		for(String child_window:total_window)    {
			System.out.println(child_window);
		
		
			//switch to child
			driver.switchTo().window(child_window);
			
			// to get title
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				driver.findElement(By.name("email")).sendKeys("darshu@gmail.com");
				Thread.sleep(1000);
				driver.close();
		        	}
			//switch back to parent class
			driver.switchTo().window(Parent_window);
			driver.close();
		
                   }
		

}
}