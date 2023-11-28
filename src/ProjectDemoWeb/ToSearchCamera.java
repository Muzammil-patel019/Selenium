package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ToSearchCamera {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(200);

        driver.findElement(By.id("Email")).sendKeys("muzammilp116@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
        Thread.sleep(1000);

        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.cssSelector("input[value='Log in']")).click();

        driver.findElement(By.partialLinkText("Electronics")).click();

        driver.findElement(By.partialLinkText("Camera, photo")).click();

        WebElement mbl = driver.findElement(By.id("products-viewmode"));
        Select listviewMbl=new Select(mbl);
        listviewMbl.selectByVisibleText("List");
        WebElement product1 = driver.findElement(By.id("products-orderby"));

        Select postionCamera =new Select(product1);
        postionCamera.selectByVisibleText("Created on");

        driver.findElement(By.partialLinkText("Under")).click();
        WebElement camera = driver.findElement(By.partialLinkText("1MP 60GB Hard Drive Handycam Camcorder"));
        camera.click();

        WebElement email = driver.findElement(By.xpath("//input[@value='Email a friend']"));
        Actions actions=new Actions(driver);
        actions.click(email).perform();

        driver.findElement(By.id("FriendEmail")).sendKeys("abc@gmail.com");
//        WebElement mymail = driver.findElement(By.id("YourEmailAddress"));
//        WebElement error = driver.findElement(By.xpath("//span[@for='YourEmailAddress']"));


        driver.findElement(By.id("PersonalMessage")).sendKeys("This is for u");
        driver.findElement(By.name("send-email")).click();

        driver.findElement(By.partialLinkText("Log out")).click();
    }
}
