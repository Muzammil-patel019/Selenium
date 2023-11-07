package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegister {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(200);

        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Muzammil");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.id("Email")).sendKeys("muzammilp11@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Muzammil@123");
        driver.findElement(By.id("register-button")).click();

    }
}
