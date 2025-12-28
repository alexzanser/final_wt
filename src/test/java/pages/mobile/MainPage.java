package pages.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    @AndroidFindBy(id = "org.wikipedia:id/search_container")
    private WebElement searchContainer;

    @AndroidFindBy(id = "org.wikipedia:id/search_src_text")
    private WebElement searchField;

    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickSearch() {
        searchContainer.click();
    }

    public void enterSearchQuery(String query) {
        searchField.sendKeys(query);
    }

    public boolean isSearchFieldDisplayed() {
        return searchField.isDisplayed();
    }
}