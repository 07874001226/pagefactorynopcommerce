package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

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
    public void navigateToVerifyRegisterPage() {
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.verifyRegisterText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test(groups = {"smoke","regression"})
    public void verifyErrorMessageWithFirstNameEmpty() {
        homePage.clickOnRegisterLink();
        registerPage.setClickOnRegisterTab();
        String expectedMessage1 = "First name is required.";
        String actualMessage1 = registerPage.verifyFirstNameText();
        Assert.assertEquals(actualMessage1, expectedMessage1);

    }

    @Test(groups = "regression")
    public void verifyUserRegisterSuccesfully() {
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("vrajesh");
        registerPage.enterLastName("patel");
        loginPage.enterEmailId("vrajeshpatel" + randomInt + "@yahoo.com");
        loginPage.enterPassword("abcd1234");
        registerPage.setConfirmPassword("abcd1234");
        registerPage.setClickOnRegisterTab();
        String expectedMessage2 = "Register";
        String actualMessage2 = registerPage.verifyRegisterText();
        Assert.assertEquals(actualMessage2, expectedMessage2);


    }


}
