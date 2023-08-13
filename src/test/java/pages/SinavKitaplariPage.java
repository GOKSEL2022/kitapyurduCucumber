package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SinavKitaplariPage {
    public SinavKitaplariPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='desktop-block']")
    public WebElement sinavKitaplariTextSinavKitaplari;
}
