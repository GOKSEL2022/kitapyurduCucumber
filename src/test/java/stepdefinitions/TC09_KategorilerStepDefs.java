package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.IndexPage;
import pages.KategoriPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC09_KategorilerStepDefs {
    HomePage homePage=new HomePage();
    IndexPage indexPage=new IndexPage();
    KategoriPage kategoriPage=new KategoriPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici kategoriler basligina gelir")
    public void kullaniciKategorilerBasliginaGelir() {
        ReusableMethods.scrollIntoViewJS(homePage.kategorilerTextHome);
    }
    @And("kullanici kategoriler tumunu goster linkine tiklar")
    public void kullaniciKategorilerTumunuGosterLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.tumunuGosterLinkKategorilerHome);
    }

    @And("kullanici acilan sayfada tum kategorileri goruntuler")
    public void kullaniciAcilanSayfadaTumKategorileriGoruntuler() {
        assert indexPage.tumKategorilerLinkKitapKategorileriIndex.isDisplayed();
    }

    @And("kullanici tum kategoriler icinden edebiyata tiklar")
    public void kullaniciTumKategorilerIcindenEdebiyataTiklar() {
        ReusableMethods.clickByJS(indexPage.edebiyatSembolKitapKategorileriIndex);
    }

    @And("kullanici acilan sayfada edebiyat urunleri oldugunu dogrular")
    public void kullaniciAcilanSayfadaEdebiyatUrunleriOldugunuDogrular() {
        assert kategoriPage.tumKitaplarEdebiyatTextKategori.isDisplayed();
    }

    @And("kullanici alt kategorilerden belgesel romana tiklar")
    public void kullaniciAltKategorilerdenBelgeselRomanaTiklar() {
        ReusableMethods.clickByJS(kategoriPage.belgeselRomanLinkEdebiyatAltKategorilerKategoriler);
    }

    @And("kullanici acilan sayfada belgesel roman basligini goruntuler")
    public void kullaniciAcilanSayfadaBelgeselRomanBasliginiGoruntuler() {
        assert kategoriPage.belgeselRomanTextKategori.isDisplayed();
    }

    @And("kullanici listeyi daralt menuden Ayse Kulin i  secer")
    public void kullaniciListeyiDaraltMenudenAyseKulinISecer() {
        ReusableMethods.scrollIntoViewJS(kategoriPage.ayseKulinLinkKategori);
        ReusableMethods.clickByJS(kategoriPage.ayseKulinLinkKategori);
    }

    @And("kullanici acilan sayfada Ayse Kulin in romanlarini goruntuler")
    public void kullaniciAcilanSayfadaAyseKulinInRomanlariniGoruntuler() {
        assert indexPage.turkanRomaniAyseKulinIndex.isDisplayed();
    }

    @And("kullanici sayfadaki urunleri sepete ekler")
    public void kullaniciSayfadakiUrunleriSepeteEkler() {
        actions.moveToElement(indexPage.turkanRomaniAyseKulinIndex).perform();
        ReusableMethods.clickByJS(indexPage.sepeteEkleTurkanRomaniAyseKulinIndex);
    }


    @When("kullanici onayli yorumlar linkine tiklar")
    public void kullaniciOnayliYorumlarLinkineTiklar() {
    }

    @And("kullanici onayli yorumlarla ilgili secenekleri goruntuler")
    public void kullaniciOnayliYorumlarlaIlgiliSecenekleriGoruntuler() {
    }

    @And("kullanici onayli yorumlari inceleyin secenegine tiklar")
    public void kullaniciOnayliYorumlariInceleyinSecenegineTiklar() {
    }

    @And("kullanici onayli yorumlar sayfasinin acildigini dogrular")
    public void kullaniciOnayliYorumlarSayfasininAcildiginiDogrular() {
    }

    @And("kullanici sirala dropdownindan en begenilenleri secer")
    public void kullaniciSiralaDropdownindanEnBegenilenleriSecer() {
    }

    @And("kullanici en begenilen yorum ile en yeni yorumun ayni olmadigini dogrular")
    public void kullaniciEnBegenilenYorumIleEnYeniYorumunAyniOlmadiginiDogrular() {
    }

    @And("kullanici yorumun yaninda ilgili kitabi gorur")
    public void kullaniciYorumunYanindaIlgiliKitabiGorur() {
    }

    @And("kullanici yorumlarin altinda bulunan evet sembolunun aktif oldugunu dogrular")
    public void kullaniciYorumlarinAltindaBulunanEvetSembolununAktifOldugunuDogrular() {
    }

    @And("kullanici evet sembolunden sonra hayir sembolune tikladiginda bu yorumu daha once oyladiniz uyarisini gorur")
    public void kullaniciEvetSembolundenSonraHayirSemboluneTikladigindaBuYorumuDahaOnceOyladinizUyarisiniGorur() {
    }

    @And("kullanici bu yorumu yanitla linke tiklar")
    public void kullaniciBuYorumuYanitlaLinkeTiklar() {
    }

    @When("kullanici yanitlama iznine sahip degilsiniz uyarisini gorur")
    public void kullaniciYanitlamaIznineSahipDegilsinizUyarisiniGorur() {
    }
}

