package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrl {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/fiction");
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
    }
}