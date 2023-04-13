package com.cydeo.step_definition;

import com.cydeo.pages.CompanyStructurePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Company_Structure_Step_Definitions {


    CompanyStructurePage company = new CompanyStructurePage();

    @Given("user logins as helpdesk user")
    public void user_logins_as_helpdesk_user() {

        Driver.getDriver().get("https://qa.ctissolutions.com");
        BrowserUtils.sleep(1);
        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys("helpdesk1@cybertekschool.com");
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Driver.getDriver().findElement(By.className("login-btn")).click();

    }
    @When("user clicks Employee option form left bar")
    public void user_clicks_employee_option_form_left_bar() {
        company.employees.click();
    }
    @When("verify that helpdesk user is in the Company Structure Page")
    public void verify_that_helpdesk_user_is_in_the_company_structure_page() {
        Assert.assertTrue(company.companyStructurePage.isDisplayed());
    }
    @Then("verify that helpdesk user cannot reach add department option")
    public void verify_that_helpdesk_user_cannot_reach_add_department_option() {
        Assert.assertTrue(!company.pageTitle.getText().contains("Add department"));
    }
    @Then("user logouts as helpdesk user")
    public void user_logouts_as_helpdesk_user() {
        company.userMenu.click();
        company.logoutButton.click();
    }

    @Given("user logins as marketing user")
    public void user_logins_as_marketing_user() {
        //Driver.getDriver().get("https://qa.ctissolutions.com");
        //BrowserUtils.sleep(1);
        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(Keys.chord(Keys.CONTROL,"a")+"marketing1@cybertekschool.com");
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Driver.getDriver().findElement(By.className("login-btn")).click();
    }

    @When("verify that marketing user is in the Company Structure Page")
    public void verify_that_marketing_user_is_in_the_company_structure_page() {
        Assert.assertTrue(company.companyStructurePage.isDisplayed());
    }
    @Then("verify that marketing user cannot reach add department option")
    public void verify_that_marketing_user_cannot_reach_add_department_option() {
        Assert.assertTrue(!company.pageTitle.getText().contains("Add department"));
    }
    @Then("user logouts as marketing user")
    public void user_logouts_as_marketing_user() {
        company.userMenu.click();
        company.logoutButton.click();
    }

    @Given("user logins as hr user")
    public void user_logins_as_hr_user() {
        Driver.getDriver().get("https://qa.ctissolutions.com");
        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(Keys.chord(Keys.CONTROL,"a")+"hr1@cybertekschool.com");
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Driver.getDriver().findElement(By.className("login-btn")).click();
    }

    @Then("verify that hr user is in the Company Structure Page")
    public void verify_that_hr_user_is_in_the_company_structure_page() {
        Assert.assertTrue(company.companyStructurePage.isDisplayed());
    }
    @Then("verify Add Department option is visible")
    public void verify_add_department_option_is_visible() {
        Assert.assertTrue(company.addDepartmentButton.isDisplayed());
    }

    @When("user clicks Add Department option from top right")
    public void user_clicks_add_department_option_from_top_right() {
        company.addDepartmentButton.click();
    }
    @When("user doesn't enter department name")
    public void user_doesn_t_enter_department_name() {
        company.addDepartmentName.sendKeys("");
        company.addButton.click();
    }
    @Then("verify that Section name is not specified. message appear")
    public void verify_that_section_name_is_not_specified_message_appear() {
        Assert.assertTrue(company.errorMessage.isDisplayed());
        Assert.assertEquals("Section name is not specified.",company.errorMessage.getText());
    }
    @Then("user enters new department name")
    public void user_enters_new_department_name() {
        company.addDepartmentName.sendKeys("New Department");
    }

    @When("user clicks parent department dropdown menu")
    public void user_clicks_parent_department_dropdown_menu() {
        company.parentDepartmentOption.click();
    }
    @When("user chooses a parent department")
    public void user_chooses_a_parent_department() {
        Select parentDepartmentDropdown = new Select(company.parentDepartmentOption);
        parentDepartmentDropdown.selectByValue("198");
    }
    @When("user clicks select from structure options")
    public void user_clicks_select_from_structure_options() {
        company.selectFromStructure.click();
    }
    @When("select supervisor from Recent then delete it")
    public void select_supervisor_from_recent_then_delete_it() {
        company.recentForStructure.click();
        company.recentOptions.click();
        company.deleteStructureOption.click();
    }
    @When("select supervisor from Company then delete it")
    public void select_supervisor_from_then_delete_it() {
        company.companyOptions.click();
        company.everything3.click();
        company.group17.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(company.gurhan));
        company.gurhan.click();
        wait.until(ExpectedConditions.elementToBeClickable(company.closeButton));
    }
    @When("select supervisor from Search")
    public void select_supervisor_from_Search() {
        company.searchOptions.click();
    }
    @When("enters a supervisor to choose")
    public void enters_a_supervisor_to_choose() {
        company.searchBarForSearchOption.sendKeys("Gurhan"+ Keys.ENTER);
        company.searchedOptionGurhan.click();
        company.addButton.click();
    }

    @When("user click Close button or X option from top right of pop-up")
    public void user_click_close_button_or_x_option_from_top_right_of_pop_up() {
        company.closeButton.click();
    }

    @When("click Edit department change name is Changed Name")
    public void click_edit_department_pencil_icon_change_name_is_changed_name() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(company.childForDragAndDrop).perform();
        actions.moveToElement(company.editDepartmentContainer).perform();
        company.editDepartmentButton.click();
        company.addDepartmentName.sendKeys(Keys.chord(Keys.CONTROL,"a")+Keys.DELETE);
        company.addDepartmentName.sendKeys("Changed Name");
        company.saveButton.click();
    }
    @When("click Add Child Department as Added Department")
    public void click_add_child_department_as_added_department() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(company.childForDragAndDrop).perform();
        actions.moveToElement(company.editDepartmentContainer).perform();
        company.addChildDepartment.click();
        company.addDepartmentName.sendKeys("Child For Changed Name");
        company.addButton.click();
    }
    @When("click Delete Department on Added Department")
    public void click_delete_department_on_added_department() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(company.childForDragAndDrop).perform();
        actions.moveToElement(company.editDepartmentContainer).perform();
        company.deleteDepartmentIcon.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }


    @When("user drag and drop one department to under another one")
    public void user_drag_and_drop_one_department_to_under_another_one() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(1);
        actions.dragAndDrop(company.childDepartment,company.parentDepartment).build().perform();
    }

    @Then("verify that dragged department is the child department and dropped department is parent department")
    public void verify_that_dragged_department_is_the_child_department_and_dropped_department_is_parent_department() {
        Assert.assertTrue(company.tableDeveloper.getText().contains(company.childDepartment.getText()));
    }

}
