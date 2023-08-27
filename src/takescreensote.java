import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreensote {

	public static void main(String[] args) {
		// public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\chromium\\chromedriver-win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        TakesScreenshot screenshot=(TakesScreenshot)driver;
       File src= screenshot.getScreenshotAs(OutputType.FILE);
       File target=new File(".\\screenshoot\\homepage.png");
      

	}

}
