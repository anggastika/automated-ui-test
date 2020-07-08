@Android @AktifasiAtProfile

  Feature: Aktifasi


    Scenario: Aktifasi Preferensi Syariah
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button profile
      When User click aktifasi preferensi syariah
      When User click aktifasi preferensi syariah

    Scenario: Aktifasi Pin Login
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button profile
      When User click aktifasi pin login
      When User click aktifasi pin login

      #DI SENGAJA 2 KALI AGAR PIN LOGINNYA dll TIDAK AKTIF, KALAU AKTIF BISA BUAT TESTING LAIN GAGAL
      #Hold dulu check login pakai pinnya soalnya bisa bermasalah ke semua

    Scenario: Aktifasi Sembunyikan nominal
      Given User is on bibit screen
      When User click button login
      And User wait for 5 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button profile
      When User click aktifasi Sembunyikan nominal
      When User click home
      When User see displayed had hidden nominal
      #BALIK LAGI BIAR MATIIN AKTIFASINYA
      When User click button profile
      When User click aktifasi Sembunyikan nominal