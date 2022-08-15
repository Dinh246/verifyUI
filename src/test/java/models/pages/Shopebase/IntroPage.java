package models.pages.Shopebase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.oftenUsedMethods;

public class IntroPage extends oftenUsedMethods {
    private  WebDriver driver;
    private final By emailFieldXpath = By.xpath("//*[@type='email']");
    private final By startFreeTrialBtnXpath = By.xpath("//*[@type='submit']");
    private final By loginBtnXpath = By.xpath("//*[text()='Login']");
    private final By start14DayFreeTrialBtnXpath = By.xpath("//*[contains(text(),'14-Day')]");

    public IntroPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement emailField() {
        return driver.findElement(emailFieldXpath);
    }

    public WebElement startFreeTrialBtn() {
        return driver.findElement(startFreeTrialBtnXpath);
    }

    public WebElement loginBtn() {
        return driver.findElement(loginBtnXpath);
    }

    public WebElement start14DayFreeTrialBtn() {
        return driver.findElement(start14DayFreeTrialBtnXpath);
    }

    public void enterEmailAndStartFreeTrial(String email){
        emailField().sendKeys(email);
        waitForElementToDisplay(this.startFreeTrialBtn());
        startFreeTrialBtn().click();
    }

    public void clickLogin(){
        loginBtn().click();
    }

    public void clickStart14DayFreeTrial(){
        startFreeTrialBtn().click();
    }

    @Override
    public IntroPage waitForElementToDisplay(WebElement Element) {
        super.waitForElementToDisplay(Element);
        return this;
    }
}
