@Android @UbahResikoPortofolio @Test
  Feature: Ubah Resiko Portofolio

    Scenario: Change User Resiko portofolio to Portfolio Konservatif
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click Ubah in the portofolio component at the main page
      When User wait for 10 seconds
      When User click the decrease button until portofolio show portofolio konservatif
      Then display portofolio changed to konservatif

     # Buat simpan hasil dari pergantiannya
     # And User click simpan hasil


    Scenario: Change User Resiko portofolio to Portofolio Moderat
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click Ubah in the portofolio component at the main page
      When User wait for 10 seconds
      When User click the decrease button until portofolio show portofolio moderat
      Then display portofolio changed to moderat
