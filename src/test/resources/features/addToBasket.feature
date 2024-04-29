Feature: Add product to the Basket on Tesco website

  Background:
    Given Open start page
    When Enter "<product>" into the search field
    Then Click on the search button

  Scenario Outline: Add a product to the Basket

    Given Add "<product>" to the Basket
    Then Check the "<product>" in the basket

    Examples:
      | product
      | Banana Loose