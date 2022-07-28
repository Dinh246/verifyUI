package test.testnghooks;

import org.testng.annotations.Test;

public class TestNG {

    @Test (groups = {"Highest", "Regression"})
    public void loginWithValidCred(){
        System.out.println("Login successfully");
    }

    @Test (groups = {"High", "Smoke"})
    public void loginWithInvalidCred(){
        System.out.println("Your email or password is incorrect!");
    }
}
