package com.library;

import java.io.FileInputStream;
import java.util.Properties;

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
}
