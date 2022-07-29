package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static io.appium.java_client.Setting.*;

public class AppiumDriverEx {

    public static AppiumDriver getAppiumDriver() {
        AppiumDriver appiumDriver;
        UiAutomator2Options options = new UiAutomator2Options()
                .setLanguage("de")
                .setLocale("de")
                .setApp("C:\\Users\\nicky\\Downloads\\R4.apk")
                .setUdid("PDAGAA48A1506417")
                .setAutomationName("uiautomator2")
                .setAutoGrantPermissions(true)
                .setPlatformName("Android")
                .disableWindowAnimation();
//                .setAppPackage("com.ringpro.popular.freerings")
//                .setAppActivity(".ui.splash.SplashActivity")
//                .setAppWaitActivity(".ui.main.MainActivity");

        URL appiumServer = null;
        try {
            appiumServer = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        assert appiumServer != null;
        appiumDriver = new AppiumDriver(appiumServer, options);
        appiumDriver.setSetting(WAIT_FOR_IDLE_TIMEOUT, 0);
        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        return appiumDriver;
    }

    public static AndroidDriver getAndroidDriver() {
        AndroidDriver androidDriver;
        UiAutomator2Options options = new UiAutomator2Options()
                .setLanguage("en")
                .setLocale("us")
//                .setApp("C:\\Users\\nicky\\Downloads\\R4.apk")
                .setUdid("PDAGAA48A1506417")
                .setAutomationName("uiautomator2")
                .setAutoGrantPermissions(true)
                .setPlatformName("Android")
                .disableWindowAnimation()
                .setAppPackage("com.bluesky.best_ringtone.free2017")
                .setAppActivity(".ui.splash.SplashActivity")
                .noReset();

        URL appiumServer = null;
        try {
            appiumServer = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        assert appiumServer != null;
        androidDriver = new AndroidDriver(appiumServer, options);
        androidDriver.setSetting(WAIT_FOR_IDLE_TIMEOUT, 0);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        return androidDriver;
    }
}