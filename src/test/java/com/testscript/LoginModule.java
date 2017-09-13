package com.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.library.BaseClass;

public class LoginModule extends BaseClass {
	
	@Test
	public void logintoabofapplication() throws InterruptedException{
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Sign In/Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Already')]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("")).sendKeys(GenericClass.getproperties(""));
	}

}
