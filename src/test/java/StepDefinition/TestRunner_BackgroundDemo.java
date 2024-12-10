package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",
        glue = {"StepDef_BackgroundDemo"},
        monochrome = true,
        plugin = {"json:target/cucumber.json"}
)

public class TestRunner_BackgroundDemo {

}
