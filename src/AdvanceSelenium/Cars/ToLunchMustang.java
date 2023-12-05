package AdvanceSelenium.Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchMustang {

    @Test(groups = "system")
    public void LunchMustang(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ford.com/cars/mustang/");
        Reporter.log("Mustang got executed",true);
        driver.quit();
}}
