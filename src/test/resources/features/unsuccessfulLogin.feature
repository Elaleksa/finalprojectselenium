Feature: Log into Tesco website - done

  Scenario Outline: Unsuccessful login with invalid credentials

  As a user
  I want to log in to the Tesco site
  So that I can access my account and shop online

    Given Open start page
    And Click sign in button
    When Enter invalid "<email>"
    And Sign in to the site
    Then Check the error under Email address box

    #To test unsuccessful log in

    Examples:
      | email
      | elizaveta.aleksandrova.p_gmail.com