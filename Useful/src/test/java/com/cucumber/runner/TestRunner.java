package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.basefile.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\Featurefile", glue = "com.cucumber.stepdefinitions")

public class TestRunner {
	
@BeforeClass
	
	public static void browserlaunch() {
		
		BaseClass.browserLaunch();

	}

	@AfterClass
	
	public static void driverQuit() {

	}
	


}
