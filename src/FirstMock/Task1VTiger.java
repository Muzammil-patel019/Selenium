package FirstMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Task1VTiger {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.vtiger.com/all-in-one-crm/");

        WebElement resources = driver.findElement(By.partialLinkText("Resources"));

        Actions actions=new Actions(driver);
        actions.moveToElement(resources).perform();

        driver.findElement(By.linkText("Contact Us")).click();
        String bengaluru = driver.findElement(By.xpath("//div[@class='text-reset text-decoration-none']/following::p")).getText();
        String phone = driver.findElement(By.xpath("//div[@class='text-reset text-decoration-none']/following::p/following::p")).getText();
        System.out.println(bengaluru);
        System.out.println(phone);



    }
}
