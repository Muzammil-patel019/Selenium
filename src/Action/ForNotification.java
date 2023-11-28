package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ForNotification {

    public static void main(String[] args) {
        ChromeOptions settings =new ChromeOptions();
        //settings.addArguments("--disable-notifications");
        settings.addArguments("--incognito");

        WebDriver driver=new ChromeDriver(settings);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.yatra.com/");
    }
}
