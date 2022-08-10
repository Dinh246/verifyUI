package test.TestNG_Scripts;

import io.appium.java_client.android.AndroidDriver;
import models.pages.R1_Screens.*;
import org.testng.annotations.*;
import utils.MultipleAppiumDrivers;
import utils.scrPath;

import java.io.IOException;


public class R1UiCheck_Session1 {

    AndroidDriver androidDriver;
    Homepage homePage;
    Detail detail;
    Search search;
    RequestRing requestRing;

    @BeforeClass
    @Parameters({"language", "locale", "udid", "port"})
    public void startAndroidDrivers(String language, String locale, String udid, Integer port) {
        androidDriver = MultipleAppiumDrivers.getMultipleAndroidDrivers(language, locale, udid, port);
        homePage = new Homepage(androidDriver);
        detail = new Detail(androidDriver);
        search = new Search(androidDriver);
        requestRing = new RequestRing(androidDriver);
    }

    @AfterClass
    public void tearDown() {
        androidDriver.quit();
    }

    @Test(description = "Take screenshot of Homepage & Cate list")
    public void takeScreenshotHomepage() throws IOException {
        homePage
                .waitForElement(homePage.LeftMenu())
                .takeScreenshot(scrPath.en, "Homepage.png")
                .openMoreCate()
                .waitForElement(homePage.ListCate())
                .takeScreenshot(scrPath.en, "Cate.jpg")
                .closeMoreCate()
                .goToDetail(2);
    }

    @Test(priority = 2, groups = {"GroupA"})
    public void takeScreenshotDetail() throws IOException {
        detail
                .waitForElement(detail.WaveAnim())
                .takeScreenshot(scrPath.en, "Detail-Before.jpg")
                .stopRingtone()
                .addToFavorites()
                .tapDownload()
                .waitForElement(detail.SkipBtn())
                .takeScreenshot(scrPath.en, "Rewarded-Dialog.jpg")
                .tapSkipRewarded()
                .waitForElement(detail.AcceptBtn())
                .takeScreenshot(scrPath.en, "Skip-Rewarded-Dialog.jpg")
                .tapAcceptRewarded()
                .waitForElement(detail.DelBtn())
                .takeScreenshot(scrPath.en, "Detail-After.jpg")
                .tapSettings()
                .waitForElement(detail.SetRingBtn())
                .takeScreenshot(scrPath.en, "Settings-Options.jpg")
                .closeSettingsAndBackToHomepage();
    }

    @Test(priority = 3, groups = {"GroupA"})
    public void takeScreenshotRating1() throws IOException {
        homePage
                .waitForElement(homePage.RateBtn())
                .takeScreenshot(scrPath.en, "Rate-App.jpg")
                .rateApp4Stars()
                .waitForElement(homePage.SendFeedbackBtn())
                .takeScreenshot(scrPath.en, "Feedback.jpg")
                .selectNoFavoriteRingtone()
                .waitForElement(homePage.RequestBtn())
                .takeScreenshot(scrPath.en, "No-Favorite-Ringtones.jpg")
                .closeFeedback()
                .goToSearch();
    }

    @Test(priority = 4, groups = {"GroupA"})
    public void takeScreenshotSearch() throws IOException {
        search
                .waitForElement(search.SearchTrends())
                .takeScreenshot(scrPath.en, "Search.jpg")
                .chooseASearchTrend()
                .waitForElement(search.RequestBtn())
                .takeScreenshot(scrPath.en, "Search-Results.jpg")
                .removeAndSearchAnotherKeyword()
                .waitForElement(search.RequestBtn())
                .takeScreenshot(scrPath.en, "Search-No-Results.jpg")
                .goToRequestRing();
    }

    @Test(priority = 5, groups = {"GroupA"})
    public void takeScreenshotRequest() throws IOException {
        requestRing
                .waitForElement(requestRing.BackBtn())
                .enterInfo(
                        "Demo Song",
                        "dinh.truong@qa.team"
                )
                .takeScreenshot(scrPath.en, "Request-Ring.jpg")
                .submitRequest();
    }
}
