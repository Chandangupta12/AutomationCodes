package Chureka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.automationpractice.pl");
		driver.manage().window().maximize();
		int s=driver.findElements(By.className("homeslider-description")).size();
		System.out.println("number slide image present at home page--->"+s);
		
		int list=driver.findElements(By.tagName("a")).size();
		System.out.println("numaer od linkes persent at webpage---->"+list);
		
		
	
	}
}