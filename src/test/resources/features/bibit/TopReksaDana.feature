@Android @TopReksaDana

  Feature: Top Reksadana

    @Positive @TopReksaDanaList
    Scenario: See Top Reksadana list
      Given User is on bibit screen
      When User click Top Reksadana
      Then Sucessfully display Top Reksadana according to API results

    @TopReksaDanaDetails
    Scenario Outline: See Top Reksadana details
      Given User is on bibit screen
      When User click Top Reksadana
      And User check details of Reksadana #<position>
      Then Sucessfully display name according to API results
      And Sucessfully display reksa value according to API results
      And Sucessfully display summary according to API results
      And Sucessfully display portfolio according to API results
#    And Sucessfully display simulasi according to API results
      And Sucessfully display alokasi aset according to API results
      And Sucessfully display top holdings according to API results
      And Sucessfully display prospektus according to API results
#      And Sucessfully display fund fact sheet according to API results
      Examples:
        | position |
        | 1        |
        | 2        |
        | 3        |
        | 4        |
        | 5        |


#      When User click desired reksa dana (Avrist Ada Kas Mutiara)
#      When Compare API product with the UI
#      When User click button beli
#      When User insert phone number that have portofolio
#      When User input correct OTP

