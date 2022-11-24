package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elements_all_links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> buttons=driver.findElements(By.xpath("//a"));
		int j=0;
		for(int i=1;i<=buttons.size();i++) {
			j=i;
		
		}
		System.out.println(j);
		
		for(int i=0;i<=buttons.size()-1;i++) {
		
		System.out.println(buttons.get(i).getText());
		}
		
	}

}
