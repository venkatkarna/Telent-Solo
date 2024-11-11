package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\kavinilavu.k\\Documents\\Cucumber\\CucumberProjectDemo_Cats\\CucumberProjectDemo_Cats\\Features\\Login.feature", 
		glue =  {"com.StepDefinition"},
		plugin = {"pretty","html:target/cucumber/report.html"},
		monochrome = true
		
		
				
			

		

)
public class TestRun {

}
