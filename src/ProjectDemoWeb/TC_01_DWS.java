package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01_DWS extends BaseClass{

    @Test
    public void ToCheckBookPage(){
        driver.findElement(By.partialLinkText("Books")).click();
        Reporter.log("Books Page Got Opened SucessFully",true);

    }
}
