package com.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactintestcases.feature", glue = "com.stepdef", monochrome = true,  tags = "@Login", publish = true)
public class Test_Runner {
	
	
}
