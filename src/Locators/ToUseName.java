package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseName {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("1234567890");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("1234567890");
    }
}
