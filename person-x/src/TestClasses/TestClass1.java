package TestClasses;

import org.openqa.selenium.WebDriver;

import BaseClasses.BaseClass1;
import pom_Classes.HomePage;
import pom_Classes.LoginPage;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass1.getDriver("chrome");
		
		LoginPage lp = new LoginPage(driver);
		lp.putEmail();
		lp.putPassword();
		lp.clickLoginBtn();
		
		
		HomePage hp = new HomePage(driver);
		
		if(hp.isProfileNameVisible())
		{
			System.out.println("Logged in");
			
			hp.enterSearchText();
			hp.clickSearchButton();
		}else {
			System.out.println("Not logged in");
		}
		
		
		
		
		
		
		

	}

}
