package pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckboxesPage extends BasePage {

    @FindBy(css = "input[type='checkbox']")
    private List<WebElement> checkboxes;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void checkCheckbox(int index) {
        if (!checkboxes.get(index).isSelected()) {
            checkboxes.get(index).click();
        }
    }

    public void uncheckCheckbox(int index) {
        if (checkboxes.get(index).isSelected()) {
            checkboxes.get(index).click();
        }
    }

    public boolean isCheckboxSelected(int index) {
        return checkboxes.get(index).isSelected();
    }
}