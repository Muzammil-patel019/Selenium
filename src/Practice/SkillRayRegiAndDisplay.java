package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRayRegiAndDisplay {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoapp.skillrary.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("SIGNUP")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Muzammil");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Patel");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("muzammilp7143@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='repassword']/following::input[@type='password' and @name='password' and @placeholder='Password']")).sendKeys("Muzammil123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='repassword']")).sendKeys("Muzammil123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='signup']")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        System.out.println(driver.findElement(By.tagName("p")).getText());
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Email')]")).getText());
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Password')]")).getText());
        System.out.println(driver.findElement(By.xpath("//p/following::p/following::p/following::p")).getText());
        System.out.println(driver.findElement(By.partialLinkText("Activate Account")).getText());





    }

}

////h2/following::p/following::p/following::p/preceding::p/following::p/following::p
