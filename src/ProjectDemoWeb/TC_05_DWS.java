package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import zmq.socket.reqrep.Rep;

public class TC_05_DWS extends BaseClass {

    @Test
    public void ToSearchCamera(){
        driver.findElement(By.partialLinkText("Electronics")).click();

        driver.findElement(By.partialLinkText("Camera, photo")).click();

        WebElement mbl = driver.findElement(By.id("products-viewmode"));
        Select listviewMbl=new Select(mbl);
        listviewMbl.selectByVisibleText("List");
        WebElement product1 = driver.findElement(By.id("products-orderby"));

        Select postionCamera =new Select(product1);
        postionCamera.selectByVisibleText("Created on");

        driver.findElement(By.partialLinkText("Under")).click();
        WebElement camera = driver.findElement(By.partialLinkText("1MP 60GB Hard Drive Handycam Camcorder"));
        camera.click();
        Reporter.log("Camera Page is Visible and Executed",true);
    }
}
