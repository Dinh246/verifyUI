package models.pages.R1_Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.userActions;

import java.io.IOException;

public class Detail extends userActions {

    private final AndroidDriver androidDriver;
    private final By backBtn = By.id("com.bluesky.best_ringtone.free2017:id/icon_back");
    private final By playBtn = By.id("com.bluesky.best_ringtone.free2017:id/icon_playing_status");
    private final By favBtn = By.id("com.bluesky.best_ringtone.free2017:id/layout_icon_favorite");
    private final By downBtn = By.id("com.bluesky.best_ringtone.free2017:id/icon_download");
    private final By delBtn = By.id("com.bluesky.best_ringtone.free2017:id/layout_icon_delete");
    private final By setBtn = By.id("com.bluesky.best_ringtone.free2017:id/icon_setting");
    private final By skipBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_no");
    private final By acceptBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_yes");
    private final By setRingBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_set_ring");
    private final By setContactBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_set_contact");
    private final By setNotiBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_set_notification");
    private final By setAlarmBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_set_alarm");
    private final By noTry = By.id("com.bluesky.best_ringtone.free2017:id/btn_no");
    private final By acceptSetRing = By.id("com.bluesky.best_ringtone.free2017:id/btn_yes");
    private final By waveAnim = By.id("com.bluesky.best_ringtone.free2017:id/equalizer");
    private final By watchAds = By.id("com.bluesky.best_ringtone.free2017:id/btn_yes");
    private final By okBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_yes");
    private final By permissionDialog = By.id("com.bluesky.best_ringtone.free2017:id/title1");
    private final By allowBtn = By.id("com.android.packageinstaller:id/permission_allow_button");
    private final By switchOn = By.id("android:id/switch_widget");
    private final By mediaFrame = By.xpath("//*[@resource-id='com.bluesky.best_ringtone.free2017:id/item_root']");


    public Detail(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    public Detail addToFavorites(){
        androidDriver.findElement(favBtn).click();
        return this;
    }

    public Detail stopRingtone(){
        androidDriver.findElement(playBtn).click();
        return this;
    }

    public Detail tapDownload(){
        androidDriver.findElement(downBtn).click();
        return this;
    }

    public Detail tapSkipRewarded(){
        androidDriver.findElement(skipBtn).click();
        return this;
    }

    public Detail tapAcceptRewarded(){
        androidDriver.findElement(acceptBtn).click();
        return this;
    }

    public Detail grantDownloadPermission(){
        androidDriver.findElement(okBtn).click();
        androidDriver.findElement(allowBtn).click();
        return this;
    }

    public WebElement AcceptBtn(){
        return androidDriver.findElement(acceptBtn);
    }

    public WebElement SkipBtn(){
        return androidDriver.findElement(skipBtn);
    }

    public WebElement WaveAnim(){
        return androidDriver.findElement(waveAnim);
    }

    public WebElement MediaFrame(){
        return androidDriver.findElement(mediaFrame);
    }

    public WebElement permissionDialog(){
        return androidDriver.findElement(permissionDialog);
    }

    public WebElement DelBtn(){
        return androidDriver.findElement(delBtn);
    }

    public WebElement SetRingBtn(){
        return androidDriver.findElement(setRingBtn);
    }

    public Detail tapSettings(){
        androidDriver.findElement(setBtn).click();
        return this;
    }

    public Detail tapWatchAds(){
        androidDriver.findElement(watchAds).click();
        return this;
    }

    public void closeSettingsAndBackToHomepage(){
        androidDriver.findElement(setRingBtn).click();
//        if (androidDriver.findElement(permissionDialog).isDisplayed()){
//            super.waitScreenStable(androidDriver.findElement(okBtn));
//            androidDriver.findElement(okBtn).click();
//            super.waitScreenStable(androidDriver.findElement(okBtn));
//            androidDriver.findElement(okBtn).click();
//            androidDriver.findElement(switchOn).click();
//            androidDriver.activateApp("com.bluesky.best_ringtone.free2017");
//        }
        androidDriver.findElement(acceptBtn).click();
        androidDriver.findElement(noTry).click();
    }

    @Override
    public Detail takeScreenshot(String savedPath, String screenshotName) throws IOException {
        super.takeScreenshot(savedPath, screenshotName);
        return this;
    }

    @Override
    public Detail waitScreenStable(WebElement Element) {
        super.waitScreenStable(Element);
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
