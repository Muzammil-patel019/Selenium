package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().fullscreen();
    }
}
