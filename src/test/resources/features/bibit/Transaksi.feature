@Android @Transaksi @Regression

Feature: Transaksi

  @Positive @NoTransaction
  Scenario: User Doesn't have a Transaksi yet
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert correct phone number
    When User input correct OTP
    When User click button transaksi
    Then Belum ada transaksi is displayed

  @Positive @NoHistory
  Scenario: User Doesn't have History yet
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert correct phone number
    When User input correct OTP
    When User click button transaksi
    When User click history tab
    Then Belum ada history is displayed

  @Positive @OwnsTransaksi
  Scenario: User owns Transaksi
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number that have transaksi
    When User input correct OTP
    When User click button transaksi
    Then User see one or some transaksi is displayed

  @Positive @OwnsHistory
  Scenario: User owns History
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number that have transaksi
    When User input correct OTP
    When User click button transaksi
    When User click history tab
    Then User see one or some history is displayed