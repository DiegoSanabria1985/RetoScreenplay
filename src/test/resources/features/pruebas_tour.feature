# Autor: XXXX

@stories
Feature: page utest

  as a user I want to enter all the data to create a new account

  @scenario1
  Scenario: enter all the data to create a new user
    Given Diego wants to create a new user
    When Add user address data on the page Add your address
    When Enter device information on the page Tell us about your devices
    When Enter the password on the page The last step
    Then find the welcome page with the message The last step