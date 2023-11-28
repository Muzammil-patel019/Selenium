package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClickDisablesButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.oracle.com/java/technologies/downloads/");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        driver.findElement(By.linkText("Download jdk-8u391-linux-aarch64.rpm")).click();
        WebElement disabledBtn = driver.findElement(By.linkText("Download jdk-8u391-linux-aarch64.rpm"));
        js.executeScript("arguments[0].click()",disabledBtn);
    }
}
