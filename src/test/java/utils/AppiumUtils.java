package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumUtils {

    public static AppiumDriver createAndroidDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "org.wikipedia");
        caps.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        caps.setCapability("noReset", true);

        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }
}