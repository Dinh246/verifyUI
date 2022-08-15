package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.time.Duration;

public class SeleniumWebDrivers {

    public static WebDriver getChromeDriver(Boolean headless){

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions
                .setPageLoadStrategy(PageLoadStrategy.NORMAL)
                .setPageLoadTimeout(Duration.ofSeconds(30))
                .setHeadless(headless)
                .setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS_AND_NOTIFY)
                .getBrowserName();

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

    public static WebDriver getFirefoxDriver(Boolean headless){

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions
                .setPageLoadStrategy(PageLoadStrategy.NORMAL)
                .setHeadless(headless)
                .setPageLoadTimeout(Duration.ofSeconds(30))
                .setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS_AND_NOTIFY)
                .setImplicitWaitTimeout(Duration.ofSeconds(5))
                .getBrowserName();

        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
