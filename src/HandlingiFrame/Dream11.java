package HandlingiFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dream11 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.dream11.com/");
//        Thread.sleep(2000);

        //using id
        //driver.switchTo().frame("send-sms-iframe");

        //using Index

       // driver.switchTo().frame(0);

        //using webelement
        WebElement dream11 = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
        driver.switchTo().frame(dream11);
        driver.findElement(By.id("regEmail")).sendKeys("7894561230");
        //using Parent
        driver.switchTo().parentFrame();

        //using Default conent
        driver.switchTo().defaultContent();
        driver.findElement(By.partialLinkText("About Us")).click();
    }
}
