package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilClass1;

public class HomePage extends UtilClass1{
	
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[@class='YUhWwv']")
	private WebElement cartBtn;
	
	@FindBy(xpath="//div[text()='Akshay']")
	private WebElement profileName;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void enterSearchText()
	{
		searchField.sendKeys("realme");
	}
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void clickCartButton()
	{
		cartBtn.click();
	}
	
	public boolean isProfileNameVisible()
	{
		try {
			WebElement element = expliciteWait(driver, profileName);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
	
}
