package models.pages.R1_Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.userActions;

public class Profile extends userActions {

    private final AndroidDriver androidDriver;
    private final By favTab = By.id("com.ringpro.popular.freerings:id/text_favorited");
    private final By homeMenubar = By.id("com.ringpro.popular.freerings:id/menu_home");
    private final By cateMenubar = By.id("com.ringpro.popular.freerings:id/menu_category");
    private final By searchMenubar = By.id("com.ringpro.popular.freerings:id/menu_search");
    private final By profileMenubar = By.id("com.ringpro.popular.freerings:id/menu_profile");
    private final By userName = By.id("com.ringpro.popular.freerings:id/txt_user_name");

    public Profile(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public WebElement FavTab() {
        return androidDriver.findElement(favTab);
    }

    public WebElement HomeMenubar() {
        return androidDriver.findElement(homeMenubar);
    }

    public WebElement SearchMenubar() {
        return androidDriver.findElement(searchMenubar);
    }

    public WebElement ProfileMenubar() {
        return androidDriver.findElement(profileMenubar);
    }

    public WebElement CateMenubar() {
        return androidDriver.findElement(cateMenubar);
    }

    public WebElement UserName() {
        return androidDriver.findElement(userName);
    }
}
