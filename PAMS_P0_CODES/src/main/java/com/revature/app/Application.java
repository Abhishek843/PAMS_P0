package com.revature.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class Application {
	public static void main(String[] args) {

		usingResourceBundle();
	}

	private static void usingResourceBundle() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("pams_project");
		String dburl = resourceBundle.getString("dbur1");

		String driver = resourceBundle.getString("driver");

		String username = resourceBundle.getString("username");

		String password = resourceBundle.getString("password");
		System.out.println("dburl:" + dburl);

		System.out.println("driver:" + driver);
		System.out.println("username: " + username);

		System.out.println("password:" + password);

	}

	public static void usingPropertiesClassStatic() { 
		Properties prop = new Properties();

		try (InputStream inputStream = Application.class.getClassLoader().getResourceAsStream("kbms_project.properties");) { 
			prop.load(inputStream);
		}catch(IOException e)
		{
			e.printStackTrace();
		}

		System.out.println("dburl:"+prop.getProperty("dburl"));
		System.out.println("driver:"+prop.getProperty("driver"));
		System.out.println("username:"+prop.getProperty("username"));
		System.out.println("password:"+prop.getProperty("password"));
	}
	
	public void usingPropertiesClassNonStatic() { 
		Properties prop = new Properties();

		try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("kbms_project.properties");) { 
			prop.load(inputStream);
		}catch (IOException e) {
			e.printStackTrace();
			}

	System.out.println("dburl:"+ prop.getProperty("dbur1"));
	System.out.println("driver:" + prop.getProperty("driver")); 
	System.out.println("username:" + prop.getProperty("username"));
	System.out.println("password:"+prop.getProperty("password"));
}
}