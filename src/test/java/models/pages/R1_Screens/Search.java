package models.pages.R1_Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.userActions;

import java.io.IOException;

public class Search extends userActions {

    private final AndroidDriver androidDriver;
    private final By searchBar = By.id("com.bluesky.best_ringtone.free2017:id/search_src_text");
    private final By xBtn = By.id("com.bluesky.best_ringtone.free2017:id/search_close_btn");
    private final By searchTrends = By.xpath("//*[@resource-id='com.bluesky.best_ringtone.free2017:id/text_key']");
    private final By noResult = By.id("com.bluesky.best_ringtone.free2017:id/text_message");
    private final By requestRing = By.id("com.bluesky.best_ringtone.free2017:id/btnRequest");

    public Search(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
    }

    public WebElement RequestBtn() {
        return androidDriver.findElement(requestRing);
    }

    public WebElement SearchTrends() {
        return androidDriver.findElement(searchTrends);
    }

    public Search chooseASearchTrend(){
        androidDriver.findElements(searchTrends).get(1).click();
        return this;
    }

    public Search removeAndSearchAnotherKeyword(){
        Actions action = new Actions(androidDriver);
        androidDriver.findElement(xBtn).click();
        androidDriver.findElement(searchBar).sendKeys("n0*@#&$r3sults");
        action.sendKeys(Keys.ENTER).perform();
        return this;
    }

    public WebElement NoResult() {
        return androidDriver.findElement(noResult);
    }

    public void goToRequestRing(){
        androidDriver.findElement(requestRing).click();
    }

    @Override
    public Search takeScreenshot(String savedPath, String screenshotName) throws IOException {
        super.takeScreenshot(savedPath, screenshotName);
        return this;
    }

    @Override
    public Search waitScreenStable(WebElement Element) {
        super.waitScreenStable(Element);
        return this;
    }
}
