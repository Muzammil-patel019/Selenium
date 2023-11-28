package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHold {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions settings =new ChromeOptions();
        //settings.addArguments("--disable-notifications");
        settings.addArguments("--incognito");
        WebDriver driver=new ChromeDriver(settings);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
        driver.findElement(By.id("password")).sendKeys("987654321");
        WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
        Actions action=new Actions(driver);
        action.clickAndHold(eyeIcon).perform();
        Thread.sleep(3000);
        action.release(eyeIcon).perform();
    }
}
