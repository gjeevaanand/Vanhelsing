package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	public WebDriver driver;
	
	
	@FindBy(xpath ="//*[@id=\'nav-link-accountList\']/span")
	private WebElement firstSignin;
	
	@FindBy(id = "createAccountSubmit")
	private WebElement createAccount;
	
	@FindBy(id = "ap_customer_name")
	private WebElement customerName;
	
	@FindBy(id = "ap_phone_number")
	private WebElement phone;
	
	@FindBy(id = "ap_email")
	private WebElement email;
	
	@FindBy(id = "ap_password")
	private WebElement password;
	
	@FindBy(id ="continue")
	private WebElement contiue;
	
	@FindBy(id ="nav-your-amazon-text")
	private WebElement home;

		
	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getFirstSignin() {
		return firstSignin;
	}



	public WebElement getCreateAccount() {
		return createAccount;
	}



	public WebElement getCustomerName() {
		return customerName;
	}



	public WebElement getPhone() {
		return phone;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getContiue() {
		return contiue;
	}



	public WebElement getHome() {
		return home;
	}



	public Registration(WebDriver ndriver) {
		
		this.driver = ndriver;
		
		PageFactory.initElements(ndriver, this);
		
			
	}
	
	
	
	
	
	
	

}
