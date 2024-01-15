package POMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC_001 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demowebshop.tricentis.com/");
        driver.navigate().refresh();
        Welcome_Page wp =new Welcome_Page(driver);
        wp.getLoginLink().click();
        Login_Page lp=new Login_Page(driver);
        lp.getEmailTextField().sendKeys("Muzammilp1162@gmail.com");
        lp.getPasswordTextField().sendKeys("Muzammil@123");
        lp.getLoginButton().click();


    }
}
