package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetLocation {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        Thread.sleep(5000);
        Point loc = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
        System.out.println(loc);

        System.out.println(loc.getY());
        System.out.println(loc.getX());
    }
}
