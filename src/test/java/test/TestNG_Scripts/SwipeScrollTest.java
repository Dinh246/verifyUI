package test.TestNG_Scripts;

import io.appium.java_client.android.AndroidDriver;
import models.pages.R1_Screens.Detail;
import models.pages.R1_Screens.Homepage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.AppiumDriverEx;

public class SwipeScrollTest {

    AndroidDriver androidDriver;
    Homepage homePage;
    Detail detail;

    @BeforeClass
    public void openApp(){
        androidDriver = AppiumDriverEx.getAndroidDriver();
        homePage = new Homepage(androidDriver);
        detail = new Detail(androidDriver);
    }

    @AfterClass
    public void closeApp(){
        androidDriver.quit();
    }

    @Test
    public void testScroll(){
        homePage.waitScreenStable(homePage.RecycleCollections())
                .swipeLeft(homePage.RecycleCollections())
                .swipeRight(homePage.RecycleCollections())
                .scrollDown(homePage.RecycleRingtones())
                .scrollUp(homePage.RecycleRingtones());
    }

    @Test
    public void testSwipe(){
        homePage.waitScreenStable(homePage.LeftMenu())
                .goToDetail(3);

        detail.swipeLeft(detail.MediaFrame())
                .swipeRight(detail.MediaFrame())
                .swipeRight(detail.MediaFrame());

    }

}
