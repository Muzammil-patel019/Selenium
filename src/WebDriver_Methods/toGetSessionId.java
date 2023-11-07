package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toGetSessionId {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);
        String windowId = driver.getWindowHandle();
        System.out.println(windowId);

    }
}
