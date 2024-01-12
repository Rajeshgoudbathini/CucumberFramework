package Implementation;
import org.openqa.selenium.WebDriver;

import Initilize.Basic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Account_page;
import pages.Home_page;
import pages.Login_page;
                                         //Note:For understanding purpose Im not optimizing these code in real time we have to write less number of line 
public class Login  {
	 WebDriver driver;
	 Login_page  loginpage;
	 Account_page accountpage;
	 Home_page homepage;
	 
	@Given("User navigate to application")
	public void user_navigate_to_application() {
		driver=Basic.getdriver();
		 homepage=new Home_page(driver);
	    homepage.Account_click();
	    homepage.Login_click();
	    loginpage=new Login_page(driver);
	}


	@When("User enter valid email address {string} in emailtextfield")
	public void user_enter_valid_email_address_in_emailtextfield(String email) {
		 
		loginpage.Email_Textfieldd(email);
	}

	@When("User enter valid password {string} in passwordtextfield")
	public void user_enter_valid_password_in_passwordtextfield(String password) {
		loginpage.Password_Textfieldd(password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginpage.Login_Button();
	}

	@Then("User get logged in successfully verify")
	public void user_get_logged_in_successfully_verify() {
		 accountpage=new Account_page(driver);
		accountpage.Edit_Your_Account_Information_element();
//		Assert.fail();                         //Note:To fail and see the screenshot in report attached with scenario use these
	}

	@When("User enter invalid email address {string} in emailtextfield")
	public void user_enter_invalid_email_address_in_emailtextfield(String email) {
		loginpage.Email_Textfieldd(email);
	}

	@When("User enter invalid password {string} in passwordtextfield")
	public void user_enter_invalid_password_in_passwordtextfield(String password) {
		loginpage.Password_Textfieldd(password);
	}

	@Then("User Should get proper warning message with creadentials mismatch")
	public void user_should_get_proper_warning_message_with_creadentials_mismatch() {
		
		loginpage.Email_password_mismatch_Warning_message();
	 }
}
