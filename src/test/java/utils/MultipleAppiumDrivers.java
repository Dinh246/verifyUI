package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static io.appium.java_client.Setting.WAIT_FOR_IDLE_TIMEOUT;

public class MultipleAppiumDrivers {

    public static AndroidDriver getMultipleAndroidDrivers(String language, String locale, String udid, Integer port){

        AndroidDriver androidDriver;
        UiAutomator2Options options = new UiAutomator2Options()
                .setLanguage(language)
                .setLocale(locale)
//                .setApp("C:\\Users\\nicky\\Downloads\\R4.apk")
                .setUdid(udid)
                .setAutomationName("uiautomator2")
                .autoGrantPermissions()
                .setPlatformName("Android")
//                .disableWindowAnimation()
//                .noReset()
                .setAppPackage("com.bluesky.best_ringtone.free2017")
                .setAppActivity(".ui.splash.SplashActivity")
                .setSystemPort(port)
                .setIsHeadless(true);

        URL appiumServer = null;
        try {
            appiumServer = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        assert appiumServer != null;
        androidDriver = new AndroidDriver(appiumServer, options);
        androidDriver.setSetting(WAIT_FOR_IDLE_TIMEOUT, 0);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return androidDriver;
    }
}
