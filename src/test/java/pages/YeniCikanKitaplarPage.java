package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YeniCikanKitaplarPage {
    public YeniCikanKitaplarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='cookiescript_accept']")
    public WebElement kabuLEtVeKapatAlertButtonYeniCikanKitaplar;
}
