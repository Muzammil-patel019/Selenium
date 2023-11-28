package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ToHandleChildWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.naukri.com/registration/createAccount?");
        String parentId = driver.getWindowHandle();
        Thread.sleep(3000);

        driver.findElement(By.name("google-register")).click();
        String childId = driver.getWindowHandle();
        driver.switchTo().window(childId);
        Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@type='email']")).sendKeys("72044447744");


    }
}
