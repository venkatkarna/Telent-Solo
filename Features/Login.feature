Feature: Login Functionality

    Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the homepage
    
    Scenario: Validate the home page
    Given user mouse hover the PMO
    When User click on Advanced job search
    
    
    Scenario: validate the advanced job search page
    Given Scroll down the advanced job search page 
    When User click on the My job button
    And scroll the My job function
    Then Click on the Add job button
    
    Scenario: Validate the advanced job search screen
    Given Select the contract box 
    When Enter the valid inputs in estimate text box field
    When Select the Job category in dropdown field
    When select the date Required By Date/Time field 
    And Enter the valid input in Originator text box field
    And Enter the valid inputs in OCU text box field
    And Select the Receipt Date/Time field
    And Select the Depot in Depot dropdown field
    Then Enter the valida inputs in COW text box field 
    Then Enter the valid inputs in Location text box field
    Then Click on the Exchange area search bar
    Then User can handle the Exchange area search bar window
    
    Scenario: validate the save button
    Given Click on the save button
    
    Scenario: Validate the Estimate screen
    Given Click on the estimate hyper link in Job info screen
    When Click on the add button
    When Select the description in dropdown list
    And  Enter the Estimate quantity number
    Then Click on the save button in Estimate screen
    
    Scenario: Validate the Job info screen
    Given Click on the Job info screen
    When User can click on the Accept job
    When User can click on the continue button
    When User can click on the No button in Job Pack required ?
    When User can click on the no button in USRN Required ?
    When User can click on the Continue button
    And User can click on the Releasd to depot button
    And User can click on the Mandatory work flow save button
    And User can click on the ZOI No excavation 
    And Click on the Release button
    And User can click on the Release Job Confirmation Yes button
    
    Scenario: Quick ling page validate
    Given Click on the quick link
    When Double click on the order number
    When User can accept the job
    When User can accept the job pack
    When User can select the pole Weighting
    When Depot accepted double click the order number
    When User can accept the job
    
    Scenario: Validate the Quick programming hyper link
    Given Click on quick programming link
    
    Scenario: For work assign
    Given click on the work assign 
    When accept the job document
    
    Scenario: For A537 Screen
    Given Click on the A537 Hyper link
    When Click on the planned work
    When Select the CSSID 
    And Click on the EC Button
    Then Click on the job info
    
    Scenario: Completete the job pack invoicing 
    Given Click on the send to Completete the job pack invoicing 
    When click on the agreen Button
    And Accept the invoicing status
    Then Accept the job
    
    Scenario: For Payment Validation
    Given Click on the payment validation
    When Click o the Add button
    And  Click on the View button
    Then Click on the Agree button
    
    Scenario: Tax Completion
    Given Click on the tax completion button
    