package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class oftenUsedMethods {

    WebDriver driver;

    public oftenUsedMethods(WebDriver driver){
        this.driver = driver;
    }

    public oftenUsedMethods takeScreenshot(String savedPath, String screenshotName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(savedPath + screenshotName));
        return this;
    }

    public oftenUsedMethods takeScreenshotOfElement(WebElement selector, String savedPath, String screenshotName) throws IOException {
        File screenshot = selector.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(savedPath + screenshotName));
        return this;
    }

    public oftenUsedMethods waitForElementToDisplay(WebElement Element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(Element));
        return this;
    }
}
