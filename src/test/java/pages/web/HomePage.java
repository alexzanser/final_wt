package pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "h1.heading")
    private WebElement header;

    @FindBy(css = "a[href='/login']")
    private WebElement formAuthLink;

    @FindBy(css = "a[href='/checkboxes']")
    private WebElement checkboxesLink;

    @FindBy(css = "a[href='/dropdown']")
    private WebElement dropdownLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        waitForElementVisible(header);
        return header.getText();
    }

    public void clickFormAuthentication() {
        waitForElementClickable(formAuthLink);
        formAuthLink.click();
    }

    public void clickCheckboxes() {
        waitForElementClickable(checkboxesLink);
        checkboxesLink.click();
    }

    public void clickDropdown() {
        waitForElementClickable(dropdownLink);
        dropdownLink.click();
    }
}