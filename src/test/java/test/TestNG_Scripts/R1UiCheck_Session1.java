package test.TestNG_Scripts;

import io.appium.java_client.android.AndroidDriver;
import models.pages.R1_Screens.*;
import org.testng.annotations.*;
import utils.AppiumDriverEx;
import utils.scrPath;
import java.io.IOException;



public class R1UiCheck_Session1 {

    AndroidDriver androidDriver = AppiumDriverEx.getAndroidDriver();
    Homepage homePage = new Homepage(androidDriver);
    Detail detail = new Detail(androidDriver);
    Search search = new Search(androidDriver);
    RequestRing requestRing = new RequestRing(androidDriver);

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
    }

    @Test(priority = 1, groups = {"groupA"})
    public void takeScreenshotHomepage() throws IOException {
        homePage.waitScreenStable(homePage.LeftMenu())
                .takeScreenshot(scrPath.en, "Homepage.png")
                .openMoreCate()
                .waitScreenStable(homePage.ListCate())
                .takeScreenshot(scrPath.en, "Cate.jpg")
                .closeMoreCate();
    }

    @Test(priority = 2, groups = {"groupA"})
    public void takeScreenshotDetail() throws IOException {
        homePage.goToDetail();

        detail.waitScreenStable(detail.WaveAnim())
                .takeScreenshot(scrPath.en, "Detail-Before.jpg")
                .stopRingtone()
                .addToFavorites()
                .tapDownload()
                .waitScreenStable(detail.SkipBtn())
                .takeScreenshot(scrPath.en, "Rewarded-Dialog.jpg")
                .tapSkipRewarded()
                .waitScreenStable(detail.AcceptBtn())
                .takeScreenshot(scrPath.en, "Skip-Rewarded-Dialog.jpg")
                .tapAcceptRewarded()
                .waitScreenStable(detail.DelBtn())
                .takeScreenshot(scrPath.en, "Detail-After.jpg")
                .tapSettings()
                .waitScreenStable(detail.SetRingBtn())
                .takeScreenshot(scrPath.en, "Settings-Options.jpg");
    }

    @Test(priority = 3, groups = {"groupA"})
    public void takeScreenshotRating1() throws IOException {

        detail.closeSettingsAndBackToHomepage();

        homePage.waitScreenStable(homePage.RateBtn())
                .takeScreenshot(scrPath.en, "Rate-App.jpg")
                .rateApp4Stars()
                .waitScreenStable(homePage.SendFeedbackBtn())
                .takeScreenshot(scrPath.en, "Feedback.jpg")
                .selectNoFavoriteRingtone()
                .waitScreenStable(homePage.RequestBtn())
                .takeScreenshot(scrPath.en,"No-Favorite-Ringtones.jpg")
                .closeFeedback();
    }

    @Test(priority = 4, groups = {"groupA"})
    public void takeScreenshotSearch() throws IOException {
        homePage.goToSearch();
        search.waitScreenStable(search.SearchTrends())
                .takeScreenshot(scrPath.en, "Search.jpg")
                .chooseASearchTrend()
                .waitScreenStable(search.RequestBtn())
                .takeScreenshot(scrPath.en, "Search-Results.jpg")
                .removeAndSearchAnotherKeyword()
                .waitScreenStable(search.RequestBtn())
                .takeScreenshot(scrPath.en, "Search-No-Results.jpg")
                .goToRequestRing();
    }

    @Test(priority = 5, groups = {"groupA"})
    public void takeScreenshotRequest() throws IOException {
        requestRing.waitScreenStable(requestRing.BackBtn())
                .enterInfo("Demo Song", "dinh.truong@qa.team")
                .takeScreenshot(scrPath.en, "Request-Ring.jpg")
                .submitRequest();
    }
}
