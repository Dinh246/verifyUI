package utils;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeScreenshotAndWaitEle {

    private final AndroidDriver androidDriver;

    public TakeScreenshotAndWaitEle(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    public TakeScreenshotAndWaitEle takeScreenshot(String savedPath, String screenshotName) throws IOException {
        File screenshot = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(savedPath + screenshotName));
        return this;
    }

    public TakeScreenshotAndWaitEle waitScreenStable(WebElement Element){
        WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(Element));
        return this;
    }
}
