package SeleniumBasic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Log in")).click();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("./Screenshots/screenshot1.png");
		FileHandler.copy(ss, destination);
		
}

}
