package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_09_DWS extends BaseClass {

    @Test
    public void AddingProductToCompareList(){

        driver.findElement(By.partialLinkText("Books")).click();
        Reporter.log("Books Page got open",true);
        WebElement comp1 = driver.findElement(By.partialLinkText("Computing and Internet"));
                comp1.click();

        Reporter.log("Computing and Internet got open",true);
        driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
        Reporter.log("Book is added to compare list",true);

        driver.findElement(By.partialLinkText("Books")).click();
        Reporter.log("Books Page got open",true);
        WebElement comp2 = driver.findElement(By.partialLinkText("Copy of Computing and Internet EX"));
        comp2.click();
        Reporter.log("Copy of Computing and Internet EX got open",true);
        driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
        Reporter.log("Book is added to compare list",true);





    }
}
