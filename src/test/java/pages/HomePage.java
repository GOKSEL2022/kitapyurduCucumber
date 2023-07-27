package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='https://hubcomfy.com/my-account-2/'])[1]")
    public WebElement signinButtonHome;


    @FindBy(xpath = "(//*[.='Register'])[2]")
    public WebElement registerButtonHome;

    @FindBy(xpath = "(//*[.='Sign Out'])[3]")
    public WebElement signOutButtonHome;


}
