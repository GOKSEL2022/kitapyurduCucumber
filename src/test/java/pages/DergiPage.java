package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DergiPage {
    public DergiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Favorilerime Ekle']")
    public WebElement favorilerimeEkleLinkDergi;

    @FindBy(xpath = "//h2[@id='swal2-title']")
    public WebElement urunBasariliSekildeFavorilerinizeEklendiAlertDergi;
}

