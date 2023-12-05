package AdvanceSelenium.Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchPorsche {
    @Test(groups = "system")
    public void LunchPorsche() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.porsche.com/middle-east/_india_/");
        Reporter.log("Porsche got executed",true);
        driver.quit();
    }
}
