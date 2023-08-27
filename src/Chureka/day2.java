package Chureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.automationpractice.pl");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("T- shirt");
		
		
		driver.findElement(By.name("submit_search")).click();
		
		
		//finding the with linked text method
		
		//driver.findElement(By.linkText("product-name")).click();
		driver.findElement(By.partialLinkText("Blouse")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Printed Dress")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
