package test.TestNG_Scripts;

import io.appium.java_client.android.AndroidDriver;
import models.pages.R1_Screens.Detail;
import models.pages.R1_Screens.Homepage;
import org.testng.annotations.*;
import utils.AppiumDriverEx;
import utils.scrPath;
import java.io.IOException;


public class R1UiCheck_Session2 {

    AndroidDriver driverSession2 = null;

    @AfterClass
    public void tearDown(){
        driverSession2.quit();
    }

    @Test(dependsOnGroups = {"groupA"})
    public void takeScreenshotRating2() throws IOException {
        driverSession2 = AppiumDriverEx.getAndroidDriver();
        Homepage homePage = new Homepage(driverSession2);
        Detail detail = new Detail(driverSession2);
        homePage.waitScreenStable(homePage.LeftMenu())
                .goToDetail();

        detail.waitScreenStable(detail.WaveAnim())
                .stopRingtone()
                .tapDownload()
                .tapWatchAds()
                .tapSettings()
                .closeSettingsAndBackToHomepage();

        homePage.waitScreenStable(homePage.RateBtn())
                .rateApp4Stars()
                .selectHardToUse()
                .selectAnOption()
                .waitScreenStable(homePage.RequestBtn())
                .takeScreenshot(scrPath.en, "Hard-To-Use.jpg")
                .submitFeedback()
                .takeScreenshot(scrPath.en, "FAQ.jpg");
    }
}