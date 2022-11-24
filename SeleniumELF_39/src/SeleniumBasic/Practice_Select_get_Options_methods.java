package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Select_get_Options_methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Books")).click();
		WebElement sort=driver.findElement(By.id("products-orderby"));
		Select sel=new Select(sort);
		List<WebElement> view1=sel.getOptions();
		int count=0;                                      // to count
		for(int i=0;i<=view1.size()-1;i++) {
			count=i;
		}
		System.out.println(count);
		
		for(int i=0;i<=view1.size()-1;i++) {                 // to print
			System.out.println(view1.get(i).getText());
		}
		
		
		

}
}
