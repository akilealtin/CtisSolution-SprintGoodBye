package com.cydeo.step_definition;

import com.cydeo.pages.AfterMassage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class AfterMassageStepDefinition {

        AfterMassage afterMassage = new AfterMassage();


 /*  @Given("User is on the login Page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment.url"));
    }
    @Given("User is on the Activity Stream page")
    public void user_is_on_the_activity_stream_page() {
    afterMassage.usernameBox.sendKeys("hr1@cybertekschool.com");
    afterMassage.passwordBox.sendKeys("UserUser");
    afterMassage.loginButton.click();
    }*/


    @Given("user click massage space")
    public void user_click_massage_space() {
    afterMassage.massageButton.click();
    }
    @When("user click add mention button")
    public void user_click_add_mention_button() {
    afterMassage.mentionButton.click();
    }
    @When("User click first box")
    public void user_click_first_box() {
afterMassage.clickBox.click();
    }
    @Then("User see selected email")
    public void user_see_selected_email() {
    String expectedHR ="helpdesk23@cybertekschool.com";
        Assert.assertTrue(afterMassage.hrVerification.getText().contains(expectedHR));
    }

    @When("user click Link button")
    public void user_click_link_button() {
    afterMassage.clickLinkButton.click();
    }
    @When("Write text massage")
    public void write_text_massage() {
    afterMassage.clickTextButton.sendKeys("HelloWorld");
    }
    @When("Write Link Massage")
    public void write_link_massage() {
    afterMassage.clickURLButton.sendKeys("www.youtube.com");
    }
    @When("click Save Button")
    public void click_save_button() {
    afterMassage.clickSaveButton.click();
    }
    @Then("see Text massage in MassageSpace")
    public void see_text_massage_in_massage_space() {

        String expectedMesage = "HelloWorld";
        Driver.getDriver().switchTo().frame(afterMassage.mesageArea);
        Assert.assertTrue(afterMassage.textVerification.getText().contains(expectedMesage));



    }



    @When("user click insertVideo")
    public void user_click_insert_video() {
    afterMassage.insertVideo.click();
    }
    @When("write youtube or vimeo link")
    public void write_youtube_or_vimeo_link() {
afterMassage.insertURL.sendKeys("https://www.youtube.com/watch?v=Kl35tdOkTHU&list=RDKl35tdOkTHU&start_radio=1");
BrowserUtils.sleep(5);
    }




    @When("user click add tagg button")
    public void user_click_add_tagg_button() {
    afterMassage.addtagButton.click();
    }
    @When("user write mesage in to button")
    public void user_write_mesage_in_to_button() {
        afterMassage.writeTagButton.sendKeys("Employee");
        BrowserUtils.sleep(5);
    }
    @When("click add button")
    public void click_add_button() {
        afterMassage.writeTagButton.sendKeys(Keys.ENTER);
    }
    @Then("Verify Button is displayed")
    public void verify_button_is_displayed() {
        String expectedmesage2 = "Employee";
    Assert.assertTrue(afterMassage.afterAddButton.getText().contains(expectedmesage2));


    }
    @Then("User click X button")
    public void user_click_x_button() {
    afterMassage.removeButton.click();
    }
    @Then("Verify button is removed")
    public void verify_button_is_removed() {
        String expectedmesage2 = "Employee";
        Assert.assertFalse(afterMassage.addTaggSpace.getText().contains(expectedmesage2));
    }




    @When("user click Save button")
    public void user_click_save_button() {
        afterMassage.afterinsertVideosave.click();
    }
    @Then("user see the link in the mesage box")
    public void user_see_the_link_in_the_mesage_box() {
        String expectedMesage = "Adamlar - Döndürüyor";
        Assert.assertTrue(afterMassage.textVerification.getText().equals(expectedMesage));
    }
}
