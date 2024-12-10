package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeaturesWithTags",
        glue = {"StepDefinition"},
        tags = "@smoke or @regression"
)

public class TestRunner_RunWithTags {

}
