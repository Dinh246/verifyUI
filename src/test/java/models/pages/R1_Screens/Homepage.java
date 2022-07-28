package models.pages.R1_Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TakeScreenshotAndWaitEle;

import java.io.IOException;

public class Homepage extends TakeScreenshotAndWaitEle {

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


    public Homepage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public WebElement LeftMenu(){
        return androidDriver.findElement(leftMenu);
    }

    public void goToDetail() {
        androidDriver.findElements(ringtones).get(1).click();
    }

    public WebElement RateBtn(){
        return androidDriver.findElement(rateBtn);
    }

    public WebElement SubmitBtn(){
        return androidDriver.findElement(submitBtn);
    }

    public WebElement SendFeedbackBtn(){
        return androidDriver.findElement(sendFeedbackBtn);
    }

    public WebElement RequestBtn(){
        return androidDriver.findElement(requestBtn);
    }

    public WebElement RequestRing(){
        return androidDriver.findElement(requestRing);
    }

    public Homepage rateApp4Stars(){
        androidDriver.findElement(rateBtn).click();
        androidDriver.findElement(fourStars).click();
        androidDriver.findElement(submitBtn).click();
        return this;
    }

    public Homepage selectNoFavoriteRingtone(){
        androidDriver.findElements(feedbackOptions).get(3).click();
        androidDriver.findElement(sendFeedbackBtn).click();
        return this;
    }

    public Homepage selectHardToUse(){
        androidDriver.findElements(feedbackOptions).get(1).click();
        androidDriver.findElement(sendFeedbackBtn).click();
        return this;
    }

    public void closeFeedback(){
        androidDriver.findElement(closeFeedbackBtn).click();
    }

    public Homepage openMoreCate(){
        androidDriver.findElement(cateBtn).click();
        return this;
    }

    public void closeMoreCate(){
        androidDriver.findElement(closeCateBtn).click();
    }

    public void goToSearch(){
        androidDriver.findElement(searchBtn).click();
    }

    public WebElement ListCate(){
        return androidDriver.findElement(listCate);
    }

    public Homepage openLeftMenu(){
        androidDriver.findElement(leftMenu).click();
        return this;
    }

    public void goToRequestRing(){
        waitScreenStable(androidDriver.findElement(requestRing));
        androidDriver.findElement(requestRing).click();
    }

    public Homepage selectAnOption(){
        androidDriver.findElements(hardToUseOpts).get(2).click();
        return this;
    }

    public Homepage submitFeedback(){
        androidDriver.findElement(sendFeedbackBtn).click();
        return this;
    }


    @Override
    public Homepage takeScreenshot(String savedPath, String screenshotName) throws IOException {
        super.takeScreenshot(savedPath, screenshotName);
        return this;
    }

    @Override
    public Homepage waitScreenStable(WebElement Element) {
        super.waitScreenStable(Element);
        return this;
    }
}
