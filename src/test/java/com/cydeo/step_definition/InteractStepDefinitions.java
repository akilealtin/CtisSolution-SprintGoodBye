package com.cydeo.step_definition;

import com.cydeo.pages.InteractPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class InteractStepDefinitions {
    InteractPage interactPage = new InteractPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("User should be able to click like button on the any employee")
    public void user_should_be_able_to_click_like_button_on_the_any_employee() {
        interactPage.likeButton.click();
        BrowserUtils.sleep(2);
    }

    @When("User should be able to click comment button and  make a comment")
    public void user_should_be_able_to_click_comment_button_and_make_a_comment() {
        interactPage.commentButton.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        BrowserUtils.sleep(3);
        interactPage.commentBox.sendKeys("Deneme");
        //   Assert.assertTrue(interactPage.commentBox.getText().contains("Deneme"));
        Driver.getDriver().switchTo().parentFrame();
        interactPage.sendButton.click();

    }

    @When("User should be able to click unfollow button")
    public void user_should_be_able_to_click_unfollow_button() {
        BrowserUtils.sleep(3);
        interactPage.unfollowButton.click();

    }



    @When("User should be able to click like the button of own comment")
    public void user_should_be_able_to_click_like_the_button_of_his_her_own_comment() {
        // Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.className("feed-post-block feed-post-block-short feed-post-block-separator")));
        BrowserUtils.sleep(3);
        actions.click(interactPage.commentLikeButton).perform();
        BrowserUtils.sleep(2);
    }

    @When("User should be able to click reply button of own comment")
    public void userShouldBeAbleToClickReplyButtonOfHisHerOwnComment() {
        interactPage.commentReplyButton.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        BrowserUtils.sleep(3);
        interactPage.commentBoxForReply.sendKeys("reply comment");
        Driver.getDriver().switchTo().defaultContent();
        actions.click(interactPage.sendButton).build().perform();
    }

    @When("User should be able to click more button and choose edit button")
    public void user_should_be_able_to_click_more_button_and_choose_edit_button() {
        BrowserUtils.sleep(4);
        interactPage.moreButton.click();
        interactPage.editButton.click();


    }

    @When("User should be able to edit her\\/his comment")
    public void user_should_be_able_to_edit_her_his_comment() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        interactPage.commentBox.sendKeys("edit comment");
        Driver.getDriver().switchTo().parentFrame();
        actions.moveToElement(interactPage.sendButton).click().perform();
    }

    @When("User should be able to delete the comment")
    public void user_should_be_able_to_delete_the_comment() {
        BrowserUtils.sleep(3);
        interactPage.moreButton.click();
        interactPage.deleteCommentButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @When("user should see be ale to add and remove other's posts to favorites by clicking on the star icon")
    public void user_should_see_be_ale_to_add_and_remove_other_s_posts_to_favorites_by_clicking_on_the_star_icon() {
        actions.moveToElement(interactPage.starButton).click().perform();
        actions.moveToElement(interactPage.starRemoveButton).click().perform();

    }



}
