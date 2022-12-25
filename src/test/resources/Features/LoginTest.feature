
Feature: Study Content Login Functionality
# https://www.worldometers.info/world-population/
  Scenario: Check the User login with valid Cridential
    Given User want to open Url 
    And User wants open Login Page
    When User will Entry UserName and Password
    And Click Login Button
    Then User will find DashBoard Page 
    And check the DashBoard Page Title
    