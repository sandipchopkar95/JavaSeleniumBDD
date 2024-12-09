package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    WebDriver driver;

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, LoginPage_PF.class);
    }

    @FindBy(id = "user-name")
    WebElement text_UserName ;

    @FindBy(id = "password")
    WebElement text_Password;

    @FindBy(id="login-button")
    WebElement button_Login;

    @FindBy(xpath = "div[class='product_label']")
    WebElement pageHeader;

    public void enterUserName(String username) {
        text_UserName.sendKeys(username);
    }

    public void enterPassword(String password) {
       text_Password.sendKeys(password);
    }

    public void clickLogin() {
        button_Login.click();
    }

    public boolean getProductHeader() {
        return pageHeader.isDisplayed();
    }
}
