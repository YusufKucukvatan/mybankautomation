Feature: Find Transactions in Account Activity
  @findTransactions
  Scenario:	Search date range
    Given user is already on Find Transactions tab
    When user enters date range from "2012-09-01" to "2012-09-06" and clicks find button
    Then results table should only show transactions between “2012-09-01” and "2012-09-06"
    And results should be sorted by most recent date
    When user enters date range from "2012-09-02" to "2012-09-06" and clicks find button
    Then results table should only show transactions between "2012-09-02" and "2012-09-06"
    And results table should not contain transactions dated "2012-09-01"