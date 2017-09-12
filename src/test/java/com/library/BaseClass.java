package com.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	
	/*@Parameter*/
	@BeforeMethod
	public void setup(){
		
		if(GenericClass.getproperties("BROWSERNAME").equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Sharath\\Framework\\Omega\\Config.Properties\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(GenericClass.getproperties("URL"));
			driver.manage().window().maximize();
		
		}
		else if(GenericClass.getproperties("BROWSERNAME").equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(GenericClass.getproperties("URL"));
			driver.manage().window().maximize();
			
		}
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	

}
