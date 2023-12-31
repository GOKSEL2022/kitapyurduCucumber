package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='search-input']")
    public WebElement searchTextBoxHome;

    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=account/register']")
    public WebElement uyeOlLinkHome;

    @FindBy(xpath = "//*[@class='menu-top-button login']")
    public WebElement girisYapLinkHome;

    @FindBy(xpath = "//*[@id='bottom-button']")
    public WebElement enAltaInYonButonHome;

    @FindBy(xpath = "//*[@id='top-button']")
    public WebElement enUsteCikYonButonHome;

    @FindBy(xpath = "//img[@class='swiper-lazy swiper-lazy-loaded']")
    public List<WebElement> anasayfaKaydiriciResimlerHome;

    @FindBy(xpath = "//*[@class='swiper-button-next common-sprite desktop-banner-next']")
    public WebElement sagYonKaydiriciButonHome;

    @FindBy(xpath = "//*[@class='swiper-button-prev common-sprite desktop-banner-prev']")
    public WebElement solYonKaydiriciButonHome;

    @FindBy(xpath = "(//*[@alt='Kavanozda'])[1]")
    public WebElement anasayfaIlkUrunHome;

    @FindBy(xpath = "//*[@id='suggest-button']")
    public WebElement fikriniziPaylasirmisinizSembolButonHome;

    @FindBy(xpath = "(//h2[text()='Önerim Var'])[1]")
    public WebElement onerimVarTextHome;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement onerimVarAdSoyadHome;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement onerimVarEmailHome;

    @FindBy(xpath = "//select[@name='subject']")
    public WebElement onerimVarSecinizDropDownHome;

    @FindBy(xpath = "//*[@name='enquiry']")
    public WebElement onerimVarGorusunuzHome;

    @FindBy(xpath = "//*[@id='feedback_captcha']")
    public WebElement onerimVarDogrulamaKoduHome;

    @FindBy(xpath = "//*[@class='button']")
    public WebElement onerimVarGonderButonHome;

    @FindBy(xpath = "//*[.='Girmiş olduğunuz doğrulama kodu hatalıdır.']")
    public WebElement onerimVarHataliKodMesajiHome;

    @FindBy(xpath = "(//*[@class='bottom-item'])[2]")
    public WebElement iletisimLinkHome;

    @FindBy(xpath = "(//*[@href='https://www.kitapyurdu.com/'])[3]")
    public WebElement kitapYurduComTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[1]")
    public WebElement cokSatanKitaplarTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[2]")
    public WebElement yeniCikanKitaplarTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[3]")
    public WebElement tumKitaplarTextHome;

    @FindBy(xpath = "//*[@href='kategori/kitap-edebiyat/128.html']")
    public WebElement tumKitaplarEdebiyatTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[4]")
    public WebElement yayincilarTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[5]")
    public WebElement yazarlarTextHome;

    @FindBy(xpath = "(//*[.='Çocuk Kitapları'])[6]")
    public WebElement cocukKitaplariTextHome;

    @FindBy(xpath = "(//*[@href='sinav-kitaplari'])[1]")
    public WebElement sinavKitaplariTextHome;

    @FindBy(xpath = "(//*[.='Ne Okusam?'])[4]")
    public WebElement neOkusamTextHome;

    @FindBy(xpath = "(//*[.='Edebiyat'])[2]")
    public WebElement edebiyatTextHome;

    @FindBy(xpath = "(//*[@href='yeni-cikan-kitaplar/haftalik/2.html'])[1]")
    public  WebElement haftalikYeniCikanKitaplarTextHome;

    @FindBy(xpath = "(//*[@class='lvl1-item'])[2]")
    public WebElement dergiLinkHome;

    @FindBy(xpath = "//*[.='Edebiyat Dergileri']")
    public WebElement edebiyatDergileriDropdownHome;

    @FindBy(xpath = "(//*[@class='lvl1-item'])[3]")
    public WebElement hobiOyuncakLinkHome;

    @FindBy(xpath = "//*[.='Oyun ve Oyuncak']")
    public WebElement oyunVeOyuncakDropdownHome;

    @FindBy(xpath = "(//*[@class='lvl1-item'])[4]")
    public WebElement kirtasiyeLinkHome;

    @FindBy(xpath = "//*[.='Kitap Aksesuarları']")
    public WebElement kitapAksesuarlariDropdownHome;

    @FindBy(xpath = "(//*[@class='lvl1-item'])[5]")
    public WebElement kirkambarLinkHome;

    @FindBy(xpath = "(//*[.='Temalı ve Lisanslı Ürünler'])[1]")
    public WebElement temaliVeLisansliUrunlerDropdownHome;

    @FindBy(xpath = "(//*[@href='index.php?route=product/category'])[1]")
    public WebElement tumKategorilerLinkHome;

    @FindBy(xpath = "(//a[@href='kampanyalar'])[1]")
    public WebElement kampanyalarLinkHome;

    @FindBy(xpath = "(//a[@href='puan-katalogu'])[1]")
    public WebElement puanKataloguLinkHome;

    @FindBy(xpath = "//*[.='Listelerim']")
    public WebElement listelerimLinkHome;

    @FindBy(xpath = "//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']")
    public WebElement favorilerimSecenegiListelerimLinkHome;

    @FindBy(xpath = "(//a[@href='https://www.kitapyurdu.com/index.php?route=account/order'])[1]")
    public WebElement siparisTakibiLinkHome;

    @FindBy(xpath = "(//a[@href='https://www.kitapyurdu.com/index.php?route=account/order'])[1]")
    public WebElement siparislerimSecenegiSiparisTakibiHome;

    @FindBy(xpath = "//*[.='Türkçe']")
    public WebElement turkceDilSecenegiHome;

    @FindBy(xpath = "(//*[.='English'])[2]")
    public WebElement englishDilSecenegiHome;

    @FindBy(xpath = "//*[.='TL']")
    public WebElement tlSecenegiHome;

    @FindBy(xpath = "(//*[.='EUR'])[2]")
    public WebElement eurSecenegiHome;

    @FindBy(xpath = "(//*[@href='yardim'])[1]")
    public WebElement yardimLinkHome;

    @FindBy(xpath = "(//a[@href='yardim'])[2]")
    public WebElement yardimVeIslemRehberiSecenegiYardimHome;

    @FindBy(xpath = "(//a[@href='https://www.kitapyurdu.com/index.php?route=account/account'])[1]")
    public WebElement merhabaYekpareBirAnKayitliKullaniciHome;

    @FindBy(xpath = "(//*[.='Dil ve Edebiyat'])[1]")
    public WebElement dilVeEdebiyatSecenegiEdebiyatDergiHome;

    @FindBy(xpath = "(//*[@class='ribbon-text'])[14]")
    public WebElement kelepirAraTextHome;

    @FindBy(xpath = "//select[@id='js-bg-cat']")
    public WebElement konuButunKonularDropDownHome;

    @FindBy(xpath = "//*[@id='js-bg-price']")
    public WebElement fiyatUstSinirTextBoxHome;

    @FindBy(xpath = "//select[@id='js-bg-disc']")
    public WebElement indirimAltSinirDropDownHome;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement kelepirAraButtonHome;

    @FindBy(xpath = "//*[.='Haftanın Yayınevi']")
    public WebElement haftaninYayineviTextHome;

    @FindBy(xpath = "//*[text()='NEFES YAYINLARI']")
    public WebElement nefesYayinlariHaftaninYayineviTextHome;

    @FindBy(xpath = "(//*[@class='featured-publisher-discount'])[1]")
    public WebElement indirimMiktariNefesYayinlariTextHome;

    @FindBy(xpath = "//a[@class='show-all']")
    public WebElement tumunuGosterLinkHome;

    @FindBy(xpath = "(//*[.='Ayın Yayınevleri'])[1]")
    public WebElement ayinYayinevleriTextHome;

    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:9103118/wi:200/wh:bdd19f781']")
    public WebElement ayinYayinlariYayineviAdlariTextHome;

    @FindBy(xpath = "(//*[@href='ayin-yayinevleri'])[1]")
    public WebElement tumunuGosterAyinYayinevleriLinkHome;

    @FindBy(xpath = "(//*[.='Ayın Yazarları'])[1]")
    public WebElement ayinYazarlariTitleTextHome;

    @FindBy(xpath = "//a[@href='index.php?route=product/manufacturer_products&manufacturer_id=5367&filter_publisher=4650&sort=purchased_365&order=DESC&filter_in_stock=1']")
    public WebElement ayinYazarlariTitleTextIlkYazarHome;

    @FindBy(xpath = "(//*[.='İlgi Görenler'])[1]")
    public WebElement ilgiGorenlerTextHome;

    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=product/best_sellers&list_id=637']")
    public WebElement ilgiGorenlerTumunuGosterLinkHome;

    @FindBy(xpath = "//*[text()='Kategoriler']")
    public WebElement kategorilerTextHome;

    @FindBy(xpath = "(//a[@aria-label='Sonraki slayt'])[4]")
    public WebElement tumunuGosterIleriYonTusuKategorilerHome;

    @FindBy(xpath = "(//a[@href='index.php?route=product/category'])[2]")
    public WebElement tumunuGosterLinkKategorilerHome;

    @FindBy(xpath = "//a[@href='onayli-yorum']")
    public WebElement onayliYorumlarLinkHome;

    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11764839/wi:120/wh:true']")
    public WebElement zeytindagiKitabiHome;

    @FindBy(xpath = "//*[@id='product-wish-list-add-62886']")
    public WebElement alisverisListemeEkleLinkAnasayfaIlkUrunHome;

    @FindBy(xpath = "//*[text()='alışveriş']")
    public WebElement urunAlisverisListenizeEklendiAlertHome;

    @FindBy(xpath = "//*[@style='display: flex;']")
    public WebElement alisverisListenizdenCikarildiAlertHome;
































}
