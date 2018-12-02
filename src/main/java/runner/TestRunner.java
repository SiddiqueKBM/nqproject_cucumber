package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\mrisl\\eclipse-workspace\\nqsel\\src\\main\\java\\features\\nqclient.feature"}, //the path of the feature files

dryRun = true //to check the mapping is proper between feature file and step def file
		
		)

public class TestRunner {

}
