package com.cydeo.step_definition;

import com.cydeo.pages.PollPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.parser.node.ASTReference;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class poll_stepDefinitions {
    PollPage pollPage = new PollPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("user clicks on the poll button")
    public void user_clicks_on_the_poll_button() {
        wait.until(ExpectedConditions.titleIs("Portal"));
        pollPage.pollButton.click();


    }


    @And("user type a title as {string}")
    public void userTypeATitleAs(String title) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(pollPage.iFrame));
        pollPage.textBox.sendKeys(title);
        Driver.getDriver().switchTo().defaultContent();

    }

    @And("user clicks on add more link")
    public void userClicksOnAddMoreLink() {

        pollPage.addMoreButton.click();
    }

    @And("user clicks on Employees and departments link")
    public void userClicksOnEmployeesAndDepartmentsLink() {
        pollPage.employeesDepartmentsLink.click();
    }

    @And("user add more than one contacts")
    public void userAddMoreThanOneContacts() {
        wait.until(ExpectedConditions.visibilityOf(pollPage.contact1));

        pollPage.contact1.click();
        pollPage.contact2.click();
        pollPage.contact3.click();


    }


    @And("user click on the close sign")
    public void userClickOnTheCloseSign() {

        pollPage.close.click();
    }

    @Then("verify the added contacts are displayed on the To box")
    public void verifyTheAddedContactsAreDisplayedOnTheToBox() {
        Assert.assertTrue(pollPage.verifyContact1.isDisplayed());
        Assert.assertTrue(pollPage.verifyContact2.isDisplayed());
        Assert.assertTrue(pollPage.verifyContact3.isDisplayed());


    }


    @When("user clicks on Question box")
    public void userClicksOnQuestionBox() {
        pollPage.questionBox.click();


    }

    @And("user adds question as {string}")
    public void userAddsQuestionAs(String question) {
        pollPage.questionBox.sendKeys(question);

    }


    @And("user clicks on the first Answer box and adds answer as {string}")
    public void userClicksOnTheFirstAnswerBoxAndAddsAnswerAs(String answer) {
        pollPage.answerBox1.click();
        pollPage.answerBox1.sendKeys(answer);


    }

    @And("user clicks on the second Answer  box and adds answer as {string}")
    public void userClicksOnTheSecondAnswerBoxAndAddsAnswerAs(String answer) {

        pollPage.answerBox2.click();
        pollPage.answerBox2.sendKeys(answer);


    }

    @And("user clicks on the third Answer box and adds answer as {string}")
    public void userClicksOnTheThirdAnswerBoxAndAddsAnswerAs(String answer) {
        pollPage.answerBox3.click();
        pollPage.answerBox3.sendKeys(answer);


    }

    @And("user deletes the third Answer")
    public void userDeletesTheThirdAnswer() {

        pollPage.deleteAnswer.click();

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }


    @And("user deletes the question")
    public void userDeletesTheQuestion() {
        pollPage.deleteQuestion.click();

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

    @And("user clicks on Allow multiple choice checkbox")
    public void userClicksOnAllowMultipleChoiceCheckbox() {
        pollPage.multipleCheckbox.click();

    }

    @And("user clicks on send button")
    public void userClicksOnSendButton() {
        pollPage.sendButton.click();
    }

    @And("user clicks on checkboxes")
    public void userClicksOnCheckboxes() {
        wait.until(ExpectedConditions.visibilityOf(pollPage.checkbox1));
        pollPage.checkbox1.click();
        pollPage.checkbox2.click();


    }

    @And("user clicks on vote button")
    public void userClicksOnVoteButton() {

        pollPage.voteButton.click();
    }


    @Then("verify the added answers are selected as multiple")
    public void verifyTheAddedAnswersAreSelectedAsMultiple() {
        Assert.assertTrue(pollPage.verifyMultiple1.isDisplayed());
        Assert.assertTrue(pollPage.verifyMultiple2.isDisplayed());

    }

    @When("user clicks on more button")
    public void userClicksOnMoreButton() {
        pollPage.moreButton.click();
    }

    @And("user selects delete")
    public void userSelectsDelete() {

        wait.until(ExpectedConditions.visibilityOf(pollPage.deleteButton));
        pollPage.deleteButton.click();
    }

    @And("user accepts the popup")
    public void userAcceptsThePopup() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

    @Then("the post should be deleted and the message should be displayed")
    public void thePostShouldBeDeletedAndTheMessageShouldBeDisplayed() {
        Assert.assertTrue(pollPage.deletedMessage.isDisplayed());

    }

    @Then("the warning message should be displayed about title")
    public void theWarningMessageShouldBeDisplayedAboutTitle() {
        Assert.assertTrue(pollPage.titleWarningMessage.isDisplayed());

    }


    @Then("the warning message should be displayed about question")
    public void theWarningMessageShouldBeDisplayedAboutQuestion() {

        Assert.assertTrue(pollPage.questionWarningMessage.isDisplayed());
    }

    @Then("the warning message of {string} should be displayed about answers")
    public void theWarningMessageOfShouldBeDisplayedAboutAnswers(String question) {

        Assert.assertTrue(pollPage.verifyAnswerWarningMessage(question).isDisplayed());
    }

    @And("user deletes everybody in To box")
    public void userDeletesEverybodyInToBox() {

        pollPage.deleteAllEmployees.click();
    }

    @Then("the warning message should be displayed about at least one person")
    public void theWarningMessageShouldBeDisplayedAboutAtLeastOnePerson() {
        Assert.assertTrue(pollPage.atLeastTwoWarningMessage.isDisplayed());

    }


    @And("user clicks add question button")
    public void userClicksAddQuestionButton() {
    pollPage.addQuestion.click();

    }
}
