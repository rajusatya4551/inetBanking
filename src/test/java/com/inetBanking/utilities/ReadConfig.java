package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	public ReadConfig() {
		
		File src=new File("./Configurations/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			properties=new Properties();
			properties.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	//action metods for getting variables data from properties file
	public String getApplicationURL() {
		String url=properties.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String uname=properties.getProperty("username");
		return uname;
	}
	
	public String getPassword() {
		String pwd=properties.getProperty("password");
		return pwd;
	}
	
	public String getChromepath() {
		String cpath=properties.getProperty("chromepath");
		return cpath;
	}
	
	public String getIepath() {
		String iepath=properties.getProperty("iepath");
		return iepath;
	}
	
	
	public String getFirefoxpath() {
		String fpath=properties.getProperty("firefoxpath");
		return fpath;
	}
	

}
