package tests.web;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.web.*;

public class WebTests extends BaseTestWeb {

    @Test
    public void testFormAuthentication() {
        HomePage homePage = new HomePage(driver);
        homePage.clickFormAuthentication();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(loginPage.getFlashMessage().contains("You logged into a secure area!"));
    }

    @Test
    public void testCheckboxes() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCheckboxes();
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.checkCheckbox(0);
        checkboxesPage.uncheckCheckbox(1);
        Assert.assertTrue(checkboxesPage.isCheckboxSelected(0));
        Assert.assertFalse(checkboxesPage.isCheckboxSelected(1));
    }

    @Test
    public void testDropdown() {
        HomePage homePage = new HomePage(driver);
        homePage.clickDropdown();
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.selectOption("Option 1");
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 1");
    }
}