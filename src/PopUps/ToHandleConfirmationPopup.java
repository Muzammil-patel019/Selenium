package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ToHandleConfirmationPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://licindia.in/");
        driver.findElement(By.partialLinkText("Login")).click();
        Alert confirm = driver.switchTo().alert();
        System.out.println(confirm.getText());
        confirm.accept();

    }
}
