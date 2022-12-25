
Feature: Check the World population info Functionality
# https://www.worldometers.info/world-population/
  Scenario: User want to get the World population info
   Given User want to open Worldometers.info 
   When User will get World current Population
   And User will get Today world Population
   And User will get This Year World Population
   Then User will check current population growth per second
   And check the Page Title
    

 
