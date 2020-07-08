@Android @TipsUntukKamu @Test

  Feature: Tips Untuk Kamu

    Scenario:Choose one of the tips untuk kamu
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number that have portofolio
      When User input correct OTP
      When User click one of the tips untuk in the main page
      Then User see the article regarding the tips

    Scenario:Show all the list of tips untuk kamu
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number that have portofolio
      When User input correct OTP
      When User click see all in the tips untuk kamu component
      Then User see list of tips untuk kamu

    Scenario:Choose one of the tips untuk kamu from Education category
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number that have portofolio
      When User input correct OTP
      When User click see all in the tips untuk kamu component
      When User click education category
      When User see list of tips untuk kamu categoried as education
      When User click one of the tips untuk kamu in the education category
      Then User see the article regarding the tips