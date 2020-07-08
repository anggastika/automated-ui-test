@Android @Topup @Regression @Test

Feature: Topup Investasi

  @Positive @TopupWithPermata
  Scenario: Topup with permata VA
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click topup
    And User wait for 7 seconds
    When User input minimal pembelian
    When User click button beli
    And User wait for 7 seconds
    When User click setuju
    When User click bayar sekarang
    And User wait for 5 seconds
    When User select payment method "Virtual Account"
    And User wait for 3 seconds
    When User click bayar via VA
    And User wait for 3 seconds
    When User click VA Permata
    And User wait for 3 seconds
    And User click bayar bank
    And User wait for 7 seconds
    Then User get terms permata 'Petunjuk Pembayaran'

  @Positive  @TopupWithTransferMethod
  Scenario: Topup with Transfer Method
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click topup
    And User wait for 7 seconds
      When User input minimal pembelian
      When User click button beli
      And User wait for 7 seconds
      When User click setuju
      When User click bayar sekarang
      And User wait for 5 seconds
      When User select payment method "Transfer Manual"
      And User click bayar
      And User wait for 3 seconds
      When User click bayar bank
      And User wait for 30 seconds and click reload if bad connection
      Then User get list of transaction

  @Positive @TopupWithBNIVa
  Scenario: Topup with BNI VA
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click topup
    And User wait for 7 seconds
    When User input minimal pembelian
    When User click button beli
    And User wait for 7 seconds
    When User click setuju
    When User click bayar sekarang
    And User wait for 5 seconds
    When User select payment method "Virtual Account"
    And User wait for 3 seconds
    When User click bayar via VA
    And User wait for 3 seconds
    When User choose BNI
    And User wait for 3 seconds
#    And User click bayar bank
#    And User wait for 7 seconds
#    Then User get terms BNI 'Transfer ke'

  @Positive @TopupWithCimbNiagaVa
  Scenario: Topup with CIMB Niaga VA
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click topup
    And User wait for 7 seconds
    When User input minimal pembelian
    When User click button beli
    And User wait for 7 seconds
    When User click setuju
    When User click bayar sekarang
    And User wait for 5 seconds
    When User select payment method "Virtual Account"
    And User wait for 3 seconds
    When User click bayar via VA
    And User wait for 3 seconds
    When User choose CIMB Niaga
    And User wait for 3 seconds
#    And User click bayar bank
#    And User wait for 7 seconds
#    Then User get terms CIMB ''

  @Positive @TopupWithBPMandiri
  Scenario: Topup with BP Mandiri
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click topup
    And User wait for 7 seconds
      When User input minimal pembelian
      When User click button beli
      And User wait for 7 seconds
      When User click setuju
      When User click bayar sekarang
      And User wait for 5 seconds
      When User select payment method "Virtual Account"
      And User wait for 3 seconds
      When User click bayar via VA
      And User wait for 6 seconds
      When User choose Mandiri BP
      And User wait for 3 seconds
#      And User click bayar bank
#      And User wait for 10 seconds
#      Then User get mandiri logo


  @Positive   @TopupWithBRIVa
  Scenario: Topup with BRI VA
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click topup
    And User wait for 7 seconds
        When User input minimal pembelian
        When User click button beli
        And User wait for 7 seconds
        When User click setuju
        When User click bayar sekarang
        And User wait for 5 seconds
        When User select payment method "Virtual Account"
        When User click bayar via VA
        And User wait for 6 seconds
        When User choose BRI
        And User wait for 3 seconds
#        And User click bayar bank
#        And User wait for 7 seconds
#        Then User get terms BRI ''


  @Positive @TopUpFromHomePage
  Scenario: Top up from home page
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User wait for 10 seconds
    When User click top up protofolio "mobil kita" on home page
    And User wait for 3 seconds

  @Positive @TopupWithLinkAja
  Scenario: Topup with LinkAja
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click topup
    And User wait for 7 seconds
    When User input minimal pembelian
    When User click button beli
    And User wait for 7 seconds
    When User click setuju
    When User click bayar sekarang
    And User wait for 5 seconds
    When User select payment method "LinkAja"
    And User wait for 3 seconds
    And User click bayar
    And User wait for 2 seconds
    And User click bayar LinkAja
    Then User is on LinkAja punchout page and contain 'Bibit - Investasi Reksadana'

  @Positive @TopupGopay
  Scenario: Topup with Gopay
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click portofolio investasi
    And User wait for 10 seconds
    When User click topup
    And User wait for 7 seconds
    When User input minimal pembelian
    When User click button beli
    And User wait for 7 seconds
    When User click setuju
    When User click bayar sekarang
    And User wait for 5 seconds
    When User select payment method "Gopay"
    And User wait for 3 seconds
    When User click bayar
    And User wait for 7 seconds
    Then User get Gopay popup


