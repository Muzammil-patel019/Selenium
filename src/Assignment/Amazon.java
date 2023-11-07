package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/events/greatindianfestival?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMI6IaI7r-dggMVxapmAh2p-AK0EAAYASAAEgL2NvD_BwE_k_");
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
