package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC07_YayinevleriYayinlariYazarlarStepDefs {
    HomePage homePage=new HomePage();
    YayineviPage yayineviPage=new YayineviPage();
    KitapPage kitapPage=new KitapPage();
    AyinYayinevleriPage ayinYayinevleriPage=new AyinYayinevleriPage();
    IndexPage indexPage=new IndexPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("kullanici haftanin yayinevi basligina gelir")
    public void kullaniciHaftaninYayineviBasliginaGelir() {
        actions.moveToElement(homePage.haftaninYayineviTextHome).perform();

    }
    @When("kullanici secilen yayinevini goruntuler")
    public void kullaniciSecilenYayineviniGoruntuler() {
        Assert.assertTrue(homePage.nefesYayinlariHaftaninYayineviTextHome.isDisplayed());
    }

    @And("kullanici yapilan indirim miktarini goruntuler")
    public void kullaniciYapilanIndirimMiktariniGoruntuler() {
        Assert.assertTrue(homePage.indirimMiktariNefesYayinlariTextHome.getText().contains("45"));
    }

    @And("kullanici tumunu goster linkine tiklar")
    public void kullaniciTumunuGosterLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.tumunuGosterLinkHome);
    }

    @And("kullanici acilan sayfada haftanin yayinevinin adini goruntuler")
    public void kullaniciAcilanSayfadaHaftaninYayinevininAdiniGoruntuler() {
        Assert.assertTrue(yayineviPage.tumunuGosterSecilenYayineviNefesYayinlariTextYayinevi.getText().contains("NEFES YAYINLARI"));
    }

    @And("kullanici cok satanlar icindeki ilk urune tiklar")
    public void kullaniciCokSatanlarIcindekiIlkUruneTiklar() {
        yayineviPage.nefesYayinlariIlkUrunYayinevi.click();
    }

    @When("kullanici acilan urunun ayni yayinevine ait oldugunu dogrular")
    public void kullaniciAcilanUrununAyniYayinevineAitOldugunuDogrular() {
        Assert.assertTrue(kitapPage.secilenIlkUrunYayineviNefesYayinlariTextKitap.getText().contains("NEFES"));
    }

    @Given("kullanici ayin yayinevleri basligina gelir")
    public void kullaniciAyinYayinevleriBasliginaGelir() {
        ReusableMethods.scrollIntoViewJS(homePage.ayinYayinevleriTextHome);
    }

    @When("kullanici ayin yayinevi basligi altinda yayinevlerinin adlarini gorur")
    public void kullaniciAyinYayineviBasligiAltindaYayinevlerininAdlariniGorur() {
        Assert.assertTrue(homePage.ayinYayinlariYayineviAdlariTextHome.isDisplayed());
    }

    @And("kullanici ayin_yayinevleri tumunu goster linkine tiklar")
    public void kullaniciAyin_yayinevleriTumunuGosterLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.tumunuGosterAyinYayinevleriLinkHome);
    }

    @And("kullanici ayin_yayinevleri_tumunu_goster acilan sayfada ayin yayinevleri textini goruntuler")
    public void kullaniciAyin_yayinevleri_tumunu_gosterAcilanSayfadaAyinYayinevleriTextiniGoruntuler() {
        assert ayinYayinevleriPage.ayinYayinevleriEylulAyinYayinevleri.isDisplayed();
    }

    @And("kullanici bir yayinevine tiklar")
    public void kullaniciBirYayinevineTiklar() {
        ReusableMethods.clickByJS(ayinYayinevleriPage.pinhanKitapTextAyinYayinevleri);
    }

    @And("kullanici tikladigi yayinevinin adini acilan sayfada goruntuler")
    public void kullaniciTikladigiYayinevininAdiniAcilanSayfadaGoruntuler() {
        assert indexPage.pinhanKitapTextIndex.isDisplayed();
    }

    @And("kullanici secilen yayinevi sayfasindaki ilk urune tiklar")
    public void kullaniciSecilenYayineviSayfasindakiIlkUruneTiklar() {
        ReusableMethods.clickByJS(indexPage.ayinYayinevleriIlkKitapCadılarEbelerVeHemsirelerKadinSifacilarinTarihiIndex);
    }

    @When("kullanici urun adinin yaninda secilen yayinevinin adini gorur")
    public void kullaniciUrunAdininYanindaSecilenYayinevininAdiniGorur() {
        Assert.assertTrue(kitapPage.pinhanYayincilikTextAyinYayinevleriSecilenUrunKitap.isDisplayed());
    }

    @Given("kullanici ayin yazarlari basligina gelir")
    public void kullaniciAyinYazarlariBasliginaGelir() {
        ReusableMethods.hover(homePage.ayinYazarlariTitleTextHome);
    }

    @And("kullanici ilk yazara tiklar")
    public void kullaniciIlkYazaraTiklar() {
        ReusableMethods.clickByJS(homePage.ayinYazarlariTitleTextIlkYazarHome);
    }

    @And("kullanici acilan sayfada ayni yazarin adini gorur")
    public void kullaniciAcilanSayfadaAyniYazarinAdiniGorur() {
        Assert.assertTrue(indexPage.carlGustavJungTextIndex.isDisplayed());
    }

    @And("kullanici yazarin ozgecmisini goruntuler")
    public void kullaniciYazarinOzgecmisiniGoruntuler() {
        Assert.assertTrue(indexPage.carlGustavJungOzgecmisTextIndex .isDisplayed());
    }


    @And("kullanici ozgecmis altinda bulunan takip et linkine tiklar")
    public void kullaniciOzgecmisAltindaBulunanTakipEtLinkineTiklar() {
        ReusableMethods.clickByJS(indexPage.carlGustavJungTakipEtLinkIndex);
    }

    @And("kullanici yazarin takip listesine alindigini gosteren alerti goruntuler")
    public void kullaniciYazarinTakipListesineAlindiginiGosterenAlertiGoruntuler() {
        Assert.assertTrue(indexPage.carlGustavJungTakipListenizeEklendiAlertIndex.isDisplayed());
    }

    @And("kullanici yazarin ilk kitabina tiklar")
    public void kullaniciYazarinIlkKitabinaTiklar() {
        ReusableMethods.clickByJS(indexPage.carlGustavJungIlkUrunIndex);
    }

    @And("kullanici secilen kitabin yaninda yazarin adini goruntuler")
    public void kullaniciSecilenKitabinYanindaYazarinAdiniGoruntuler() {
    }

    @And("kullanici kitapla ilgili aciklama yazisini gorur")
    public void kullaniciKitaplaIlgiliAciklamaYazisiniGorur() {
    }

    @And("kullanici ic sayfalara goz at linkine tiklar")
    public void kullaniciIcSayfalaraGozAtLinkineTiklar() {
    }

    @And("kullanici acilan sayfada ileri tusuna tiklar")
    public void kullaniciAcilanSayfadaIleriTusunaTiklar() {
    }

    @And("kullanici acilan kitabin icerigini goruntuler")
    public void kullaniciAcilanKitabinIceriginiGoruntuler() {
    }

    @And("kullanici kitap icerigini kapatir")
    public void kullaniciKitapIceriginiKapatir() {
    }

    @And("kullanici yorumlar linkine tiklar")
    public void kullaniciYorumlarLinkineTiklar() {
    }

    @And("kullanici yapilan yorumlari goruntuler")
    public void kullaniciYapilanYorumlariGoruntuler() {
    }

    @And("kullanici urun hakkinda yorum yazar")
    public void kullaniciUrunHakkindaYorumYazar() {
    }

    @And("kullanici yorumlar_gonder butonuna tiklar")
    public void kullaniciYorumlar_gonderButonunaTiklar() {
    }

    @When("kullanici en az bir siparisi buluna epostasi dogrulanmis uyeler yorum yapabilir alertini goruntuler")
    public void kullaniciEnAzBirSiparisiBulunaEpostasiDogrulanmisUyelerYorumYapabilirAlertiniGoruntuler() {
    }
}
