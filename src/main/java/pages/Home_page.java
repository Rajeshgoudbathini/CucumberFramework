package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	 WebDriver driver;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement Account_button;
	
	@FindBy(linkText ="Login")
	private WebElement Login;


	
public Home_page(WebDriver driver) { 
	this.driver=driver;
	PageFactory.initElements(driver, this);
   }

public void Account_click() { 
	Account_button.click();
   }

public void Login_click() { 
	Login.click();
  }
}
