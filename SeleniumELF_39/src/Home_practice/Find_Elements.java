package Home_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		List<WebElement> buttons=driver.findElements(By.xpath("//input[@type='button']"));
		for(int i=0;i<=buttons.size()-1;i++) {
			System.out.println( buttons.get(i).getAttribute("value"));
		}
	}

}
