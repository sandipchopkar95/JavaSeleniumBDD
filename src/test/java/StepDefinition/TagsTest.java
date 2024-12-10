package StepDefinition;

import io.cucumber.java.en.*;

public class TagsTest {

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        System.out.println("I am on the homepage");
    }

    @When("I perform an action")
    public void i_perform_an_action() {
        System.out.println("I perform an action");
    }

    @Then("I should see the result")
    public void i_should_see_the_result() {
        System.out.println("I should see the result");
    }
}
