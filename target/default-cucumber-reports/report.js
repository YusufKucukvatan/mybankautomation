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
  "name": "User should not be able to login with blank credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@wip"
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
  "name": "user enters \"\" and \"\" and clicks Sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDefinitions.user_enters_and_and_clicks_Sign_in_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefinitions.user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinitions.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});