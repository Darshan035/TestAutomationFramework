package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elements_vote {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> buttons=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<=buttons.size()-1;i++) {
			buttons.get(i).click();
			try {
			Thread.sleep(1000);
			}
			catch(Exception e) {
			//	System.out.println("handled");
			}
		}
	}

}
