package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {

    @Test
    public void crickbuzz(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cricbuzz.com/");
        Reporter.log("Cricbuzz got executed",true);
        driver.quit();
    }

    @Test(enabled = false)
    public void baskinRobbins(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://baskinrobbinsindia.com/");
        Reporter.log("baskinRobbins got Executed",true);
        driver.quit();
    }

    @Test(invocationCount = 1,threadPoolSize = 1,priority = 1)
    public  void amazon(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Reporter.log("Amazon got Executed",true);
        driver.quit();
    }
}
