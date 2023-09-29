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
        ReusableMethods.clickByJS(ayinYayinevleriPage.tutiKitapTextAyinYayinevleri);
    }

    @And("kullanici tikladigi yayinevinin adini acilan sayfada goruntuler")
    public void kullaniciTikladigiYayinevininAdiniAcilanSayfadaGoruntuler() {
        assert indexPage.tutiKitapTextIndex.isDisplayed();
    }

    @And("kullanici secilen yayinevi sayfasindaki ilk urune tiklar")
    public void kullaniciSecilenYayineviSayfasindakiIlkUruneTiklar() {
        ReusableMethods.clickByJS(indexPage.ayinYayinevleriIlkKitapInsaninFabrikaAyarlariIndex);
    }

    @When("kullanici urun adinin yaninda secilen yayinevinin adini gorur")
    public void kullaniciUrunAdininYanindaSecilenYayinevininAdiniGorur() {
    }
}
