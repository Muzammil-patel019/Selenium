package POMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {

    public  Welcome_Page(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(linkText = "Register")
    private WebElement registerLink;

    public WebElement getRegisterLink() {
        return registerLink;
    }

    public WebElement getLoginLink() {
        return loginLink;
    }

    @FindBy(linkText = "Log in")
    private WebElement loginLink;



    }

