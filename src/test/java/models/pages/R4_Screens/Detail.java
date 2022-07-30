package models.pages.R4_Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utils.userActions;

import java.io.File;
import java.io.IOException;

public class Detail extends userActions {

    private final AppiumDriver androidDriver;
    private final By backBtn = By.id("com.appspro.best.ringtones2017:id/icon_back_status");
    private final By prevBtn = By.id("com.appspro.best.ringtones2017:id/icon_play_pre");
    private final By nextBtn = By.id("com.appspro.best.ringtones2017:id/icon_play_next");
    private final By playBtn = By.id("com.appspro.best.ringtones2017:id/icon_playing_status");
    private final By favBtn = By.id("com.appspro.best.ringtones2017:id/icon_detail_favorite");
    private final By downBtn = By.id("com.appspro.best.ringtones2017:id/icon_detail_download");
    private final By delBtn = By.id("com.appspro.best.ringtones2017:id/icon_detail_delete");
    private final By setBtn = By.id("com.appspro.best.ringtones2017:id/icon_detail_setting");
    private final By closeBtn = By.id("com.appspro.best.ringtones2017:id/img_close");
    private final By watchAdsBtn1 = By.id("com.appspro.best.ringtones2017:id/btn_reward");
    private final By watchAdsBtn2 = By.id("com.appspro.best.ringtones2017:id/btn_yes");
    private final By buyVipBtn1 = By.id("com.appspro.best.ringtones2017:id/btn_vip_3");
    private final By buyVipBtn2 = By.id("com.appspro.best.ringtones2017:id/btn_purchase");
    private final By cancelBtn = By.id("com.appspro.best.ringtones2017:id/btn_no");
    private final By closeInterBtn = By.id("close-button-icon");
    private final By setRingBtn = By.id("com.appspro.best.ringtones2017:id/icon_set_call");
    private final By setContactBtn = By.id("com.appspro.best.ringtones2017:id/icon_set_contact");
    private final By setNotiBtn = By.id("com.appspro.best.ringtones2017:id/icon_set_sms");
    private final By setAlarmBtn = By.id("com.appspro.best.ringtones2017:id/icon_set_alarm");
    private final By waveAnim = By.id("com.appspro.best.ringtones2017:id/equalizerView");

    public Detail(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public AppiumDriver getAppiumDriver() {
        return androidDriver;
    }

    public WebElement BackBtn() {
        return androidDriver.findElement(backBtn);
    }

    public WebElement PrevBtn() {
        return androidDriver.findElement(prevBtn);
    }

    public WebElement NextBtn() {
        return androidDriver.findElement(nextBtn);
    }

    public WebElement PlayBtn() {
        return androidDriver.findElement(playBtn);
    }

    public WebElement FavBtn() {
        return androidDriver.findElement(favBtn);
    }

    public WebElement DownBtn() {
        return androidDriver.findElement(downBtn);
    }

    public WebElement DelBtn() {
        return androidDriver.findElement(delBtn);
    }

    public WebElement SetBtn() {
        return androidDriver.findElement(setBtn);
    }

    public WebElement CloseBtn() {
        return androidDriver.findElement(closeBtn);
    }

    public WebElement WatchAdsBtn1() {
        return androidDriver.findElement(watchAdsBtn1);
    }

    public WebElement WatchAdsBtn2() {
        return androidDriver.findElement(watchAdsBtn2);
    }

    public WebElement BuyVipBtn1() {
        return androidDriver.findElement(buyVipBtn1);
    }

    public WebElement BuyVipBtn2() {
        return androidDriver.findElement(buyVipBtn2);
    }

    public WebElement CancelBtn() {
        return androidDriver.findElement(cancelBtn);
    }

    public WebElement CloseInterBtn() {
        return androidDriver.findElement(closeInterBtn);
    }

    public WebElement SetRingBtn() {
        return androidDriver.findElement(setRingBtn);
    }

    public WebElement SetContactBtn() {
        return androidDriver.findElement(setContactBtn);
    }

    public WebElement SetNotiBtn() {
        return androidDriver.findElement(setNotiBtn);
    }

    public WebElement SetAlarmBtn() {
        return androidDriver.findElement(setAlarmBtn);
    }

    public WebElement WaveAnim() {
        return androidDriver.findElement(waveAnim);
    }

    public Detail takeScreenshot(String savedPath, String screenshotName) throws IOException {
        File Detail = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Detail, new File(savedPath + screenshotName));
        return this;
    }

    public Detail addToFavorites(){
        this.FavBtn().click();
        return this;
    }

    @Override
    public Detail swipeLeft(WebElement element){
        super.swipeLeft(element);
        return this;
    }

    @Override
    public Detail swipeRight(WebElement element){
        super.swipeRight(element);
        return this;
    }

    @Override
    public Detail scrollUp(WebElement element){
        super.scrollUp(element);
        return this;
    }

    @Override
    public Detail scrollDown(WebElement element){
        super.scrollDown(element);
        return this;
    }
}



