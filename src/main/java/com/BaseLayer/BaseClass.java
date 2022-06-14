package com.BaseLayer;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public static void inilitization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sele_webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/pdf/multiplewindow.html");
				
	}

}
