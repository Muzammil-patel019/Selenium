package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06_DWS extends BaseClass{
    @Test
    public void ToCheckJewelary(){
        driver.findElement(By.partialLinkText("Jewelry")).click();
        Reporter.log("Jewelary Page got executed",true);
        driver.findElement(By.partialLinkText("Create Your Own Jewelry")).click();
        Reporter.log("Create Jewelry Got opened",true);
        driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("10");
        Reporter.log("Input is given for length",true);
        driver.findElement(By.id("product_attribute_71_11_17_48")).click();
        Reporter.log("LadyBug is selected",true);


    }
}
