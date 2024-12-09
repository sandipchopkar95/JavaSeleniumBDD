package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSearchSteps {
    WebDriver driver;
    @Given("the browser is launched,")
    public void the_browser_is_launched() {
        System.out.println("Inside Test : - The browser is launched");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @And("the user is on the Google search page,")
    public void the_user_is_on_the_google_search_page() {
        System.out.println("Inside Test : - Google page is opened");
        driver.navigate().to("https://www.google.com");
    }

    @When("the user types text into the search bar,")
    public void the_user_types_text_into_the_search_bar() {
        System.out.println("Inside Test : - Text is entered");
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
    }

    @And("presses Enter,")
    public void presses_enter() {
        System.out.println("Inside Test : - Press enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("the user should be redirected to the search results page.")
    public void the_user_should_be_redirected_to_the_search_results_page() {
        System.out.println("Inside Test : - user navigate to search result");
        driver.getPageSource().contains("Online Courses");
        driver.close();
        driver.quit();
    }
}
