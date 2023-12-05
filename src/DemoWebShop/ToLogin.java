package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ToLogin {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/fiction");


        driver.findElement(By.linkText("Log in")).click();


        driver.findElement(By.id("Email")).sendKeys("muzammilp116@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
        Thread.sleep(1000);
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
    }
}
