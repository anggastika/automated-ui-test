@Android @Search @Regression @Test

Feature: Search

  @Positive @SimpleSearch
  Scenario: Search with sample value ex : Pasar Uang
    Given User is on bibit screen
    When User click loup icon
    When User click search bar
    When User input search value
    Then get search result contain 'Pasar Uang'
    And User wait for 5 seconds

