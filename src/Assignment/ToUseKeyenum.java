package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseKeyenum {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
//        EdgeDriver driver =new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);
    }
}
