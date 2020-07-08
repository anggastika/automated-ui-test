@Android @ProfileSubMenu

  Feature: Profile SubMenu
    Scenario: User open FAQ in Profile
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button profile
      When User click FAQ

    Scenario: User open Store in Profile
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button profile
      When User click Store

    Scenario: User open Rate Bibit in Profile and give rate bibit keren
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button profile
      When User click Rate bibit
      When User click bibit keren
      When User click berikan saran

    Scenario: User open Rate Bibit in Profile and give rate kurang oke
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button profile
      When User click Rate bibit
      When User click kurang oke
      When User click berikan saran

    Scenario: User open komunitas in profile
      Given User is on bibit screen
      When User click button login
      When User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button profile
      When User click Komunitas