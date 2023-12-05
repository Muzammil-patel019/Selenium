package AdvanceSelenium.Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchBMW {
    @Test(groups = "smoke")
    public void LunchBMW() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bmw.in/en/index.html");
        Reporter.log("BMW got executed",true);
        driver.quit();
    }
}