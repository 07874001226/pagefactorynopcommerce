package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class LoginTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;


    @BeforeMethod(alwaysRun = true)
            //(groups = {"sanity","smoke","regression"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }


    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test (groups = {"smoke","regression"})


    public void verifyUserShouldNotLoginWithInvalidCredtials() throws InterruptedException {
        homePage.clickOnLoginLink();
        Thread.sleep(1000);
        loginPage.enterEmailId("vrajeshpatel@yahoo.com");
        Thread.sleep(1000);
        loginPage.enterPassword("abc123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @Test(groups = "regression")
    public void verifyUserLogInSuccessfully() throws InterruptedException {

        homePage.clickOnRegisterLink();
        Thread.sleep(1000);
        registerPage.enterFirstName("vrajesh");
        registerPage.enterLastName("patel");
        loginPage.enterEmailId("vrajeshpatel" + randomInt + "@yahoo.com");
        loginPage.enterPassword("abcd1234");
        Thread.sleep(1000);
        registerPage.setConfirmPassword("abcd1234");
        registerPage.setClickOnRegisterTab();
        loginPage.clickOnLogOutButton();
        Thread.sleep(1000);
        homePage.clickOnLoginLink();
        Thread.sleep(1000);
        loginPage.enterEmailId("vrajeshpatel" + randomInt + "@yahoo.com");
        Thread.sleep(1000);
        loginPage.enterPassword("abcd1234");
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        String expectedMessage = "Welcome to our store";
        String actualMessage = loginPage.getWelcomeStoreText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }


}



