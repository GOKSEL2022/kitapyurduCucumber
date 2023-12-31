package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KategoriPage {
    public KategoriPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@href='kategori/kitap-edebiyat/128.html']")
    public WebElement tumKitaplarEdebiyatTextKategori;

    @FindBy(xpath = "(//*[.='Edebiyat'])[8]")
    public WebElement edebiyatTextKitap;

    @FindBy(xpath = "//a[@href='https://www.kitapyurdu.com/index.php?route=product/category']")
    public WebElement tumKategorilerTextKategoriler;

    @FindBy(xpath = "//a[@href='https://www.kitapyurdu.com/kategori/edebiyat-belgesel-roman/128_150.html']")
    public WebElement belgeselRomanLinkEdebiyatAltKategorilerKategoriler;

    @FindBy(xpath = "//h1[.='Belgesel Roman']")
    public WebElement belgeselRomanTextKategori;

    @FindBy(xpath = "(//*[.=' Ayşe Kulin'])[1]")
    public WebElement ayseKulinLinkKategori;
}
