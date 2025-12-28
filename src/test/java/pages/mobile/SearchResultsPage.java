package pages.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @AndroidFindBy(id = "org.wikipedia:id/page_list_item_title")
    private List<WebElement> searchResults;

    public SearchResultsPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickFirstResult() {
        searchResults.get(0).click();
    }

    public String getFirstResultTitle() {
        return searchResults.get(0).getText();
    }
}