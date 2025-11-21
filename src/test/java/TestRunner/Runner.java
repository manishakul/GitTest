package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/main/resources/Feature",
        glue = {"StepDefination"},
        plugin = {"pretty", "html:cucumber-reports/reports.html", "json:cucumber-reports/cucumberReport.json"},
        publish = true
        //dryRun = true
)
public class Runner extends AbstractTestNGCucumberTests {
}
