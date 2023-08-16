package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HaftalikPage {
    public HaftalikPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='mn-icon icon-angleRight'])[1]")
    public WebElement haftalikCokSatanKitaplarTextHome;

    //@FindBy(xpath = "(//*[@class='mn-icon icon-angleRight'])[2]")
    //public WebElement haftalikYeniCikanKitaplarTextHaftalik;

    @FindBy(xpath = "(//*[.='Çok Satanlar (Haftalık)'])[2]")
    public WebElement cokSatanlarHaftalikTextHaftalik;

    @FindBy(xpath = "(//*[.='Yeni Çıkanlar (Haftalık)'])[2]")
    public WebElement yeniCikanlarHaftalikTextHaftalik;


}
