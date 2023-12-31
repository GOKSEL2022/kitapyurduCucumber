package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC05_KitapYurduHome02StepDefs {
    HomePage homePage=new HomePage();
    KitapPage kitapPage=new KitapPage();
    CocukKitaplariPage cocukKitaplariPage=new CocukKitaplariPage();
    HaftalikPage haftalikPage=new HaftalikPage();
    KategoriPage kategoriPage=new KategoriPage();
    NeOkusamPage neOkusamPage=new NeOkusamPage();
    SinavKitaplariPage sinavKitaplariPage=new SinavKitaplariPage();
    YayincilarPage yayincilarPage=new YayincilarPage();
    YazarlarPage yazarlarPage=new YazarlarPage();
    KampanyalarPage kampanyalarPage=new KampanyalarPage();
    PuanKataloguPage puanKataloguPage=new PuanKataloguPage();
    IndexPage indexPage=new IndexPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici cok satan kitaplar basliginin uzerine gelir")
    public void kullaniciCokSatanKitaplarBasligininUzerineGelir() {
        actions.moveToElement(homePage.cokSatanKitaplarTextHome).perform();
    }

    @When("kullanici haftalik cok satan kitaplar basligina tiklar")
    public void kullaniciHaftalikCokSatanKitaplarBasliginaTiklar() {
        ReusableMethods.clickByJS(haftalikPage.haftalikCokSatanKitaplarTextHome);
    }

    @And("kullanici haftalik cok satan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikCokSatanKitaplarSayfasininAcildiginiDogrular() {
        Assert.assertTrue(haftalikPage.cokSatanlarHaftalikTextHaftalik.isDisplayed());
    }

    @And("kullanici yeni cikan kitaplar basligini uzerine gelir")
    public void kullaniciYeniCikanKitaplarBasliginiUzerineGelir() {

        actions.moveToElement(homePage.yeniCikanKitaplarTextHome).perform();
    }

    @And("Kullanici haftalik yeni cikan kitaplar basligina tiklar")
    public void kullaniciHaftalikYeniCikanKitaplarBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.haftalikYeniCikanKitaplarTextHome);
    }

    @And("kullanici haftalik yeni cikan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikYeniCikanKitaplarSayfasininAcildiginiDogrular() {
        Assert.assertTrue(haftalikPage.yeniCikanlarHaftalikTextHaftalik.isDisplayed());
    }

    @And("kullanici tum kitaplar basliginin uzerine gelir")
    public void kullaniciTumKitaplarBasligininUzerineGelir() {
        actions.moveToElement(homePage.tumKitaplarTextHome).perform();
    }

    @And("kullanici tum kitaplar basliginin altinda edebiyat secenegine tiklar")
    public void kullaniciTumKitaplarBasligininAltindaEdebiyatSecenegineTiklar() {
        ReusableMethods.clickByJS(homePage.tumKitaplarEdebiyatTextHome);
    }

    @And("kullanici edebiyat sayfasinin acildigini dogrular")
    public void kullaniciEdebiyatSayfasininAcildiginiDogrular() {
        Assert.assertTrue(kategoriPage.edebiyatTextKitap.isDisplayed());
    }

    @And("kullanici yayincilar basligina tiklar")
    public void kullaniciYayincilarBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.yayincilarTextHome);
    }

    @And("kullanici yayincilar sayfasinin acildigini dogrular")
    public void kullaniciYayincilarSayfasininAcildiginiDogrular() {
        Assert.assertTrue(yayincilarPage.favoriYayinciniziBulunTextYayincilar.isDisplayed());
    }

    @And("kullanici yazarlar basligina tiklar")
    public void kullaniciYazarlarBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.yazarlarTextHome);
    }

    @And("kullanici yazarlar sayfasinin acildigini dogrular")
    public void kullaniciYazarlarSayfasininAcildiginiDogrular() {
        Assert.assertTrue(yazarlarPage.yazarligaMerhabaDiyenlerTextYazarlar.isDisplayed());
    }

    @And("kullanici cocuk kitaplari basligina tiklar")
    public void kullaniciCocukKitaplariBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.cocukKitaplariTextHome);
    }

    @And("kullanici cocuk kitaplari sayfasinin acildigini dogrular")
    public void kullaniciCocukKitaplariSayfasininAcildiginiDogrular() {
        Assert.assertTrue(cocukKitaplariPage.cocukKitaplariTextCocukKitaplari.isDisplayed());
    }

    @And("kullanici sinav kitaplari basligina tiklar")
    public void kullaniciSinavKitaplariBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.sinavKitaplariTextHome);
    }

    @And("kullanici sinav kitaplari sayfasinin acildigini dogrular")
    public void kullaniciSinavKitaplariSayfasininAcildiginiDogrular() {
        Assert.assertTrue(sinavKitaplariPage.sinavKitaplariTextSinavKitaplari.isDisplayed());
    }

    @And("kullanici ne okusam basligina tiklar")
    public void kullaniciNeOkusamBasliginaTiklar() {
        ReusableMethods.clickByJS(homePage.neOkusamTextHome);
    }

    @When("kullanici ne okusam sayfasinin acildigini dogrular")
    public void kullaniciNeOkusamSayfasininAcildiginiDogrular() {
        Assert.assertTrue(neOkusamPage.neOkusamListeleriTextNeOkusam.isDisplayed());
    }

    @And("kullanici kitapYurduCom textine tiklar")
    public void kullaniciKitapYurduComTextineTiklar() {
        ReusableMethods.clickByJS(homePage.kitapYurduComTextHome);
    }

    @Given("kullanici dergi linkine tiklar")
    public void kullaniciDergiLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.dergiLinkHome);
    }

    @When("kullanici dergi ile ilgili alanlarin acildigini dogrular")
    public void kullaniciDergiIleIlgiliAlanlarinAcildiginiDogrular() {
        Assert.assertTrue(homePage.edebiyatDergileriDropdownHome.isDisplayed());
    }

    @And("kullanici hobi_oyuncak linkine tiklar")
    public void kullaniciHobi_oyuncakLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.hobiOyuncakLinkHome);
    }

    @And("kullanici hobi_oyuncak ile ilgili alanlarin acildigini dogrular")
    public void kullaniciHobi_oyuncakIleIlgiliAlanlarinAcildiginiDogrular() {
        Assert.assertTrue(homePage.oyunVeOyuncakDropdownHome.isDisplayed());
    }

    @And("kullanici kirtasiye linkine tiklar")
    public void kullaniciKirtasiyeLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.kirtasiyeLinkHome);
    }

    @And("kullanici kirtasiye ile ilgili alanlarin acildigini dogrular")
    public void kullaniciKirtasiyeIleIlgiliAlanlarinAcildiginiDogrular() {
        Assert.assertTrue(homePage.kitapAksesuarlariDropdownHome.isDisplayed());
    }

    @And("kullanici kirkambar linkine tiklar")
    public void kullaniciKirkambarLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.kirkambarLinkHome);
    }

    @And("kullanici temali ve lisansli urunler alaninin acildigini dogrular")
    public void kullaniciTemaliVeLisansliUrunlerAlanininAcildiginiDogrular() {
        assert homePage.temaliVeLisansliUrunlerDropdownHome.isDisplayed();
    }

    @And("kullanici tum kategoriler linkine tiklar")
    public void kullaniciTumKategorilerLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.tumKategorilerLinkHome);
    }

    @And("kullanici tum kategori seceneklerinin gorunur oldugunu dogrular")
    public void kullaniciTumKategoriSeceneklerininGorunurOldugunuDogrular() {
        Assert.assertTrue(kategoriPage.tumKategorilerTextKategoriler.isDisplayed());
    }

    @And("kullanici kampanyalar linkine tiklar")
    public void kullaniciKampanyalarLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.kampanyalarLinkHome);
    }

    @And("kullanici one cikan kampanyalari goruntuler")
    public void kullaniciOneCikanKampanyalariGoruntuler() {
        Assert.assertTrue(kampanyalarPage.tumKampanyalarTextKampanyalar.isDisplayed());
    }

    @And("kullanici puan katalogu linkine tiklar")
    public void kullaniciPuanKataloguLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.puanKataloguLinkHome);
    }

    @When("kullanici puan katalogu sayfasinin acildigini dogrular")
    public void kullaniciPuanKataloguSayfasininAcildiginiDogrular() {
        Assert.assertTrue(puanKataloguPage.puanKataloguTextPuanKatalogu.isDisplayed());
    }

    @Given("kullanici listelerim linkine gelir")
    public void kullaniciListelerimLinkineGelir() {
        actions.moveToElement(homePage.listelerimLinkHome).perform();

        //ReusableMethods.clickByJS(homePage.listelerimLinkHome);
    }

    @When("kullanici acilan listelerim alt secenekleri goruntuler")
    public void kullaniciAcilanListelerimAltSecenekleriGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.favorilerimSecenegiListelerimLinkHome.isDisplayed());
    }

    @And("kullanici siparis takibi linkine gelir")
    public void kullaniciSiparisTakibiLinkineGelir() {
        actions.moveToElement(homePage.siparisTakibiLinkHome).perform();
        //ReusableMethods.clickByJS(homePage.siparisTakibiLinkHome);
    }

    @And("kullanici acilan siparis takibi alt seceneklerini goruntuler")
    public void kullaniciAcilanSiparisTakibiAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.siparislerimSecenegiSiparisTakibiHome.isDisplayed());

    }

    @And("kullanici Turkce linkine gelir")
    public void kullaniciTurkceLinkineGelir() {
        actions.moveToElement(homePage.turkceDilSecenegiHome).perform();

    }

    @And("kullanici acilan Turkce alt seceneklerini goruntuler")
    public void kullaniciAcilanTurkceAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.englishDilSecenegiHome.isDisplayed());
    }

    @And("kullanici TL secenegini gelir")
    public void kullaniciTLSeceneginiGelir() {
        actions.moveToElement(homePage.tlSecenegiHome).perform();
    }

    @And("kullanici acilan TL alt seceneklerini goruntuler")
    public void kullaniciAcilanTLAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.eurSecenegiHome.isDisplayed());
    }

    @And("kullanici yardim linkine gelir")
    public void kullaniciYardimLinkineGelir() {
        actions.moveToElement(homePage.yardimLinkHome).perform();
    }
    @And("kullanici yardim ve islem rehberi secenegini goruntuler")
    public void kullaniciYardimVeIslemRehberiSeceneginiGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.yardimVeIslemRehberiSecenegiYardimHome.isDisplayed());
    }

    @Given("kullanici anasayfadaki ilk urune gelir")
    public void kullaniciAnasayfadakiIlkUruneGelir() {
        ReusableMethods.scrollIntoViewJS(homePage.haftaninYayineviTextHome);
    }

    @When("kullanici sayfadaki ilk urunu sepete ekler")
    public void kullaniciSayfadakiIlkUrunuSepeteEkler() throws InterruptedException {
        actions.moveToElement(homePage.zeytindagiKitabiHome).perform();
        Thread.sleep(1000);
        ReusableMethods.clickByJS(homePage.alisverisListemeEkleLinkAnasayfaIlkUrunHome);
    }

    @And("kullanici urun alisveris listenize eklendi alertini gorur")
    public void kullaniciUrunAlisverisListenizeEklendiAlertiniGorur() throws InterruptedException {
        assert homePage.urunAlisverisListenizeEklendiAlertHome.isDisplayed();
    }

    @And("kullanici goruntulenen alerte tiklar")
    public void kullaniciGoruntulenenAlerteTiklar() {
        ReusableMethods.clickByJS(homePage.urunAlisverisListenizeEklendiAlertHome);
    }

    @And("kullanici sectigi urunu alisveris listesinde goruntuler")
    public void kullaniciSectigiUrunuAlisverisListesindeGoruntuler() {
        assert indexPage.zeytindagiKitabiFalihRifkiAtayIndex.isDisplayed();

    }

    @And("kullanici bir onceki sayfaya doner")
    public void kullaniciBirOncekiSayfayaDoner() {
        Driver.getDriver().navigate().back();
    }

    @When("kullanici eklemis oldugu urunun tekrar listeye eklenebilecegini dogrular")
    public void kullaniciEklemisOlduguUrununTekrarListeyeEklenebileceginiDogrular() {
        actions.moveToElement(homePage.zeytindagiKitabiHome).perform();
        ReusableMethods.clickByJS(homePage.alisverisListemeEkleLinkAnasayfaIlkUrunHome);
        assert homePage.urunAlisverisListenizeEklendiAlertHome.isDisplayed();
    }
}
