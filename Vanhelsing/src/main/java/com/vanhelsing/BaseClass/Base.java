package com.vanhelsing.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		
		try {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\JEEVA29ANAND\\eclipse-workspace\\Vanhelsing\\Driver");
			driver = new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static void enterUrl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void sendKeys(WebElement element, String value ) {
		
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void dropDown(WebElement element, String values ) {
		
		try {
			Select sc = new Select(element);
			sc.selectByVisibleText(values);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void click(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
