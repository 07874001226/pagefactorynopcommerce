package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Computers")
    WebElement computersLink;

    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;

    @FindBy(linkText = "Apparel")
    WebElement apparelLink;

    @FindBy(linkText = "Digital downloads")
    WebElement digitalDownloadsLink;

    @FindBy(linkText = "Books")
    WebElement booksLink;

    @FindBy(linkText = "Jewelry")
    WebElement jewelryLink;

    @FindBy(linkText = "Gift Cards")
    WebElement giftCardLink;

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;


    public void mouseHoverOnComputerLink() {
        Reporter.log("MouseHover on Computer link : " + computersLink.toString() + "<br>");
        mouseHoverToElement(computersLink);
        log.info("MouseHover on Computer link : " + computersLink.toString());

    }

    public void clickOnComputerLink() {
        Reporter.log("Clicking on Computer link : " + computersLink.toString() + "<br>");
        clickOnElement(computersLink);
        log.info("Clicking on Computer link : " + computersLink.toString());
    }

    public void clickOnElectronics() {
        Reporter.log("Clicking on Electronics link : " + electronicsLink.toString() + "<br>");
        clickOnElement(electronicsLink);
        log.info("Clicking on Electronics link : " + electronicsLink.toString());
    }

    public void clickOnApparel() {
        Reporter.log("Clicking on Apparel link : " + apparelLink.toString() + "<br>");
        clickOnElement(apparelLink);
        log.info("Clicking on Apparel link : " + apparelLink.toString());
    }

    public void clickOnDigitalDownloads() {
        Reporter.log("Clicking on DigitalDownloads link : " + digitalDownloadsLink.toString() + "<br>");
        clickOnElement(digitalDownloadsLink);
        log.info("Clicking on DigitalDownloads link : " + digitalDownloadsLink.toString());
    }

    public void clickOnBooks() {
        Reporter.log("Clicking on Books link : " + booksLink.toString() + "<br>");
        clickOnElement(booksLink);
        log.info("Clicking on Books link : " + booksLink.toString());
    }

    public void clickOnJewelry() {
        Reporter.log("Clicking on Jewelry link : " + jewelryLink.toString() + "<br>");
        clickOnElement(jewelryLink);
        log.info("Clicking on Jewelry link : " + jewelryLink.toString());
    }

    public void clickOnGiftCards() {
        Reporter.log("Clicking on GiftCards link : " + giftCardLink.toString() + "<br>");
        clickOnElement(giftCardLink);
        log.info("Clicking on GiftCards link : " + giftCardLink.toString());
    }


    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link : " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on Register link : " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
        log.info("Clicking on Register link : " + registerLink.toString());
    }
}
