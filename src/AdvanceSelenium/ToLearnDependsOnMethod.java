package AdvanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethod {

    @Test
    public void createAccount() {
        Reporter.log("Account created Successfully");
    }
    @Test(dependsOnMethods = "createAccount")
    public void editAccount() {
        Reporter.log("Account edited Successfully");
    }
    @Test(dependsOnMethods = "editAccount")
    public void deleteAccount(){
        Reporter.log("Account deleted Successfully");
    }
}
