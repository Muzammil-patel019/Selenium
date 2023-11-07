package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUSeGetSize {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        Thread.sleep(5000);
        Dimension size = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
        System.out.println(size);


        System.out.println(size.getHeight());
        System.out.println(size.getWidth());

    }
}
