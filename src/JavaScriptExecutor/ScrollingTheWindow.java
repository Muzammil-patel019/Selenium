package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingTheWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.google.co.in/");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        driver.findElement(By.name("q")).sendKeys("Flowers", Keys.ENTER);
        driver.findElement(By.linkText("Images")).click();

        for (;;){
            try {
                driver.findElement(By.xpath("//div[text()='How to Make Paper Flowers']")).click();
                break;

            }catch (Exception e){
                js.executeScript("window.scrollBy(0,500)");


            }
        }



    }
}
