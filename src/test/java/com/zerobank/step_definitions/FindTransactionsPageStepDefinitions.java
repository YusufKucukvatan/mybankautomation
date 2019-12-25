package com.zerobank.step_definitions;

import com.zerobank.pages.FindTransactionsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.text.ParseException;

public class FindTransactionsPageStepDefinitions {
        FindTransactionsPage findTransactionsPage=new FindTransactionsPage();

    @Given("user is already on Find Transactions tab")
    public void user_is_already_on_Find_Transactions_tab() {
        findTransactionsPage.navigateToFindTransaction();
    }

    @When("user enters date range from {string} to {string} and clicks find button")
    public void user_enters_date_range_from_to_and_clicks_find_button(String date1, String date2) throws ParseException {
        findTransactionsPage.findTransactions(date1,date2);
        Assert.assertTrue(findTransactionsPage.verifyTransactionDates());
    }

//    @Then("results table should only show transactions between “{int}{int}{int}” and {string}")
//    public void results_table_should_only_show_transactions_between_and(Integer int1, Integer int2, Integer int3, String string) {
//
//    }
//
//    @Then("results should be sorted by most recent date")
//    public void results_should_be_sorted_by_most_recent_date() {
//
//    }
//
//    @Then("results table should only show transactions between {string} and {string}")
//    public void results_table_should_only_show_transactions_between_and(String string, String string2) {
//
//    }
//
//    @Then("results table should not contain transactions dated {string}")
//    public void results_table_should_not_contain_transactions_dated(String string) {
//
//    }
}
