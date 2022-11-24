package Home_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elements_send_keys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/demo%20(1).html");
		List<WebElement> names=driver.findElements(By.xpath("//input[@name='fname']"));
		for(int i=0;i<=names.size()-1;i++) {
			names.get(i).sendKeys("darshan");
		}
	}

}
