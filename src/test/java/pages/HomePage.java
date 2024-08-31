package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public WebElement anasayfadaEklenenKitap;

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='search-input']")
    public WebElement searchTextBoxHome;

    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=account/register']")
    public WebElement uyeOlLinkHome;

    @FindBy(xpath = "//*[@class='menu-top-button login']")
    public WebElement girisYapLinkHome;

    @FindBy(xpath = "//*[@data-title='En Alta İn']")
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

    @FindBy(xpath = "//*[@title='kitapla buluşmanın en kolay yolu!']")
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

    @FindBy(xpath = "//*[.='Deutsch']")
    public WebElement almancaDilSecenegiHome;

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

    @FindBy(xpath = "//*[.='Gelecek Haftanın Yayınevi']")
    public WebElement gelecekHaftaninYayineviTextHome;

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

    @FindBy(xpath = "(//a[@href='yardim'])[3]")
    public WebElement yardimVeIslemRehberiLinkSayfaAltiHome;

    @FindBy(xpath = "(//a[@href='yardim/video'])[2]")
    public WebElement videoYardimLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[.='Havale/EFT Bilgileri'])[2]")
    public WebElement havaleEFTBilgileriLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[.='Müşteri Hizmetleri'])[4]")
    public WebElement musteriHizmetleriLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='platin-uyelik'])[2]")
    public WebElement platinUyelikLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='gumus-uyelik']")
    public WebElement gumusUyelikLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='teslim-noktalari']")
    public WebElement teslimNoktalariLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='hemen-al']")
    public WebElement hemenAlLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='cok-satan-kitaplar/haftalik/1.html'])[2]")
    public WebElement cokSatanKitaplarLinkSayfaAltiHome;

    @FindBy(xpath = "(//a[@href='yeni-cikan-kitaplar/haftalik/2.html'])[2]")
    public WebElement yeniSatanKitaplarLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='index.php?route=product/best_sellers&sort=purchased&order=DESC&list_id=744']")
    public WebElement kargoOdeyenAvantajliUrunlerLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@src='https://img.kitapyurdu.com/v1/getImage/fn:11577570/wi:700/wh:64442eeba']")
    public WebElement kargoOdeyenAvantajliUrunlerTextTitleSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='kampanyalar'])[2]")
    public WebElement kampanyalarLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='ayin-yazarlari']")
    public WebElement ayinYazarlariLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='ayin-yayinevleri']")
    public WebElement ayinYayinevleriLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='puan-katalogu'])[2]")
    public WebElement puanKataloguLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='index.php?route=magazine/book_magazine']")
    public WebElement eDergiLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='ne-okusam'])[5]")
    public WebElement neOkusamLinkSayfaAltiHome;

    @FindBy(css = "a[href='index.php?route=product/bargain&sort=purchased&order=DESC&discount=60'")
    public WebElement kelepirKitaplarLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='kategori/cesitli-kitap-hediye-karti/1727.html'])[3]")
    public WebElement kitapHediyeKartlariLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='sinav-kitaplari'])[2]")
    public WebElement sinavKitaplariLinkSayfaAltiHome;

    @FindBy(xpath = "(//a[@href='cocuk-kitaplari'])[2]")
    public WebElement cocukKitaplariLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='index.php?route=product/best_sellers&list_id=1358&sort=purchased&order=DESC']")
    public WebElement cepBoyKitaplariLinkSayfaAltiHome;

    @FindBy(linkText = "İngilizce Kitaplar")
    public WebElement ingilizceKitaplarLinkSayfaAltiHome;

    @FindBy(partialLinkText = "okinzi Kültür-Sanat Ürünleri")
    public WebElement bookinziKulturSanatUrunleriLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='hobi-oyuncak'])[2]")
    public WebElement oyundanDahaFazlasiLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='kategori/hobi-ve-oyuncak-montessori-oyuncaklari/1728.html'])[2]")
    public WebElement montessoriOyuncaklariLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@href='kingofpuzzle'])[2]")
    public WebElement kingOfPuzzleUrunleriLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='yayinevi/akil-defteri/7526.html']")
    public WebElement akilDefteriLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@id='cookiescript_accept']")
    public WebElement kabuleEtVeKapatAlertHome;

    @FindBy(xpath = "//*[@href='sesli-kitap']")
    public WebElement kitapyurduSesliKitaplarLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[.='Kitapyurdu E-Kitap'])[2]")
    public WebElement kitapyurduEkitapLinkSayfaAltiHome;
    //(//*[@href='e-kitap'])[2]

    @FindBy(xpath = "(//*[.='Kütüphanem Uygulaması'])[2]")
    public WebElement kutuphanemUygulamasiLinkSayfaAltiHome;
    //(//*[@href='kutuphanem'])[2]

    @FindBy(xpath = "//*[@href='eklentiler']")
    public WebElement kitapyurduChromeEklentileriLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='onayli-yorum']")
    public WebElement onayliYorumlarLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='https://kdy.kitapyurdu.com/']")
    public WebElement kdyPlatformuLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='https://kdd.kitapyurdu.com/']")
    public WebElement kddPlatformuLinkSayfaAltiHome;

    @FindBy(xpath = "//*[@href='https://kitapdergisi.com/']")
    public WebElement kitapDergisiComLinkSayfaAltiHome;

    @FindBy(xpath = "(//*[@class='fa fa-heart red'])[1]")
    public WebElement naneyiYedikLokantasiFavorilerimeEkleButonHome;

    @FindBy(xpath = "//*[@id='product-682156']")
    public WebElement naneyiYedikLokantasiHome;

    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=account/wishlist']")
    public WebElement alisverisListemSecenegiListelerimDropdownHome;

    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=account/readlist']")
    public WebElement okumaListemSecenegiListelerimDropdownHome;

    @FindBy(xpath = "(//*[@class='box-content product-grid-wr'])[3]")
    public WebElement cokSatanlarNaneyiYedikLokantasiHome;

    @FindBy(xpath = "//*[@id='product-685019']")
    public WebElement denizGucuDevletleriHome;














































}
