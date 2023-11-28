package JavaScriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollIntoView {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        WebElement indiaFlag = driver.findElement(By.xpath("//td[text()='India']"));
        js.executeScript("arguments[0].scrollIntoView(false)",indiaFlag);

    }
}
