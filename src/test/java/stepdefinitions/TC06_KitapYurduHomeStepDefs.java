package stepdefinitions;

import com.github.javafaker.Faker;
import groovyjarjarantlr4.v4.codegen.model.chunk.TokenPropertyRef_index;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
    int kartNo = Faker.instance().number().numberBetween(1000, 9999);
    int kullanimTarihi1=Faker.instance().number().numberBetween(1, 12);
    int kullanimTarihi2=Faker.instance().number().numberBetween(2000, 2030);
    int cvc=Faker.instance().number().numberBetween(100, 999);

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


    @And("kullanici ayni sayfadaki ilk urune tiklar")
    public void kullaniciAyniSayfadakiIlkUruneTiklar() {
        ReusableMethods.clickByJS(indexPage.dergiSayfasiIlkUrunIndex);
    }

    @And("kullanici fatura turu olarak sahis olarak sahis secer")
    public void kullaniciFaturaTuruOlarakSahisOlarakSahisSecer() {
        ReusableMethods.clickByJS(indexPage.sahisCheckBoxIndex);
    }

    @And("kullanici satin al_index butonuna tiklar")
    public void kullaniciSatinAl_indexButonunaTiklar() {
        ReusableMethods.clickByJS(indexPage.satinAlButonIndex);
    }

    @And("kullanici Adres Ekle sayfasinin acildigini dogrular")
    public void kullaniciAdresEkleSayfasininAcildiginiDogrular() {
        Assert.assertTrue(indexPage.adresEkleTextIndex.isDisplayed());
    }

    @And("kullanici adres ekle sayfasina adres basligi girer")
    public void kullaniciAdresEkleSayfasinaAdresBasligiGirer() {

        try {
            indexPage.adresBasligiTextBoxIndex.sendKeys("İşyeri adresi",
                    Keys.TAB, "Celik Holding", Keys.TAB, "Patron");
        }catch (Exception e) {

        }
        try {
            ReusableMethods.clickByJS(indexPage.yeniAdresEkleIndex);
            indexPage.adresBasligiTextBoxIndex.sendKeys("İşyeri adresi",
                    Keys.TAB, "Celik Holding", Keys.TAB, "Patron");
        } catch (Exception e){

        }
    }

    @And("kullanici ad_sirketAdi girer")
    public void kullaniciAd_sirketAdiGirer() {
    }

    @And("kullanici soyad_unvan girer")
    public void kullaniciSoyad_unvanGirer() {
    }

    @And("kullanici ulke girer")
    public void kullaniciUlkeGirer() {
        new Select(indexPage.ulkeDropDownIndex).selectByVisibleText("Türkiye");
    }

    @And("kullanici sehir girer")
    public void kullaniciSehirGirer() {
        new Select(indexPage.sehirDropDownIndex).selectByVisibleText("Samsun");
    }

    @And("kullanici ilce girer")
    public void kullaniciIlceGirer() {
        new Select(indexPage.ilceDropDownIndex).selectByVisibleText("ÇARŞAMBA");
    }

    @And("kullanici mahalle girer")
    public void kullaniciMahalleGirer() {
        indexPage.mahalleTextBoxIndex.sendKeys("Kirazlikçay Mahallesi",
                Keys.TAB, Faker.instance().address().fullAddress(),
                Keys.TAB,"55500",Keys.TAB,"5445499495",Keys.TAB,"3628333333",
                Keys.TAB,Keys.SPACE,Keys.TAB,"12398855742",Keys.TAB,Keys.ENTER);
    }

    @And("kullanici posta_kodu girer")
    public void kullaniciPosta_koduGirer() {
    }

    @And("kullanici cep_telefonu girer")
    public void kullaniciCep_telefonuGirer() {
    }

    @And("kullanici sabit_telefon girer")
    public void kullaniciSabit_telefonGirer() {
    }

    @And("kullanici fatura_turu secer")
    public void kullaniciFatura_turuSecer() {
    }

    @And("kullanici TC kimlik no girer")
    public void kullaniciTCKimlikNoGirer() {
    }

    @And("kullanici kaydet butonuna tiklar")
    public void kullaniciKaydetButonunaTiklar() {
        try {
            ReusableMethods.clickByJS(indexPage.kaydetButonIndex);
        }catch (Exception e) {

        }
        try {
           ReusableMethods.clickByJS(indexPage.devamEtButonIndex);
        } catch (Exception e){

        }

    }


    @And("kullanici adres ekle butonuna tiklar.")
    public void kullaniciAdresEkleButonunaTiklar() {
        indexPage.yeniAdresEkleIndex.click();
    }

    @And("kullanici kart ile ode basligini goruntuler")
    public void kullaniciKartIleOdeBasliginiGoruntuler() {
        Assert.assertTrue(indexPage.kartIleOdeCheckboxIndex.isDisplayed());
    }

    @And("kullanici rastgele kart numarasi girer")
    public void kullaniciRastgeleKartNumarasiGirer() {
        indexPage.kartNumarasiTextBoxIndex.sendKeys(kartNo+""+kartNo+""+kartNo+""+kartNo+"",
                Keys.TAB,Faker.instance().name().fullName(),Keys.TAB,kullanimTarihi1+""+kullanimTarihi2,Keys.TAB,cvc+"",Keys.TAB,Keys.SPACE);
    }

    @And("kullanici kart uzerindeki isim girer")
    public void kullaniciKartUzerindekiIsimGirer() {
    }

    @And("kullanici son kullanma tarihi girer")
    public void kullaniciSonKullanmaTarihiGirer() {
    }

    @And("kullanici CVC girer")
    public void kullaniciCVCGirer() {
    }

    @And("kullanici toplam tutari goruntuler")
    public void kullaniciToplamTutariGoruntuler() {
        Assert.assertTrue(indexPage.toplamTutarTextIndex.isDisplayed());
    }

    @When("kullanici kart numarasi gecersiz kontrol ediniz alertini gorur")
    public void kullaniciKartNumarasiGecersizKontrolEdinizAlertiniGorur() {
        ReusableMethods.clickByJS(indexPage.devamEtButonIndex);
        ReusableMethods.waitForVisibility(indexPage.kartNoGecersizKontrolEdinizAlertIndex,5);
    }
}
