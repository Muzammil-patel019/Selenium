package FirstMock;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class Task2Flipkart {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.flipkart.com/");
        Actions actions=new Actions(driver);
        actions.click().perform();

        WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
        actions.moveToElement(electronics).perform();
        driver.findElement(By.linkText("Gaming")).click();


//      actions.moveByOffset(585,548).click().perform();
        driver.findElement(By.xpath("//img[@alt='Bestor Ultra-Low Friction Gaming Mouse Mat, Anti-Slip Base, High Durability, Waterproof Mousepad' and//div[text()='Black, Red']]")).click();
//      driver.navigate().to("https://www.flipkart.com/bestor-ultra-low-friction-gaming-mouse-mat-anti-slip-base-high-durability-waterproof-mousepad/p/itm27158e5cb5daf?");

        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows)
        {
            driver.switchTo().window(windowHandle);
        }

        TakesScreenshot ts= (TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File src=new File("./ErrorShot/5.jpeg");
        FileHandler.copy(temp,src);

        String price = driver.findElement(By.xpath("//span[text()='Special price']/following::div")).getText();
        System.out.println(price);





    }
}
