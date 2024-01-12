package Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Initilize.Basic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	
	@Given("User naviagte to homepage")
	public void user_naviagte_to_homepage() {
		driver=Basic.getdriver();

	}

	@When("User enter valid product {string} in searchbox")
	public void user_enter_valid_product_in_searchbox(String product) {
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys(product);
	}

	@And("User click on search button")
	public void user_click_on_search_button() {
	    driver.findElement(By.xpath("//div[@id=\"search\"]/child::span")).click();

	}

	@Then("User should get the valid product in searchpage")
	public void user_should_get_the_valid_product_in_searchpage() {
		driver.findElement(By.xpath("//a[text()='HP LP3065']")).isDisplayed();
	}

	@When("User enter invalid product {string} in searchbox")
	public void user_enter_invalid_product_in_searchbox(String product) {
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys(product);

	}

	@Then("User should get the no product matched message in searchpage")
	public void user_should_get_the_no_product_matched_message_in_searchpage() {
		   driver.findElement(By.xpath("//p[text()='There is no product that matches the search criteria.']")).isDisplayed();
	}

}
