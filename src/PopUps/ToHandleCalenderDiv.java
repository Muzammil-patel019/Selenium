package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ToHandleCalenderDiv {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.abhibus.com/");
        driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();


      for(;;)
            try {
                WebElement month = driver.findElement(By.xpath("//span[text()='December']/../../.."));
                month.click();
                Actions actions=new Actions(driver);
                WebElement day = driver.findElement(By.xpath("//span[text()='25']"));


                actions.moveToElement(day).perform();
            }
        catch (Exception e){
                driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
        }

    }
}
