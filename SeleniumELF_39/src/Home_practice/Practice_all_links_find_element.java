package Home_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_all_links_find_element {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> all =driver.findElements(By.xpath("//a"));      // [//a is in register inspect]
		    int count=0;
		    for(int i=0;i<=all.size()-1;i++) {
		    	count=i;
		    	 }
		    System.out.println(count);
		    
		for(int i=0;i<=all.size()-1;i++) {
			System.out.println(all.get(i).getText());
		}
	}

}
