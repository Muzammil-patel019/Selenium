package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ToSearchDesktop {
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
          driver.findElement(By.partialLinkText("Computers")).click();


          Actions actions=new Actions(driver);
//        WebElement desktop = driver.findElement(By.partialLinkText("Computers"));
//        actions.moveToElement(desktop).perform();
          driver.findElement(By.partialLinkText("Desktops")).click();

        WebElement product = driver.findElement(By.id("products-orderby"));

            Select postion =new Select(product);
            postion.selectByVisibleText("Created on");

          driver.findElement(By.partialLinkText("Under")).click();
        driver.findElement(By.partialLinkText("Simple Computer")).click();

        driver.findElement(By.xpath("//input[@type='radio']")).click();

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        WebElement addCart = driver.findElement(By.id("add-to-cart-button-75"));
//        actions.moveToElement(addCart).perform();
        addCart.click();





    }
}
