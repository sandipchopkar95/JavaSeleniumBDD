package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",
        glue = {"StepDef_BackgroundDemo"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/HtmlReports/cucumber.html",
                "json:target/JsonReports/cucumber.json",
                "junit:target/JUnitReports/cucumber.xml"
        }
)

public class TestRunner_BackgroundDemo {

}
