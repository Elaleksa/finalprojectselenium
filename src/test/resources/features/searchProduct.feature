Feature: Search product in Tesco website

  Scenario Outline: Search for a product

    Given Open start page
    When Enter "<product>" into the search field
    And Click on the search button
    Then Check that the "<product>" is found

    #There should be the list of products related to the searched product and searched product should be included of at least one product

    Examples:
      | product |
      | Magyar Tej ESL Milk |
