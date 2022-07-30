package models.pages.R1_Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.userActions;

public class Categories extends userActions {

    private AndroidDriver androidDriver;
    private final By leftMenu = By.id("com.ringpro.popular.freerings:id/layoutIconMenuHome");
    private final By homeMenubar = By.id("com.ringpro.popular.freerings:id/menu_home");
    private final By cateMenubar = By.id("com.ringpro.popular.freerings:id/menu_category");
    private final By searchMenubar = By.id("com.ringpro.popular.freerings:id/menu_search");
    private final By profileMenubar = By.id("com.ringpro.popular.freerings:id/menu_profile");
    private final By titleCate = By.id("com.ringpro.popular.freerings:id/title1");

    public Categories(AndroidDriver androidDriver) {
        super(androidDriver);
    }

}
