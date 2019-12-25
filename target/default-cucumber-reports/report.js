$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search date range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@findTransactions"
    }
  ]
});
formatter.step({
  "name": "user is already on Find Transactions tab",
  "keyword": "Given "
});
formatter.match({
  "location": "FindTransactionsPageStepDefinitions.user_is_already_on_Find_Transactions_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters date range from \"2012-09-01\" to \"2012-09-06\" and clicks find button",
  "keyword": "When "
});
formatter.match({
  "location": "FindTransactionsPageStepDefinitions.user_enters_date_range_from_to_and_clicks_find_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should only show transactions between “2012-09-01” and \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "results should be sorted by most recent date",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters date range from \"2012-09-02\" to \"2012-09-06\" and clicks find button",
  "keyword": "When "
});
formatter.match({
  "location": "FindTransactionsPageStepDefinitions.user_enters_date_range_from_to_and_clicks_find_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "results table should only show transactions between \"2012-09-02\" and \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "results table should not contain transactions dated \"2012-09-01\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});