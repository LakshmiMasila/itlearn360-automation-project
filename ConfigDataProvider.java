package com.masila.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
Properties pro;
	
	public ConfigDataProvider()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			File f = new File("./Drivers/chromedriver.exe");
			System.out.println("Driver exists: " + f.exists());
			pro= new Properties();
			pro.load(fis);
			
		} catch (Exception e)
		{
			System.out.println("Not able to load config file "+e.getMessage());
		} 
	}

	public String getBrowser() {
		// TODO Auto-generated method stub
		return pro.getProperty("browser");
	}

	public String getStagingUrl() {
		// TODO Auto-generated method stub
		return pro.getProperty("testurl");
	}
}