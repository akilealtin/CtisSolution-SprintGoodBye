package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterMassage {

    public AfterMassage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='microoPostFormLHE_blogPostForm']")
    public WebElement massageButton;

    @FindBy(xpath = "//*[@id='bx-b-mention-blogPostForm']")
    public WebElement mentionButton;

    @FindBy(xpath = "//a[contains(@onclick, \"'U513',\")]")
    public WebElement clickBox;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/ol/li[1]/div[2]/span[1]/span[2]/span[1]")
    public WebElement hrVerification;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement mesageArea;

    @FindBy(xpath = "//a[@href='www.youtube.com']")
    public  WebElement textVerification;
@FindBy(xpath = "//*[@id='linkidPostFormLHE_blogPostForm-text']")
public WebElement afterClickEdit;


    @FindBy(xpath = "//span[@title='Link']")
    public WebElement clickLinkButton;

    @FindBy(xpath = "//*[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement clickTextButton;

    @FindBy(xpath = "//*[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement clickURLButton;

    @FindBy(xpath = "//*[@id='undefined']")
    public WebElement clickSaveButton;

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideo;

    @FindBy(xpath = "//*[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement insertURL;

@FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement errorMassage;


@FindBy(xpath = "//*[@id='bx-b-tag-input-blogPostForm']")
    public WebElement addtagButton;

@FindBy(xpath = "//*[@id='TAGS_blogPostForm67abSn']")
    public WebElement writeTagButton;

@FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement clickAddbutton;

@FindBy(xpath = "//span[@class='feed-add-post-tags']")
    public WebElement afterAddButton;

@FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/ol/li[2]/div[2]/span[1]/span")
    public WebElement removeButton;
@FindBy(xpath = "//*[@id='post-tags-container-blogPostForm']")
    public WebElement addTaggSpace;

@FindBy(xpath = "//*[@id='undefined']")
    public WebElement afterinsertVideosave;


}
