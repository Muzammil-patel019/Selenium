package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPlayMusic {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Justin Bieber - Baby ft. Ludacris");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Justin Bieber - Baby ft. Ludacris')]")).click();
    }
}
