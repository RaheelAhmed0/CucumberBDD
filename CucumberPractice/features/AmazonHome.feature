Feature: Amazon Home Page

  @S2
  Scenario: Cart Navigation Link
    Given I am on Amazon Home Page
    When I click on Cart Navigation Link
    Then I navigate to Cart Page

  @S3
  Scenario: Search item count
    Given I am on Amazon Home Page
    When I search for 'iPhone 14'
    Then I validate that at least 10000 results are present

  @S4
  Scenario: Search item count2
    Given I am on Amazon Home Page
    When I search for 'Pixel 7'
    Then I validate that at least 100 results are present

  @S5
  Scenario Outline: Home Page Links
    Given I am on Amazon Home Page
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link         | url                                                                                 | title             |
      | Mobiles      | https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles  | Mobile Phones     |
      | New Releases | https://www.amazon.in/gp/new-releases/?ref_=nav_cs_newreleases                      | New Releases      |
      | Best Sellers | https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers                       | Bestsellers |
