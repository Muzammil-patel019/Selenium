package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRayVeri {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoapp.skillrary.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("LOGIN")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("admin");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("admin");
        Thread.sleep(1000);
        driver.findElement(By.id("last")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='users.php']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("muzammilp714@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='#activate']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();


    }
}
