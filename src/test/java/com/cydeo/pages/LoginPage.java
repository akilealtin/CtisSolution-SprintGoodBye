package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this );

    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorText;

    @FindBy(xpath = "//a[@href='/?forgot_password=yes']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//label[contains(@class, 'item')]")
    public WebElement rememberMe;

    @FindBy(xpath = "//*[@id='USER_REMEMBER']")
    public WebElement rememberMeButton;

    @FindBy(xpath = "span[id='user-name']")
    public WebElement ownUsername1;

    @FindBy(xpath = "//*[@id='user-block']")
    public WebElement clickUsername;

    @FindBy(xpath = "/html/body/div[7]/div[1]/div/div/a[1]/span[2]")
    public WebElement clickMyProfile;

    @FindBy(xpath = "//*[@id='pagetitle']")
    public WebElement ownUsername;




    public void Login(){
        usernameBox.sendKeys("hr2@cybertekschool.com");
        passwordBox.sendKeys("UserUser");
        loginButton.click();
    }
    public void Login2(){
        usernameBox.sendKeys("hr60@cybertekschool.com");
        passwordBox.sendKeys("UserUser");
        loginButton.click();
    }






}
