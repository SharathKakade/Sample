package com.library;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericClass {

public static String getproperties(String skey){
		
		String svalue=null;
		Properties properties=new Properties();
		try{
		
		FileInputStream file=new FileInputStream("C:\\Sharath\\Framework\\Omega\\Config.Properties");
		properties.load(file);
		svalue=properties.getProperty(skey);
		}catch(Exception e){
			
		}
		return svalue;
	}

//handle the select class with index

	public static void selecybyindex(WebElement element,int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	//handle the select class with value
	public static void selectbyvalue(WebElement element,String value){
		Select select=new Select(element);
		select.selectByValue(value);
	}
	//handle the select class with text
	public static void selectbytext(WebElement element,String text){
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	//handle the action class
	public static void Actions(WebElement element){
		Actions action=new Actions(BaseClass.driver);
		action.moveToElement(element).perform();
	}

}
