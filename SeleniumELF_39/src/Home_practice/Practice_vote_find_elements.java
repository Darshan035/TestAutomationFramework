package Home_practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_vote_find_elements {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.navigate().to("https://demowebshop.tricentis.com/");
			List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
			for(int i=0;i<=radio.size()-1;i++) {
			radio.get(i).click();
			try {
			Thread.sleep(1000);
			}
			catch(Exception e) {
				//System.out.println("sleep");
				}
			}
				
	}

}
