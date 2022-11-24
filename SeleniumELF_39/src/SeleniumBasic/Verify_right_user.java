package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_right_user {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("darshannn1@text.com");
		driver.findElement(By.id("Password")).sendKeys("Password");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String actaul_value=driver.findElement(By.className("account")).getText();
		String expected_value="darshannn1@text.com";
		
		if(actaul_value.equals(expected_value)) {
			System.out.println("right user");
		}
		else {
			System.out.println("wrong user");
		}
		
		
		
	}

}
