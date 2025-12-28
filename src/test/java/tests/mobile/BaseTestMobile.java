package tests.mobile;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.AppiumUtils;

import java.net.MalformedURLException;

public class BaseTestMobile {
    protected AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = AppiumUtils.createAndroidDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}