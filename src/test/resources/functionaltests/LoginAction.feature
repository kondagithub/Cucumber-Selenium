@SMOKE
Feature: Login Action

	@SMOKE, @FIRST
  Scenario: Perform Succcesfull Login
    Given User is on Login Page
    When User accepted cookies
    And User enters "ABC@gmail.com" and "Password@7" and performed login action
    Then User login is successful