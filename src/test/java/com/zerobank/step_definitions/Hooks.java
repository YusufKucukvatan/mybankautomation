package com.zerobank.step_definitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("This is before method...");
    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}
