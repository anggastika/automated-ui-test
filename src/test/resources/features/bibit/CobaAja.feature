@Android @CobaAja @Test

  Feature: Coba aja

    @Positive @CobainAja
    Scenario: User know total he or she get in 25 years investment
      Given User is on bibit screen
      When User click coba aja dulu
      When User answer all the questions in the register page
      When User click simulasikan rekomendasi robo
      When User input investasi awal
      When User input investasi bulanan
      Then check perkiraan Nilai Investasi
