package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooUSeIdLocator {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("WERT@123");
        driver.findElement(By.name("login")).click();
}}
