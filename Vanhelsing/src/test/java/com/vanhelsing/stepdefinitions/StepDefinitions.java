package com.vanhelsing.stepdefinitions;

import com.vanhelsing.BaseClass.Base;
import com.vanhelsing.pom.RegPage;

import cucumber.api.java.en.Then;

public class StepDefinitions extends Base {
	
	@Then("^customer enter the facebook\\.com$")
	public void customer_enter_the_facebook_com() throws Throwable {
	   enterUrl("https://www.facebook.com/");
	}

	@Then("^customer  enter the first name and last name$")
	public void customer_enter_the_first_name_and_last_name() throws Throwable {
	    RegPage rp = new RegPage(driver);
	    sendKeys(rp.getFirstname(), "Jeeva");
	    sendKeys(rp.getLastname(), "anand");
		
	}

	@Then("^customer enter the email and password$")
	public void customer_enter_the_email_and_password() throws Throwable {
		RegPage rp = new RegPage(driver);
		sendKeys(rp.getEmail(), "ammapillai@gmail.com");
		sendKeys(rp.getPassword(), "password");
	
	}

	@Then("^customer enter the birthday and sex$")
	public void customer_enter_the_birthday_and_sex() throws Throwable {
		RegPage rp = new RegPage(driver);
		sendKeys(rp.getDay(), "24");
		sendKeys(rp.getMonth(), "Jun");
		sendKeys(rp.getYear(), "1987");
        click(rp.getMale());
	}

	@Then("^customer click the sign up button$")
	public void customer_click_the_sign_up_button() throws Throwable {
		RegPage rp = new RegPage(driver);
		click(rp.getSubmit());
		sendKeys(rp.getConfirm(), "ammapillai@gmail.com");
		click(rp.getSubmitagain());

	}


}
