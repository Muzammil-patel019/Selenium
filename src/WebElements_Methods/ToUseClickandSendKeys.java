package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClickandSendKeys {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        String Title = driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
        Thread.sleep(2000);
        System.out.println(Title);
        //driver.quit();

    }
}
