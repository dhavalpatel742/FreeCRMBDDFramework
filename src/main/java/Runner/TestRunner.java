package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Selenium_Workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature"},//the path of the feature files
		glue={"stepDefinitions"},//the path of the step definition files
		plugin= {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def file
		tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"}
		)
//OR: ,  EXAMPLE: tags = {"@SmokeTest, @RegressionTest"}
//AND: "  EXAMPLE: tags = {"@SmokeTest", "@RegressionTest"}
//IGNORE SPECIFIC TEST CASES: ~    EXAMPLES: tags = {"~@SmokeTest", "@RegressionTest"}

public class TestRunner {
	

}
