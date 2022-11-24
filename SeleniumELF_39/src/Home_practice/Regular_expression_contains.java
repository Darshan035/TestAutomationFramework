package Home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_expression_contains {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("(//a[contains(@class,'ico-cart')])[1]")).click();
	//	driver.findElement(By.xpath("(//a[contains(text(),'Digital')])[1]")).click();
	    driver.findElement(By.xpath("(//a[contains(@href,'/gift')])[3]")).click();
	    }
}
