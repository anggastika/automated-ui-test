@Android @InvestasiSkrg @Regression @Test

Feature: Investasi Sekarang

  @Negative @OrderWithUncompletedReg
  Scenario: User login with uncompleted registration and click Button Investasi Sekarang and get warning message
    Given User is on bibit screen
    When User click button login
    And User wait for 10 seconds
    When User insert phone number "089912341234"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 10 seconds
    Then User get warning message 'Selesaikan Registrasimu'

  @Positive  @TransferMethod
  Scenario: User login with completed registration and try to order with transfer method payment
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
      When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 5 seconds
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

  @Positive @VaPermata
  Scenario: User login with completed registration and try to order with Permata Virtual Account
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
        When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 5 seconds
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
#        And User click bayar bank
#        And User wait for 7 seconds
#    Then User get terms permata 'Petunjuk Pembayaran'

  @Positive @VaBNI
  Scenario: User login with completed registration and try to order with BNI Virtual Account
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 5 seconds
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

  @Positive @VaCimbNiaga
  Scenario: User login with completed registration and try to order with CIMB Virtual Account
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 5 seconds
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

  @Positive @VaMandiri
  Scenario: User login with completed registration and try to order with Mandiri VA
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 5 seconds
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
#    And User click bayar bank
#    And User wait for 10 seconds
#    Then User get mandiri logo

  @Positive @VaBRI
  Scenario: User login with completed registration and try to order with BRI Virtual Account
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 5 seconds
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
#    And User click bayar bank
#    And User wait for 7 seconds
#    Then User get terms BRI ''

  @Positive @LinkAja
  Scenario: User login with completed registration and try to order with LinkAja
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 5 seconds
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

  @Positive @Gopay
  Scenario: User login with completed registration and try to order with GoPay
    Given User is on bibit screen
    When User click button login
    And User wait for 7 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    And User wait for 10 seconds
    When User click investasi sekarang
    And User wait for 5 seconds
    When User input minimal pembelian
    And User wait for 5 seconds
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

  @Positive @InvestasiSekarangFromHomePage
  Scenario: Top up from home page
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User wait for 10 seconds
    When User click investasi sekarang with portofolio "Honda Jazz" on home page
    And User wait for 3 seconds
