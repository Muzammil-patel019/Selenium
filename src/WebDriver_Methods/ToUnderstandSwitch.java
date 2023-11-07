package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Collections;
import java.util.Set;

public class ToUnderstandSwitch {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.actitime.com/login.do");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String parentId = driver.getWindowHandle();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        driver.navigate().to("https://demo.actitime.com/tasks/tasklist.do");
        driver.findElement(By.className("checkbox inactive")).click();
        Set<String> allWindowIds = driver.getWindowHandles();
        System.out.println(allWindowIds);
        


    }
}
