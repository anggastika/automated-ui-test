@Android @NabungRutin @Test

Feature: Nabung Rutin

  @Positive @NabungRutinMakeANewSchedule
  Scenario: User Make a new Schedule
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click Sekarang kamu bisa Nabung Rutin
    When User click tambah Pembelian Rutin
    When User Choose Portofolio
    When User Choose Product
    When User input Nilai investasi
    When User Choose Gopay as Method payment
    When User wait for 10 seconds
    When User click terapkan
    When User click button Confirm
    Then User see Successfully make the schedule

  @Negative @FailsMakeASchedule
  Scenario: User fails to make a schedule
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click Sekarang kamu bisa Nabung Rutin
    When User click tambah Pembelian Rutin
    When User Choose Portofolio
    When User input Nilai investasi
    When User wait for 10 seconds
    When User click terapkan
    When User click button Confirm
    Then User see error message

  @Negative @PortofolioHasSchedule
  Scenario: User fail to make a new schedule because portofolio already has schedule
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click Sekarang kamu bisa Nabung Rutin
    When User click tambah Pembelian Rutin
    When User Choose Portofolio
    When User Choose Product
    When User input Nilai investasi
    When User Choose Gopay as Method payment
    When User wait for 10 seconds
    When User click terapkan
    When User click button Confirm
    Then User see error message

  @Positive @PortofolioHaveManyProduct
  Scenario: User Make a new Schedule that portofolio have many products
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click Sekarang kamu bisa Nabung Rutin
    When User click tambah Pembelian Rutin
    When User Choose Portofolio that still not have schedule
    When User input Nilai investasi
    When User Choose Gopay as Method payment
    When User wait for 10 seconds
    When User click terapkan
    When User click button Confirm
    Then User see Successfully make the schedule



