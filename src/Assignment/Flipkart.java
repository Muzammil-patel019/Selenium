package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Mobile");
    }
}
