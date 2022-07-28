package models.pages.R4_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Downloads {

    private AppiumDriver appiumDriver;
    private final By leftMenu = By.id("com.appspro.best.ringtones2017:id/icon_menu");
    private final By vipIcon = By.id("com.appspro.best.ringtones2017:id/btn_vip");
    private final By ringtones = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/ringtone_list_name']");
    private final By playBtn = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/icon_list_ringtone_status']");
    private final By favBtn = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/btn_favorite']");
    private final By homeMenubar = By.id("com.appspro.best.ringtones2017:id/icon_home_action");
    private final By searchMenubar = By.id("com.appspro.best.ringtones2017:id/icon_search_action");
    private final By moreappsMenubar = By.id("com.appspro.best.ringtones2017:id/icon_more_app_action");
    private final By downMenubar = By.id("com.appspro.best.ringtones2017:id/footer_download");

    public Downloads(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public WebElement LeftMenu() {
        return appiumDriver.findElement(leftMenu);
    }

    public WebElement VipIcon() {
        return appiumDriver.findElement(vipIcon);
    }

    public List<WebElement> Ringtones() {
        return appiumDriver.findElements(ringtones);
    }

    public List<WebElement> PlayBtn() {
        return appiumDriver.findElements(playBtn);
    }

    public List<WebElement> FavBtn() {
        return appiumDriver.findElements(favBtn);
    }

    public WebElement HomeMenubar() {
        return appiumDriver.findElement(homeMenubar);
    }

    public WebElement SearchMenubar() {
        return appiumDriver.findElement(searchMenubar);
    }

    public WebElement MoreappsMenubar() {
        return appiumDriver.findElement(moreappsMenubar);
    }

    public WebElement DownMenubar() {
        return appiumDriver.findElement(downMenubar);
    }
}
