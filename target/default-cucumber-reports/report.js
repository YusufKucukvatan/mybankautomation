$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Only authorized users should be able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDefinitions.user_is_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid credentials and click Sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDefinitions.user_enters_valid_credentials_and_click_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on Account Summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefinitions.user_should_be_on_Account_Summary_page()"
});
formatter.result({
  "status": "passed"
});
});