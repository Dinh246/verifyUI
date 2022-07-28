package models.pages.R2_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Detail {

    private AppiumDriver appiumDriver;
    private final By backBtn = By.id("com.ringpro.popular.freerings:id/icon_back");
    private final By playBtn = By.id("com.ringpro.popular.freerings:id/icon_playing_status");
    private final By favBtn = By.id("com.ringpro.popular.freerings:id/layout_icon_favorite");
    private final By downBtn = By.id("com.ringpro.popular.freerings:id/icon_download");
    private final By delBtn = By.id("com.ringpro.popular.freerings:id/layout_icon_delete");
    private final By setBtn = By.id("com.ringpro.popular.freerings:id/icon_setting");
    private final By closeBtn = By.id("com.ringpro.popular.freerings:id/btn_no");
    private final By acceptBtn = By.id("com.ringpro.popular.freerings:id/btn_yes");
    private final By setRingBtn = By.id("com.ringpro.popular.freerings:id/btn_set_ring");
    private final By setContactBtn = By.id("com.ringpro.popular.freerings:id/btn_set_contact");
    private final By setNotiBtn = By.id("com.ringpro.popular.freerings:id/btn_set_notification");
    private final By setAlarmBtn = By.id("com.ringpro.popular.freerings:id/btn_set_alarm");
    private final By waveAnim = By.id("com.ringpro.popular.freerings:id/equalizer");
    private final By hideSettings = By.id("com.ringpro.popular.freerings:id/down_arrow");

    public Detail(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public WebElement BackBtn() {
        return appiumDriver.findElement(backBtn);
    }

    public WebElement PlayBtn() {
        return appiumDriver.findElement(playBtn);
    }

    public WebElement FavBtn() {
        return appiumDriver.findElement(favBtn);
    }

    public WebElement DownBtn() {
        return appiumDriver.findElement(downBtn);
    }

    public WebElement DelBtn() {
        return appiumDriver.findElement(delBtn);
    }

    public WebElement SetBtn() {
        return appiumDriver.findElement(setBtn);
    }

    public WebElement CloseBtn() {
        return appiumDriver.findElement(closeBtn);
    }

    public WebElement AcceptBtn() {
        return appiumDriver.findElement(acceptBtn);
    }

    public WebElement SetRingBtn() {
        return appiumDriver.findElement(setRingBtn);
    }

    public WebElement SetContactBtn() {
        return appiumDriver.findElement(setContactBtn);
    }

    public WebElement SetNotiBtn() {
        return appiumDriver.findElement(setNotiBtn);
    }

    public WebElement SetAlarmBtn() {
        return appiumDriver.findElement(setAlarmBtn);
    }

    public WebElement WaveAnim() {
        return appiumDriver.findElement(waveAnim);
    }

    public WebElement HideSettings() {
        return appiumDriver.findElement(hideSettings);
    }
}
