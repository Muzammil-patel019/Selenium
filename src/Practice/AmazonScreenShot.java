package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class AmazonScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeOptions settings =new ChromeOptions();

        settings.addArguments("--incognito");
        WebDriver driver=new ChromeDriver(settings);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.in/");
        driver.findElement(By.partialLinkText("Mobiles")).click();
        WebElement laptop = driver.findElement(By.partialLinkText("Laptops & Accessories"));


        Actions actions=new Actions(driver);
        actions.moveToElement(laptop).perform();
        driver.findElement(By.partialLinkText("Dell")).click();


        Select price=new Select(driver.findElement(By.id("s-result-sort-select")));
        price.selectByVisibleText("Price: High to Low");

        Thread.sleep(2000);

        TakesScreenshot ts= (TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File src=new File("./ErrorShot/amazon1.jpeg");

        FileHandler.copy(temp,src);
        
    }
}
