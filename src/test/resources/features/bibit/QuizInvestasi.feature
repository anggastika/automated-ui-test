@Android @QuizInvestasi @Test

Feature: Quiz investasi

  Scenario:  User try Quiz Apa sih Reksa dana
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click Quiz Apa sih Reksa dana
    When User click Mulai Kuis
