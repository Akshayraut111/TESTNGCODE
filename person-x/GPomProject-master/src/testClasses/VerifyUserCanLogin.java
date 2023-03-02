package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base1;
import pomClasses.HomePage;
import pomClasses.LoginPage;

public class VerifyUserCanLogin {
	
	WebDriver driver;
	
	LoginPage lp;
	HomePage hp;
	
	@BeforeClass
	public void beforeClass() {
		driver = Base1.getDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
	}
	
	@Test
	public void VerifyUserLogin() {
		lp.enterEmailID();
		lp.enterPassword();
		lp.clickOnLoginBtn();
		boolean isProfileNameVisible = hp.checkProfileNameVisible();
		if(isProfileNameVisible) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test is failed");
		}
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method Called");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Called");
	}
}
