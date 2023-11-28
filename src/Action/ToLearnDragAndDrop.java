package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ToLearnDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        WebElement photogallery = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(photogallery);


        WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']']"));
        WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
        WebElement img4 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

        WebElement trash = driver.findElement(By.id("trash"));

        Actions action =new Actions(driver);
        action.dragAndDrop(img3,trash).perform();
    }
}
