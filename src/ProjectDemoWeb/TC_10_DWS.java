package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_10_DWS extends BaseClass{

    @Test
    public void AddingProductToWishList(){

        driver.findElement(By.partialLinkText("Electronics")).click();

        driver.findElement(By.partialLinkText("Cell phones")).click();
        Reporter.log("Cell phone page got opened",true);
        driver.findElement(By.partialLinkText("Smartphone")).click();
        Reporter.log("Smartphone page is opened",true);
        driver.findElement(By.id("add-to-wishlist-button-43")).click();
        Reporter.log("Smart Phone is added to Wishlist",true);
    }
}
