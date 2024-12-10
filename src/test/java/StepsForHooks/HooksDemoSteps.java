package StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HooksDemoSteps {
    WebDriver driver;

    @Before(order = 1, value = "@smoke")
    public void browserSetup() {
        System.out.println("Inside :- Browser Setup");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Before(order = 2)
    public void setup2(){
        System.out.println("Inside :- Setup 2");
    }

    @After
    public void closeBrowser() {
        System.out.println("Inside :- Browser Close");
        driver.close();
        driver.quit();
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("Inside :- Before Step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("Inside :- After Step");
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {

    }

    @And("Click on login button")
    public void click_on_login_button() {

    }

    @Then("User navigates to the product page")
    public void user_navigates_to_the_product_page() {

    }
}
