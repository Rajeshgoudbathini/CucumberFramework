package Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Initilize.Basic;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class My_Hooks {
	WebDriver driver;
	@Before
	public void setup() { 
		ConfigReader configReader=new ConfigReader();
		Properties prop = configReader.initilizeproperties();
		Basic.initilize_browser(prop.getProperty("browser")); 
		driver=Basic.getdriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}
	
	@After
	public void teardown(Scenario scenario) { 
		
	String scenarioName = scenario.getName().replace(" ", "_");
	
	if(scenario.isFailed()) { 
		byte[] srcscreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(srcscreenshot, "image/png", scenarioName);
	}
		driver.quit();
	}
}
