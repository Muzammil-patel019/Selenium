package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ToUseDoubleClick {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoapp.skillrary.com/product.php?product=selenium55");
        WebElement addButton = driver.findElement(By.id("add"));
        Actions action= new Actions(driver);
        action.doubleClick(addButton).perform();


    }
}
