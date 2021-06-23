package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(linkText = "Desktops")
    WebElement deskTopsLink;

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement verifyDesktopsText;

    @FindBy(xpath ="//ul[@class='top-menu notmobile']/li[1]/ul/li[2]/a")
    WebElement noteBooksLink;

    @FindBy(xpath = "//h1[contains(text(),'Notebooks')]" )
    WebElement verifyNotebooksText;

    @FindBy(xpath = "//h1[contains(text(),'Software')]")
    WebElement verifySoftwareText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[3]/a" )
    WebElement softwareLink;

    public void clickOnDeskstops(){
        Reporter.log("Clicking on Desktops : " + deskTopsLink.toString() + "<br>");
        clickOnElement(deskTopsLink);
        log.info("Clicking on Desktops link : " + deskTopsLink.toString());
    }
    public String verifyOnDesktopsText(){
        Reporter.log("Verify on Desktops Text : " + verifyDesktopsText.toString() + "<br>");
        log.info("Verify on Desktops Text : " + verifyDesktopsText.toString());
        return getTextFromElement(verifyDesktopsText);
    }
    public void clickOnNotebooks(){
        Reporter.log("Clicking on Notebooks: " + noteBooksLink.toString() + "<br>");
        clickOnElement(noteBooksLink);
        log.info("Clicking on Notebooks link : " + noteBooksLink.toString());
    }
    public String verifyOnNotebooksText(){
        Reporter.log("Verify on Notebooks Text : " + verifyNotebooksText.toString() + "<br>");
        log.info("Verify on Notebooks Text : " + verifyNotebooksText.toString());
        return getTextFromElement(verifyNotebooksText);
    }
    public void clickOnSoftware(){
        Reporter.log("Clicking on Software: " + softwareLink.toString() + "<br>");
        clickOnElement(softwareLink);
        log.info("Clicking on Software link : " + softwareLink.toString());
    }
    public String verifyOnSoftwareText(){
        Reporter.log("Verify on Software Text : " + verifySoftwareText.toString() + "<br>");
        log.info("Verify on Software Text : " + verifySoftwareText.toString());
        return getTextFromElement(verifySoftwareText);
    }
}
