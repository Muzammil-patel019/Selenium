package ProjectDemoWeb;

import org.openqa.selenium.By;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_04_DWS extends BaseClass{

    @Test
    public void ToClickOnGiftCard(){


        driver.findElement(By.partialLinkText("Gift Cards")).click();
        driver.findElement(By.partialLinkText("$100 Physical Gift Card")).click();
        Reporter.log("Gift card is displayed",true);



    }
}
