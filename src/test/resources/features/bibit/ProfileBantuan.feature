@Android @ProfileBantuan @Test

Feature: Profile Bantuan
  Scenario: User try bantuan chat support via profile
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click button bantuan
    And User wait for 10 seconds
    When User click chat support
    Then User redirect to Support page

  Scenario: User try bantuan chat wa via profile
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click button bantuan
    And User wait for 10 seconds
    Then User click wa


  Scenario: User try bantuan chat support via profile
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click button bantuan
    And User wait for 10 seconds
    When User click support via email