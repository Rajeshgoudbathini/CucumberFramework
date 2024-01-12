package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
    WebDriver driver;
	

@FindBy(id="input-email")
private WebElement email_Field;

@FindBy(id="input-password")
private WebElement password_Field;

@FindBy(xpath="//input[@value='Login']")
private WebElement Login;

@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
private WebElement Email_password_mismatch_Warning;


	public Login_page(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Password_Textfieldd(String password) { 
		password_Field.sendKeys(password);
	}
	
	public void Email_Textfieldd(String email) { 
		email_Field.sendKeys(email);
	}
	
	public void Login_Button() { 
		Login.click();
	}
	
	public void Email_password_mismatch_Warning_message() { 
		Email_password_mismatch_Warning.isDisplayed();
	}
}
