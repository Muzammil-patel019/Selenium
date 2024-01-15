package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class AmazonPhone {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.in/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
        searchBox.sendKeys("mobile", Keys.ENTER);

        driver.findElement(By.xpath("//span[text()='Neo 7 Pro 5G (Dark Storm, 8Gb Ram, 128Gb Storage) | Snapdragon 8+ Gen 1 | Independent Gaming Chip | Flagship 50Mp Ois Camera | Ag Glass Design, Orange']")).click();

        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows)
        {
            driver.switchTo().window(windowHandle);
        }
       


        TakesScreenshot ts= (TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File src=new File("./ErrorShot/amazoo0n1.jpeg");

        FileHandler.copy(temp,src);

    }
}
