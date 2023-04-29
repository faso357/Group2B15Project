package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateEmployee extends CommonMethods {


    @When("user clicks on pim tab")
    public void user_clicks_on_pim_tab() {
        doClick(createEmployeePage.pimTab);
    }
    @When("user clicks on add employee")
    public void user_clicks_on_add_employee() {
        doClick(createEmployeePage.addEmpBtn);
    }
    @When("user fills firstname and middlename and lastname")
    public void user_fills_firstname_and_middlename_and_lastname() {
        sendText(createEmployeePage.firstNameBox, ConfigReader.getPropertyValue("firstname"));
        sendText(createEmployeePage.middleNameBox, ConfigReader.getPropertyValue("middlename"));
        sendText(createEmployeePage.lastNameBox, ConfigReader.getPropertyValue("lastname"));
    }

    @Then("user selects create login box")
    public void user_selects_create_login_box() {

        doClick(createEmployeePage.loginBox);
    }
    @Then("user fills username")
    public void user_fills_username() {
        sendText(createEmployeePage.userNameBox,ConfigReader.getPropertyValue("empusername"));
    }
    @Then("user fills password and confirm it")
    public void user_fills_password_and_confirm_it() {
       sendText(createEmployeePage.userPasswordBox, ConfigReader.getPropertyValue("emppassword"));
       sendText(createEmployeePage.rePasswordBox, ConfigReader.getPropertyValue("emppassword"));

    }
    @Then("user selects status enabled")
    public void user_selects_status_enabled() {
        WebElement statusDropDown = driver.findElement(By.id("status"));
        clickOnDropdown(statusDropDown).selectByValue("Enabled");
    }
    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        doClick(createEmployeePage.btnSaveBox);
    }


}