package Chureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com");
		 driver.manage().window().maximize();
     	 driver.findElement(By.xpath("")).click();
		// driver.findElement(By.xpath("")).click();
//		 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Earbuds");
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		 Thread.sleep(1000);
		 driver.quit();
	}
}