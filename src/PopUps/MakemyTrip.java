package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MakemyTrip {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.makemytrip.com/");
        Actions actions=new Actions(driver);
        actions.click().perform();
//        actions.moveByOffset(1784,163).perform();
        driver.findElement(By.xpath("//span[text()='Departure']")).click();

        for (;;) {
            try {
                driver.findElement(By.xpath("//div[text()='February 2024']/../..//p[text()='25']")).click();
                break;
            } catch (Exception e) {
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

            }


        }




//
    }
}
