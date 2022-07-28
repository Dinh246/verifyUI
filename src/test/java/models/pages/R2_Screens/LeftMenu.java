package models.pages.R2_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LeftMenu {

    private AppiumDriver appiumDriver;
    private final By backBtn = By.id("com.ringpro.popular.freerings:id/icon_back_menu");
    private final By appLogo = By.id("com.ringpro.popular.freerings:id/img_logo");
    private final By requestRing = By.id("com.ringpro.popular.freerings:id/layout_request_new_ring");
    private final By resetRing = By.id("com.ringpro.popular.freerings:id/layout_reset_to_default");
    private final By policyPage = By.id("com.ringpro.popular.freerings:id/layout_privacy_policy");
    private final By shareApp = By.id("com.ringpro.popular.freerings:id/layout_share_app");
    private final By showNoti = By.id("com.ringpro.popular.freerings:id/switch_show_notification");

    public LeftMenu(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
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

    public WebElement ShareApp() {
        return appiumDriver.findElement(shareApp);
    }

    public WebElement ShowNoti() {
        return appiumDriver.findElement(showNoti);
    }

    public WebElement BackBtn() {
        return appiumDriver.findElement(backBtn);
    }

    public WebElement AppLogo() {
        return appiumDriver.findElement(appLogo);
    }
}
