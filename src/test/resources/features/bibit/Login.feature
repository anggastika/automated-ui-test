@Android @Login @Regression @Test

Feature: Login

  @Positive @NormalLogin
  Scenario: Login with already registered phone number
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page

  @Negative @WrongLogin
  Scenario: Login with unregistered phone number
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "0890909090909"
    Then User get error message contain 'Nomor handphone yang kamu masukan salah'

  @Negative @WrongOtp
  Scenario: Login with unregistered phone number
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input wrong otp "1234"
    Then User get otp error message contain 'Kode OTP yang kamu masukkan salah'
