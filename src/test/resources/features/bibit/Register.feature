@Android @Register @Regression @Test

Feature: Register

  @Negative @RegWithUnregistered
  Scenario: Register with Unregistered Phone Number
    Given User is on bibit screen
    When User click button Register
    When User answer all the questions
    When User wait for 2 seconds
    When User input Unregistered Phone Number
    When User input correct OTP
    Then successfully Register Phone Number

  @Positive @Register
  Scenario Outline: Register with phone number
    Given User is on bibit screen
    When User click button Register
    When User answer all the questions
    When User wait for 2 seconds
    When insert phone number <error>
    Then display phone number <result>

    Examples:
      |         error             |      result          |
      |  registered               | already existed      |
      | wrong phone number format | wrong phone number   |

  @Negative @OtpFiveTimes
  Scenario: to many OTPs already sent to the phone number
    Given User is on bibit screen
    When User click button Register
    When User answer all the questions
    When User wait for 2 seconds
    And insert phone number
    And insert OTP for five times
    Then display to many OTPs

  @ContinueRegister
  Scenario: Continue Register
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "089912341234"
    When User input correct OTP
    When User wait for 10 seconds
    When User click button lanjutkan registrasi on home page
    And User input pendidikan "S1" on register page
    And User input pendapatan pertahun "> Rp100 Juta - 500 Juta / tahun" on register page
    And User input sumber penghasilan "Keuntungan Bisnis" on register page
    And User nama bank "BCA" on register page
    And User input nomor rekening "123321123" on register page
    And User input nama pemilik rekening "Jonathan"
    And User sign on registration on register page
    And User upload ktp on register page
    And User wait for 3 seconds