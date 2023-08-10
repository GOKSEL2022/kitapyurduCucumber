package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.IletisimPage;
import pages.IndexPage;
import pages.KitapPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC04_KitapYurduHomeStepDefs {
    int sayi1=Faker.instance().number().numberBetween(100,999);
    int sayi2=Faker.instance().number().numberBetween(100,999);
    HomePage homePage=new HomePage();
    KitapPage kitapPage=new KitapPage();
    IndexPage indexPage=new IndexPage();
    IletisimPage iletisimPage=new IletisimPage();

    @And("kullanici anasayfanin en altina gelir")
    public void kullaniciAnasayfaninEnAltinaGelir() {
        homePage.enAltaInYonButonHome.click();
    }

    @And("kullanici anasayfanin en üst kismina gider")
    public void kullaniciAnasayfaninEnÜstKisminaGider() {
        homePage.enUsteCikYonButonHome.click();
    }

    @And("kullanici bir saniye bekler")
    public void kullaniciBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Given("kullanici sag yon tusuna tiklar")
    public void kullaniciSagYonTusunaTiklar() {
        for (int i=1;i<homePage.anasayfaKaydiriciResimlerHome.size();i++){
            homePage.sagYonKaydiriciButonHome.click();
        }
    }
    @When("kullanici sag yon tusunun erisilebilir oldugunu dogrular")
    public void kullaniciSagYonTusununErisilebilirOldugunuDogrular() {
        Assert.assertTrue(homePage.sagYonKaydiriciButonHome.isEnabled());
    }
    @And("kullanici sol yon tusuna tiklar")
    public void kullaniciSolYonTusunaTiklar() {
        for (int i=1;i<homePage.anasayfaKaydiriciResimlerHome.size();i++) {
            homePage.solYonKaydiriciButonHome.click();
        }
    }

    @And("kullanici sol yon tusunun erisilebilir oldugunu dogrular")
    public void kullaniciSolYonTusununErisilebilirOldugunuDogrular() {
        Assert.assertTrue(homePage.solYonKaydiriciButonHome.isEnabled());
    }

    @And("kullanici anasayfada birden fazla resim oldugunu dogrular")
    public void kullaniciAnasayfadaOnBesAdetKaydiriciOldugunuDogrular() {
       Assert.assertTrue(homePage.anasayfaKaydiriciResimlerHome.size()>1);
    }

    @Given("kullanici anasayfadaki ilk urune tiklar")
    public void kullaniciAnasayfadakiIlkUruneTiklar() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.clickByJS(homePage.anasayfaIlkUrunHome);
    }

    @When("kullanici secilen urunun sayfada goruntulendigini dogrular")
    public void kullaniciSecilenUrununSayfadaGoruntulendiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("kavanozda"));
    }

    @And("kullanici urunun yaninda aciklama yazisini goruntuler")
    public void kullaniciUrununYanindaAciklamaYazisiniGoruntuler() {
        Assert.assertTrue(kitapPage.ilkUrunDescriptionTextKitap.isDisplayed());
    }

    @And("kullanici urunun altinda yorum bolumunu goruntuler")
    public void kullaniciUrununAltindaYorumBolumunuGoruntuler() {
        Assert.assertTrue(kitapPage.ilkUrunYorumlarKitap.isDisplayed());
    }

    @And("kullanici urunle ilgili aciklamanin altinda temel bilgileri \\(sayfa,cilt) goruntuler")
    public void kullaniciUrunleIlgiliAciklamaninAltindaTemelBilgileriSayfaCiltGoruntuler() {
        Assert.assertTrue(kitapPage.ilkUrunKitapBilgileriKitap.isDisplayed());
    }

    @And("kullanici urunun yaninda fiyat bilgisini goruntuler")
    public void kullaniciUrununYanindaFiyatBilgisiniGoruntuler() {
        Assert.assertTrue(kitapPage.urunFiyatiKitap.isDisplayed());
    }

    @And("kullanici sepete git butonua tiklar")
    public void kullaniciSepeteGitButonuaTiklar() {
        kitapPage.sepeteGitButonKitap.click();
    }

    @And("kullanici sectigi urunun sepete eklendigini goruntuler")
    public void kullaniciSectigiUrununSepeteEklendiginiGoruntuler() {
        Assert.assertTrue(indexPage.secilenUrunKitap.isDisplayed());
    }
    @And("kullanici urun basliginin yanindaki radio butonu tiklar")
    public void kullaniciUrunBasligininYanindakiRadioButonuTiklar() {
        indexPage.secilenUrunCheckboxAltIndex.click();
    }
    @And("kullanici urun gorselinin yanindaki radio butonu tiklar")
    public void kullaniciUrunGorselininYanindakiRadioButonuTiklar() {
        indexPage.secilenUrunCheckboxUstIndex.click();
    }

    @And("kullanici urunun altinda alisveris sonrasi kazanacagi puani goruntuler")
    public void kullaniciUrununAltindaAlisverisSonrasiKazanacagiPuaniGoruntuler() {
        Assert.assertTrue(indexPage.secilenUrunKazanacaginizPuanKitap.isDisplayed());
    }

    @And("kullanici urun miktarini goruntuler")
    public void kullaniciUrunMiktariniGoruntuler() {
        Assert.assertTrue(indexPage.secilenUrunMiktarIndex.isDisplayed());
    }

    @And("kullanici tedarik suresini goruntuler")
    public void kullaniciTedarikSuresiniGoruntuler() {
        Assert.assertTrue(indexPage.secilenUrunTedarikSuresiIndex.isDisplayed());
    }

    @And("kullanici birim fiyati goruntuler")
    public void kullaniciBirimFiyatiGoruntuler() {
        Assert.assertTrue(indexPage.secilenUrunBirimFiyatiIndex.isDisplayed());
    }

    @And("kullanici toplam fiyati goruntuler")
    public void kullaniciToplamFiyatiGoruntuler() {
        Assert.assertTrue(indexPage.secilenUrunToplamIndex.isDisplayed());
    }

    @And("kullanici secili urunu sepetten kaldirmak icin x e tiklar")
    public void kullaniciSeciliUrunuSepettenKaldirmakIcinXETiklar() {
        indexPage.secilenUrunListedenKaldirIndex.click();
    }

    @When("kullanici secilen Urunun sepetten Cikarildigini dogrular")
    public void kullaniciSecilenUrununSepettenCikarildiginiDogrular() {
        Assert.assertTrue(indexPage.secilenUrunSepetinizdenCikariliyorAlertIndex.isDisplayed());
    }

    @Given("kullanici fikrinizi bizimle paylasir misiniz sembolune tiklar")
    public void kullaniciFikriniziBizimlePaylasirMisinizSemboluneTiklar() {
        ReusableMethods.clickByJS(homePage.fikriniziPaylasirmisinizSembolButonHome);
    }

    @When("kullanici onerim var formunun acildigini dogrular")
    public void kullaniciOnerimVarFormununAcildiginiDogrular() {
        Assert.assertTrue(homePage.onerimVarTextHome.isDisplayed());
    }

    @And("kullanici ad-soyad alanina {string} girer")
    public void kullaniciAdSoyadAlaninaGirer(String string) {
        homePage.onerimVarAdSoyadHome.sendKeys(Faker.instance().name().fullName());
    }

    @And("kullanici e-posta alanina {string} girer")
    public void kullaniciEPostaAlaninaGirer(String string) {
        homePage.onerimVarEmailHome.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("kullanici seciniz kismindan oneriyi secer")
    public void kullaniciSecinizKismindanOneriyiSecer() {
        Select select=new Select(homePage.onerimVarSecinizDropDownHome);
        select.selectByVisibleText("Öneri");
    }

    @And("kullanici gorusunuz alanina {string} girer")
    public void kullaniciGorusunuzAlaninaGirer(String string) {
        homePage.onerimVarGorusunuzHome.sendKeys(Faker.instance().lorem().paragraph());
    }

    @And("kullanici dogrulama kodu kismina alti haneli sayi girer")
    public void kullaniciDogrulamaKoduKisminaAltiHaneliSayiGirer() {
        homePage.onerimVarDogrulamaKoduHome.sendKeys(""+sayi1+sayi2);
    }
    @And("kullanici gonder butonuna tiklar")
    public void kullaniciGonderButonunaTiklar() {
        ReusableMethods.clickByJS(homePage.onerimVarGonderButonHome);
    }
    @When("kullanici girmis oldugunuz dogrulama kodu hatalidir uyarisini gorur")
    public void kullaniciGirmisOldugunuzDogrulamaKoduHatalidirUyarisiniGorur() {
        Assert.assertTrue(homePage.onerimVarHataliKodMesajiHome.isDisplayed());
    }

    @When("kullanici iletisim linkine tiklar")
    public void kullaniciIletisimLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.iletisimLinkHome);
    }

    @And("kullanici seciniz dropdownindan oneri secer")
    public void kullaniciSecinizDropdownindanOneriSecer() {
        Select select=new Select(iletisimPage.secinizDropDownIletisim);
        select.selectByVisibleText("Öneri");
    }


    @And("kullanici adiniz alanina {string} girer")
    public void kullaniciAdinizAlaninaGirer(String string) {
        iletisimPage.adinizTextBoxIletisim.sendKeys(Faker.instance().name().fullName());
    }

    @And("kullanici e-posta adresiniz {string} girer")
    public void kullaniciEPostaAdresinizGirer(String string) {
        iletisimPage.emailTextBoxIletisim.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("kullanici mesajiniz alanina {string} girer")
    public void kullaniciMesajinizAlaninaGirer(String string) {
        iletisimPage.mesajinizTextBoxIletisim.sendKeys(Faker.instance().lorem().paragraph());
    }

    @And("kullanici dogrulama kodu alanina {string} girer")
    public void kullaniciDogrulamaKoduAlaninaGirer(String string) {
        iletisimPage.dogrulamaKodunuzTextBoxIletisim.sendKeys(""+sayi1+sayi2);
    }

    @When("kullanici gonder butona tiklar")
    public void kullaniciGonderButonaTiklar() {
        ReusableMethods.clickByJS(iletisimPage.gonderButonIletisim);    }

    @Then("kullanici dogrulama kodu yanlis uyarisini gorur")
    public void kullaniciDogrulamaKoduYanlisUyarisiniGorur() {
        Assert.assertTrue(iletisimPage.dogrulamKoduYanlisHataMesajiIletisim.isDisplayed());
    }
}
