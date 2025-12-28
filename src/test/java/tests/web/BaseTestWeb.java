package tests.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import utils.WebDriverUtils;

public class BaseTestWeb {
    protected WebDriver driver;
    protected final String BASE_URL = "https://the-internet.herokuapp.com/";

    @BeforeClass
    public void setUp() {
        driver = WebDriverUtils.createChromeDriver();
        driver.get(BASE_URL);
        System.out.println("Page title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    @AfterMethod
    public void afterMethod() {
        driver.get(BASE_URL);
    }
}