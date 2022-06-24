package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\com.automation\\Master\\Dress.feature"
		,glue={"com.stepdefinition"}
		,tags={"@tag3 "}
		,monochrome=true
		,dryRun=false
		,format= {"pretty","html:/com.automation/target/cucumber-reports"}
		)
public class RunnerExecutor {

}
