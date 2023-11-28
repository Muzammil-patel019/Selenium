package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WoodenStreet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.woodenstreet.com/");

        for (;;) {
            try {
                driver.findElement(By.id("loginclose1")).click();
                break;
            }catch (Exception e) {
                Thread.sleep(2000);
            }
        }


        //sofas
        driver.findElement(By.linkText("Sofas")).click();
        driver.findElement(By.linkText("Sofa Sets")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Curved')]")).click();
        driver.findElement(By.id("button-cart-buy-now")).click();

        //living rooms
        driver.findElement(By.linkText("Kids Room")).click();
        driver.findElement(By.linkText("Bunk Beds")).click();
        driver.findElement(By.linkText("Douglas Bunk Bed (Walnut Finish)")).click();
        driver.findElement(By.id("button-cart-buy-now")).click();

        //lamps&lighting
        driver.findElement(By.linkText("Lamps & Lighting")).click();

        driver.findElement(By.linkText("Floor Lamps")).click();
        driver.findElement(By.linkText("Beige Wooden Floor Lamp with Shelf White Shade")).click();
        driver.findElement(By.id("button-cart-buy-now")).click();

        //Outdoor
        driver.findElement(By.linkText("Swing Chairs")).click();
        driver.findElement(By.linkText("Outdoor Lights")).click();

    }
}
