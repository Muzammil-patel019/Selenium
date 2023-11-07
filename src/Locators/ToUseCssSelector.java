package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssSelector {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(20);

        driver.findElement(By.cssSelector("input[ value='Search store']")).sendKeys("Books");
        driver.close();
    }
}
