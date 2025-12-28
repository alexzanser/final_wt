package tests.mobile;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mobile.*;

public class MobileTests extends BaseTestMobile {

    @Test
    public void testMainPageLoads() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.isSearchFieldDisplayed());
    }

    @Test
    public void testSearchAndOpenArticle() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSearch();
        mainPage.enterSearchQuery("Java");
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        String title = searchResultsPage.getFirstResultTitle();
        searchResultsPage.clickFirstResult();
        ArticlePage articlePage = new ArticlePage(driver);
        Assert.assertTrue(articlePage.getArticleTitle().contains("Java"));
    }

    @Test
    public void testScrollInArticle() {
        // Предполагаем, что статья уже открыта из предыдущего теста, но для простоты
        // повторим
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSearch();
        mainPage.enterSearchQuery("Java");
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.clickFirstResult();
        ArticlePage articlePage = new ArticlePage(driver);
        articlePage.scrollToImage();
        Assert.assertTrue(articlePage.isImageDisplayed());
    }
}