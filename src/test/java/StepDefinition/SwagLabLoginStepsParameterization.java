package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SwagLabLoginStepsParameterization {
    WebDriver driver;
    @Given("the browser is opened, parameter")
    public void the_browser_is_opened() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
    @Given("the user is on the login page, parameter")
    public void the_user_is_on_the_login_page() {
        driver.get("https://www.saucedemo.com/v1/");
    }
    @When("^the user provides a valid (.*) and (.*), parameter$")
    public void the_user_provides_a_valid_username_and_password(String username,String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @When("clicks the login button, parameter")
    public void clicks_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("the user should be redirected to the product page. parameter")
    public void the_user_should_be_redirected_to_the_product_page() {
        String title= driver.findElement(By.cssSelector("div.product_label")).getText();
        Assert.assertEquals("The Product tile is matched ","Products", title);
        driver.close();
    }
}
