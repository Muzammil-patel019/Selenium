package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {
    WebDriver driver;
    @BeforeClass
    public void ToLunchBrowser()
    {
        driver=new ChromeDriver();
        Reporter.log("Browser got Open",true);
        driver.manage().window().maximize();
        Reporter.log("Window got Maximize",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @BeforeMethod
    public  void ToPerformLogin(){

        driver.get("https://demowebshop.tricentis.com/");
        Reporter.log("Navigate to Welcome Page",true);
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("muzammilp116@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
        Reporter.log("Navigate to Home Page",true);
    }

    @AfterMethod
    public void ToPerformLogout(){
        driver.findElement(By.partialLinkText("Log out")).click();
        Reporter.log("Logged Out Successfully",true);
    }

    @AfterClass
    public void ToCloseBrowser(){
        Reporter.log("Browser Got Closed",true);
        driver.quit();
    }

}