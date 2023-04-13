package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage extends BasePage {

    public PollPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']/span")
    public WebElement pollButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iFrame;


    @FindBy(css = "body[contenteditable='true']")
    public WebElement textBox;

    @FindBy(css = "a#bx-destination-tag")

    public WebElement addMoreButton;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesDepartmentsLink;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[6]/div[1]/div[1]")
    public WebElement contact1;
    public String  c1(){
        String c1 = contact1.getText();

    return c1;
    }

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[1]/div[1]/div[1]")
    public WebElement contact2;

    public String  c2(){
        String c1 = contact2.getText();

        return c1;
    }


    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[3]/div[1]/div[1]")
    public WebElement contact3;

    public String  c3(){
        String c1 = contact3.getText();

        return c1;
    }
    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement close;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']/span/span[2]/span[.='hr77@cybertekschool.com']")
    public WebElement verifyContact1;


    public WebElement verifyC1(){
        String xPath= "//div[@id='feed-add-post-destination-container']/span/span[2]/span[.='"+c1()+"']";
       return Driver.getDriver().findElement(By.xpath(xPath));
    }

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']/span/span[3]/span[.='helpdesk1@cybertekschool.com']")
    public WebElement verifyContact2;


    public WebElement verifyC2(){
        String xPath= "//div[@id='feed-add-post-destination-container']/span/span[3]/span[.='"+c2()+"']";
       return Driver.getDriver().findElement(By.xpath(xPath));
    }


    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']/span/span[4]/span[.='hr76@cybertekschool.com']")
    public WebElement verifyContact3;


    public WebElement verifyC3(){
        String xPath= "//div[@id='feed-add-post-destination-container']/span/span[4]/span[.='"+c3()+"']";
       return Driver.getDriver().findElement(By.xpath(xPath));
    }

    @FindBy(xpath = "//input[@placeholder='Question ']")
    public WebElement questionBox;



    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]")
    public WebElement toBox;
    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement answerBox1;
    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement answerBox2;
    @FindBy(xpath = "//input[@placeholder='Answer  3']")
    public WebElement answerBox3;


    @FindBy(xpath = "(//label[.='Select A']/../label)[1]/span")
    public WebElement checkbox1;

    @FindBy(xpath = "(//label[.='Select B']/../label)[1]/span")
    public WebElement checkbox2;

    @FindBy(xpath = "(//label[.='Select C']/../label)[1]/span")
    public WebElement checkbox3;


    @FindBy(id = "multi_1")
    public WebElement multipleCheckbox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "(//label[@title='Delete answer'])[3]")
    public WebElement deleteAnswer;

    @FindBy(xpath = "//label[@title='Delete question']")
    public WebElement deleteQuestion;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestion;


    @FindBy(xpath = "(//button[@data-bx-vote-button='actVoting'])[1]")
    public WebElement voteButton;

    @FindBy(xpath = "//label[.='Select A']/../../../following-sibling::td[2]/span[.='100%']")
    public WebElement verifyMultiple1;

    @FindBy(xpath = "//label[.='Select B']/../../../following-sibling::td[2]/span[.='100%']")
    public WebElement verifyMultiple2;

    @FindBy(xpath = "//label[.='Select C']/../../../following-sibling::td[2]/span[.='100%']")
    public WebElement verifyMultiple3;

    @FindBy(xpath = "(//span[.='More' and @class='feed-post-more-text' ])[1]")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Delete' and @class='menu-popup-item menu-popup-no-icon ']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[.='The post has been deleted.' and @class='feed-add-info-text']")
    public WebElement deletedMessage;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement titleWarningMessage;

    @FindBy(xpath = "//span[.='The question text is not specified.']")
    public WebElement questionWarningMessage;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement atLeastTwoWarningMessage;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement deleteAllEmployees;


    public WebElement verifyAnswerWarningMessage(String question) {
        String xpath = "//span[.='The question \"" + question + "\" has no answers.']";
        WebElement answerWarning = Driver.getDriver().findElement(By.xpath(xpath));

        return answerWarning;
    }


}
