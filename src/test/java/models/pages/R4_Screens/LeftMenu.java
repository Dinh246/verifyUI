package models.pages.R4_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LeftMenu {

    private AppiumDriver appiumDriver;
    private final By favTab = By.id("com.appspro.best.ringtones2017:id/favoriteRingtone");
    private final By requestRing = By.id("com.appspro.best.ringtones2017:id/requestRingtone");
    private final By resetRing = By.id("com.appspro.best.ringtones2017:id/resetRingtone");
    private final By policyPage = By.id("com.appspro.best.ringtones2017:id/privacyPolicy");
    private final By emailDev = By.id("com.appspro.best.ringtones2017:id/contact_email");
    private final By signinGG = By.id("com.appspro.best.ringtones2017:id/login_logout");

    public LeftMenu(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public WebElement FavTab() {
        return appiumDriver.findElement(favTab);
    }

    public WebElement RequestRing() {
        return appiumDriver.findElement(requestRing);
    }

    public WebElement ResetRing() {
        return appiumDriver.findElement(resetRing);
    }

    public WebElement PolicyPage() {
        return appiumDriver.findElement(policyPage);
    }

    public WebElement EmailDev() {
        return appiumDriver.findElement(emailDev);
    }

    public WebElement SigninGG() {
        return appiumDriver.findElement(signinGG);
    }
}
