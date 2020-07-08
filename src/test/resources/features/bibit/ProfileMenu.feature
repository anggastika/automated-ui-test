@Android @ProfileMenu @Regression @Test

Feature: Profile

  @Positive @EditUserAddress
  Scenario: Edit User Address in Profile
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click Data Pribadi
    When User Input Pin Number
    And User wait for 10 seconds
    When User click Ubah data personal
    When User input New Alamat
    Then User click Simpan Perubahan

  @Positive @EditUserCity
  Scenario: Edit User City in Profile
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click Data Pribadi
    When User Input Pin Number
    And User wait for 10 seconds
    When User click Ubah data personal
    When User input New City
    And User wait for 5 seconds
    Then User click the suggested City
    Then User click Simpan Perubahan

  @Positive @EditKodepos
  Scenario: Edit User kodepos in Profile
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click Data Pribadi
    When User Input Pin Number
    And User wait for 10 seconds
    When User click Ubah data personal
    When User input kodepos
    Then User click Simpan Perubahan

  @Positive @InputKodePromo
  Scenario: User input kode promo in Profile
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click kode promo
    When User input kode promo
    When User click verifikasi kode promo
    When User click Gunakan Voucher
    Then successfully use voucher kode promo

  @Negative @InputInvalidKodePormo
  Scenario: User input invalid kode promo in Profile
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click kode promo
    When User input invalid kode promo
    When User click verifikasi kode promo
    Then Voucher tidak ditemukan is Displayed

  @Positive @InputAlreadyKodePromo
  Scenario: User input already used kode promo in Profile
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click kode promo
    When User input kode promo already used
    When User click verifikasi kode promo
    Then Voucher sudah digunakan is Displayed

  @Positive @UserSeeVoucherSaya
  Scenario: User see voucher in Voucher Saya
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click voucher saya
    Then User see a or some vouchers

  @Positive @VoucherInVoucherSaya
  Scenario: User does not have voucher in Voucher Saya
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert correct phone number
    When User input correct OTP
    When User click button profile
    When User click voucher saya
    Then belum ada voucher is displayed

  @Positive @KamusInvestasi
  Scenario: User search saham in Kamus Investasi
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click kamus investasi
    When User input saham in search bar
    Then show result article contain saham

  @Positive @Logout
  Scenario: User try to logout
    Given User is on bibit screen
    When User click button login
    When User wait for 2 seconds
    When User insert phone number "085156242296"
    When User input correct OTP
    When User click button profile
    When User click logout
    Then Successfully logout