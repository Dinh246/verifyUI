package models.pages.R2_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search {

    private AppiumDriver appiumDriver;
    private final By searchBar = By.id("com.ringpro.popular.freerings:id/input_search");
    private final By xBtn = By.id("com.ringpro.popular.freerings:id/button_clear");
    private final By searchTrends = By.xpath("//*[@resource-id='com.ringpro.popular.freerings:id/text_key']");
    private final By homeMenubar = By.id("com.ringpro.popular.freerings:id/menu_home");
    private final By cateMenubar = By.id("com.ringpro.popular.freerings:id/menu_category");
    private final By searchMenubar = By.id("com.ringpro.popular.freerings:id/menu_search");
    private final By profileMenubar = By.id("com.ringpro.popular.freerings:id/menu_profile");
    private final By noResult = By.id("com.ringpro.popular.freerings:id/tv_empty_result");

    public Search(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
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

    public WebElement HomeMenubar() {
        return appiumDriver.findElement(homeMenubar);
    }

    public WebElement CateMenubar() {
        return appiumDriver.findElement(cateMenubar);
    }

    public WebElement SearchMenubar() {
        return appiumDriver.findElement(searchMenubar);
    }

    public WebElement ProfileMenubar() {
        return appiumDriver.findElement(profileMenubar);
    }

    public WebElement NoResult() {
        return appiumDriver.findElement(noResult);
    }
}
