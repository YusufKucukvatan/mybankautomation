$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Account Summary",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Account summary page account types",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@accountSummary2"
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
  "name": "following account types should be displayed",
  "rows": [
    {
      "cells": [
        "Cash Accounts",
        "Investment Accounts",
        "Credit Accounts",
        "Loan Accounts"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummaryPageStepDefinitions.following_account_types_should_be_displayed(String\u003e)"
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