package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base1;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import pomClasses.HomePage;

public class VerifyUserCanGetLowsetPriceProduct {
	
	WebDriver driver;
	
	HomePage hp;
	
	@BeforeClass
	public void beforeClass() {
		driver = Base1.getDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		hp = new HomePage(driver);
	}
	
	@Test()
	public void VerifyUserGetLowestPriceProduct() {
		hp.searchProduct();	
		
		for(int i=1; i<=5; i++) {
			
			if(i != 1) {
				hp.switchPage(i);
			}
			
			System.out.println(hp.getLowsetPrice());	
		}
		
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
	
	}
	
	@AfterClass
	public void afterClass() {
		
	}

}
