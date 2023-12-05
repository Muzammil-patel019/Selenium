package AdvanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.*;

public class ConfigurationAnnotaion {

    @BeforeSuite
    public void beforeSuit(){
        Reporter.log("Before Suit Got Executed",true);
    }
    @AfterSuite
    public void afterSuit(){
        Reporter.log("After Suit Got Executed",true);
    }
    @BeforeTest
    public void beforeTest(){
        Reporter.log("Before Test Got Executed",true);
    }
    @AfterTest
    public void afterTest(){
        Reporter.log("After Test Got Executed",true);
    }

    @Test
    public void Test(){
        Reporter.log("Test Case Got Executed",true);
    }



    @BeforeClass
    public void beforeClass(){
        Reporter.log("Before Class Got Executed",true);
    }
    @AfterClass
    public void afterClass(){
        Reporter.log("After Suit Got Executed",true);
    }
    @BeforeMethod
    public void beforeMethod(){
        Reporter.log("Before Method Got Executed",true);
    }
    @AfterMethod
    public void afterMethod(){
        Reporter.log("After Method Got Executed",true);
    }



}
