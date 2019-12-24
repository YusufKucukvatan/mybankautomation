package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AccountActivityPageStepDefinitions {
    AccountActivityPage accountActivityPage=new AccountActivityPage();
    @Then("dropdown default option should be {string}")
    public void dropdown_default_option_should_be(String expectedValue) {
        String actualValue=accountActivityPage.dropdownDefaultVerification();
        Assert.assertEquals("Default value not matched", expectedValue, actualValue);
    }

    @Then("dropdown options should be following items")
    public void dropdownOptionsShouldBeFollowingItems(List<String> expectedOptions) {
        List<String> actualOptions=accountActivityPage.dropdownOptions();
        Assert.assertEquals("Options not matched", expectedOptions, actualOptions);

    }

    @Then("transaction table columns should be following items")
    public void transactionTableColumnsShouldBeFollowingItems(List<String> expectedColumns) {
        List<String> actualColumns=accountActivityPage.transactiontableColumnsVerification();
        Assert.assertEquals("Columns not matched", expectedColumns,actualColumns);
    }
}
