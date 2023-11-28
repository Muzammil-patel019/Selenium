package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ToOrderHat {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(2000);

//        driver.findElement(By.linkText("Log in")).click();
//        Thread.sleep(200);
//
//        driver.findElement(By.id("Email")).sendKeys("muzammilp116@gmail.com");
//        Thread.sleep(1000);
//        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
//        Thread.sleep(1000);
//
//        driver.findElement(By.id("RememberMe")).click();
//        driver.findElement(By.cssSelector("input[value='Log in']")).click();

        JavascriptExecutor js= (JavascriptExecutor) driver;

        driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
        WebElement view = driver.findElement(By.id("products-viewmode"));
        Select listviewMbl=new Select(view);
        listviewMbl.selectByVisibleText("List");

        WebElement display = driver.findElement(By.id("products-pagesize"));
        Select displayView=new Select(display);
        displayView.selectByVisibleText("12");

        for (;;){
            try {
                driver.findElement(By.partialLinkText("Wool Hat")).click();
                break;
            }catch (Exception e){
                js.executeScript("window.scrollBy(0,500)");

            }
        }

    }
}
