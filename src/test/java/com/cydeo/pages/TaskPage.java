package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // login
    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    public void Login() {
        usernameBox.sendKeys("hr1@cybertekschool.com");
        passwordBox.sendKeys("UserUser");
        loginButton.click();
    }
//Scenario-1
    @FindBy(css = "span[id='feed-add-post-form-tab-tasks']")
    public WebElement taskButton;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskName;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement enteredTask;

    @FindBy(css = "input[id='tasks-task-priority-cb']")
    public WebElement highPriority;

    @FindBy(xpath = "(//span[@class='task-form-field-controls'])[1]//a[1]")
    public WebElement addMoreButton;

    @FindBy(css = "a[class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "(//div[@id='bx-lm-category-relation-129']//a)[5]")
    public  WebElement hr77;

    @FindBy(xpath = "//span[@data-item-value='U769']/a")
    public WebElement hr77Selected;

    @FindBy(xpath = "(//div[@id='bx-lm-category-relation-129']//a)[55]")
    public  WebElement helpdesk49;

    @FindBy(xpath = "//span[@data-item-value='U539']/a")
    public WebElement helpdesk49Selected;

    @FindBy(xpath = "(//div[@id='bx-lm-category-relation-129']//a)[155]")
    public  WebElement marketting50;

    @FindBy(xpath = "//span[@data-item-value='U641']/a")
    public WebElement marketting50Selected;

    @FindBy(xpath = "(//span[@class='popup-window-close-icon'])[1]")
    public WebElement xExitButton;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[1]")
    public WebElement deadlineArea;

    @FindBy(xpath = "//a[@class='bx-calendar-top-month']")
    public WebElement currentMount;

    @FindBy(xpath = "(//div[@class='bx-calendar-month-content']//span)[4]")
    public WebElement mouthMay;

    @FindBy(xpath = "//a[@class='bx-calendar-top-year']")
    public WebElement currentYear;

    @FindBy(xpath = "(//div[@id='bx-calendar-year-content']/span)[4]")
    public WebElement year;

    @FindBy(xpath = "((//div[@class='bx-calendar-range'])[4]//a)[3]")
    public WebElement day23May;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[1]")
    public WebElement hour;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[2]")
    public WebElement minute;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectButton;

    @FindBy(css = "button[id='blog-submit-button-save']" )
    public  WebElement sendButton;

    @FindBy(css = "span[class='tasks-task-mpf-link']")
    public WebElement checklistButton;

    @FindBy(css = "span[class='task-checklist-form-vpadding']>input")
    public  WebElement checklistInputArea;

    @FindBy(css = "span[class='task-checklist-form-vpadding']>span")
    public  WebElement checklistTikSign;

    @FindBy(css = "span[class='task-checklist-form-vpadding']>span")
    public  WebElement checklistXSign;

    @FindBy(xpath = "(//div[@id='bx-component-scope-lifefeed_task_form-checklist']/div)[2]")
    public WebElement checklistEntered;


    @FindBy(xpath = "//div[@id=\"blogPostEditCreateTaskPopup\"]")
    public WebElement pupUpView;  // the whole window

    @FindBy(xpath = "(//*[@id=\"blogPostEditCreateTaskPopup\"]//div)[4]")
    public WebElement pupUpViewNote1;  // Task has been created

    @FindBy(xpath = "(//*[@id=\"blogPostEditCreateTaskPopup\"]//div)[5]")
    public WebElement pupUpViewNote2;  // You can now view and edit the task.

    @FindBy(xpath = "(//*[@id=\"blogPostEditCreateTaskPopup\"]//span)[2]")
    public WebElement pupUpViewNote3;  // VIEW TASK







    // extra

    @FindBy(xpath = "((//div[@class='task-options-item-more']/span)[2]/span)[1]")
    public WebElement timePlanningButton;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[2]")
    public WebElement startTaskOnArea;

    @FindBy(xpath = "((//div[@class='bx-calendar-range'])[2]//a)[2]")
    public WebElement day8May;

    @FindBy(xpath = "//input[@data-bx-id='dateplanmanager-duration']")
    public WebElement duration;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[3]")
    public WebElement finishArea;







}