package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegisterText;
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickOnRegisterButton;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement verifyFirstNameText;


    public String verifyRegisterText() {
        Reporter.log("Verify Text : " + verifyRegisterText.toString() + "<br>");
        log.info("Verify Text : " + verifyRegisterText.toString());
        return getTextFromElement(verifyRegisterText);
    }
    public void enterFirstName(String firstname) {
        Reporter.log("Entering firstname : " + firstname + " to firstname field : " + firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField, firstname);
        log.info("Entering firstname : " + firstname + " to firstname field : " + firstNameField.toString());
    }
    public void enterLastName(String lastname) {
        Reporter.log("Entering lastname  : " + lastname + " to lastname field : " + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastname);
        log.info("Entering lastname  : " + lastname + " to lastname field : " + lastNameField.toString());
    }
        public void setConfirmPassword(String confirmpassword) {
            Reporter.log("Entering ConfirmPassword  : " + confirmpassword + " to ConfirmPassword field : " + confirmPassword.toString() + "<br>");
            sendTextToElement(confirmPassword, confirmpassword);
            log.info("Entering ConfirmPassword  : " + confirmpassword + " to ConfirmPassword field : " + confirmPassword.toString());
        }
    public void setClickOnRegisterTab() {
        Reporter.log("Clicking on login button : " + clickOnRegisterButton.toString() + "<br>");
        log.info("Clicking On Login Butto : " + clickOnRegisterButton.toString());
        clickOnElement(clickOnRegisterButton);
    }

    public String verifyFirstNameText() {
        Reporter.log("Verify First NameText : " + verifyFirstNameText.toString() + "<br>");
        log.info("Verify First Name Text : " + verifyFirstNameText.toString());
        return getTextFromElement(verifyFirstNameText);
    }

    }


