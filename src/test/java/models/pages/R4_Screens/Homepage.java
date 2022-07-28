package models.pages.R4_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage {

    private AppiumDriver appiumDriver;
    private final By leftMenu = By.id("com.appspro.best.ringtones2017:id/icon_menu");
    private final By vipIcon = By.id("com.appspro.best.ringtones2017:id/btn_vip");
    private final By otherCollections = By.id("com.appspro.best.ringtones2017:id/img_collection");
    private final By ringtones = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/ringtone_list_name']");
    private final By playBtn = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/icon_list_ringtone_status']");
    private final By favBtn = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/btn_favorite']");
    private final By homeMenubar = By.id("com.appspro.best.ringtones2017:id/footer_home");
    private final By downMenubar = By.id("com.appspro.best.ringtones2017:id/icon_download_action");
    private final By searchMenubar = By.id("com.appspro.best.ringtones2017:id/icon_search_action");
    private final By moreappsMenubar = By.id("com.appspro.best.ringtones2017:id/icon_more_app_action");
    private final By rateBtn = By.id("com.appspro.best.ringtones2017:id/btn_like_invite");
    private final By closeRateBtn = By.id("com.appspro.best.ringtones2017:id/btn_dislike_invite");
    private final By fiveStars = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.ImageView");
    private final By fourStars = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.ImageView");
    private final By submitBtn = By.id("com.appspro.best.ringtones2017:id/btn_rate");
    private final By closeBtn = By.id("com.appspro.best.ringtones2017:id/btn_close_rate");
    private final By feedbackOptions = By.xpath("//*[@resource-id='com.appspro.best.ringtones2017:id/selected_feedback']");
    private final By sendFeedbackBtn = By.id("com.appspro.best.ringtones2017:id/btn_send");
    private final By closeFeedbackBtn = By.id("com.appspro.best.ringtones2017:id/btn_close_feedback");
    private final By otherFeedback = By.id("com.appspro.best.ringtones2017:id/edt_feedback");
    private final By okBtn = By.id("com.appspro.best.ringtones2017:id/btn_send");
    private final By vipTitle = By.id("com.appspro.best.ringtones2017:id/text1");


    public Homepage(AppiumDriver appiumDriver) {
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

    public List<WebElement> OtherCollections() {
        return appiumDriver.findElements(otherCollections);
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

    public WebElement DownMenubar() {
        return appiumDriver.findElement(downMenubar);
    }

    public WebElement SearchMenubar() {
        return appiumDriver.findElement(searchMenubar);
    }

    public WebElement MoreappsMenubar() {
        return appiumDriver.findElement(moreappsMenubar);
    }

    public WebElement RateBtn() {
        return appiumDriver.findElement(rateBtn);
    }

    public WebElement CloseRateBtn() {
        return appiumDriver.findElement(closeRateBtn);
    }

    public WebElement FiveStars() {
        return appiumDriver.findElement(fiveStars);
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

    public WebElement CloseFeedbackBtn() {
        return appiumDriver.findElement(closeFeedbackBtn);
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

    public WebElement VipTitle() {
        return appiumDriver.findElement(vipTitle);
    }
}
