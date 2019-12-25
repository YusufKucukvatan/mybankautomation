package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FindTransactionsPage  extends PageBase{
    public FindTransactionsPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    LoginPage loginPage=new LoginPage();

    @FindBy(xpath = "//a[text()='Find Transactions']")
    public WebElement findTransactionsTab;

    @FindBy(id="aa_description")
    public WebElement description;

    @FindBy(id="aa_fromDate")
    public WebElement fromDate;

    @FindBy(id="aa_toDate")
    public WebElement toDate;

    @FindBy(id="aa_fromAmount")
    public WebElement fromAmount;

    @FindBy(id="aa_toAmount")
    public WebElement toAmount;

    @FindBy(id="aa_type")
    public WebElement type;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement findButton;

    @FindBy(xpath = "//div[contains(@id,'filtered')]/table/tbody/tr")
    public List<WebElement> dates;

    public void navigateToFindTransaction(){
        loginPage.openUrl();
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        navigateTo("Account Activity");
        findTransactionsTab.click();
    }
    public void findTransactions(String date1, String date2){
        fromDate.sendKeys(date1);
        toDate.sendKeys(date2);
        findButton.click();
    }
    public boolean verifyTransactionDates() throws ParseException {
        boolean flag=true;
        int rowNum= dates.size();
        List<String> transactionDates=new ArrayList<>();
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
        List<Date> d=new ArrayList<>();
        for (int i=0; i<rowNum; i++){
            transactionDates.add(Driver.get().findElement(By.xpath("//div[contains(@id,'filtered')]/table/tbody/tr["+(i+1)+"]/td[1]")).getText());
            d.add(date.parse(transactionDates.get(i)));
        }

        Date dateFirst=date.parse("2012-08-31");
        Date dateLast=date.parse("2012-09-07");
        for (int i = 0; i < d.size(); i++) {
            if(!(d.get(i).after(dateFirst) && d.get(i).before(dateLast))){
                System.out.println(d.get(i));
                flag=false;
                break;
            }
        }

        for (int i=0; i<d.size()-1; i++){
            for (int j = i+1; j < d.size(); j++) {
                if(d.get(i).compareTo(d.get(j))<0){
                    flag=false;
                    System.out.println(d.get(i)+" is not more recent than "+d.get(j));
                    break;
                }
            }
        }
        return flag;

    }

}
