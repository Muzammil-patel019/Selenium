package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class PerformMouseHover {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.woodenstreet.com/");
        driver.findElement(By.id("loginclose1")).click();

        WebElement sofas = driver.findElement(By.partialLinkText("Sofas"));
        Actions action =new Actions(driver);
        action.moveToElement(sofas).perform();

    }
}
