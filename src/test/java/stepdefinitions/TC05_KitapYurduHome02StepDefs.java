package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;
import static utilities.ReusableMethods.scrollIntoViewJS;

public class TC05_KitapYurduHome02StepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());

    @Given("kullanici cok satan kitaplar basliginin uzerine gelir")
    public void kullaniciCokSatanKitaplarBasligininUzerineGelir() {
        actions.moveToElement(allPages.homePage().cokSatanKitaplarTextHome).perform();
    }
    @When("kullanici haftalik cok satan kitaplar basligina tiklar")
    public void kullaniciHaftalikCokSatanKitaplarBasliginaTiklar() {
        clickByJS(allPages.haftalikPage().haftalikCokSatanKitaplarTextHome);
    }
    @And("kullanici haftalik cok satan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikCokSatanKitaplarSayfasininAcildiginiDogrular() {
        assert allPages.haftalikPage().cokSatanlarHaftalikTextHaftalik.isDisplayed();
    }
    @And("kullanici yeni cikan kitaplar basligini uzerine gelir")
    public void kullaniciYeniCikanKitaplarBasliginiUzerineGelir() {
        actions.moveToElement(allPages.homePage().yeniCikanKitaplarTextHome).perform();
    }
    @And("Kullanici haftalik yeni cikan kitaplar basligina tiklar")
    public void kullaniciHaftalikYeniCikanKitaplarBasliginaTiklar() {
        clickByJS(allPages.homePage().haftalikYeniCikanKitaplarTextHome);
    }
    @And("kullanici haftalik yeni cikan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikYeniCikanKitaplarSayfasininAcildiginiDogrular() {
        assert allPages.haftalikPage().yeniCikanlarHaftalikTextHaftalik.isDisplayed();
    }
    @And("kullanici tum kitaplar basliginin uzerine gelir")
    public void kullaniciTumKitaplarBasligininUzerineGelir() {
        actions.moveToElement(allPages.homePage().tumKitaplarTextHome).perform();
    }
    @And("kullanici tum kitaplar basliginin altinda edebiyat secenegine tiklar")
    public void kullaniciTumKitaplarBasligininAltindaEdebiyatSecenegineTiklar() {
        clickByJS(allPages.homePage().tumKitaplarEdebiyatTextHome);
    }
    @And("kullanici edebiyat sayfasinin acildigini dogrular")
    public void kullaniciEdebiyatSayfasininAcildiginiDogrular() {
        assert allPages.kategoriPage().edebiyatTextKitap.isDisplayed();
    }
    @And("kullanici yayincilar basligina tiklar")
    public void kullaniciYayincilarBasliginaTiklar() {
        clickByJS(allPages.homePage().yayincilarTextHome);
    }
    @And("kullanici yayincilar sayfasinin acildigini dogrular")
    public void kullaniciYayincilarSayfasininAcildiginiDogrular() {
        assert allPages.yayincilarPage().favoriYayinciniziBulunTextYayincilar.isDisplayed();
    }
    @And("kullanici yazarlar basligina tiklar")
    public void kullaniciYazarlarBasliginaTiklar() {
        clickByJS(allPages.homePage().yazarlarTextHome);
    }
    @And("kullanici yazarlar sayfasinin acildigini dogrular")
    public void kullaniciYazarlarSayfasininAcildiginiDogrular() {
        assert allPages.yazarlarPage().yazarligaMerhabaDiyenlerTextYazarlar.isDisplayed();
    }
    @And("kullanici cocuk kitaplari basligina tiklar")
    public void kullaniciCocukKitaplariBasliginaTiklar() {
        clickByJS(allPages.homePage().cocukKitaplariTextHome);
    }
    @And("kullanici cocuk kitaplari sayfasinin acildigini dogrular")
    public void kullaniciCocukKitaplariSayfasininAcildiginiDogrular() {
        assert allPages.cocukKitaplariPage().cocukKitaplariTextCocukKitaplari.isDisplayed();
    }
    @And("kullanici sinav kitaplari basligina tiklar")
    public void kullaniciSinavKitaplariBasliginaTiklar() {
        clickByJS(allPages.homePage().sinavKitaplariTextHome);
    }
    @And("kullanici sinav kitaplari sayfasinin acildigini dogrular")
    public void kullaniciSinavKitaplariSayfasininAcildiginiDogrular() {
        assert allPages.sinavKitaplariPage().sinavKitaplariTextSinavKitaplari.isDisplayed();
    }
    @And("kullanici ne okusam basligina tiklar")
    public void kullaniciNeOkusamBasliginaTiklar() {
        clickByJS(allPages.homePage().neOkusamTextHome);
    }
    @When("kullanici ne okusam sayfasinin acildigini dogrular")
    public void kullaniciNeOkusamSayfasininAcildiginiDogrular() {
        assert allPages.neOkusamPage().neOkusamListeleriTextNeOkusam.isDisplayed();
    }
    @And("kullanici kitapYurduCom textine tiklar")
    public void kullaniciKitapYurduComTextineTiklar() {
        clickByJS(allPages.homePage().kitapYurduComTextHome);
    }
    @Given("kullanici dergi linkine tiklar")
    public void kullaniciDergiLinkineTiklar() {
        clickByJS(allPages.homePage().dergiLinkHome);
    }
    @When("kullanici dergi ile ilgili alanlarin acildigini dogrular")
    public void kullaniciDergiIleIlgiliAlanlarinAcildiginiDogrular() {
        assert allPages.homePage().edebiyatDergileriDropdownHome.isDisplayed();
    }
    @And("kullanici hobi_oyuncak linkine tiklar")
    public void kullaniciHobi_oyuncakLinkineTiklar() {
        clickByJS(allPages.homePage().hobiOyuncakLinkHome);
    }
    @And("kullanici hobi_oyuncak ile ilgili alanlarin acildigini dogrular")
    public void kullaniciHobi_oyuncakIleIlgiliAlanlarinAcildiginiDogrular() {
        assert allPages.homePage().oyunVeOyuncakDropdownHome.isDisplayed();
    }
    @And("kullanici kirtasiye linkine tiklar")
    public void kullaniciKirtasiyeLinkineTiklar() {
        clickByJS(allPages.homePage().kirtasiyeLinkHome);
    }
    @And("kullanici kirtasiye ile ilgili alanlarin acildigini dogrular")
    public void kullaniciKirtasiyeIleIlgiliAlanlarinAcildiginiDogrular() {
        assert allPages.homePage().kitapAksesuarlariDropdownHome.isDisplayed();
    }
    @And("kullanici kirkambar linkine tiklar")
    public void kullaniciKirkambarLinkineTiklar() {
        clickByJS(allPages.homePage().kirkambarLinkHome);
    }
    @And("kullanici temali ve lisansli urunler alaninin acildigini dogrular")
    public void kullaniciTemaliVeLisansliUrunlerAlanininAcildiginiDogrular() {
        assert allPages.homePage().temaliVeLisansliUrunlerDropdownHome.isDisplayed();
    }
    @And("kullanici tum kategoriler linkine tiklar")
    public void kullaniciTumKategorilerLinkineTiklar() {
        clickByJS(allPages.homePage().tumKategorilerLinkHome);
    }
    @And("kullanici tum kategori seceneklerinin gorunur oldugunu dogrular")
    public void kullaniciTumKategoriSeceneklerininGorunurOldugunuDogrular() {
        assert allPages.kategoriPage().tumKategorilerTextKategoriler.isDisplayed();
    }
    @And("kullanici kampanyalar linkine tiklar")
    public void kullaniciKampanyalarLinkineTiklar() {
        clickByJS(allPages.homePage().kampanyalarLinkHome);
    }
    @And("kullanici one cikan kampanyalari goruntuler")
    public void kullaniciOneCikanKampanyalariGoruntuler() {
        assert allPages.kampanyalarPage().tumKampanyalarTextKampanyalar.isDisplayed();
    }
    @And("kullanici puan katalogu linkine tiklar")
    public void kullaniciPuanKataloguLinkineTiklar() {
        clickByJS(allPages.homePage().puanKataloguLinkHome);
    }
    @When("kullanici puan katalogu sayfasinin acildigini dogrular")
    public void kullaniciPuanKataloguSayfasininAcildiginiDogrular() {
        assert allPages.puanKataloguPage().puanKataloguTextPuanKatalogu.isDisplayed();
    }
    @Given("kullanici listelerim linkine gelir")
    public void kullaniciListelerimLinkineGelir() {
        actions.moveToElement(allPages.homePage().listelerimLinkHome).perform();
    }
    @When("kullanici acilan listelerim alt secenekleri goruntuler")
    public void kullaniciAcilanListelerimAltSecenekleriGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().favorilerimSecenegiListelerimLinkHome.isDisplayed();
    }
    @And("kullanici siparis takibi linkine gelir")
    public void kullaniciSiparisTakibiLinkineGelir() {
        actions.moveToElement(allPages.homePage().siparisTakibiLinkHome).perform();
    }
    @And("kullanici acilan siparis takibi alt seceneklerini goruntuler")
    public void kullaniciAcilanSiparisTakibiAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().siparislerimSecenegiSiparisTakibiHome.isDisplayed();
    }
    @And("kullanici Turkce linkine gelir")
    public void kullaniciTurkceLinkineGelir() {
        actions.moveToElement(allPages.homePage().turkceDilSecenegiHome).perform();
    }
    @And("kullanici acilan Turkce alt seceneklerini goruntuler")
    public void kullaniciAcilanTurkceAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().englishDilSecenegiHome.isDisplayed();
    }
    @And("kullanici TL secenegini gelir")
    public void kullaniciTLSeceneginiGelir() {
        actions.moveToElement(allPages.homePage().tlSecenegiHome).perform();
    }
    @And("kullanici acilan TL alt seceneklerini goruntuler")
    public void kullaniciAcilanTLAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().eurSecenegiHome.isDisplayed();
    }
    @And("kullanici yardim linkine gelir")
    public void kullaniciYardimLinkineGelir() {
        actions.moveToElement(allPages.homePage().yardimLinkHome).perform();
    }
    @And("kullanici yardim ve islem rehberi secenegini goruntuler")
    public void kullaniciYardimVeIslemRehberiSeceneginiGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().yardimVeIslemRehberiSecenegiYardimHome.isDisplayed();
    }
    @Given("kullanici anasayfadaki ilk urune gelir")
    public void kullaniciAnasayfadakiIlkUruneGelir() {
        scrollIntoViewJS(allPages.homePage().haftaninYayineviTextHome);
    }
    @When("kullanici sayfadaki ilk urunu sepete ekler")
    public void kullaniciSayfadakiIlkUrunuSepeteEkler() throws InterruptedException {
        actions.moveToElement(allPages.homePage().zeytindagiKitabiHome).perform();
        Thread.sleep(1000);
        clickByJS(allPages.homePage().alisverisListemeEkleLinkAnasayfaIlkUrunHome);
    }
    @And("kullanici urun alisveris listenize eklendi alertini gorur")
    public void kullaniciUrunAlisverisListenizeEklendiAlertiniGorur() {
        assert allPages.homePage().urunAlisverisListenizeEklendiAlertHome.isDisplayed();
    }
    @And("kullanici goruntulenen alerte tiklar")
    public void kullaniciGoruntulenenAlerteTiklar() {
        clickByJS(allPages.homePage().urunAlisverisListenizeEklendiAlertHome);
    }
    @And("kullanici sectigi urunu alisveris listesinde goruntuler")
    public void kullaniciSectigiUrunuAlisverisListesindeGoruntuler() {
        assert allPages.indexPage().zeytindagiKitabiFalihRifkiAtayIndex.isDisplayed();
    }
    @And("kullanici bir onceki sayfaya doner")
    public void kullaniciBirOncekiSayfayaDoner() {
        Driver.getDriver().navigate().back();
    }
    @When("kullanici eklemis oldugu urunun tekrar listeye eklenebilecegini dogrular")
    public void kullaniciEklemisOlduguUrununTekrarListeyeEklenebileceginiDogrular() {
        actions.moveToElement(allPages.homePage().zeytindagiKitabiHome).perform();
        clickByJS(allPages.homePage().alisverisListemeEkleLinkAnasayfaIlkUrunHome);
        assert allPages.homePage().urunAlisverisListenizeEklendiAlertHome.isDisplayed();
    }
}
