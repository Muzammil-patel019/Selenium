package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_07_DWS extends BaseClass{

    @Test
    public void ToPerformCheckout() throws InterruptedException {

        driver.findElement(By.partialLinkText("Gift Cards")).click();
        driver.findElement(By.partialLinkText("$100 Physical Gift Card")).click();

        driver.findElement(By.id("giftcard_4_RecipientName")).sendKeys("Muzzu");
        driver.findElement(By.id("giftcard_4_Message")).sendKeys("Offer");
        WebElement qty = driver.findElement(By.id("addtocart_4_EnteredQuantity"));
        qty.clear();
        qty.sendKeys("10");

        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);


        Select drAddress =new Select(driver.findElement(By.id("billing-address-select")));
        Thread.sleep(2000);
        drAddress.getOptions();
        drAddress.selectByVisibleText("New Address");

        try {

            if (driver.findElement(By.id("billing-address-select")).isDisplayed()) {

                Select drpAddress = new Select(driver.findElement(By.id("billing-address-select")));
                drpAddress.selectByVisibleText("New Address");
                Select drpCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));

               

                drpCountry.selectByVisibleText("India");

                driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bengaluru");

                driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("OLD AIRPORT ROAD");

                driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560017");

                driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("+917204947143");

                driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();

                driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();


                driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
                Reporter.log("Shipping Method got executed",true);

                driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
                Reporter.log("Payment Method got executed",true);

                driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
                Reporter.log("Payment got executed",true);

                driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();

                Reporter.log("Order Confirm got executed",true);

                driver.findElement(By.partialLinkText("Click here for order details.")).click();
                Reporter.log("Order details got executed",true);

            }


        } catch (Exception e) {

       Reporter.log("New Address not found",true);

        }





        }
    }
