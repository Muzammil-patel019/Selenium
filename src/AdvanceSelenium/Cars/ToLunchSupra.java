package AdvanceSelenium.Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchSupra {

    @Test(groups = "system")
    public void LunchSupra(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.toyota.com/grsupra/");
        Reporter.log("Supra got executed");
        driver.quit();
    }
}
