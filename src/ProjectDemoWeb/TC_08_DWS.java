package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_08_DWS extends BaseClass{

    @Test
    public void ToMailGiftCard(){
        driver.findElement(By.partialLinkText("Electronics")).click();
        Reporter.log("Electronucs page got opened",true);

        driver.findElement(By.partialLinkText("Camera, photo")).click();
        Reporter.log("Camera page is displayed",true);

        WebElement mbl = driver.findElement(By.id("products-viewmode"));
        Select listviewMbl=new Select(mbl);
        listviewMbl.selectByVisibleText("List");
        Reporter.log("View is in List Style",true);
        WebElement product1 = driver.findElement(By.id("products-orderby"));

        Select postionCamera =new Select(product1);
        postionCamera.selectByVisibleText("Created on");

        driver.findElement(By.partialLinkText("Under")).click();
        WebElement camera = driver.findElement(By.partialLinkText("1MP 60GB Hard Drive Handycam Camcorder"));
        camera.click();
        Reporter.log("Camera is added",true);

        WebElement email = driver.findElement(By.xpath("//input[@value='Email a friend']"));
        Actions actions=new Actions(driver);
        actions.click(email).perform();

        driver.findElement(By.id("FriendEmail")).sendKeys("abc@gmail.com");
//        WebElement mymail = driver.findElement(By.id("YourEmailAddress"));
//        WebElement error = driver.findElement(By.xpath("//span[@for='YourEmailAddress']"));


        driver.findElement(By.id("PersonalMessage")).sendKeys("This is for u");
        driver.findElement(By.name("send-email")).click();
        Reporter.log("Email Sent To Friend",true);
    }
}
