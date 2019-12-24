package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage extends PageBase{
    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement dropdownDefault;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public List<WebElement> dropdownitems;

    @FindBy(xpath = "//div/table/thead/tr/th")
    public List<WebElement> transactionTableColumns;

    public String dropdownDefaultVerification(){
        Select s=new Select(dropdownDefault);
        String value=s.getFirstSelectedOption().getText();
        return value;
    }

    public List<String> dropdownOptions(){
        List<String> actualOptions=new ArrayList<>();
        for (WebElement e : dropdownitems) {
            actualOptions.add(e.getText());
        }
        return actualOptions;
    }
    public List<String> transactiontableColumnsVerification(){
        List<String> columns=new ArrayList<>();
        for (WebElement e : transactionTableColumns) {
            columns.add(e.getText());
        }
        return columns;
    }
}
