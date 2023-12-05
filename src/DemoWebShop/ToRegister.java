package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ToRegister {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/fiction");


        driver.findElement(By.linkText("Register")).click();


        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Muzammil");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.id("Email")).sendKeys("muzammilp11@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Muzammil@123");
        driver.findElement(By.id("register-button")).click();
    }
}
