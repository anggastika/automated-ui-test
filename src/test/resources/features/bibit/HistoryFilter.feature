@Android @HistoryFilter

  Feature: History Filter
    Scenario: User try to filter history to see the buying transaction past 6 month
      Given User is on bibit screen
      When User click button login
      And User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button transaksi
      When User click history tab
      When User wait for 10 seconds
      When User click  history filter button
      When User choose pembelian at transaction
      When User choose semua at status
      When User choose six months period
      When click button terapkan
      Then Display all buying transaction between past six months

    Scenario: User try to filter history to see the selling transaction past 3 months
      Given User is on bibit screen
      When User click button login
      And User wait for 2 seconds
      When User insert phone number "085156242296"
      When User input correct OTP
      When User click button transaksi
      When User click history tab
      When User wait for 10 seconds
      When User click  history filter button
      When User choose pembelian at transaction
      When User choose semua at status
      When User choose three months period
      When click button terapkan
      Then Display all buying transaction between past three months

