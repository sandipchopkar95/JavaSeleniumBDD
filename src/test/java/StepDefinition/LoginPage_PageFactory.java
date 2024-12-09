package StepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage_PF;
import pageFactory.ProductPage_PF;

import java.time.Duration;

public class LoginPage_PageFactory {
    WebDriver driver;
    LoginPage_PF loginPagePf;

    @Given("the browser is opened, page factory")
    public void the_browser_is_opened_page_factory() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }

    @And("the user is on the login page, page factory")
    public void the_user_is_on_the_login_page_page_factory() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("the user provides a valid username and password, page factory")
    public void the_user_provides_a_valid_username_and_password_page_factory() {
        loginPagePf= new LoginPage_PF(driver);
        loginPagePf.enterUserName("standard_user");
        loginPagePf.enterPassword("secret_sauce");
    }

    @And("clicks the login button, page factory")
    public void clicks_the_login_button_page_factory() {
        LoginPage_PF loginPagePf = new LoginPage_PF(driver);
        loginPagePf.clickLogin();
    }

    @Then("the user should be redirected to the product page. page factory")
    public void theUserShouldBeRedirectedToTheProductPagePageFactory() {
        ProductPage_PF productPagePf = new ProductPage_PF(driver);
        String productLabel = productPagePf.getProductLabel();
        Assert.assertEquals( "Products",productLabel);
    }
}
