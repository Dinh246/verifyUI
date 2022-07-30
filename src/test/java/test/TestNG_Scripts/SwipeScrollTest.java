package test.TestNG_Scripts;

import io.appium.java_client.android.AndroidDriver;
import models.pages.R1_Screens.Detail;
import models.pages.R1_Screens.Homepage;
import org.testng.annotations.Test;
import utils.AppiumDriverEx;

public class SwipeScrollTest {

    AndroidDriver androidDriver;
    Homepage homePage;
    Detail detail;

    @Test
    public void testScroll(){
        androidDriver = AppiumDriverEx.getAndroidDriver();
        homePage = new Homepage(androidDriver);
        homePage.waitScreenStable(homePage.RecycleCollections())
                .swipeLeft(homePage.RecycleCollections())
                .swipeRight(homePage.RecycleCollections())
                .waitScreenStable(homePage.RecycleRingtones())
                .scrollDown(homePage.RecycleRingtones())
                .scrollUp(homePage.RecycleRingtones());
    }

    @Test
    public void testSwipe(){
        androidDriver = AppiumDriverEx.getAndroidDriver();
        homePage = new Homepage(androidDriver);
        detail = new Detail(androidDriver);
        homePage.waitScreenStable(homePage.LeftMenu())
                .goToDetail();

        detail.swipeLeft(detail.MediaFrame())
                .swipeRight(detail.MediaFrame()).swipeRight(detail.MediaFrame());

        System.out.println("number is :" + androidDriver.manage().window().getSize().width*0.25 + "and" + androidDriver.manage().window().getSize().width*0.75);
    }

}
