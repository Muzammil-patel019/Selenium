package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;



public class Navigate {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();

//        System.out.println(driver.getPageSource());
        driver.navigate().to("https://demo.actitime.com/tasks/tasklist.do");
        //System.out.println(driver.getWindowHandle());
//  //  driver.findElement(By.tagName("img"));
//        Select select = new Select(driver.findElement(By.className("name")));


        Select objSelect = new Select(driver.findElement(By.className("checkbox")));
        objSelect.selectByValue("Modelling");

    }

}
