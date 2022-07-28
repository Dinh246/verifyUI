package models.pages.R2_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile {

    private AppiumDriver appiumDriver;
    private final By favTab = By.id("com.ringpro.popular.freerings:id/text_favorited");
    private final By homeMenubar = By.id("com.ringpro.popular.freerings:id/menu_home");
    private final By cateMenubar = By.id("com.ringpro.popular.freerings:id/menu_category");
    private final By searchMenubar = By.id("com.ringpro.popular.freerings:id/menu_search");
    private final By profileMenubar = By.id("com.ringpro.popular.freerings:id/menu_profile");
    private final By userName = By.id("com.ringpro.popular.freerings:id/txt_user_name");

    public Profile(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public WebElement FavTab() {
        return appiumDriver.findElement(favTab);
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

    public WebElement UserName() {
        return appiumDriver.findElement(userName);
    }
}
