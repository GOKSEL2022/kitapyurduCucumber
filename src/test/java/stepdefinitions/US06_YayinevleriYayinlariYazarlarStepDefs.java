package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class US06_YayinevleriYayinlariYazarlarStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());

    @Given("kullanici haftanin yayinevi basligina gelir")
    public void kullaniciHaftaninYayineviBasliginaGelir() {
        actions.moveToElement(allPages.homePage().haftaninYayineviTextHome).perform();
    }
    @When("kullanici secilen yayinevini goruntuler")
    public void kullaniciSecilenYayineviniGoruntuler() {
        assert allPages.homePage().nefesYayinlariHaftaninYayineviTextHome.isDisplayed();
    }
    @And("kullanici yapilan indirim miktarini goruntuler")
    public void kullaniciYapilanIndirimMiktariniGoruntuler() {
        assert allPages.homePage().indirimMiktariNefesYayinlariTextHome.getText().contains("45");
    }
    @And("kullanici tumunu goster linkine tiklar")
    public void kullaniciTumunuGosterLinkineTiklar() {
        clickByJS(allPages.homePage().tumunuGosterLinkHome);
    }
    @And("kullanici acilan sayfada haftanin yayinevinin adini goruntuler")
    public void kullaniciAcilanSayfadaHaftaninYayinevininAdiniGoruntuler() {
        assert allPages.yayineviPage().tumunuGosterSecilenYayineviNefesYayinlariTextYayinevi.getText().contains("NEFES YAYINLARI");
    }
    @And("kullanici cok satanlar icindeki ilk urune tiklar")
    public void kullaniciCokSatanlarIcindekiIlkUruneTiklar() {
        allPages.yayineviPage().nefesYayinlariIlkUrunYayinevi.click();
    }
    @When("kullanici acilan urunun ayni yayinevine ait oldugunu dogrular")
    public void kullaniciAcilanUrununAyniYayinevineAitOldugunuDogrular() {
        assert allPages.kitapPage().secilenIlkUrunYayineviNefesYayinlariTextKitap.getText().contains("NEFES");
    }
    @Given("kullanici ayin yayinevleri basligina gelir")
    public void kullaniciAyinYayinevleriBasliginaGelir() {
        scrollIntoViewJS(allPages.homePage().ayinYayinevleriTextHome);
    }
    @When("kullanici ayin yayinevi basligi altinda yayinevlerinin adlarini gorur")
    public void kullaniciAyinYayineviBasligiAltindaYayinevlerininAdlariniGorur() {
        assert allPages.homePage().ayinYayinlariYayineviAdlariTextHome.isDisplayed();
    }
    @And("kullanici ayin_yayinevleri tumunu goster linkine tiklar")
    public void kullaniciAyin_yayinevleriTumunuGosterLinkineTiklar() {
        clickByJS(allPages.homePage().tumunuGosterAyinYayinevleriLinkHome);
    }
    @And("kullanici ayin_yayinevleri_tumunu_goster acilan sayfada ayin yayinevleri textini goruntuler")
    public void kullaniciAyin_yayinevleri_tumunu_gosterAcilanSayfadaAyinYayinevleriTextiniGoruntuler() {
        assert allPages.ayinYayinevleriPage().ayinYayinevleriEylulAyinYayinevleri.isDisplayed();
    }
    @And("kullanici bir yayinevine tiklar")
    public void kullaniciBirYayinevineTiklar() {
        clickByJS(allPages.ayinYayinevleriPage().pinhanKitapTextAyinYayinevleri);
    }
    @And("kullanici tikladigi yayinevinin adini acilan sayfada goruntuler")
    public void kullaniciTikladigiYayinevininAdiniAcilanSayfadaGoruntuler() {
        assert allPages.indexPage().pinhanKitapTextIndex.isDisplayed();
    }
    @And("kullanici secilen yayinevi sayfasindaki ilk urune tiklar")
    public void kullaniciSecilenYayineviSayfasindakiIlkUruneTiklar() {
        clickByJS(allPages.indexPage().ayinYayinevleriIlkKitapCadılarEbelerVeHemsirelerKadinSifacilarinTarihiIndex);
    }
    @When("kullanici urun adinin yaninda secilen yayinevinin adini gorur")
    public void kullaniciUrunAdininYanindaSecilenYayinevininAdiniGorur() {
        assert allPages.kitapPage().pinhanYayincilikTextAyinYayinevleriSecilenUrunKitap.isDisplayed();
    }
    @Given("kullanici ayin yazarlari basligina gelir")
    public void kullaniciAyinYazarlariBasliginaGelir() {
       hover(allPages.homePage().ayinYazarlariTitleTextHome);
    }
    @And("kullanici ilk yazara tiklar")
    public void kullaniciIlkYazaraTiklar() {
        clickByJS(allPages.homePage().ayinYazarlariTitleTextIlkYazarHome);
    }
    @And("kullanici acilan sayfada ayni yazarin adini gorur")
    public void kullaniciAcilanSayfadaAyniYazarinAdiniGorur() {
        assert allPages.indexPage().carlGustavJungTextIndex.isDisplayed();
    }
    @And("kullanici yazarin ozgecmisini goruntuler")
    public void kullaniciYazarinOzgecmisiniGoruntuler() {
        assert allPages.indexPage().carlGustavJungOzgecmisTextIndex.isDisplayed();
    }
    @And("kullanici ozgecmis altinda bulunan takip et linkine tiklar")
    public void kullaniciOzgecmisAltindaBulunanTakipEtLinkineTiklar() {
        clickByJS(allPages.indexPage().carlGustavJungTakipEtLinkIndex);
    }
    @And("kullanici yazarin takip listesine alindigini gosteren alerti goruntuler")
    public void kullaniciYazarinTakipListesineAlindiginiGosterenAlertiGoruntuler() {
        assert allPages.indexPage().carlGustavJungTakipListenizeEklendiAlertIndex.isDisplayed();
    }
    @And("kullanici yazarin ilk kitabina tiklar")
    public void kullaniciYazarinIlkKitabinaTiklar() {
        clickByJS(allPages.indexPage().carlGustavJungIlkUrunIndex);
    }
    @And("kullanici secilen kitabin yaninda yazarin adini goruntuler")
    public void kullaniciSecilenKitabinYanindaYazarinAdiniGoruntuler() {
        assert allPages.kitapPage().yazarAdiTextIlkUrunKitap.isDisplayed();
    }
    @And("kullanici kitapla ilgili aciklama yazisini gorur")
    public void kullaniciKitaplaIlgiliAciklamaYazisiniGorur() {
        assert allPages.kitapPage().ayinYazarlariIlkUrunDescriptionKitap.isDisplayed();
    }
    @And("kullanici ic sayfalara goz at linkine tiklar")
    public void kullaniciIcSayfalaraGozAtLinkineTiklar() {
        clickByJS(allPages.kitapPage().icSayfalaraGozAtLinkKitap);
    }
    @And("kullanici acilan sayfada ileri tusuna tiklar")
    public void kullaniciAcilanSayfadaIleriTusunaTiklar() {
        clickByJS(allPages.kitapPage().ileriYonTusuAyinYazarlariIlkUrunKitap);
    }
    @And("kullanici acilan kitabin icerigini goruntuler")
    public void kullaniciAcilanKitabinIceriginiGoruntuler() {
        assert allPages.kitapPage().sayfaIcerigiAyinYazarlariIlkUrunKitap.isDisplayed();
    }
    @And("kullanici kitap icerigini kapatir")
    public void kullaniciKitapIceriginiKapatir() {
        clickByJS(allPages.kitapPage().sayfaIceriginiKapatAyinYazarlariIlkUrunKitap);
    }
    @And("kullanici yorumlar linkine tiklar")
    public void kullaniciYorumlarLinkineTiklar() {
        clickByJS(allPages.kitapPage().yorumlarLinkAyinYazarlariIlkUrunKitap);
    }
    @And("kullanici yapilan yorumlari goruntuler")
    public void kullaniciYapilanYorumlariGoruntuler() {
        assert allPages.kitapPage().yapilanYorumlarTextAyinYazarlariIlkUrunKitap.isDisplayed();
    }
    @And("kullanici urun hakkinda yorum yazar")
    public void kullaniciUrunHakkindaYorumYazar() {
        allPages.kitapPage().yorumYazTextBoxAyinYazarlariIlkUrunKitap.sendKeys(Faker.instance().lorem().paragraph());
    }
    @And("kullanici yorumlar_gonder butonuna tiklar")
    public void kullaniciYorumlar_gonderButonunaTiklar() {
        clickByJS(allPages.kitapPage().gonderButonYorumYazTextBoxAyinYazarlariIlkUrunKitap);
    }
    @When("kullanici en az bir siparisi bulunan epostasi dogrulanmis uyeler yorum yapabilir alertini goruntuler")
    public void kullaniciEnAzBirSiparisiBulunanEpostasiDogrulanmisUyelerYorumYapabilirAlertiniGoruntuler() {
        assert allPages.kitapPage().enAzBirSiparisiBulunanEpostasiDogrulanmisUyelerYorumYapabilirAlertKitap.getText().contains("Kitapyurdu'nda en az bir siparişi bulunan e-posta adresi doğrulanmış üyeler yorum yapabilmektedir");
    }
}
