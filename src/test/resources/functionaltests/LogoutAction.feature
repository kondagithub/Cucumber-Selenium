@SMOKE
Feature: Logout Action
    
  @SMOKE, @LAST  
	Scenario: Perform Logout Action
    Given User is on home page
    When User performed logout
    Then User logout is successful