package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColorFromDemoWeb {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();


        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(200);
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
        WebElement msg = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]"));
        System.out.println(msg.getCssValue("color"));
    }
}
