package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/main/resources/Feature",
        glue = {"StepDefination"},
        plugin = {"pretty", "html:target/cucumber-reports/reports.html", "json:target/cucumber-reports/cucumberReport.json"},
        publish = true
        //dryRun = true
)
public class Runner extends AbstractTestNGCucumberTests {
}
