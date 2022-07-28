package models.pages.R2_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage {

    private AppiumDriver appiumDriver;
    private final By leftMenu = By.id("com.ringpro.popular.freerings:id/layoutIconMenuHome");
    private final By ringtones = By.xpath("//*[@resource-id='com.ringpro.popular.freerings:id/layout_info_row']");
    private final By playBtn = By.xpath("//*[@resource-id='com.ringpro.popular.freerings:id/icon_list_ringtone_status']");
    private final By favBtn = By.xpath("//*[@resource-id='com.ringpro.popular.freerings:id/icon_favorite_status']");
    private final By homeMenubar = By.id("com.ringpro.popular.freerings:id/menu_home");
    private final By cateMenubar = By.id("com.ringpro.popular.freerings:id/menu_category");
    private final By searchMenubar = By.id("com.ringpro.popular.freerings:id/menu_search");
    private final By profileMenubar = By.id("com.ringpro.popular.freerings:id/menu_profile");
    private final By rateBtn = By.id("com.ringpro.popular.freerings:id/btn_yes");
    private final By fourStars = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.ImageView");
    private final By submitBtn = By.id("com.ringpro.popular.freerings:id/btn_yes");
    private final By laterBtn = By.id("com.ringpro.popular.freerings:id/btn_later");
    private final By closeBtn = By.id("com.appspro.best.ringtones2017:id/btn_close_rate");
    private final By feedbackOptions = By.xpath("//*[@resource-id='com.ringpro.popular.freerings:id/selected_feedback']");
    private final By sendFeedbackBtn = By.id("com.ringpro.popular.freerings:id/btn_send");
    private final By otherFeedback = By.id("com.appspro.best.ringtones2017:id/edt_feedback");
    private final By okBtn = By.id("com.ringpro.popular.freerings:id/btn_send");


    public Homepage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public WebElement LeftMenu() {
        return appiumDriver.findElement(leftMenu);
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

    public WebElement CateMenubar() {
        return appiumDriver.findElement(cateMenubar);
    }

    public WebElement SearchMenubar() {
        return appiumDriver.findElement(searchMenubar);
    }

    public WebElement ProfileMenubar() {
        return appiumDriver.findElement(profileMenubar);
    }

    public WebElement RateBtn() {
        return appiumDriver.findElement(rateBtn);
    }

    public WebElement FourStars() {
        return appiumDriver.findElement(fourStars);
    }

    public WebElement SubmitBtn() {
        return appiumDriver.findElement(submitBtn);
    }

    public WebElement CloseBtn() {
        return appiumDriver.findElement(closeBtn);
    }

    public List<WebElement> FeedbackOptions() {
        return appiumDriver.findElements(feedbackOptions);
    }

    public WebElement SendFeedbackBtn() {
        return appiumDriver.findElement(sendFeedbackBtn);
    }

    public WebElement OtherFeedback() {
        return appiumDriver.findElement(otherFeedback);
    }

    public WebElement OkBtn() {
        return appiumDriver.findElement(okBtn);
    }

    public WebElement HomeMenubar() {
        return appiumDriver.findElement(homeMenubar);
    }

    public WebElement LaterBtn() {
        return appiumDriver.findElement(laterBtn);
    }
}
