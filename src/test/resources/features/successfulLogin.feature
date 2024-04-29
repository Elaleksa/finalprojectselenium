Feature: Log into Tesco website

  Scenario Outline: Successful login with valid credentials

  As a user
  I want to log in to the Tesco site
  So that I can access my account and shop online

    Given Open start page
    And Click sign in button
    When Enter valid "<email>" and valid "<password>"
    And Sign in to the site
    Then Check successful login

    #To test successful log in

    Examples:
      | email | password |
      | elizaveta.aleksandrova.p@gmail.com | q2n5mm770 |