package Basic;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        System.out.println(driver.manage().getCookies());
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        Point size = driver.manage().window().getPosition();
    }
}
