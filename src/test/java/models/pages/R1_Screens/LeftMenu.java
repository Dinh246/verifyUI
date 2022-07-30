package models.pages.R1_Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.userActions;

public class LeftMenu extends userActions {

    private final AndroidDriver androidDriver;
    private final By backBtn = By.id("com.ringpro.popular.freerings:id/icon_back_menu");
    private final By appLogo = By.id("com.ringpro.popular.freerings:id/img_logo");
    private final By requestRing = By.id("com.ringpro.popular.freerings:id/layout_request_new_ring");
    private final By resetRing = By.id("com.ringpro.popular.freerings:id/layout_reset_to_default");
    private final By policyPage = By.id("com.ringpro.popular.freerings:id/layout_privacy_policy");
    private final By shareApp = By.id("com.ringpro.popular.freerings:id/layout_share_app");
    private final By showNoti = By.id("com.ringpro.popular.freerings:id/switch_show_notification");

    public LeftMenu(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public AndroidDriver getAppiumDriver() {
        return androidDriver;
    }

}
