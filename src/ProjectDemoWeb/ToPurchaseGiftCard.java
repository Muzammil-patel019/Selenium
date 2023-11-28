package ProjectDemoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ToPurchaseGiftCard {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demowebshop.tricentis.com/fiction");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(200);

        driver.findElement(By.id("Email")).sendKeys("muzammilp116@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("Muzammil@123");
        Thread.sleep(1000);

        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.cssSelector("input[value='Log in']")).click();

        JavascriptExecutor js= (JavascriptExecutor) driver;

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
        Select drpCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
       ;
        drpCountry.selectByVisibleText("India");

        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bengaluru");

        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("OLD AIRPORT ROAD");

        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560017");

        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("+917204947143");

        driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();

        driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();

        driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();

        driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();

        driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();

        driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();

        driver.findElement(By.partialLinkText("Click here for order details.")).click();


    }
}
