package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



//        driver.findElement(By.id("loginusername")).sendKeys("admin");
       // driver.findElement(By.id("loginpassword")).sendKeys("admin");

        String username="admin";
        String pas="admin";

        String URL ="https://"+username+":"+pas+"@"+"www.demoblaze.com";
        driver.get(URL);
        driver.findElement(By.id("login2")).click();
//    driver.switchTo().alert().sendKeys("admin");
    }
}
