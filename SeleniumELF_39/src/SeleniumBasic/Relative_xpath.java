package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/xpath1.html");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("dacchu");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("gowda");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Test yantra");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("namma bengalore");
	}

}
