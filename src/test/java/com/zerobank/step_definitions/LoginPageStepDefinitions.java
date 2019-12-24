package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("user is already on login page")
    public void user_is_already_on_login_page() {
        loginPage.signin();
    }

    @When("user enters {string} and {string} and clicks Sign in button")
    public void user_enters_and_and_clicks_Sign_in_button(String string, String string2) {
        loginPage.login(string,string2);
    }

    @Then("user should be on Account Summary page")
    public void user_should_be_on_Account_Summary_page() {
        Assert.assertTrue("Title not matched", loginPage.verifyAccountSummary());
    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        Assert.assertTrue(loginPage.verifyTroubleMessageDisplayed());
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Assert.assertTrue(loginPage.verifyErrorMessageDisplayed());

    }
}
