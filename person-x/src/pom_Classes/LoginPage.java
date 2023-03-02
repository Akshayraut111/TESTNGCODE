package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilClass1;

public class LoginPage extends UtilClass1{
	
	WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void putEmail()
	{
		email.sendKeys("akshaynarhare1541@gmail.com");
	}
	
	public void putPassword()
	{
		password.sendKeys("Akshay123");
	}
	
	public void clickLoginBtn()
	{
		loginButton.click();
	}
	

}
