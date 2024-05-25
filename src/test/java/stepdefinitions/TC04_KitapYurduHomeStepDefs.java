package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.clickByJS;

public class TC04_KitapYurduHomeStepDefs {
    int sayi1=Faker.instance().number().numberBetween(100,999);
    int sayi2=Faker.instance().number().numberBetween(100,999);
    Actions actions=new Actions(Driver.getDriver());
    AllPages allPages=new AllPages();
    HomePage homePage=new HomePage();
    KitapPage kitapPage=new KitapPage();
    IndexPage indexPage=new IndexPage();
    IletisimPage iletisimPage=new IletisimPage();

    @And("kullanici anasayfanin en altina gelir")
    public void kullaniciAnasayfaninEnAltinaGelir() {
        allPages.homePage().enAltaInYonButonHome.click();
    }

    @And("kullanici anasayfanin en üst kismina gider")
    public void kullaniciAnasayfaninEnÜstKisminaGider() {
        allPages.homePage().enUsteCikYonButonHome.click();
    }

    @And("kullanici bir saniye bekler")
    public void kullaniciBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Given("kullanici sag yon tusuna tiklar")
    public void kullaniciSagYonTusunaTiklar() {
        for (int i=1;i<allPages.homePage().anasayfaKaydiriciResimlerHome.size();i++){
            allPages.homePage().sagYonKaydiriciButonHome.click();
        }
    }
    @When("kullanici sag yon tusunun erisilebilir oldugunu dogrular")
    public void kullaniciSagYonTusununErisilebilirOldugunuDogrular() {
        assert allPages.homePage().sagYonKaydiriciButonHome.isEnabled();
    }
    @And("kullanici sol yon tusuna tiklar")
    public void kullaniciSolYonTusunaTiklar() {
        for (int i=1;i<allPages.homePage().anasayfaKaydiriciResimlerHome.size();i++) {
            allPages.homePage().solYonKaydiriciButonHome.click();
        }
    }

    @And("kullanici sol yon tusunun erisilebilir oldugunu dogrular")
    public void kullaniciSolYonTusununErisilebilirOldugunuDogrular() {
        assert allPages.homePage().solYonKaydiriciButonHome.isEnabled();
    }

    @And("kullanici anasayfada birden fazla resim oldugunu dogrular")
    public void kullaniciAnasayfadaOnBesAdetKaydiriciOldugunuDogrular() {
       Assert.assertTrue(allPages.homePage().anasayfaKaydiriciResimlerHome.size()>1);
    }

