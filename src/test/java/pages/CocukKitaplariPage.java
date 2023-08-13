package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CocukKitaplariPage {
    public CocukKitaplariPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='desktop-block']")
    public WebElement cocukKitaplariTextCocukKitaplari;
}
