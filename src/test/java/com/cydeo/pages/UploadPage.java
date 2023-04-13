package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import java.util.LinkedHashMap;
import java.util.Map;

public class UploadPage {


    public UploadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;
    @FindBy(id = "microoPostFormLHE_blogPostForm")
    public WebElement sendBox;
    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadButton;
    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadfileandpicturesButton;

    @FindBy(css = "div[class='feed-com-files-title']")
    public WebElement files;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;








}
