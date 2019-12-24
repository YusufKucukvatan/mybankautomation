package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends PageBase{
    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    LoginPage loginPage=new LoginPage();

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> subTitles;

    public String returnTitle(){
        String actualTitle=Driver.get().getTitle();
        return actualTitle;
    }

    public List<String> returnSubTitles(){
        List<String> dashboardTitles=new ArrayList<>();

        for (WebElement e : subTitles) {
            dashboardTitles.add(e.getText());
        }
        return dashboardTitles;
    }
}
