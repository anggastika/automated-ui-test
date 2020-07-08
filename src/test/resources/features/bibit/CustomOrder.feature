@Android @CustomOrder @Regression

  Feature: Custom Order

    @Positive @CustomOrderVaPermata
    Scenario: Custom order with Permata Virtual Account
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      Then User is on bibit main page
      And User wait for 10 seconds
      When User click custom order option Pasar Uang
      And User wait for 5 seconds
      When User click company
      And User wait for 2 seconds
      When User click beli1
      And User wait for 2 seconds
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
#      And User click bayar bank
#      And User wait for 7 seconds
#      Then User get terms permata 'Petunjuk Pembayaran'

    @Positive @CustomOrderVaBNI
    Scenario: Custom order with BNI Virtual Account
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      Then User is on bibit main page
      And User wait for 10 seconds
      When User click custom order option Pasar Uang
      And User wait for 5 seconds
      When User click company
      And User wait for 2 seconds
      When User click beli1
      And User wait for 2 seconds
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
#      And User click bayar bank
#      And User wait for 7 seconds
#      Then User get terms BNI 'Transfer ke'

    @Positive @CustomOrderVaCimbNiaga
    Scenario: Custom order with BNI Virtual Account
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      Then User is on bibit main page
      And User wait for 10 seconds
      When User click custom order option Pasar Uang
      And User wait for 5 seconds
      When User click company
      And User wait for 2 seconds
      When User click beli1
      And User wait for 2 seconds
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
#      And User click bayar bank
#      And User wait for 7 seconds
#      Then User get terms CIMB ''


    @Positive @CustomOrderMandiriBP
    Scenario: Custom order with Mandiri Bill Payment
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      Then User is on bibit main page
      And User wait for 10 seconds
      When User click custom order option Pasar Uang
      And User wait for 5 seconds
      When User click company
      And User wait for 2 seconds
      When User click beli1
      And User wait for 2 seconds
      When User input min pembelian
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

    @Positive @CustomVaBRI
    Scenario: Custom order with Mandiri Bill Payment
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      Then User is on bibit main page
      And User wait for 10 seconds
      When User click custom order option Pasar Uang
      And User wait for 5 seconds
      When User click company
      And User wait for 2 seconds
      When User click beli1
      And User wait for 2 seconds
      When User input min pembelian
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
#      And User click bayar bank
#      And User wait for 7 seconds
#      Then User get terms BRI ''