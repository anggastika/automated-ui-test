@Android @Jual @Regression @Test

Feature: Jual Reksadana

  @Positive @Jual
  Scenario: Jual reksadana
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click jual
    And User wait for 7 seconds
    When User click saya mengerti
    And User wait for 5 seconds
    When User input jumlah penjualan
    When User click jual2
    And User wait for 5 seconds
    When User click approve
    When User click jual3
    And User wait for 5 seconds
    When User insert PIN
    And User wait for 30 seconds and click reload if bad connection
    Then User get list of transaction
