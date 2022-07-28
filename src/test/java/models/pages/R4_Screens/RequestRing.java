package models.pages.R4_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RequestRing {

        private AppiumDriver appiumDriver;
        private final By backBtn = By.id("com.appspro.best.ringtones2017:id/btn_back");
        private final By name = By.id("com.appspro.best.ringtones2017:id/edt_name");
        private final By singer = By.id("com.appspro.best.ringtones2017:id/edt_singer");
        private final By email = By.id("com.appspro.best.ringtones2017:id/edt_mail");
        private final By newRingRadioBtn = By.id("com.appspro.best.ringtones2017:id/img_request_new");
        private final By updateRingRadioBtn = By.id("com.appspro.best.ringtones2017:id/img_request_update");
        private final By submitBtn = By.id("com.appspro.best.ringtones2017:id/btn_submit");

        public RequestRing(AppiumDriver appiumDriver) {
                this.appiumDriver = appiumDriver;
        }

        public AppiumDriver getAppiumDriver() {
                return appiumDriver;
        }

        public WebElement BackBtn() {
                return appiumDriver.findElement(backBtn);
        }

        public WebElement Name() {
                return appiumDriver.findElement(name);
        }

        public WebElement Singer() {
                return appiumDriver.findElement(singer);
        }

        public WebElement Email() {
                return appiumDriver.findElement(email);
        }

        public RequestRing inputInfo(String songName, String singerName, String userEmail) {
                appiumDriver.findElement(name).sendKeys(songName);
                appiumDriver.findElement(singer).sendKeys(singerName);
                appiumDriver.findElement(email).sendKeys(userEmail);
                return this;
        }

        public WebElement NewRingRadioBtn() {
                return appiumDriver.findElement(newRingRadioBtn);
        }

        public WebElement UpdateRingRadioBtn() {
                return appiumDriver.findElement(updateRingRadioBtn);
        }

        public WebElement SubmitBtn() {
                return appiumDriver.findElement(submitBtn);
        }

        public void submitRequest(){
                this.SubmitBtn().click();
        }
}
