package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
    WebDriver driver;

    public LoginPagePOM(WebDriver driver) {
        this.driver = driver;
    }

    private final By text_UserName = By.id("user-name");
    private final By text_Password = By.id("password");
    private final By button_Login = By.id("login-button");
    private final By pageHeader = By.xpath("div[class='product_label']");

    public void enterUserName(String username) {
        driver.findElement(text_UserName).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(text_Password).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(button_Login).click();
    }

    public boolean getProductHeader() {
        return driver.findElement(pageHeader).isDisplayed();
    }
}