    @Given("kullanici anasayfadaki ilk urune tiklar")
    public void kullaniciAnasayfadakiIlkUruneTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        clickByJS(allPages.homePage().anasayfaIlkUrunHome);
    }

    @When("kullanici secilen urunun sayfada goruntulendigini dogrular")
    public void kullaniciSecilenUrununSayfadaGoruntulendiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kavanozda");
    }

    @And("kullanici urunun yaninda aciklama yazisini goruntuler")
    public void kullaniciUrununYanindaAciklamaYazisiniGoruntuler() {
        assert allPages.kitapPage().ilkUrunDescriptionTextKitap.isDisplayed();
    }

    @And("kullanici urunun altinda yorum bolumunu goruntuler")
    public void kullaniciUrununAltindaYorumBolumunuGoruntuler() {
        assert allPages.kitapPage().ilkUrunYorumlarKitap.isDisplayed();
    }

    @And("kullanici urunle ilgili aciklamanin altinda temel bilgileri \\(sayfa,cilt) goruntuler")
    public void kullaniciUrunleIlgiliAciklamaninAltindaTemelBilgileriSayfaCiltGoruntuler() {
        assert allPages.kitapPage().ilkUrunKitapBilgileriKitap.isDisplayed();
    }

    @And("kullanici urunun yaninda fiyat bilgisini goruntuler")
    public void kullaniciUrununYanindaFiyatBilgisiniGoruntuler() {
        assert allPages.kitapPage().urunFiyatiKitap.isDisplayed();
    }

    @And("kullanici sepete git butonua tiklar")
    public void kullaniciSepeteGitButonuaTiklar() {
        allPages.kitapPage().sepeteGitButonKitap.click();
    }

    @And("kullanici sectigi urunun sepete eklendigini goruntuler")
    public void kullaniciSectigiUrununSepeteEklendiginiGoruntuler() {
        assert allPages.indexPage().secilenUrunKitap.isDisplayed();
    }
    @And("kullanici urun basliginin yanindaki radio butonu tiklar")
    public void kullaniciUrunBasligininYanindakiRadioButonuTiklar() {
        allPages.indexPage().secilenUrunCheckboxAltIndex.click();
    }
    @And("kullanici urun gorselinin yanindaki radio butonu tiklar")
    public void kullaniciUrunGorselininYanindakiRadioButonuTiklar() {
        allPages.indexPage().secilenUrunCheckboxUstIndex.click();
    }

    @And("kullanici urunun altinda alisveris sonrasi kazanacagi puani goruntuler")
    public void kullaniciUrununAltindaAlisverisSonrasiKazanacagiPuaniGoruntuler() {
        assert allPages.indexPage().secilenUrunKazanacaginizPuanKitap.isDisplayed();
    }

    @And("kullanici urun miktarini goruntuler")
    public void kullaniciUrunMiktariniGoruntuler() {
        assert allPages.indexPage().secilenUrunMiktarIndex.isDisplayed();
    }

    @And("kullanici tedarik suresini goruntuler")
    public void kullaniciTedarikSuresiniGoruntuler() {
        assert allPages.indexPage().secilenUrunTedarikSuresiIndex.isDisplayed();
    }

    @And("kullanici birim fiyati goruntuler")
    public void kullaniciBirimFiyatiGoruntuler() {
        Assert.assertTrue(indexPage.secilenUrunBirimFiyatiIndex.isDisplayed());
    }

    @And("kullanici toplam fiyati goruntuler")
    public void kullaniciToplamFiyatiGoruntuler() {
        assert allPages.indexPage().secilenUrunToplamIndex.isDisplayed();
    }

    @And("kullanici secili urunu sepetten kaldirmak icin x e tiklar")
    public void kullaniciSeciliUrunuSepettenKaldirmakIcinXETiklar() {
        allPages.indexPage().secilenUrunListedenKaldirIndex.click();
    }

    @When("kullanici secilen Urunun sepetten Cikarildigini dogrular")
    public void kullaniciSecilenUrununSepettenCikarildiginiDogrular() {
        assert allPages.indexPage().secilenUrunSepetinizdenCikariliyorAlertIndex.isDisplayed();
    }

    @Given("kullanici fikrinizi bizimle paylasir misiniz sembolune tiklar")
    public void kullaniciFikriniziBizimlePaylasirMisinizSemboluneTiklar() {
        clickByJS(allPages.homePage().fikriniziPaylasirmisinizSembolButonHome);
    }

    @When("kullanici onerim var formunun acildigini dogrular")
    public void kullaniciOnerimVarFormununAcildiginiDogrular() {
        assert allPages.homePage().onerimVarTextHome.isDisplayed();
    }

    @And("kullanici ad-soyad alanina {string} girer")
    public void kullaniciAdSoyadAlaninaGirer(String string) {
        allPages.homePage().onerimVarAdSoyadHome.sendKeys(Faker.instance().name().fullName());
    }

    @And("kullanici e-posta alanina {string} girer")
    public void kullaniciEPostaAlaninaGirer(String string) {
        allPages.homePage().onerimVarEmailHome.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("kullanici seciniz kismindan oneriyi secer")
    public void kullaniciSecinizKismindanOneriyiSecer() {
        Select select=new Select(allPages.homePage().onerimVarSecinizDropDownHome);
        select.selectByVisibleText("Öneri");
    }

    @And("kullanici gorusunuz alanina {string} girer")
    public void kullaniciGorusunuzAlaninaGirer(String string) {
        allPages.homePage().onerimVarGorusunuzHome.sendKeys(Faker.instance().lorem().paragraph());
    }

    @And("kullanici dogrulama kodu kismina alti haneli sayi girer")
    public void kullaniciDogrulamaKoduKisminaAltiHaneliSayiGirer() {
        allPages.homePage().onerimVarDogrulamaKoduHome.sendKeys(""+sayi1+sayi2);
    }
    @And("kullanici gonder butonuna tiklar")
    public void kullaniciGonderButonunaTiklar() {
        clickByJS(allPages.homePage().onerimVarGonderButonHome);
    }
    @When("kullanici girmis oldugunuz dogrulama kodu hatalidir uyarisini gorur")
    public void kullaniciGirmisOldugunuzDogrulamaKoduHatalidirUyarisiniGorur() {
        assert allPages.homePage().onerimVarHataliKodMesajiHome.isDisplayed();
    }

    @When("kullanici iletisim linkine tiklar")
    public void kullaniciIletisimLinkineTiklar() {
        clickByJS(allPages.homePage().iletisimLinkHome);
    }

    @And("kullanici seciniz dropdownindan oneri secer")
    public void kullaniciSecinizDropdownindanOneriSecer() {
        Select select=new Select(allPages.iletisimPage().secinizDropDownIletisim);
        select.selectByVisibleText("Öneri");
    }


    @And("kullanici adiniz alanina {string} girer")
    public void kullaniciAdinizAlaninaGirer(String string) {
        allPages.iletisimPage().adinizTextBoxIletisim.sendKeys(Faker.instance().name().fullName());
    }

    @And("kullanici e-posta adresiniz {string} girer")
    public void kullaniciEPostaAdresinizGirer(String string) {
        allPages.iletisimPage().emailTextBoxIletisim.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("kullanici mesajiniz alanina {string} girer")
    public void kullaniciMesajinizAlaninaGirer(String string) {
        allPages.iletisimPage().mesajinizTextBoxIletisim.sendKeys(Faker.instance().lorem().paragraph());
    }

    @And("kullanici dogrulama kodu alanina {string} girer")
    public void kullaniciDogrulamaKoduAlaninaGirer(String string) {
        allPages.iletisimPage().dogrulamaKodunuzTextBoxIletisim.sendKeys(""+sayi1+sayi2);
    }

    @When("kullanici gonder butona tiklar")
    public void kullaniciGonderButonaTiklar() {
        clickByJS(allPages.iletisimPage().gonderButonIletisim);    }

    @Then("kullanici dogrulama kodu yanlis uyarisini gorur")
    public void kullaniciDogrulamaKoduYanlisUyarisiniGorur() {
        assert allPages.iletisimPage().dogrulamKoduYanlisHataMesajiIletisim.isDisplayed();
    }
}
