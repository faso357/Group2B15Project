package StepDefinitions;

import Pages.CreateEmployeePage;
import Pages.EmployeeExperiencePage;
import Pages.LoginPage;

public class PageInitializer {

    public static LoginPage login;

    public static CreateEmployeePage createEmployeePage;

    public static EmployeeExperiencePage employeeExperiencePage;
    public static void PageObjectInitializer(){

        login = new LoginPage();
        createEmployeePage = new CreateEmployeePage();
        employeeExperiencePage = new EmployeeExperiencePage();
    }
}
