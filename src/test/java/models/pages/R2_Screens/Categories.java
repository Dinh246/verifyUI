package models.pages.R2_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Categories {

    private AppiumDriver appiumDriver;
    private final By leftMenu = By.id("com.ringpro.popular.freerings:id/layoutIconMenuHome");
    private final By homeMenubar = By.id("com.ringpro.popular.freerings:id/menu_home");
    private final By cateMenubar = By.id("com.ringpro.popular.freerings:id/menu_category");
    private final By searchMenubar = By.id("com.ringpro.popular.freerings:id/menu_search");
    private final By profileMenubar = By.id("com.ringpro.popular.freerings:id/menu_profile");
    private final By titleCate = By.id("com.ringpro.popular.freerings:id/title1");

    public Categories(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public WebElement LeftMenu() {
        return appiumDriver.findElement(leftMenu);
    }

    public WebElement HomeMenubar() {
        return appiumDriver.findElement(homeMenubar);
    }

    public WebElement SearchMenubar() {
        return appiumDriver.findElement(searchMenubar);
    }

    public WebElement ProfileMenubar() {
        return appiumDriver.findElement(profileMenubar);
    }

    public WebElement CateMenubar() {
        return appiumDriver.findElement(cateMenubar);
    }

    public WebElement TitleCate() {
        return appiumDriver.findElement(titleCate);
    }
}
