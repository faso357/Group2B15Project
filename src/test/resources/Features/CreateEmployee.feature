Feature:  Employee


   @createEmployee
  Scenario: Create a new Employee
   # Given open the browser and launch HRMS application
    When user enters valid user and valid password
   And click on login button
     And user clicks on pim tab
    And user clicks on add employee
    And user fills firstname and middlename and lastname
   Then user selects create login box
   And user fills username
     And user fills password and confirm it
     And user selects status enabled
     Then user clicks on save button
     #And Close the browser



