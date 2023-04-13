package com.cydeo.step_definition;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.UploadPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class UploadStepDefinition {
    UploadPage uploadPage = new UploadPage();

    @When("user should click message button")
    public void user_should_click_message_button() {
        uploadPage.messageButton.click();
        uploadPage.sendBox.click();
    }

    @When("user should click upload files button")
    public void user_should_click_upload_files_button() {
        uploadPage.uploadButton.click();

    }

    @When("user should choose files for uploading and attach the files to the message")
    public void user_should_choose_files_for_uploading_and_attach_the_files_to_the_message() {
        //BrowserUtils.sleep(2);
        String filepath1 = "C:\\Users\\90534\\Desktop\\Ctis solutions file.docx";
        String filepath2 = "C:\\Users\\90534\\Desktop\\Kaptan_Resim_1.jpg";
        String filepath3 = "C:\\Users\\90534\\Desktop\\Sample_Test_Cases2 (2).xlsx";
        uploadPage.uploadfileandpicturesButton.sendKeys(filepath1 + "\n" + filepath2 + "\n" + filepath3);


    }

    @Then("user should see uploaded files under the message")
    public void user_should_see_uploaded_files_under_the_message() {
        String expected1 = "Ctis solutions file";
        String expected2 = "Kaptan_Resim_1";
        String expected3 = "Sample_Test_Cases2 (2)";
    }

    @And("user should choose different types files for uploading and attach the files to the message")
    public void userShouldChooseDifferentTypesFilesForUploadingAndAttachTheFilesToTheMessage() {
        //BrowserUtils.sleep(2);
        String filepath1 = "C:\\Users\\90534\\Desktop\\Ctis solutions file.docx";
        String filepath2 = "C:\\Users\\90534\\Desktop\\Kaptan_Resim_1.jpg";
        String filepath3 = "C:\\Users\\90534\\Desktop\\Sample_Test_Cases2 (2).xlsx";
        uploadPage.uploadfileandpicturesButton.sendKeys(filepath1 + "\n" + filepath2 + "\n" + filepath3);
    }

    @Then("user clicks the send button")
    public void userClicksTheSendButton() {
        BrowserUtils.sleep(2);
        uploadPage.sendButton.click();
    }
    @And("user should upload picture")
    public void userShouldUploadPicture() {
        String picture="C:\\Users\\90534\\Desktop\\Kaptan_Resim_1.jpg";
        uploadPage.uploadfileandpicturesButton.sendKeys(picture);

    }

    @Then("user should see uploaded pictures under the message")
    public void userShouldSeeUploadedPicturesUnderTheMessage() {

    }


}


