package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ToLearnProperties {
    public static void main(String[] args) throws IOException {

        //Step 1 Create Url of FileInputStream
        FileInputStream fis=new FileInputStream("./TestData/testdata.properties");


        //Step 2 Create  Obj of FileType
        Properties prop=new Properties();

        //Step 3 Call Function
        prop.load(fis);

        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        //Automation Script
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get(url);

        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);





    }
}
