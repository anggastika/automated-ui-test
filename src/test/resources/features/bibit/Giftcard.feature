@Android @Giftcard @Regression

Feature: Giftcard

  @Positive @SendGiftcard
  Scenario: User can send giftcard to others
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click giftcard menu
    And User select giftcard theme "Birthday"
    And User wait for 10 seconds
    And User select themes on slick slide
    And User wait for 5 seconds
    And User click pilih desain
    And User select nominal "500,000"
    And User input message "free text free text"
    And User click selanjutnya
    And User click lanjutkan pembayaran
    And User wait for 5 seconds
    Then User get gojek popup
