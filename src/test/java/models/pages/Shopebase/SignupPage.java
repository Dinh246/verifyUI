package models.pages.Shopebase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.oftenUsedMethods;

public class SignupPage extends oftenUsedMethods {
    WebDriver driver;
    private final By signupTitleXpath = By.xpath("//*[contains(text(), '14-day')]");
    private final By emailFieldCss = By.cssSelector("#email");
    private final By pwFieldCss = By.cssSelector("#password");
    private final By shopNameFieldCss = By.cssSelector("#shop_name");
    private final By signupBtnXpath = By.xpath("//*[@type='submit']");

    public SignupPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebElement signupTitle() {
        return driver.findElement(signupTitleXpath);
    }

    public WebElement emailField() {
        return driver.findElement(emailFieldCss);
    }

    public WebElement pwField() {
        return driver.findElement(pwFieldCss);
    }

    public WebElement shopNameField() {
        return driver.findElement(shopNameFieldCss);
    }

    public WebElement signupBtn() {
        return driver.findElement(signupBtnXpath);
    }

    public void enterCredentialsAndClickSignup(String password, String shopName){
        pwField().sendKeys(password);
        shopNameField().sendKeys(shopName);
        signupBtn().click();
    }

    public SignupPage expectEmailWasFilledWith(String email){
        String actual = emailField().getAttribute("value");
        Assert.assertEquals(actual, email);
        return this;
    }

    @Override
    public SignupPage waitForElementToDisplay(WebElement Element) {
        super.waitForElementToDisplay(Element);
        return this;
    }
}
