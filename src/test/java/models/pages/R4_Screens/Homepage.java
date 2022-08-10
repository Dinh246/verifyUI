package models.pages.R4_Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.userActions;

import java.io.IOException;
import java.util.List;

public class Homepage extends userActions {

    private final AndroidDriver androidDriver;
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
    private final By recycleRingtones = By.id("com.appspro.best.ringtones2017:id/recycle_ringtone");
    private final By recycleCollections = By.id("com.appspro.best.ringtones2017:id/recycleCollection");


    public Homepage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return androidDriver;
    }

    public WebElement LeftMenu() {
        return androidDriver.findElement(leftMenu);
    }

    public WebElement VipIcon() {
        return androidDriver.findElement(vipIcon);
    }

    public List<WebElement> OtherCollections() {
        return androidDriver.findElements(otherCollections);
    }

    public List<WebElement> Ringtones() {
        return androidDriver.findElements(ringtones);
    }

    public List<WebElement> PlayBtn() {
        return androidDriver.findElements(playBtn);
    }

    public List<WebElement> FavBtn() {
        return androidDriver.findElements(favBtn);
    }

    public WebElement DownMenubar() {
        return androidDriver.findElement(downMenubar);
    }

    public WebElement RecycleRingtones() {
        return androidDriver.findElement(recycleRingtones);
    }

    public WebElement RecycleCollections() {
        return androidDriver.findElement(recycleCollections);
    }

    public WebElement SearchMenubar() {
        return androidDriver.findElement(searchMenubar);
    }

    public WebElement MoreappsMenubar() {
        return androidDriver.findElement(moreappsMenubar);
    }

    public WebElement RateBtn() {
        return androidDriver.findElement(rateBtn);
    }

    public WebElement CloseRateBtn() {
        return androidDriver.findElement(closeRateBtn);
    }

    public WebElement FiveStars() {
        return androidDriver.findElement(fiveStars);
    }

    public WebElement FourStars() {
        return androidDriver.findElement(fourStars);
    }

    public WebElement SubmitBtn() {
        return androidDriver.findElement(submitBtn);
    }

    public WebElement CloseBtn() {
        return androidDriver.findElement(closeBtn);
    }

    public List<WebElement> FeedbackOptions() {
        return androidDriver.findElements(feedbackOptions);
    }

    public WebElement SendFeedbackBtn() {
        return androidDriver.findElement(sendFeedbackBtn);
    }

    public WebElement CloseFeedbackBtn() {
        return androidDriver.findElement(closeFeedbackBtn);
    }

    public WebElement OtherFeedback() {
        return androidDriver.findElement(otherFeedback);
    }

    public WebElement OkBtn() {
        return androidDriver.findElement(okBtn);
    }

    public WebElement HomeMenubar() {
        return androidDriver.findElement(homeMenubar);
    }

    public WebElement VipTitle() {
        return androidDriver.findElement(vipTitle);
    }

    public void goToDetail() {
        androidDriver.findElements(ringtones).get(1).click();
    }

    @Override
    public Homepage takeScreenshot(String savedPath, String screenshotName) throws IOException {
        super.takeScreenshot(savedPath, screenshotName);
        return this;
    }

    @Override
    public Homepage waitForElement(WebElement Element) {
        super.waitForElement(Element);
        return this;
    }

    @Override
    public Homepage swipeLeft(WebElement element){
        super.swipeLeft(element);
        return this;
    }

    @Override
    public Homepage swipeRight(WebElement element){
        super.swipeRight(element);
        return this;
    }

    @Override
    public Homepage scrollUp(WebElement element){
        super.scrollUp(element);
        return this;
    }

    @Override
    public Homepage scrollDown(WebElement element){
        super.scrollDown(element);
        return this;
    }
}
