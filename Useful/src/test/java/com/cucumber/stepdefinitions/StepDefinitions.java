package com.cucumber.stepdefinitions;

import org.openqa.selenium.support.ui.Wait;

import com.cucumber.basefile.BaseClass;
import com.cucumber.pom.Registration;

import cucumber.api.java.en.Then;

public class StepDefinitions extends BaseClass {
	
	@Then("^customer enter the Amazon\\.com$")
	public void customer_enter_the_Amazon_com() throws Throwable {
		getUrl("https://www.amazon.in/");
	  
	}

	@Then("^customer click on login button$")
	public void customer_click_on_login_button() throws Throwable {
		Registration rg = new Registration(driver);
		clickOption(rg.getFirstSignin());		
	    
	}

	@Then("^Customer click on new account$")
	public void customer_click_on_new_account() throws Throwable {
		Thread.sleep(5000);
		Registration rg = new Registration(driver);
		clickOption(rg.getCreateAccount());	
	    
	}

	@Then("^customer  enter the name mobile password$")
	public void customer_enter_the_name_mobile_password() throws Throwable {
		Thread.sleep(5000);
		Registration rg = new Registration(driver);
		sendKeys(rg.getCustomerName(), "Jeeva Anand");
		sendKeys(rg.getPhone(),"7305300873");
		sendKeys(rg.getPassword(), "Ksrct@018");
		
	   
	}

	@Then("^customer enter the email$")
	public void customer_enter_the_email() throws Throwable {
		Registration rg = new Registration(driver);
		sendKeys(rg.getEmail(),"gjeevaanand@gmail.com");

	    
	}

	@Then("^customer click the sign up button$")
	public void customer_click_the_sign_up_button() throws Throwable {
		Registration rg = new Registration(driver);
        clickOption(rg.getContiue());
		
	  
	}

	@Then("^customer in home page$")
	public void customer_in_home_page() throws Throwable {
		Thread.sleep(5000);
		Registration rg = new Registration(driver);
        clickOption(rg.getHome());
		
		
		
	    
	}


}
