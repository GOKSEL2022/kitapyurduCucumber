package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;
import static utilities.ReusableMethods.scrollIntoViewJS;
public class US08_KategorilerStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());  SoftAssert softAssert=new SoftAssert();
    @Given("kullanici kategoriler basligina gelir")
    public void kullaniciKategorilerBasliginaGelir() {
        scrollIntoViewJS(allPages.homePage().kategorilerTextHome);
    }
    @And("kullanici kategoriler tumunu goster linkine tiklar")
    public void kullaniciKategorilerTumunuGosterLinkineTiklar() {
        clickByJS(allPages.homePage().tumunuGosterLinkKategorilerHome);
    }

    @And("kullanici acilan sayfada tum kategorileri goruntuler")
    public void kullaniciAcilanSayfadaTumKategorileriGoruntuler() {
        assert allPages.indexPage().tumKategorilerLinkKitapKategorileriIndex.isDisplayed();
    }

    @And("kullanici tum kategoriler icinden edebiyata tiklar")
    public void kullaniciTumKategorilerIcindenEdebiyataTiklar() {
        clickByJS(allPages.indexPage().edebiyatSembolKitapKategorileriIndex);
    }

    @And("kullanici acilan sayfada edebiyat urunleri oldugunu dogrular")
    public void kullaniciAcilanSayfadaEdebiyatUrunleriOldugunuDogrular() {
        assert allPages.kategoriPage().tumKitaplarEdebiyatTextKategori.isDisplayed();
    }

    @And("kullanici alt kategorilerden belgesel romana tiklar")
    public void kullaniciAltKategorilerdenBelgeselRomanaTiklar() {
        clickByJS(allPages.kategoriPage().belgeselRomanLinkEdebiyatAltKategorilerKategoriler);
    }

    @And("kullanici acilan sayfada belgesel roman basligini goruntuler")
    public void kullaniciAcilanSayfadaBelgeselRomanBasliginiGoruntuler() {
        assert allPages.kategoriPage().belgeselRomanTextKategori.isDisplayed();
    }

    @And("kullanici listeyi daralt menuden Ayse Kulin i  secer")
    public void kullaniciListeyiDaraltMenudenAyseKulinISecer() {
        scrollIntoViewJS(allPages.kategoriPage().ayseKulinLinkKategori);
        clickByJS(allPages.kategoriPage().ayseKulinLinkKategori);
    }

    @And("kullanici acilan sayfada Ayse Kulin in romanlarini goruntuler")
    public void kullaniciAcilanSayfadaAyseKulinInRomanlariniGoruntuler() {
        assert allPages.indexPage().turkanRomaniAyseKulinIndex.isDisplayed();
    }

    @And("kullanici sayfadaki urunleri sepete ekler")
    public void kullaniciSayfadakiUrunleriSepeteEkler() {
        actions.moveToElement(allPages.indexPage().turkanRomaniAyseKulinIndex).perform();
        clickByJS(allPages.indexPage().sepeteEkleTurkanRomaniAyseKulinIndex);
    }


    @When("kullanici onayli yorumlar linkine tiklar")
    public void kullaniciOnayliYorumlarLinkineTiklar() {
        clickByJS(allPages.homePage().onayliYorumlarLinkHome);
    }

    @And("kullanici onayli yorumlarla ilgili secenekleri goruntuler")
    public void kullaniciOnayliYorumlarlaIlgiliSecenekleriGoruntuler() {
        softAssert.assertTrue(allPages.onayliYorumPage().onayliYorumBulunanKitaplarLinkOnayliYorumlar.isDisplayed());
        softAssert.assertTrue(allPages.onayliYorumPage().onayliYorumlariInceleyinLinkOnayliYorumlar.isDisplayed());
        softAssert.assertTrue(allPages.onayliYorumPage().onayliYorumlarIleYenidenKesfedinLinkOnayliYorumlar.isDisplayed());
        softAssert.assertAll();
    }

    @And("kullanici onayli yorumlari inceleyin secenegine tiklar")
    public void kullaniciOnayliYorumlariInceleyinSecenegineTiklar() {
        clickByJS(allPages.onayliYorumPage().onayliYorumlariInceleyinLinkOnayliYorumlar);
    }

    @And("kullanici onayli yorumlar sayfasinin acildigini dogrular")
    public void kullaniciOnayliYorumlarSayfasininAcildiginiDogrular() {
        assert allPages.indexPage().onayliYorumlarTextIndex.isDisplayed();
    }

    @And("kullanici sirala dropdownindan en begenilenleri secer")
    public void kullaniciSiralaDropdownindanEnBegenilenleriSecer() {
        new Select(allPages.indexPage().onayliYorumlarDropDownIndex).selectByVisibleText("En Beğenilenler");
    }

    @And("kullanici en begenilen yorum ile en yeni yorumun ayni olmadigini dogrular")
    public void kullaniciEnBegenilenYorumIleEnYeniYorumunAyniOlmadiginiDogrular() {
        assert allPages.indexPage().enBegenilenOnayliYorumTextIndex.getText().contains("Milletinin Adı Sanı Yok Olmasın Diye Yazan Mirza Haydar");

    }
    @And("kullanici yorumun yaninda ilgili kitabi gorur")
    public void kullaniciYorumunYanindaIlgiliKitabiGorur() {
        assert allPages.indexPage().atomikAliskanliklarKitabiOnayliYorumlarIndex.isDisplayed();
    }

    @And("kullanici yorumlarin altinda bulunan evet sembolunun aktif oldugunu dogrular")
    public void kullaniciYorumlarinAltindaBulunanEvetSembolununAktifOldugunuDogrular() {
        assert allPages.indexPage().evetLinkiBuYorumaKatiliyorMusunuzIndex.isDisplayed();
        clickByJS(allPages.indexPage().evetLinkiBuYorumaKatiliyorMusunuzIndex);
    }

    @And("kullanici evet sembolunden sonra hayir sembolune tikladiginda bu yorumu daha once oyladiniz uyarisini gorur")
    public void kullaniciEvetSembolundenSonraHayirSemboluneTikladigindaBuYorumuDahaOnceOyladinizUyarisiniGorur() {
        clickByJS(allPages.indexPage().hayirLinkiBuYorumaKatiliyorMusunuzIndex);
        assert allPages.indexPage().buYorumuDahaOnceOyladinizAlertIndex.isDisplayed();
    }

    @And("kullanici bu yorumu yanitla linke tiklar")
    public void kullaniciBuYorumuYanitlaLinkeTiklar() {
        clickByJS(allPages.indexPage().buYorumuYanitlaLinkiOnayliYorumlarIndex);
    }

    @When("kullanici yanitlama iznine sahip degilsiniz uyarisini gorur")
    public void kullaniciYanitlamaIznineSahipDegilsinizUyarisiniGorur() {
        assert allPages.indexPage().yanitlamaIznineSahipDegilsinizAlertIndex.isDisplayed();
    }
}

