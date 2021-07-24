package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureWithTags", glue= {"StepDefinitions"}, 
monochrome= true, plugin= {"pretty","junit:F:/eclipse_workspace/CucumberDemo/JUnitReports/report.xml",
		"json:F:/eclipse_workspace/CucumberDemo/JSONReports/report.json",
		"html:F:/eclipse_workspace/CucumberDemo/HTMLReports/report.html"},
		tags = "@mustRun"
)
public class TestRunner_RunWithSingleTag {

}
