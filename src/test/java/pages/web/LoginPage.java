package pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(id = "flash")
    private WebElement flashMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        waitForElementVisible(usernameField);
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        waitForElementVisible(passwordField);
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        waitForElementClickable(loginButton);
        loginButton.click();
    }

    public String getFlashMessage() {
        waitForElementVisible(flashMessage);
        return flashMessage.getText();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}