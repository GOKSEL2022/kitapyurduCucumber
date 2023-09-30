package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AyinYayinevleriPage {
    public AyinYayinevleriPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11776673/wh:543b5c094']")
    public WebElement ayinYayinevleriEylulAyinYayinevleri;

    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:9103118/wi:200/wh:bdd19f781']")
    public WebElement pinhanKitapTextAyinYayinevleri;


}
