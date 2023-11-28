package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortBooks {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Books")).click();;

        WebElement books = driver.findElement(By.name("products-orderby"));
        WebElement page = driver.findElement(By.name("products-pagesize"));

        Select book1=new Select(books);
        Select page1=new Select(page);

        book1.selectByVisibleText("Price: High to Low");
        Thread.sleep(1000);
        page1.selectByIndex(2);

    }
}
