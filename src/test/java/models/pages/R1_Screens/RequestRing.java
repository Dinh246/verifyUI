package models.pages.R1_Screens;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.userActions;

import java.io.IOException;

public class RequestRing extends userActions {

        private final AndroidDriver androidDriver;
        private final By backBtn = By.id("com.bluesky.best_ringtone.free2017:id/icon_back_request_new_ring");
        private final By name = By.id("com.bluesky.best_ringtone.free2017:id/edt_text_ringtone_name");
        private final By email = By.id("com.bluesky.best_ringtone.free2017:id/edt_text_your_mail");
        private final By newRingRadioBtn = By.id("com.bluesky.best_ringtone.free2017:id/layout_icon_check_new_ring");
        private final By submitBtn = By.id("com.bluesky.best_ringtone.free2017:id/btn_submit");

        public RequestRing(AndroidDriver androidDriver) {
                super(androidDriver);
                this.androidDriver = androidDriver;
        }

        public WebElement SubmitBtn() {
                return androidDriver.findElement(submitBtn);
        }

        public WebElement BackBtn() {
                return androidDriver.findElement(backBtn);
        }

        public RequestRing enterInfo(String songName, String userEmail){
                androidDriver.findElement(name).sendKeys(songName);
                androidDriver.findElement(email).sendKeys(userEmail);
                androidDriver.findElement(newRingRadioBtn).click();
                return this;
        }

        public void submitRequest(){
                androidDriver.findElement(submitBtn).click();
        }

        @Override
        public RequestRing takeScreenshot(String savedPath, String screenshotName) throws IOException {
                super.takeScreenshot(savedPath, screenshotName);
                return this;
        }

        @Override
        public RequestRing waitForElement(WebElement Element) {
                super.waitForElement(Element);
                return this;
        }
}
