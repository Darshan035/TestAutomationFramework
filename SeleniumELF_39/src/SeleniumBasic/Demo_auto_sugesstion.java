package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_auto_sugesstion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("compu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("")).click();
	}

}
