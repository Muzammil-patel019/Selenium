package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebLogin {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(200);

        driver.findElement(By.id("Email")).sendKeys("muzammilp116@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.cssSelector("input[value='Log in']")).click();



    }
}
