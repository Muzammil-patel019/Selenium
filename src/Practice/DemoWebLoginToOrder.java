package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebLoginToOrder {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(200);

        driver.findElement(By.id("Email")).sendKeys("muzammilp116@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.cssSelector("input[value='Log in']")).click();


        driver.findElement(By.cssSelector("input[ value='Search store']")).sendKeys("Book");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Health Book")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);


//        Select drpAddress =new Select(driver.findElement(By.id("billing-address-select")));
//        Thread.sleep(2000);
//        drpAddress.getOptions();
//        drpAddress.selectByVisibleText("New Address");

//        try {
//
//            if (driver.findElement(By.id("billing-address-select")).isDisplayed()) {
//
//                Select drpAddress = new Select(driver.findElement(By.id("billing-address-select")));
//                drpAddress.selectByVisibleText("New Address");
//            }
//
//
//        } catch (Exception e) {
//
//        }


        Select drpCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        Thread.sleep(1000);
        drpCountry.selectByVisibleText("India");
        Thread.sleep(1000);
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bengaluru");
        Thread.sleep(1000);
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("OLD AIRPORT ROAD");
        Thread.sleep(1000);
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560017");
        Thread.sleep(1000);
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("+917204947143");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Click here for order details.")).click();
        Thread.sleep(1000);

        driver.findElement(By.partialLinkText("Addresses")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        Thread.sleep(1000);


        driver.switchTo().alert().accept();
        Thread.sleep(1000);
    }
}
