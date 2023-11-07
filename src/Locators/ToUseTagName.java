package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ToUseTagName {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/events/greatindianfestival/&ref_=ine_gw_j23_p3_swm/?_encoding=UTF8&ref_=nav_swm_swm_gd&pf_rd_p=fc929ac2-7705-40f9-b112-39c90fe9f3f0&pf_rd_s=nav-sitewide-msg&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=RE062AM1JW299RJ2FAW9");
        Thread.sleep(10000);

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size());
    }
}
