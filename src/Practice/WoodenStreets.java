package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class WoodenStreets {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.woodenstreet.com/");

        driver.findElement(By.id("loginclose1")).click();

        driver.findElement(By.linkText("Profile")).click();
        driver.findElement(By.linkText("My Profile")).click();
        Actions action=new Actions(driver);
        Thread.sleep(6000);
        WebElement login = driver.findElement(By.id("login_submit_btn"));

        login.click();

//        action.moveToElement(login,1130,430).perform();
    }
}
