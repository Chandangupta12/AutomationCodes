package Chureka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathAxis {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.mcxindia.com/market-data/top-gainers");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//table[@id='tblGainers']/descendant::td[13]/child::*")).click();
		//driver.findElement(By.xpath("//a[@target='_blank'][normalize-space()='CRUDEOIL']")).click();
		//Thread.sleep(3000);
		//driver.navigate().back();
    	driver.findElement(By.xpath("//ul[@class='left-links']/child::li[9]/child::*")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='Monthwise']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='Datewise']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='Yearwise']")).click();
//		Thread.sleep(3000);
//		driver.close();
		WebElement drp=driver.findElement(By.xpath("//*[@id='ddlInstrumentName']"));
		Select drplist=new Select(drp);
		drplist.selectByValue("FUTCOM");
		
		WebElement drp2=driver.findElement(By.xpath("//*[@id='cph_InnerContainerRight_C004_ddlSegment']"));
		Select drplist2=new Select(drp2);
		drplist2.selectByValue("BASE METALS");
//		
//		WebElement drp3=driver.findElement(By.xpath("//*[@id='ddlCommodityHead']"));
//		Select drplist3=new Select(drp3);
//		drplist3.selectByValue("IRONORE");
//		
//		WebElement drp4=driver.findElement(By.xpath("//*[@id='ddlCommodityContract']"));
//		Select drplist4=new Select(drp4);
//		drplist4.selectByValue("IRON");
		
		WebElement drp5=driver.findElement(By.xpath("//*[@id='cph_InnerContainerRight_C004_ddlFromYear']"));
		Select drplist5=new Select(drp5);
		drplist5.selectByValue("2022");
		
		WebElement drp6=driver.findElement(By.xpath("//*[@id='cph_InnerContainerRight_C004_ddlToYear']"));
		Select drplist6=new Select(drp6);
		drplist6.selectByValue("2023");
		Thread.sleep(3000);
	}

}
