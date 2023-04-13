package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructurePage {

    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/company/vis_structure.php']")
    public WebElement employees;

    @FindBy(id = "pagetitle")
    public WebElement companyStructurePage;

    @FindBy(className = "pagetitle-inner-container")
    public WebElement pageTitle;

    @FindBy(id = "user-block")
    public WebElement userMenu;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[@id='pagetitle-menu']/a")
    public WebElement addDepartmentButton;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement addDepartmentName;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//div[@class='popup-window-buttons']/span[2]")
    public WebElement closeButton;

    @FindBy(xpath = "//div[@id='BXStructure']/span[1]")
    public WebElement xIcon;

    @FindBy(xpath = "//ul[@class='webform-error-list']/li")
    public WebElement errorMessage;

    @FindBy(id = "IBLOCK_SECTION_ID")
    public WebElement parentDepartmentOption;

    @FindBy(id = "single-user-choice")
    public WebElement selectFromStructure;

    @FindBy(xpath = "//span[.='Recent']")
    public WebElement recentForStructure;

    @FindBy(xpath = "//table[@class='finder-box-tab-columns']//td/div")
    public WebElement recentOptions;

    @FindBy(xpath = "//span[@id='structure-department-head']")
    public WebElement deleteStructureOption;

    @FindBy(xpath = "//span[.='Company']")
    public WebElement companyOptions;

    @FindBy(xpath = "//div[@class='company-structure']/div[1]/span")
    public WebElement everything3;

    @FindBy(xpath = "(//div[.='group17'])[2]/..")
    public WebElement group17;

    //@FindBy(xpath = "(//div[.='group17'])[2]/../../following-sibling::div[1]")
    @FindBy(xpath = "(//div[.='Gurhan'])[2]")
    public WebElement gurhan;

    @FindBy(xpath = "//span[.='Search']")
    public WebElement searchOptions;

    @FindBy(xpath = "//div[@class='finder-box-search']/input")
    public WebElement searchBarForSearchOption;

    @FindBy(xpath = "(//table[@class='finder-box-tab-columns'])[2]//div[1]/div[1]")
    public WebElement searchedOptionGurhan;

    @FindBy(xpath = "(//div[@class='structure-dept-title-text'])[8]")
    public WebElement editDepartmentContainer;

    @FindBy(xpath = "//td[@class='bx-layout-inner-inner-cont']//a[.='ChildDrag']/../following-sibling::div[1]/div[1]")
    public WebElement editDepartmentButton;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//td[@class='bx-layout-inner-inner-cont']//a[.='ChildDrag']/../following-sibling::div[1]/div[3]")
    public WebElement addChildDepartment;

    @FindBy(xpath = "//td[@class='bx-layout-inner-inner-cont']//a[.='Changed Name']/../following-sibling::div[1]/div[2]")
    public WebElement deleteDepartmentIcon;

    @FindBy(id = "bx_str_479")
    public WebElement childForDragAndDrop;

    @FindBy(id = "bx_str_347")
    public WebElement childForDragDrop;

    //@FindBy(id = "bx_str_149")
    @FindBy(id = "bx_str_149")
    public WebElement parentForDragAndDrop;

    @FindBy(xpath = "//a[.='New Department2']/../../..")
    public WebElement childDepartment;

    @FindBy(xpath = "//a[.='Developer']/../../..")
    public WebElement parentDepartment;

    @FindBy(xpath = "//a[.='Developer']/../../../../../following-sibling::tr[1]/td[1]/table")
    public WebElement tableDeveloper;




}
