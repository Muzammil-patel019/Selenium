package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_03_DWS extends BaseClass {


    @Test
    public void ToAddHatToCart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
        Reporter.log("Apparel & Shoes page got opened sucessfully",true);
        WebElement view = driver.findElement(By.id("products-viewmode"));
        Select listviewMbl = new Select(view);
        listviewMbl.selectByVisibleText("List");

        WebElement display = driver.findElement(By.id("products-pagesize"));
        Select displayView = new Select(display);
        displayView.selectByVisibleText("12");

        for (; ; ) {
            try {
                driver.findElement(By.partialLinkText("Wool Hat")).click();
                break;
            } catch (Exception e) {
                js.executeScript("window.scrollBy(0,500)");

            }
        }
        Reporter.log("Wool Hat pages is opened sucessfully",true);
    }
}
