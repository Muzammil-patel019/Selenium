package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AuthenticationPop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
     //   driver.get("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-test.html");
    }
}
