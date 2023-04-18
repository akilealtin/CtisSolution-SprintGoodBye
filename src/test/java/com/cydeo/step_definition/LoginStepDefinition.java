package com.cydeo.step_definition;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")//bunu vercem
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment.url"));
    }
    @When("User enters valid username {string}")
    public void user_enters_valid_username(String usernameP) {
        loginPage.usernameBox.sendKeys(usernameP);
    }
    @When("User enters valid password {string}")
    public void user_enters_valid_password(String string) {
        loginPage.passwordBox.sendKeys(string);
    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }
    @Then("User should land on Activity Stream page")
    public void user_should_land_on_activity_stream_page() {
        String expectedURL = "https://qa.ctissolutions.com/stream/?login=yes";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));
    }


    @When("user enters invalid username {string}")
    public void user_enters_invalid_username(String string) {
        loginPage.usernameBox.sendKeys(string);
    }
    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String string) {
        loginPage.passwordBox.sendKeys(string);
    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();
    }
    @Then("User should see Incorrect login or password massage displayed")
    public void user_should_see_ıncorrect_login_or_password_massage_displayed() {
        String expectedErrorMasage = "Incorrect login or password";
        Assert.assertTrue(loginPage.errorText.getText().contains(expectedErrorMasage));
    }

    @Then("User should see Please fill out this field massage displayed")
    public void user_should_see_please_fill_out_this_field_massage_displayed() {
        String expectedErrorMasage2 = "Please fill out this field massage";
        Assert.assertTrue(loginPage.errorText.getText().contains(expectedErrorMasage2));
    }

    @When("user click Forgot your password Button")
    public void user_click_forgot_your_password_button() {
        loginPage.forgotPassword.click();
    }
    @Then("user see get Password Page")
    public void user_see_get_password_page() {
        String expectedURL2 = "https://qa.ctissolutions.com/?forgot_password=yes";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL2));
    }


    @Then("user see Remember Me link")
    public void user_see_remember_me_link() {
        String expectedTitle = "Remember me on this computer";
        Assert.assertTrue(loginPage.rememberMe.getText().contains(expectedTitle));
        //muhammed
    }
    @When("user click remember me link")
    public void user_click_remember_me_link() {
        loginPage.rememberMeButton.click();
    }

    @When("Press Enter")
    public void press_enter() {
        loginPage.passwordBox.sendKeys(Keys.ENTER);
    }


    @Then("User See your own name {string}")
    public void user_see_your_own_name(String string) {
        String actualname = loginPage.ownUsername.getText();
        Assert.assertEquals(string,actualname);
    }
    @When("User click on your name")
    public void user_click_on_your_name() {
        loginPage.clickUsername.click();
    }
    @When("User click My Profile buttn")
    public void user_click_my_profile_buttn() {
        loginPage.clickMyProfile.click();
    }
    @Then("User see {string}")
    public void user_see(String string) {
        String actualName2 = loginPage.ownUsername.getText();
        Assert.assertEquals(string,actualName2);
    }

    @Then("user see {string} image")
    public void user_see_image(String string) {
        String actualPassword = "•••••••••";
        Assert.assertEquals(string,actualPassword);
    }


    @Given("user should be login")
    public void userShouldBeLogin() {
        loginPage.Login();
    }

    @Given("user should be login2")
    public void userShouldBeLogin2() {
        loginPage.Login2();
    }


}
