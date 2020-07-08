@Android @Portofolio @Regression @Test

Feature: Portofolio

  Scenario: User Doesn't have a Portofolio yet
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "089912341234"
    When User input correct OTP
    When User click button portofolio
    Then Belum ada portofolio is displayed

  @Positive @CompareApi
  Scenario: User owns Portofolio
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button portofolio
    Then User see one or some portofolios is displayed
    And The Portofolio Data from UI is Same with API Data

  @Positive @TambahPortofolio
  Scenario: User Can Add Portofolio
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    When User click button portofolio
      And User wait for 5 seconds
    When User click button tambah portofolio
      And User wait for 5 seconds
      And User select investment purpose "Tabungan"
    When User click terapkan
    And User wait for 5 seconds
    And User input portofolio name "nabung buat tahun depan"
    And User input target money 25000000 rupiah
      And User select portofolio investment due date 10 2026
    When User click lanjut
    And User wait for 5 seconds
    Then Jumlah yang harus terkumpul 'Rp25,000,000'
    And User click simpan

  @Positive @TambahPortofolioCalculatePMT
  Scenario: User Can Add Portofolio
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    When User click button portofolio
    And User wait for 5 seconds
    When User click button tambah portofolio
    And User wait for 5 seconds
    And User select investment purpose "Tabungan"
    When User click terapkan
    And User wait for 5 seconds
    And User input portofolio name "nabung buat tahun depan"
    And User input target money 25000000 rupiah
    And User select portofolio investment due date 10 2026
    When User click lanjut
    And User wait for 5 seconds
    Then Jumlah yang harus terkumpul 'Rp25,000,000'
    And Target Tanggal Pencapaian "Okt, 2026"
    And Jumlah yang Harus Kamu Tabung Tiap Bulan matches with calculation
    And User click simpan

    @Negative @MinimumTargetMoney
    Scenario: User Get Error When Input Minimum Target Money as Rp 10000
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      Then User is on bibit main page
      When User click button portofolio
      And User wait for 5 seconds
      When User click button tambah portofolio
      And User wait for 5 seconds
      And User select investment purpose "Tabungan"
      When User click terapkan
      And User wait for 5 seconds
      And User input portofolio name "negative test"
      And User input target money 10000 rupiah
      And User select portofolio investment due date 10 2026
      When User click lanjut
      And User wait for 5 seconds
      Then Show error message 'Nilai target goal setting harus lebih besar dari Rp.100,000'

  @Negative @PortofolioNameLong
  Scenario: User input long portofolio name
    Given User is on bibit screen
    When User click button login
    And User wait for 5 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    Then User is on bibit main page
    When User click button portofolio
    And User wait for 5 seconds
    When User click button tambah portofolio
    And User wait for 5 seconds
    And User select investment purpose "Tabungan"
    When User click terapkan
    And User wait for 5 seconds
    And User input portofolio name "negative test 123123123123123123123123123123123123123123123123123123123123123"
    And User input target money 10000 rupiah
    And User select portofolio investment due date 10 2026
    When User click lanjut
    And User wait for 5 seconds
  #  Then Show error message 'Nilai target goal setting harus lebih besar dari Rp.100,000'