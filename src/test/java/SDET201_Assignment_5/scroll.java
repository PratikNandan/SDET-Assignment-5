package SDET201_Assignment_5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {
	WebDriver driver;
	@BeforeTest
	public void bt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		
	}
@Test
public void task() {
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shoes");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	JavascriptExecutor js  = (JavascriptExecutor)driver;

	WebElement org = driver.findElement(By.linkText("Site Map"));
	js.executeScript("arguments[0].scrollIntoView(true)",org);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement org1 = driver.findElement(By.xpath("//input[@type='text']"));
	js.executeScript("arguments[0].scrollIntoView(true)",org1);

	
	
	


	
}

}
