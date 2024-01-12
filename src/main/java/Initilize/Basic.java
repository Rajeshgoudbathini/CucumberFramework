package Initilize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {
	static  WebDriver driver =null ;
	 
	
	 public static void initilize_browser(String browser) { 
		 
		if(browser.equalsIgnoreCase("chrome")) { 
		driver=	new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
	}	 
	 
	 public static WebDriver getdriver() { 
		 return driver;
	 }
}

