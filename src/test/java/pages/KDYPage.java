package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KDYPage {
    public KDYPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@href='/FAQ']")
    public WebElement sikSorulanSorularLinkKDY;

    @FindBy(xpath = "//*[@href='#Kitap_208']")
    public WebElement ilkSoruSikSorulanSorularLinkKDY;

    @FindBy(xpath = "//*[@class='inner font-italic show']")
        public WebElement ilkCevapSikSorulanSorularLinkKDY;

    @FindBy(xpath = "(//*[@id='text'])[1]")
    public WebElement aramaTextboxKdy;

    @FindBy(xpath = "//*[.=' Punto hangi büyüklükte olmalıdır?']")
    public WebElement puntoIcerenTextAramaAlaniKdy;
}
