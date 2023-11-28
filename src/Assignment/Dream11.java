package Assignment;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dream11 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.dream11.com/");
//        Thread.sleep(2000);
        driver.switchTo().frame("send-sms-iframe");
        driver.findElement(By.id("regEmail")).sendKeys("7894561230");

    }
}
