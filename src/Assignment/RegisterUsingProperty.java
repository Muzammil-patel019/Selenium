package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class RegisterUsingProperty {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("./TestData/DemoRegi.properties");

        Properties prop=new Properties();

        prop.load(fis);

        String url = prop.getProperty("url");

        String firstName = prop.getProperty("firstName");
        String lastName = prop.getProperty("lastName");
        String email = prop.getProperty("email");
        String password = prop.getProperty("password");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get(url);

        driver.findElement(By.linkText("Register")).click();


        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
//        driver.findElement(By.id("register-button")).click();

    }
}
