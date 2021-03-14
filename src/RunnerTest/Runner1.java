package RunnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"featurefile"}, glue={"stepdefinition"},
tags={"@Functional"}, plugin = {"html:target/Destination"})

public class Runner1 {

}
