package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YazarlarPage {
    public YazarlarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Yazarlığa Merhaba Diyenler']")
    public WebElement yazarligaMerhabaDiyenlerTextYazarlar;
}
