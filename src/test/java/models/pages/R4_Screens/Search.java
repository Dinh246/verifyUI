package models.pages.R4_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search {

    private AppiumDriver appiumDriver;
    private final By backBtn = By.id("com.appspro.best.ringtones2017:id/btn_back");
    private final By searchBar = By.id("com.appspro.best.ringtones2017:id/input_search");
    private final By xBtn = By.id("com.appspro.best.ringtones2017:id/layout_delete_search");
    private final By searchTrends = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/search_name_keyword']");

    public Search(AppiumDriver appiumDriver) {
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

    public WebElement SearchTrends() {
        return appiumDriver.findElement(searchTrends);
    }
}
