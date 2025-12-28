package pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    @FindBy(id = "dropdown")
    private WebElement dropdown;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectOption(String option) {
        waitForElementVisible(dropdown);
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public String getSelectedOption() {
        waitForElementVisible(dropdown);
        Select select = new Select(dropdown);
        return select.getFirstSelectedOption().getText();
    }
}