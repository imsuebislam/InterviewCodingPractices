package com.CucumberSteps;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.cucumber.cucumbetoptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/BFS/Eclipse_Workspace/CucumberJourney/src/test/resources/Features/WorldPopulatio.feature",
                 glue= {"StepsDefinitions"},
                 monochrome=true,
                 plugin= {"pretty","html:terget/HTMLReports",
                		 "json:terget/JsonReport/Repotr.json",
                		"junit:terget/JUNITReports/Report.xml"}
                )
public class TestRunnerClass {

}
