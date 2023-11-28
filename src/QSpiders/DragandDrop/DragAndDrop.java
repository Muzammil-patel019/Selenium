package QSpiders.DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");

        WebElement mblCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
        WebElement mblCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));

        WebElement mblAccess = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));

        Actions action =new Actions(driver);
        action.dragAndDrop(mblCharger,mblAccess).perform();
        action.dragAndDrop(mblCover,mblAccess).perform();


    }
}
