package Implementation;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Initilize.Basic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
WebDriver driver;

	@Given("User navigate to Register accountpage")
	public void user_navigate_to_register_accountpage() {
		driver=Basic.getdriver();

		    driver.findElement(By.xpath("//span[text()='My Account']")).click();
		    driver.findElement(By.linkText("Register")).click();
	}

	@When("User enter the mandatory fields below")
	public void user_enter_the_mandatory_fields_below(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class,String.class);
	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(map.get("firstname"));
	    driver.findElement(By.id("input-lastname")).sendKeys(map.get("lastname"));
	    driver.findElement(By.id("input-email")).sendKeys(timestamp()+"@gmail.com");
	    driver.findElement(By.id("input-telephone")).sendKeys(map.get("telephone"));
	    driver.findElement(By.id("input-password")).sendKeys(map.get("password"));
	    driver.findElement(By.id("input-confirm")).sendKeys(map.get("conformpassword"));
	    
	}
	
	
	@When("User enter the mandatory fields with existing email below")
	public void User_enter_the_mandatory_fields_with_existing_email_below(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class,String.class);
	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(map.get("firstname"));
	    driver.findElement(By.id("input-lastname")).sendKeys(map.get("lastname"));
	    driver.findElement(By.id("input-email")).sendKeys(map.get("email"));
	    driver.findElement(By.id("input-telephone")).sendKeys(map.get("telephone"));
	    driver.findElement(By.id("input-password")).sendKeys(map.get("password"));
	    driver.findElement(By.id("input-confirm")).sendKeys(map.get("conformpassword"));
	    
	}

	@When("User click on privacy policy button")
	public void user_click_on_privacy_policy_button() {
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();

	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

	}

	@Then("User shoud get registered and redirected to acccount success page")
	public void user_shoud_get_registered_and_redirected_to_acccount_success_page() {
	  boolean message = driver.findElement(By.xpath("//div[@id=\"content\"]/h1")).isDisplayed();
	  Assert.assertTrue(message);
	}

	@When("User click on newsletter subscribe option")
	public void user_click_on_newsletter_subscribe_option() {
driver.findElement(By.xpath("//label[@class=\"radio-inline\"]/input[@value=\"1\"]")).click();
	}

	@Then("User shoud get email already exists warning  message")
	public void user_shoud_get_email_already_exists_warning_message() {
	  boolean message = driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).isDisplayed();
	 Assert.assertTrue(message);
	}

	@When("User enter the empty fields")
	public void user_enter_the_empty_fields() {
	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(" ");
	    driver.findElement(By.id("input-lastname")).sendKeys(" ");
	    driver.findElement(By.id("input-email")).sendKeys(" ");
	    driver.findElement(By.id("input-telephone")).sendKeys(" ");
	    driver.findElement(By.id("input-password")).sendKeys(" ");
	    driver.findElement(By.id("input-confirm")).sendKeys(" ");
	}

	@Then("User shoud get proper warning message for every mandatory fields")
	public void user_shoud_get_proper_warning_message_for_every_mandatory_fields() {
		
 driver.findElement(By.xpath("//div[text()='First Name must be between 1 and 32 characters!']")).isDisplayed();
   driver.findElement(By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']")).isDisplayed();
      driver.findElement(By.xpath("//div[text()='E-Mail Address does not appear to be valid!']")).isDisplayed();
    driver.findElement(By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']")).isDisplayed();
   driver.findElement(By.xpath("//div[text()='Password must be between 4 and 20 characters!']")).isDisplayed();
 
	}
	
	
	public String timestamp() { 
		Date date= new Date();
	String presentdate = date.toString().replace(" ", "_").replace(":","_");
	return presentdate;
	}
}
