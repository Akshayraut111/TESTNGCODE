package baseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	
	static WebDriver driver;
	
	//Initializations
	public static WebDriver getDriver() {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Batch 18th June 2022\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		return driver;
	}
	
	

}
