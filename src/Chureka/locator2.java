package Chureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Tag and ID 
		//driver.findElement(By.cssSelector("input#email")).sendKeys("devid"); //before # is Tag name and after #is ID attribute name must be have
		//driver.findElement(By.cssSelector("#email")).sendKeys("devid");

		
		//tag and class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("shaphard");// before dot cssselector tag name afetr dot use as claass attribute name
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("shaphard");
		
		//tag and attribute
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("hossion");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("hossion");
		
		
		//tag claas aatribute
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Raw");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("raw untimate");
		
		
	}

}
