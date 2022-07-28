import io.appium.java_client.android.AndroidDriver;
import models.pages.R2_Screens.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AppiumDriverEx;
import utils.TakeScreenshotAndWaitEle;
import utils.scrPath;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class R2UiCheck {

    public static void main(String[] args) throws IOException {

        AndroidDriver androidDriver = AppiumDriverEx.getAndroidDriver();
        Actions action = new Actions(androidDriver);
        Homepage homePage = new Homepage(androidDriver);
        Detail detail = new Detail(androidDriver);
        Search search = new Search(androidDriver);
        LeftMenu leftMenu = new LeftMenu(androidDriver);
        Categories categories = new Categories(androidDriver);
        RequestRing requestRing = new RequestRing(androidDriver);
        Profile profile = new Profile(androidDriver);
        TakeScreenshotAndWaitEle takeScreenshot = new TakeScreenshotAndWaitEle(androidDriver);

        //Create Fluent wait
        WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));

        //Get Homepage screenshot
        wait.until(ExpectedConditions.visibilityOf(homePage.LeftMenu()));
        File Homepage = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Homepage, new File(scrPath.en + "Home.png"));

        //Open detail and take screenshot 1st time
        homePage.Ringtones().get(1).click();
        wait.until(ExpectedConditions.invisibilityOf(detail.WaveAnim()));
        File Detail1 = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Detail1, new File(scrPath.en + "Detail1.png"));
        detail.FavBtn().click();
        detail.DownBtn().click();

        //Take rewarded dialog screenshot
        wait.until(ExpectedConditions.visibilityOf(detail.CloseBtn()));
        File rewardedDialog = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(rewardedDialog, new File(scrPath.en + "rewardedDialog.png"));

        //Take skip dialog screenshot
        detail.CloseBtn().click();
        wait.until(ExpectedConditions.visibilityOf(detail.AcceptBtn()));
        File skipDialog = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(skipDialog, new File(scrPath.en + "skipDialog.png"));
        detail.AcceptBtn().click();
//        WebElement closeRewardBtn = androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button[2]"));
//        action.moveToElement(closeRewardBtn);
//        try {
//            action.wait(7L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        action.click();
//        action.perform();

        //Take detail screenshot 2nd time
        wait.until(ExpectedConditions.visibilityOf(detail.DelBtn()));
        File Detail2 = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Detail2, new File(scrPath.en + "Detail2.png"));

        //Take detail screenshot 3rd time
        detail.SetBtn().click();
        File Detail3 = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Detail3, new File(scrPath.en + "Detail3.png"));

        //Back to list
        wait.until(ExpectedConditions.visibilityOf(detail.SetRingBtn()));
        detail.HideSettings().click();
        detail.BackBtn().click();

        //Take screenshot of Rate app
        wait.until(ExpectedConditions.visibilityOf(homePage.RateBtn()));
        File RateApp1 = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(RateApp1, new File(scrPath.en + "RateApp1.png"));
        homePage.RateBtn().click();
        File RateApp2 = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(RateApp2, new File(scrPath.en + "RateApp2.png"));
        wait.until(ExpectedConditions.visibilityOf(homePage.FourStars()));
        homePage.FourStars().click();
        homePage.SubmitBtn().click();

        //Take screenshot of Feedback
        wait.until(ExpectedConditions.visibilityOf(homePage.SendFeedbackBtn()));
        File Feedback = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Feedback, new File(scrPath.en + "Feedback.png"));
        homePage.FeedbackOptions().get(2).click();
        homePage.SendFeedbackBtn().click();

        //Take screenshot of feedback completion screen
        wait.until(ExpectedConditions.visibilityOf(homePage.OkBtn()));
        File FeedbackDone = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(FeedbackDone, new File(scrPath.en + "FeedbackDone.png"));
        homePage.OkBtn().click();

        //Go to Categories and take screenshot
        homePage.CateMenubar().click();
        File Cate = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Cate, new File(scrPath.en + "Cate.png"));


        //Go to search and take screenshot
        categories.SearchMenubar().click();
        wait.until(ExpectedConditions.visibilityOf(search.SearchTrends()));
        File Search = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Search, new File(scrPath.en + "Search.png"));
        search.SearchBar().click();
        search.SearchBar().sendKeys("asdasda3wedasd");
        action.sendKeys(Keys.ENTER).perform();


        //Take screenshot of search no result
        wait.until(ExpectedConditions.visibilityOf(search.NoResult()));
        File SearchNoResult = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SearchNoResult, new File(scrPath.en + "SearchNoResult.png"));

        //Go to Profile and take screenshots
        search.ProfileMenubar().click();
        wait.until(ExpectedConditions.visibilityOf(profile.UserName()));
        File Downloads = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Downloads, new File(scrPath.en + "Downloads.png"));

        //Go back to homepage
        profile.HomeMenubar().click();

        //Open leftmenu in Homepage & take screenshot
        homePage.LeftMenu().click();
        File LeftMenu = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(LeftMenu, new File(scrPath.en + "LeftMenu.png"));

        //Go to Request ringtones and take screenshot
        leftMenu.RequestRing().click();
        wait.until(ExpectedConditions.visibilityOf(requestRing.SubmitBtn()));
        File RequestRing = androidDriver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(RequestRing, new File(scrPath.en + "RequestRing.png"));

        //Finish
        androidDriver.quit();
    }
}
