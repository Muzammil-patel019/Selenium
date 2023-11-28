package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class OrangeHrm {
    public static void main(String[] args) {
        ChromeOptions settings = new ChromeOptions();

        settings.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(settings);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();

        driver.findElement(By.linkText("Admin")).click();

        WebElement drpdown = driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
        drpdown.click();
        
//        WebElement drpdown1 = driver.findElement(By.xpath("//div[@class='oxd-select-text-input' and @tabindex='0' and text()='Admin']"));

//
//        Actions actions=new Actions(driver);
//        actions.moveToElement(drpdown1).perform();

//        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
//        driver.findElement(By.linkText("Logout")).click();


    }
}