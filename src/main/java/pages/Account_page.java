package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_page {

	WebDriver driver;
	@FindBy(linkText = "Edit your account information")
	private WebElement Edit_Your_Account_Information;


public Account_page(WebDriver driver) { 
	this.driver=driver;
	PageFactory.initElements(driver, this);
   }


public void Edit_Your_Account_Information_element() { 
	Edit_Your_Account_Information.isDisplayed();	
   }
}