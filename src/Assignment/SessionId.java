package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class SessionId {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cornerhouseicecreams.com/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
    }
}
