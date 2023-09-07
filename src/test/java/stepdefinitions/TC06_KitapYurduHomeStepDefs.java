package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.DergiPage;
import pages.HomePage;
import pages.IndexPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC06_KitapYurduHomeStepDefs {
    HomePage homePage=new HomePage();
    IndexPage indexPage=new IndexPage();
    DergiPage dergiPage=new DergiPage();
    Actions actions=new Actions(Driver.getDriver());

    @And("kullanici e-posta alanina gecerli bir {string} girer.")
    public void kullaniciEPostaAlaninaGecerliBirGirer(String string) {
        indexPage.textBoxEpostaHosgeldinizIndex.sendKeys(string);
    }

    @And("kullanici sifre alanina kayitli sifresini {string} girer.")
    public void kullaniciSifreAlaninaKayitliSifresiniGirer(String string) {
        indexPage.textBoxSifreHosgeldinizIndex.sendKeys(string);
    }

    @And("kullanici beni hatirla checkboxi tiklar.")
    public void kullaniciBeniHatirlaCheckboxiTiklar() {
        ReusableMethods.clickByJS(indexPage.checkBoxBeniHatirlaHosgeldinizIndex);
    }

    @And("kullanici giris yap butonuna tiklar.")
    public void kullaniciGirisYapButonunaTiklar() {
        ReusableMethods.clickByJS(indexPage.girisYapButonHosgeldinizIndex);
    }
    @And("kullanici sayfaya kayitli hesap ile girdigini dogrular")
    public void kullaniciSayfayaKayitliHesapIleGirdiginiDogrular() {
        Assert.assertTrue(homePage.merhabaYekpareBirAnKayitliKullaniciHome.getText().contains("yekpare bir an"));
    }


    @And("kullanici edebiyat dergileri seceneginin uzerine gelir")
    public void kullaniciEdebiyatDergileriSecenegininUzerineGelir() {
        actions.moveToElement(homePage.edebiyatDergileriDropdownHome).perform();
    }

    @And("kullanici dil ve edebiyat secenegini tiklar")
    public void kullaniciDilVeEdebiyatSeceneginiTiklar() {
        ReusableMethods.clickWithTimeOut(homePage.dilVeEdebiyatSecenegiEdebiyatDergiHome,2);
    }

    @And("kullanici urunlerin listelendigi sayfada oldugunu dogrular")
    public void kullaniciUrunlerinListelendigiSayfadaOldugunuDogrular() {
        Assert.assertTrue(indexPage.urunListelendiTextIndex.getText().contains("ürün listelendi"));
    }

    @And("kullanici anasayfadaki sayfadaki ilk urune tiklar")
    public void kullaniciAnasayfadakiSayfadakiIlkUruneTiklar() {
        ReusableMethods.clickByJS(indexPage.dilVeEdebiyatDergileriIlkUrunIndex);
    }

    @And("kullanici sayfadaki ilk urune tiklar")
    public void kullaniciSayfadakiIlkUruneTiklar() {
        ReusableMethods.clickByJS(indexPage.dilVeEdebiyatDergileriIlkUrunIndex);
    }

    @And("kullanici favorilerime ekle secenegini tiklar")
    public void kullaniciFavorilerimeEkleSeceneginiTiklar() throws InterruptedException {
        ReusableMethods.scrollIntoViewJS(dergiPage.favorilerimeEkleLinkDergi);
        Thread.sleep(1000);
        ReusableMethods.clickByJS(dergiPage.favorilerimeEkleLinkDergi);
    }

    @And("kullanici urun basarili sekilde favorilerinize eklenedi mesajini gorur")
    public void kullaniciUrunBasariliSekildeFavorilerinizeEklenediMesajiniGorur() {
        Assert.assertTrue(dergiPage.urunBasariliSekildeFavorilerinizeEklendiAlertDergi.isDisplayed());
    }

    @And("kullanici listelerim linkinde favorilerim secenegini tiklar")
    public void kullaniciListelerimLinkindeFavorilerimSeceneginiTiklar() {
        ReusableMethods.clickByJS(homePage.favorilerimSecenegiListelerimLinkHome);
    }

    @And("kullanici favorilere ekledigi urunun favori listesinde oldugunu goruntuler")
    public void kullaniciFavorilereEkledigiUrununFavoriListesindeOldugunuGoruntuler() {
        Assert.assertTrue(indexPage.favorilerimEklenenUrunIndex.isDisplayed());
    }
}
