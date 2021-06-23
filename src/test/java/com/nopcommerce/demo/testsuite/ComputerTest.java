package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    ComputerPage computerPage;

    @BeforeMethod(alwaysRun = true)
            //(groups = {"sanity","smoke","regression"})
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        computerPage =new ComputerPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToDesktopPage() {
        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnDeskstops();
        String expectedMessage = "Desktops";
        String actualMessage = computerPage.verifyOnDesktopsText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToNotebooksPage() {
        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnNotebooks();
        String expectedMessage = "Notebooks";
        String actualMessage = computerPage.verifyOnNotebooksText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToSoftwarePage() {
        homePage.mouseHoverOnComputerLink();
        computerPage.clickOnSoftware();
        String expectedMessage = "Software";
        String actualMessage = computerPage.verifyOnSoftwareText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
