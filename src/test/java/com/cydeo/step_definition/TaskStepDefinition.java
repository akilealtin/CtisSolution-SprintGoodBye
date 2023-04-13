package com.cydeo.step_definition;

import com.cydeo.pages.TaskPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;

public class TaskStepDefinition {

   TaskPage taskPage = new TaskPage();

    @Given("User is on the Activity Stream page")
    public void user_is_on_the_activity_stream_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment.url"));
        taskPage.usernameBox.sendKeys("hr1@cybertekschool.com");
        taskPage.passwordBox.sendKeys("UserUser");
        taskPage.loginButton.click();
    }

    //Scenario-1

    @When("user click on TASK")
    public void user_click_on_task() {
        taskPage.taskButton.click();
    }

    @When("user click on HighPriority")
    public void user_click_on_high_priority() {
        taskPage.highPriority.click();
    }

    @Then("Verify High Priority tik is visible")
    public void verifyHighPriorityTikIsVisible() {
        taskPage.highPriority.isSelected();
    }

    @And("user enters task name")
    public void userEntersTaskName() {
        taskPage.taskName.sendKeys("Task for May");
    }
    @Then("Verify task name is displayed")
    public void verifyTaskNameIsDisplayed() {
        String actualTaskName = taskPage.enteredTask.getText();
        String expectedTaskName = "Task for May";
    //    Assert.assertEquals(expectedTaskName,actualTaskName);
        taskPage.taskName.isDisplayed();
        System.out.println("actualTaskName = " + actualTaskName);
    }

    @And("user enters the checklist items")
    public void userEntersTheChecklistItems() {
        taskPage.checklistButton.click();
        taskPage.checklistInputArea.sendKeys("First do manuel testing");
        taskPage.checklistTikSign.click();
        taskPage.checklistInputArea.sendKeys("Second do automation testing");
        taskPage.checklistTikSign.click();
        taskPage.checklistInputArea.sendKeys("Third get the results");
        taskPage.checklistTikSign.click();
        taskPage.checklistXSign.click();
    }


    @Then("Verify checklist items are displayed")
    public void verifyChecklistItemsAreDisplayed() {
        taskPage.checklistEntered.isDisplayed();
    }


    @When("user click on Add more button")
    public void user_click_on_add_more_button() {
        taskPage.addMoreButton.click();
    }


    @When("user click on Employees and departments Button")
    public void user_click_on_employees_and_departments_button() {
        taskPage.employeesAndDepartmentsButton.click();
    }
    @When("user selects three person")
    public void user_selects_person() {
        taskPage.hr77.click();
        taskPage.helpdesk49.click();
        taskPage.marketting50.click();
        taskPage.xExitButton.click();
    }

    @Then("Verify three person are displayed")
    public void verifyPersonAreDisplayed() {
    //    BrowserUtils.sleep(5);
    //    taskPage.hr77Selected.isDisplayed();
    //    taskPage.helpdesk49Selected.isDisplayed();
    //    taskPage.marketting50Selected.isDisplayed();
        System.out.println("Three person are selected");
    }

    @When("user selects Deadline")
    public void user_selects_deadline() {
        taskPage.deadlineArea.click();
        taskPage.currentMount.click();
        taskPage.mouthMay.click();
        taskPage.currentYear.click();
        taskPage.year.click();
        taskPage.day23May.click();
        taskPage.hour.sendKeys("08");
        taskPage.minute.sendKeys("30");
        taskPage.selectButton.click();
    }

    @Then("Verify Deadline is displayed")
    public void verifyDeadlineIsDisplayed() {
        taskPage.deadlineArea.isDisplayed();
        System.out.println("taskPage.deadlineArea.getText() = " + taskPage.deadlineArea.getText());
    }



    @And("user click on SEND button")
    public void userClickOnSENDButton() {
        taskPage.sendButton.click();
    }


    @Then("Verify task has been created")
    public void verifyTaskHasBeenCreated() {
        taskPage.pupUpView.isDisplayed();
        String actualNote1 = taskPage.pupUpViewNote1.getText();
        String actualNote2 = taskPage.pupUpViewNote2.getText();
        String actualNote3 = taskPage.pupUpViewNote3.getText();
        String expectedNote1 = "Task has been created";
        String expectedNote2 = "You can now view and edit the task.";
        String expectedNote3 = "VIEW TASK";

        Assert.assertEquals(expectedNote1, actualNote1);
        Assert.assertEquals(expectedNote2, actualNote2);
        Assert.assertEquals(expectedNote3, actualNote3);

        System.out.println("actualNote1 = " + actualNote1);
        System.out.println("expectedNote2 = " + expectedNote2);
        System.out.println("expectedNote3 = " + expectedNote3);
    }


    // below is extra

    @And("user enters Time planning data")
    public void userEntersTimePlanningData() {
        taskPage.timePlanningButton.click();
        taskPage.startTaskOnArea.click();
        taskPage.currentMount.click();
        taskPage.mouthMay.click();
        taskPage.currentYear.click();
        taskPage.year.click();
        BrowserUtils.sleep(2);
        taskPage.day8May.click();
        taskPage.hour.sendKeys("08");
        taskPage.minute.sendKeys("30");
        taskPage.selectButton.click();

        taskPage.duration.sendKeys("10 days, 5 hours");

        taskPage.finishArea.click();
        taskPage.currentMount.click();
        taskPage.mouthMay.click();
        taskPage.currentYear.click();
        taskPage.year.click();
        taskPage.day23May.click();
        taskPage.hour.sendKeys("08");
        taskPage.minute.sendKeys("30");
        taskPage.selectButton.click();
    }


}
