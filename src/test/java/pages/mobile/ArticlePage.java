package pages.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ArticlePage extends BasePage {

    @AndroidFindBy(id = "org.wikipedia:id/view_page_title_text")
    private WebElement articleTitle;

    @AndroidFindBy(id = "org.wikipedia:id/view_page_header_image")
    private WebElement articleImage;

    public ArticlePage(AppiumDriver driver) {
        super(driver);
    }

    public String getArticleTitle() {
        return articleTitle.getText();
    }

    public void scrollToImage() {
        // Simple scroll
        driver.executeScript("mobile: scroll", "{direction: 'down'}");
    }

    public boolean isImageDisplayed() {
        return articleImage.isDisplayed();
    }
}