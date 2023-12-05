package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_02_DWS extends BaseClass{


        @Test
        public void ToCheckComputerPage(){
            driver.findElement(By.partialLinkText("Computers")).click();
            Reporter.log("Computers Page Got Opened SucessFully",true);

        }
    }

