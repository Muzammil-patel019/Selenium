package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookSignupWithoutSelect {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/r.php");

        driver.findElement(By.xpath("//select[@id='day']")).click();
        driver.findElement(By.xpath("//option[@value='20']")).click();

        driver.findElement(By.xpath("//select[@id='month']")).click();
        driver.findElement(By.xpath("//option[@value='11']")).click();

        driver.findElement(By.xpath("//select[@id='year']")).click();
        driver.findElement(By.xpath("//option[@value='1999']")).click();



    }
}
