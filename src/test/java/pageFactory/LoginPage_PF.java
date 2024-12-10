package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
    WebDriver driver;

    @FindBy(id = "user-name")
    @CacheLookup                 // Store element in the cache memory so next time it will directly use from there (Reduce time)
    WebElement text_UserName;

    @FindBy(id = "password")
    @CacheLookup
    WebElement text_Password;

    @FindBy(id = "login-button")
    @CacheLookup
    WebElement button_Login;

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver, this);

        //When dealing with AJAX application use below solution to reduce possibility of stale element exception
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
        PageFactory.initElements(factory, this);
    }

    public void enterUserName(String username) {
        text_UserName.sendKeys(username);
    }

    public void enterPassword(String password) {
        text_Password.sendKeys(password);
    }

    public void clickLogin() {
        button_Login.click();
    }

}
