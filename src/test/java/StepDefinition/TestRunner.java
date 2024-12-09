package StepDefinition;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/HtmlReports/cucumber.html",
                "json:target/JsonReports/cucumber.json",
                "junit:target/JUnitReports/cucumber.xml"
        }
)

public class TestRunner {

}
