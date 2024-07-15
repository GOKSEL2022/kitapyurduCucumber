package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KDDPage {
    public KDDPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "who")
    public WebElement ePostaAdresinizTextboxKDD;

    @FindBy(xpath = "//*[@href='/Contact/']")
    public WebElement iletisimLinkKDD;

    @FindBy(xpath = "//*[@class='green']")
    public WebElement devamEtButonIletisimKDD;

    @FindBy(xpath = "//*[.=' Mesajınız iletildi. Geri bildiminiz için teşekkürler...']")
    public WebElement mesajinizIletildiGeriBildiriminizIcinTesekkurlerTextIletisimKDD;

}
