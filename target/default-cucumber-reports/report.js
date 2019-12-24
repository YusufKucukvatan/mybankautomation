$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Account Activity transaction table columns verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@accountActivity4"
    }
  ]
});
formatter.step({
  "name": "user is already on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDefinitions.user_is_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"username\" and \"password\" and clicks Sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDefinitions.user_enters_and_and_clicks_Sign_in_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Account Activity\" tab",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinitions.userClicksOnTab(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "transaction table columns should be following items",
  "rows": [
    {
      "cells": [
        "Date",
        "Description",
        "Deposit",
        "Withdrawal"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivityPageStepDefinitions.transactionTableColumnsShouldBeFollowingItems(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinitions.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});