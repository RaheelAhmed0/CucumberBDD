Feature: Ebay Advanced search

	@S6
  Scenario: Ebay Advanced search function
    Given I am on Ebay Advance search page
    When I advance search an item
      | keyword   | exclude     | min | max  |
      | iPhone 14 | refurbished | 400 | 1300 |
