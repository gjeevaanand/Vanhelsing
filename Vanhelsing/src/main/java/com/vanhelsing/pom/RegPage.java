package com.vanhelsing.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {
	
	public WebDriver driver;
		
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(name = "reg_email__")
	private WebElement email;
	
	@FindBy(name = "reg_passwd__")
	private WebElement password;
	
	@FindBy(id ="day")
	private WebElement day; 
	
	@FindBy(id ="month")
	private WebElement month; 
	
	@FindBy(id ="year")
	private WebElement year; 
	
	@FindBy(xpath = "//*[@id=\'u_0_7\']")
	private WebElement male;
	
	@FindBy(name = "websubmit")
	private WebElement submit;
	
	@FindBy(name = "reg_email_confirmation__")
	private WebElement confirm;
	
	@FindBy(name = "websubmit")
	private WebElement submitagain;
	
	
public WebDriver getDriver() {
		return driver;
	}









	public WebElement getFirstname() {
		return firstname;
	}









	public WebElement getLastname() {
		return lastname;
	}









	public WebElement getEmail() {
		return email;
	}









	public WebElement getPassword() {
		return password;
	}









	public WebElement getDay() {
		return day;
	}









	public WebElement getMonth() {
		return month;
	}









	public WebElement getYear() {
		return year;
	}









	public WebElement getMale() {
		return male;
	}









	public WebElement getSubmit() {
		return submit;
	}









	public WebElement getConfirm() {
		return confirm;
	}









	public WebElement getSubmitagain() {
		return submitagain;
	}









public RegPage(WebDriver xdriver) {
		
		this.driver = xdriver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

}
