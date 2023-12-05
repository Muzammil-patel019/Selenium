package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/fiction");
        System.out.println( driver.getPageSource());
    }

}
