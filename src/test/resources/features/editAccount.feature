Feature: Edit Surname in My Account on Tesco Website

  Background:
    Given Open start page
    And Click sign in button
    When Enter valid "elizaveta.aleksandrova.p@gmail.com" and valid "q2n5mm770"
    And Sign in to the site
    Then Check successful login

  Scenario Outline: Edit surname in the account settings

    Given Click on My Account
    When Click on Edit
    And Enter new "<surname>" into the input field Surname
    And Click on Save changes button
    Then Compare expected "Elizaveta Alexandrova" and actual result

    Examples:
    | surname |
    | Alexandrova |