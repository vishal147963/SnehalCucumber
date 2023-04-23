Feature: Test end to end function of OrangeHRM

  Scenario Outline: Test login function
    Given User is on login Page
    When user enter valid <username> and <Password>
    Then user click on login button
    And user enter home page
Examples:
|username|Password|
|Admin|admin123|
|Admin|admin123|
|Admin|admin123|
|Admin|admin123|
|Admin|admin123|
