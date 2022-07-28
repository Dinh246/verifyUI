package test.TestNG_Scripts;

import io.appium.java_client.android.AndroidDriver;
import models.pages.R1_Screens.Homepage;
import org.testng.annotations.Test;
import utils.AppiumDriverEx;

public class MultipleClassesTestNg {

    @Test
    public void launchAppAgain(){
        AndroidDriver androidDriver = AppiumDriverEx.getAndroidDriver();
        Homepage homePage = new Homepage(androidDriver);
        homePage.waitScreenStable(homePage.LeftMenu());
    }
}
