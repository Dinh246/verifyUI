package utils;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class userActions {

    AndroidDriver androidDriver;
    Sequence swipe;
    Sequence scroll;
    PointerInput finger;


    public userActions(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    public userActions takeScreenshot(String savedPath, String screenshotName) throws IOException {
        File screenshot = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(savedPath + screenshotName));
        return this;
    }

    public userActions waitScreenStable(WebElement Element){
        WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(Element));
        return this;
    }

    public userActions swipeLeft(WebElement element){
        int centerY = element.getRect().y + (element.getSize().height/2);
        double startX = androidDriver.manage().window().getSize().width*0.75;
        double endX = androidDriver.manage().window().getSize().width*0.25;

        finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        swipe = new Sequence(finger,1);
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), (int)startX, centerY));
        swipe.addAction(finger.createPointerDown(0));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), (int)endX, centerY));
        swipe.addAction(finger.createPointerUp(0));

        androidDriver.perform(List.of(swipe));

        return this;
    }

    public userActions swipeRight(WebElement element){
        int centerY = element.getRect().y + (element.getSize().height/2);
        double startX = androidDriver.manage().window().getSize().width*0.25;
        double endX = androidDriver.manage().window().getSize().width*0.9;

        finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        swipe = new Sequence(finger,1);
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), (int)startX, centerY));
        swipe.addAction(finger.createPointerDown(0));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), (int)endX, centerY));
        swipe.addAction(finger.createPointerUp(0));

        androidDriver.perform(List.of(swipe));
        return this;
    }

    public userActions scrollUp(WebElement element){
        int centerX = androidDriver.manage().window().getSize().width/2;
        double startY = element.getRect().y + (element.getSize().height*0.2);
        double endY = element.getRect().y + (element.getSize().height*0.9);

        finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        scroll = new Sequence(finger,1);
        scroll.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int) startY));
        scroll.addAction(finger.createPointerDown(0));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(480), PointerInput.Origin.viewport(), centerX, (int) endY));
        scroll.addAction(finger.createPointerUp(0));

        androidDriver.perform(List.of(scroll));
        return this;
    }

    public userActions scrollDown(WebElement element){
        int centerX = androidDriver.manage().window().getSize().width/2;
        double startY = androidDriver.manage().window().getSize().height*0.8;
        double endY = androidDriver.manage().window().getSize().height*0.2;

        finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        scroll = new Sequence(finger,1);
        scroll.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int) startY));
        scroll.addAction(finger.createPointerDown(0));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(480), PointerInput.Origin.viewport(), centerX, (int) endY));
        scroll.addAction(finger.createPointerUp(0));

        androidDriver.perform(List.of(scroll));
        return this;
    }
}
