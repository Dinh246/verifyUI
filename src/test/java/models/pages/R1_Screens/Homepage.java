package models.pages.R1_Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.userActions;

import java.io.IOException;
import java.util.List;

public class Homepage extends userActions {

    private final AndroidDriver androidDriver;
    private final By leftMenu = By.id("com.bluesky.best_ringtone.free2017:id/layout_icon_menu_home");
    private final By ringtones = By.xpath("//*[@resource-id='com.bluesky.best_ringtone.free2017:id/name_ring']");
    private final By rateBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_yes");
    private final By fourStars = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.ImageView");
    private final By submitBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_rate");
    private final By feedbackOptions = By.xpath("//*[@resource-id='com.bluesky.best_ringtone.free2017:id/selected_feedback']");
    private final By sendFeedbackBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_send");
    private final By closeFeedbackBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_close_feedback");
    private final By requestBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_send");
    private final By searchBtn = By.id("com.bluesky.best_ringtone.free2017:id/icon_search_toolbar");
    private final By listCate = By.id("com.bluesky.best_ringtone.free2017:id/list_category");
    private final By cateBtn = By.id("com.bluesky.best_ringtone.free2017:id/icon_more_cate");
    private final By closeCateBtn = By.id("com.bluesky.best_ringtone.free2017:id/icon_hide_dialog_category");
    private final By requestRing = By.id("com.bluesky.best_ringtone.free2017:id/layout_menu_request");
    private final By hardToUseOpts = By.xpath("//*[@resource-id='com.bluesky.best_ringtone.free2017:id/selected_feedback']");
    private final By recycleRingtones = By.id("com.bluesky.best_ringtone.free2017:id/detail_container");
    private final By recycleCollections = By.id("com.bluesky.best_ringtone.free2017:id/tabLayout");


    public Homepage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public WebElement LeftMenu() {
        return androidDriver.findElement(leftMenu);
    }

    public WebElement RecycleRingtones() {
        return androidDriver.findElement(recycleRingtones);
    }

    public WebElement RecycleCollections() {
        return androidDriver.findElement(recycleCollections);
    }

    public void goToDetail(Integer ringIndex) {
        waitForElement(this.Ringtone().get(ringIndex));
        androidDriver.findElements(ringtones).get(ringIndex).click();
    }

    public WebElement RateBtn() {
        return androidDriver.findElement(rateBtn);
    }

    public WebElement SubmitBtn() {
        return androidDriver.findElement(submitBtn);
    }

    public WebElement SendFeedbackBtn() {
        return androidDriver.findElement(sendFeedbackBtn);
    }

    public WebElement RequestBtn() {
        return androidDriver.findElement(requestBtn);
    }

    public WebElement RequestRing() {
        return androidDriver.findElement(requestRing);
    }

    public Homepage rateApp4Stars() {
        androidDriver.findElement(rateBtn).click();
        androidDriver.findElement(fourStars).click();
        androidDriver.findElement(submitBtn).click();
        return this;
    }

    public Homepage selectNoFavoriteRingtone() {
        androidDriver.findElements(feedbackOptions).get(3).click();
        androidDriver.findElement(sendFeedbackBtn).click();
        return this;
    }

    public Homepage selectHardToUse() {
        androidDriver.findElements(feedbackOptions).get(1).click();
        androidDriver.findElement(sendFeedbackBtn).click();
        return this;
    }

    public Homepage closeFeedback() {
        androidDriver.findElement(closeFeedbackBtn).click();
        return this;
    }

    public Homepage openMoreCate() {
        androidDriver.findElement(cateBtn).click();
        return this;
    }

    public Homepage closeMoreCate() {
        androidDriver.findElement(closeCateBtn).click();
        return this;
    }

    public void goToSearch() {
        androidDriver.findElement(searchBtn).click();
    }

    public WebElement ListCate() {
        return androidDriver.findElement(listCate);
    }

    public List<WebElement> Ringtone() {
        return androidDriver.findElements(ringtones);
    }

    public Homepage openLeftMenu() {
        androidDriver.findElement(leftMenu).click();
        return this;
    }

    public void goToRequestRing() {
        waitForElement(androidDriver.findElement(requestRing));
        androidDriver.findElement(requestRing).click();
    }

    public Homepage selectAnOption() {
        androidDriver.findElements(hardToUseOpts).get(2).click();
        return this;
    }

    public Homepage submitFeedback() {
        androidDriver.findElement(sendFeedbackBtn).click();
        return this;
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
    public Homepage swipeLeft(WebElement element) {
        super.swipeLeft(element);
        return this;
    }

    @Override
    public Homepage swipeRight(WebElement element) {
        super.swipeRight(element);
        return this;
    }

    @Override
    public Homepage scrollUp(WebElement element) {
        super.scrollUp(element);
        return this;
    }

    @Override
    public Homepage scrollDown(WebElement element) {
        super.scrollDown(element);
        return this;
    }

    @Override
    public Homepage swipeLeftMultipleTimes(WebElement element, Integer times) {
        super.swipeLeftMultipleTimes(element, times);
        return this;
    }

    @Override
    public Homepage swipeRightMultipletimes(WebElement element, Integer times) {
        super.swipeRightMultipletimes(element, times);
        return this;
    }

    @Override
    public Homepage scrollUpMultipleTimes(WebElement element, Integer times) {
        super.scrollUpMultipleTimes(element, times);
        return this;
    }

    @Override
    public Homepage scrollDownMultipleTimes(WebElement element, Integer times) {
        super.scrollDownMultipleTimes(element, times);
        return this;
    }
}
