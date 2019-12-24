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

    @When("user enters valid credentials and click Sign in button")
    public void user_enters_valid_credentials_and_click_Sign_in_button() {
        loginPage.login();
    }

    @Then("user should be on Account Summary page")
    public void user_should_be_on_Account_Summary_page() {
        Assert.assertTrue("Title not matched", loginPage.verifyAccountSummary());
    }

}
