package Assignment;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class RegisterUsingExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("./TestData/ResgistrationData.xlsx");

        Workbook workbook= WorkbookFactory.create(fis);

        String url = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
        String firstName = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
        String lastName = workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
        String email= workbook.getSheet("Sheet1").getRow(3).getCell(0).toString();
        String password= workbook.getSheet("Sheet1").getRow(4).getCell(0).toString();

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

    }
}
