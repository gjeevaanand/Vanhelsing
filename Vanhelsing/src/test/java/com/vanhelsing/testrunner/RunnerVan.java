package com.vanhelsing.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vanhelsing.BaseClass.Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\vanhelsing\\feature", glue = "com.vanhelsing.stepdefinitions")

public class RunnerVan {
	
	@BeforeClass
	
	public static void browserlaunch() {
		
		Base.browserLaunch();

	}

	@AfterClass
	
	public static void driverQuit() {

	}
	
	
	
}
