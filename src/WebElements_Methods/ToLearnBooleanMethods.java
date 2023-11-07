package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        Thread.sleep(5000);
        System.out.println("======================================================================");
        System.out.println("Before Entering the data");
        WebElement LoginButton = driver.findElement(By.xpath("//button[.='Log in']"));
        System.out.println(LoginButton.isDisplayed());
        System.out.println(LoginButton.isEnabled());
        System.out.println("======================================================================");
        System.out.println("After Entering the data");
        driver.findElement(By.name("username")).sendKeys("789456123");
        driver.findElement(By.name("password")).sendKeys("123456789");
        System.out.println(LoginButton.isDisplayed());
        System.out.println(LoginButton.isEnabled());
        System.out.println("======================================================================");
    }
}
