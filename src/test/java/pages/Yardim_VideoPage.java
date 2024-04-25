package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Yardim_VideoPage {
    public Yardim_VideoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//*[.='BANKA HESAP BİLGİLERİMİZ:']")
    public WebElement bankaHesapBilgilerimizTextTitleYardimVideo;
}
