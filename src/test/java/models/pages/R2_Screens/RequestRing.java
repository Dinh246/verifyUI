package models.pages.R2_Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RequestRing {

        private AppiumDriver appiumDriver;
        private final By backBtn = By.id("com.ringpro.popular.freerings:id/icon_back");
        private final By name = By.id("com.ringpro.popular.freerings:id/edt_song_name");
        private final By singer = By.id("com.ringpro.popular.freerings:id/edt_singer");
        private final By email = By.id("com.ringpro.popular.freerings:id/edt_your_email");
        private final By newRingRadioBtn = By.id("com.ringpro.popular.freerings:id/img_check_new_ringtone");
        private final By updateRingRadioBtn = By.id("com.ringpro.popular.freerings:id/img_check_update_ringtone");
        private final By submitBtn = By.id("com.ringpro.popular.freerings:id/btn_request_new_ring");

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

        public WebElement NewRingRadioBtn() {
                return appiumDriver.findElement(newRingRadioBtn);
        }

        public WebElement UpdateRingRadioBtn() {
                return appiumDriver.findElement(updateRingRadioBtn);
        }

        public WebElement SubmitBtn() {
                return appiumDriver.findElement(submitBtn);
        }
}
