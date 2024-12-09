package StepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPagePOM;

import java.time.Duration;

public class LoginPOM {
    WebDriver driver;
    LoginPagePOM loginPage;

    @Given("the browser is opened, POM")
    public void the_browser_is_opened() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }

    @Given("the user is on the login page, POM")
    public void the_user_is_on_the_login_page() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("the user provides a valid username and password, POM")
    public void the_user_provides_a_valid_username_and_password() {
        loginPage = new LoginPagePOM(driver);
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @When("clicks the login button, POM")
    public void clicks_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("the user should be redirected to the product page. POM")
    public void the_user_should_be_redirected_to_the_product_page() {
        boolean isProductHeaderDisplayed = loginPage.getProductHeader();
        Assert.assertTrue("The Product tile is displayed ", isProductHeaderDisplayed);
        driver.close();
        driver.quit();
    }
}
