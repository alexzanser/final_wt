package pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthLink;

    @FindBy(linkText = "Checkboxes")
    private WebElement checkboxesLink;

    @FindBy(linkText = "Dropdown")
    private WebElement dropdownLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return header.getText();
    }

    public void clickFormAuthentication() {
        formAuthLink.click();
    }

    public void clickCheckboxes() {
        checkboxesLink.click();
    }

    public void clickDropdown() {
        dropdownLink.click();
    }
}