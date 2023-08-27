package Chureka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium {

	private static final WebElement Webelement = null;

	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","E:\\chromium\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		WebElement drp=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		System.out.println(drp.getAttribute("value"));
//		List<WebElement> optiondrp=driver.findElements(By.tagName("option"));
//		System.out.println(optiondrp.size());
		Select drpcountry=new Select(drp);
		drpcountry.selectByVisibleText("India");
		
		
//	for(WebElement count:optiondrp)
//	{
//		System.out.println(count.getText());
//	}	
}
}
