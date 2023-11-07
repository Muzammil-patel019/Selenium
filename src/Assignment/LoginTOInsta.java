package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTOInsta {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
    }
}
