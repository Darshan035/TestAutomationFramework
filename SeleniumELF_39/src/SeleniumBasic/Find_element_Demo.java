package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_element_Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/demo%20(1).html");
		List<WebElement> buttons=driver.findElements(By.xpath("//input[@type='text']"));
		for(int i=0;i<=buttons.size()-1;i++) {
			buttons.get(i).sendKeys("dacchu");
		}
	}

}
