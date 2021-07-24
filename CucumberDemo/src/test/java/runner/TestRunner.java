package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue= {"StepDefinitions", "testBase"}, 
monochrome= true, plugin= {"pretty","junit:F:/eclipse_workspace/CucumberDemo/JUnitReports/report.xml",
		"json:F:/eclipse_workspace/CucumberDemo/JSONReports/report.json",
		"html:F:/eclipse_workspace/CucumberDemo/HTMLReports/report.html",
		"json:target/cucumber.json"}
)
public class TestRunner {

}
