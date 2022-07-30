//import io.appium.java_client.AppiumDriver;
//import models.pages.R4_Screens.*;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//import utils.AppiumDriverEx;
//import utils.scrPath;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//
//public class R4UiCheck {
//
//    @Test
//    public static void main(String[] args) throws IOException {
//
//        AppiumDriver appiumDriver = AppiumDriverEx.getAppiumDriver();
//        Actions action = new Actions(appiumDriver);
//        Homepage homePage = new Homepage(appiumDriver);
//        Detail detail = new Detail(appiumDriver);
//        Search search = new Search(appiumDriver);
//        LeftMenu leftMenu = new LeftMenu(appiumDriver);
//        Downloads downloads =new Downloads(appiumDriver);
//        RequestRing requestRing = new RequestRing(appiumDriver);
//        SearchResults searchResults = new SearchResults(appiumDriver);
//
//        //Create Fluent wait
//        WebDriverWait wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(30));
//
//        //Get Homepage screenshot
//        wait.until(ExpectedConditions.visibilityOfAllElements(homePage.OtherCollections().get(0)));
//        File Homepage = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(Homepage, new File(scrPath.en + "Home.png"));
//
//        //Open detail and take screenshot 1st time
//        homePage.Ringtones().get(1).click();
//        wait.until(ExpectedConditions.invisibilityOf(detail.WaveAnim()));
//        detail.PlayBtn().click();
//        detail.takeScreenshot(scrPath.en, "Detail.png");
//        detail.FavBtn().click();
//        detail.DownBtn().click();
//
//        //Take rewarded dialog screenshot
//        wait.until(ExpectedConditions.visibilityOf(detail.WatchAdsBtn1()));
//        File rewardedDialog = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(rewardedDialog, new File(scrPath.en + "rewardedDialog.png"));
//
//        //Take skip dialog screenshot
//        detail.CloseBtn().click();
//        wait.until(ExpectedConditions.visibilityOf(detail.WatchAdsBtn2()));
//        File skipDialog = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(skipDialog, new File(scrPath.en + "skipDialog.png"));
//        detail.WatchAdsBtn2().click();
////        WebElement closeRewardBtn = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button[2]"));
////        action.moveToElement(closeRewardBtn);
////        try {
////            action.wait(7L);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////        action.click();
////        action.perform();
//
//        //Take detail screenshot 2nd time
//        wait.until(ExpectedConditions.visibilityOf(detail.DelBtn()));
//        File Detail2 = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(Detail2, new File(scrPath.en + "Detail2.png"));
//
//        //Take detail screenshot 3rd time
//        detail.SetBtn().click();
//        File Detail3 = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(Detail3, new File(scrPath.en + "Detail3.png"));
//
//        //Back to list
//        wait.until(ExpectedConditions.visibilityOf(detail.SetRingBtn()));
//        detail.SetBtn().click();
//        detail.BackBtn().click();
//
//        //Take screenshot of Rate app
//        wait.until(ExpectedConditions.visibilityOf(homePage.RateBtn()));
//        File RateApp1 = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(RateApp1, new File(scrPath.en + "RateApp1.png"));
//        homePage.RateBtn().click();
//        File RateApp2 = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(RateApp2, new File(scrPath.en + "RateApp2.png"));
//        wait.until(ExpectedConditions.visibilityOf(homePage.FourStars()));
//        homePage.FourStars().click();
//        homePage.SubmitBtn().click();
//
//        //Take screenshot of Feedback
//        wait.until(ExpectedConditions.visibilityOf(homePage.SendFeedbackBtn()));
//        File Feedback = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(Feedback, new File(scrPath.en + "Feedback.png"));
//        homePage.FeedbackOptions().get(2).click();
//        homePage.SendFeedbackBtn().click();
//
//        //Take screenshot of feedback completion screen
//        wait.until(ExpectedConditions.visibilityOf(homePage.OkBtn()));
//        File FeedbackDone = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(FeedbackDone, new File(scrPath.en + "FeedbackDone.png"));
//        homePage.OkBtn().click();
//
//        //Go to Downloads and take screenshot
//        homePage.DownMenubar().click();
//        File Downloads = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(Downloads, new File(scrPath.en + "Downloads.png"));
//
//
//        //Go to search and take screenshot
//        downloads.SearchMenubar().click();
//        wait.until(ExpectedConditions.visibilityOf(search.SearchTrends()));
//        File Search = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(Search, new File(scrPath.en + "Search.png"));
//        search.SearchBar().click();
//        search.SearchBar().sendKeys("asdasda3wedasd");
//        action.sendKeys(Keys.ENTER).perform();
//
//
//        //Take screenshot of search no result
//        wait.until(ExpectedConditions.visibilityOf(searchResults.NoResult()));
//        File SearchNoResult = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(SearchNoResult, new File(scrPath.en + "SearchNoResult.png"));
//
//        //Back to home
//        searchResults.BackBtn().click();
//        search.BackBtn().click();
//
//        //Open leftmenu in Homepage & take screenshot
//        homePage.LeftMenu().click();
//        File LeftMenu = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(LeftMenu, new File(scrPath.en + "LeftMenu.png"));
//
//        //Go to Request ringtones and take screenshot
//        leftMenu.RequestRing().click();
//        wait.until(ExpectedConditions.visibilityOf(requestRing.SubmitBtn()));
//        requestRing.inputInfo("hutpin", "namCT", "deptrai@qa.team");
//        File RequestRing = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(RequestRing, new File(scrPath.en + "RequestRing.png"));
//
//        //Back to home
//        requestRing.BackBtn().click();
//
//        //Go to Vip and take screenshot
//        homePage.VipIcon().click();
//        wait.until(ExpectedConditions.visibilityOf(homePage.VipTitle()));
//        File VIP = appiumDriver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(VIP, new File(scrPath.en + "VIP.png"));
//
//        //Finish
//        appiumDriver.quit();
//    }
//}
