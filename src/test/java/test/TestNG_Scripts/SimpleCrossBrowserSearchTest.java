package test.TestNG_Scripts;

import io.github.cdimascio.dotenv.Dotenv;
import io.qameta.allure.Step;
import models.pages.Shopebase.IntroPage;
import models.pages.Shopebase.SignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.SeleniumWebDrivers;

public class SimpleCrossBrowserSearchTest {

    WebDriver driver;
    IntroPage introPage;
    SignupPage signupPage;
    Dotenv dotenv = Dotenv.load();

    @Parameters("browser")
    @BeforeClass
    public void getBrowser(String browser){

        if(browser.equalsIgnoreCase("chrome") ){
            driver = SeleniumWebDrivers.getChromeDriver(false);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = SeleniumWebDrivers.getFirefoxDriver(false);
        }else {
            throw new IllegalArgumentException("Invalid browser value!");
        }
        introPage = new IntroPage(driver);
        signupPage = new SignupPage(driver);
        driver.get("https://www.shopbase.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    @Step("Enter email and click on start free trial")
    public void SignupWithEmailFlow(){
        introPage
                .enterEmailAndStartFreeTrial(dotenv.get("EMAIL"));
        signupPage
                .waitForElementToDisplay(signupPage.signupTitle())
                .expectEmailWasFilledWith(dotenv.get("EMAIL"))
                .enterCredentialsAndClickSignup(dotenv.get("PASSWORD"), dotenv.get("SHOPNAME"));
    }
}
