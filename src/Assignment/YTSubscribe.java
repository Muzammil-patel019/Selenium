package Assignment;

import com.google.common.eventbus.Subscribe;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class YTSubscribe {
    public static void main(String[] args)
        throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
            driver.manage().window().maximize();


            driver.get("https://www.youtube.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Mr Beast");
            driver.findElement(By.id("search-icon-legacy")).click();
            Thread.sleep(2000);
        String Subscribe = driver.findElement(By.id("video-count")).getText();
        System.out.println(Subscribe);

        driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'MrBeast') and @id='text']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='text' and text()='Subscribe']")).click();
        Thread.sleep(2000);
    }
}
