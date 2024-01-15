package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginToFBusingDP {

    @DataProvider(name="cred")
        public String[][] ToSendData(){

        String [][] data={
                {"sadik@gmail.com","sadiq@123"},
                {"muzzu@gmail.com","Muzzu@123"},
                {"pavan@gmail.com","pavan@123"}
        };
        return data;



    }

    @Test(dataProvider = "cred")
    public void ToLogin(String email,String password)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}
