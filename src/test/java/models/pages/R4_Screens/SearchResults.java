package models.pages.R4_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResults {

    private AppiumDriver appiumDriver;
    private final By backBtn = By.id("com.appspro.best.ringtones2017:id/btn_back");
    private final By searchBar = By.id("com.appspro.best.ringtones2017:id/input_search");
    private final By xBtn = By.id("com.appspro.best.ringtones2017:id/layout_delete_search");
    private final By ringtones = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/ringtone_list_name']");
    private final By playBtn = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/icon_list_ringtone_status']");
    private final By favBtn = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/btn_favorite']");
    private final By noResult = By.id("com.appspro.best.ringtones2017:id/tv_empty_result");

    public SearchResults(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public WebElement BackBtn() {
        return appiumDriver.findElement(backBtn);
    }

    public WebElement SearchBar() {
        return appiumDriver.findElement(searchBar);
    }

    public WebElement xBtn() {
        return appiumDriver.findElement(xBtn);
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

    public WebElement NoResult() {
        return appiumDriver.findElement(noResult);
    }
}
