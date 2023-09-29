package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AyinYayinevleriPage {
    public AyinYayinevleriPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11761148/wh:4e091ceab']")
    public WebElement ayinYayinevleriEylulAyinYayinevleri;

    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:7959956/wi:200/wh:6081657ff']")
    public WebElement tutiKitapTextAyinYayinevleri;


}