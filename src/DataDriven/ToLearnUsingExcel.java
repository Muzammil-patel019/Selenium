package DataDriven;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class ToLearnUsingExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("./TestData/TestData.xlsx");

        Workbook workbook= WorkbookFactory.create(fis);

        String username = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
        String password = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);


    }
}
