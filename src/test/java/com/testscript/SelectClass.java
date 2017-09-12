package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.library.BaseClass;

public class SelectClass extends BaseClass{
	
	@Test
	public void selectclass() throws InterruptedException {
		driver.findElement(By.id("Skills")).click();
		Select select=new Select(driver.findElement(By.id("Skills")));
		
		// By using SelectBy Index Method
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		
		// By using SelectBy Value Method
		select.selectByValue("Backup Management");
		Thread.sleep(2000);
		
		// By using SelectBy VisibleText Method
				select.selectByVisibleText("C++");
				Thread.sleep(2000);
	}

}
