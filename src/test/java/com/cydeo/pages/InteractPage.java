package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractPage  {
    public InteractPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div//a[@class='bx-ilike-text'])[1]")
    public WebElement likeButton;

    @FindBy(xpath = "(//span[@class='feed-inform-comments'])[1]")
    public WebElement commentButton;

    @FindBy(className = "feed-inform-follow")
    public WebElement unfollowButton;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[2]")
    public WebElement moreButton;

    @FindBy(id = "bx-ilike-top-users-BLOG_POST_515-1681403467")
    public WebElement emojiLoaded;
    @FindBy(xpath = "//span[@class='bxhtmled-metion']/..")
    public WebElement commentBoxForReply;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement commentBox;

    @FindBy(xpath = "(//button[.='Send'])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "(//a[@class='bx-ilike-text'])[2]")
    public WebElement commentLikeButton;
    @FindBy(xpath = "(//div[@class='feed-com-informers-bottom'])[2]/a[1]")
    public WebElement commentReplyButton;
    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement commentSendButton;
    @FindBy(xpath = "//div//span[@class='menu-popup-item blog-comment-popup-menu ']/span[.='Delete']")
    public WebElement deleteCommentButton;
    // @FindBy(xpath = "//div[@class='menu-popup-items']/span[.='Edit']")
    @FindBy(xpath = "//div//span[@class='menu-popup-item blog-comment-popup-menu ']/span[.='Edit']")
    public WebElement editButton;
    @FindBy(xpath = "(//div[@title='Add to favorites'])[1]")
    public WebElement starButton;
    @FindBy(xpath = "(//div[@title='Remove from favorites'])[1]")
    public WebElement starRemoveButton;
    @FindBy(xpath = "(//div[contains(@class, 'feed-post-emoji-text')])[3]")
    public WebElement likeSign;


    public void deleteComment(){
        moreButton.click();
        deleteCommentButton.click();
    }
}
