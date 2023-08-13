package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YayincilarPage {
    public YayincilarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Favori Yayıncınızı Bulun']")
    public WebElement favoriYayinciniziBulunTextYayincilar;
}
