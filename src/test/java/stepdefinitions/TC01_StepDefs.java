package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.IndexPage;
import pages.KitapPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01_StepDefs {
    KitapPage kitapPage=new KitapPage();
    HomePage homePage =new HomePage();
    IndexPage indexPage=new IndexPage();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    int postaKodu1 = Faker.instance().number().numberBetween(100, 999);
    int postaKodu2 = Faker.instance().number().numberBetween(10, 99);
    int sabitPhone1=212;
    int phoneNo1 = 5+Faker.instance().number().numberBetween(30,60);
    int phoneNo2 = Faker.instance().number().numberBetween(100, 999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000, 9999);
    @Given("kullanici kitapyurdu_url ye gider")
    public void kullaniciKitapyurdu_urlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("kitapyurdu_url"));
    }
    @When("kullanici anasayfanin acildigini dogrular")
    public void kullaniciAnasayfaninAcildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("kitapyurdu"));
    }

    @And("kullanici arama cubugunda safahat aratir")
    public void kullaniciAramaCubugundaSafahatAratir() {
        homePage.searchTextBoxHome.sendKeys("safahat", Keys.ENTER);
    }

    @And("kullanici arama sonuclarinda safahat oldugunu dogrular")
    public void kullaniciAramaSonuclarindaSafahatOldugunuDogrular() {
        Assert.assertTrue(indexPage.safahatImgIndex.isDisplayed());
    }
    @And("kullanici safahat kitabina tiklar")
    public void kullaniciSafahatKitabinaTiklar() {
        indexPage.safahatImgIndex.click();
    }
    @And("kullanici safahat ile ilgili aciklama yazisini gorur")
    public void kullaniciSafahatIleIlgiliAciklamaYazisiniGorur() {
        Assert.assertTrue(indexPage.descriptionSafahatKitap.isDisplayed());
    }
    @And("kullanici sepete ekle butonuna tiklar")
    public void kullaniciSepeteEkleButonunaTiklar() {
        kitapPage.sepeteEkleButonKitap.click();
    }
    @And("kullanici urunun sepete eklendiginin belirten alerti gorur")
    public void kullaniciUrununSepeteEklendigininBelirtenAlertiGorur() {
        Assert.assertTrue(kitapPage.sepetinizdeAlertKitap.isDisplayed());
    }
    @And("kullanici sepetim butonuna tiklar")
    public void kullaniciSepetimButonunaTiklar() {
        kitapPage.sepetimButonKitap.click();
    }
    @And("kullanici satin al butonuna tiklar")
    public void kullaniciSatinAlButonunaTiklar() {
        ReusableMethods.clickByJS(kitapPage.satinAlButonKitap);
    }
    @And("kullanici uye olmadan devam et butonuna tiklar")
    public void kullaniciUyeOlmadanDevamEtButonunaTiklar() {
        indexPage.uyeOlmadanDevamEtButonIndex.click();
    }
    @And("kullanici adrese teslim et checkboxin secili oldugunu gorur")
    public void kullaniciAdreseTeslimEtCheckboxinSeciliOldugunuGorur() {
        Assert.assertTrue(indexPage.adreseTeslimEtRadioButonIndex.isSelected());
    }
    @And("kullanici adres ekle butonuna tiklar")
    public void kullaniciAdresEkleButonunaTiklar() {
        indexPage.adresEkleTextBoxIndex.click();
    }
    @And("kullanici adiniz girer")
    public void kullaniciAdinizGirer() {
        indexPage.adinizTextBoxIndex.sendKeys(faker.name().firstName(),
                Keys.TAB,faker.name().lastName(),
                Keys.TAB,faker.internet().emailAddress(),
                Keys.TAB,faker.company().name(),
                Keys.TAB,faker.internet().domainName(),
                Keys.TAB,faker.address().fullAddress(),
                Keys.TAB,faker.address().zipCode(),
                Keys.TAB,""+544+phoneNo2+phoneNo3,
                Keys.TAB,""+0212+phoneNo2+phoneNo3,
                Keys.TAB,faker.code().imei());
    }
    @And("kullanici soyadiniz girer")
    public void kullaniciSoyadinizGirer() {
    }
    @And("kullanici e-posta adresiniz girer")
    public void kullaniciEPostaAdresinizGirer() {
    }
    @And("kullanici ad_sirket adi girer")
    public void kullaniciAd_sirketAdiGirer() {
    }
    @And("kullanici soyad_unvan bilgilerini girer")
    public void kullaniciSoyad_unvanBilgileriniGirer() {
    }
    @And("kullanici ulke olarak Türkiye secer")
    public void kullaniciUlkeOlarakTürkiyeSecer() {
        ReusableMethods.clickByJS(indexPage.ulkeDropDown1Index);
        indexPage.ulkeDropDown2Index.sendKeys("Türkiye");
        actions.doubleClick(indexPage.ulkeDropDown3Index).perform();
    }
    @And("kullanici sehir olarak Samsun secer")
    public void kullaniciSehirOlarakSamsunSecer() throws InterruptedException {
        ReusableMethods.clickByJS(indexPage.sehirDropDown1Index);
        indexPage.sehirDropDown2Index.sendKeys("Samsun");
        Thread.sleep(1000);
        ReusableMethods.clickByJS(indexPage.sehirDropDown3Index);
    }
    @And("kullanici ilce olarak Carsamba secer")
    public void kullaniciIlceOlarakCarsambaSecer() throws InterruptedException {
        ReusableMethods.clickByJS(indexPage.ilceDropDown1Index);
        indexPage.ilceDropDown2Index.sendKeys("ÇARŞAMBA");
        Thread.sleep(1000);
        ReusableMethods.clickByJS(indexPage.ilceDropDown3Index);
    }
    @And("kullanici mahalle olarak Sarıcalı Mah secer")
    public void kullaniciMahalleOlarakSarıcalıMahSecer() throws InterruptedException {
        ReusableMethods.clickByJS(indexPage.mahalleDropDown1Index);
        indexPage.mahalleDropDown2Index.sendKeys("SARICALI MAH");
        Thread.sleep(1000);
        ReusableMethods.clickByJS(indexPage.mahalleDropDown3Index);
    }
    @And("kullanici adres girer")
    public void kullaniciAdresGirer() {
    }
    @And("kullanici posta kodu girer")
    public void kullaniciPostaKoduGirer() {
    }
    @And("kullanici cep telefonu girer")
    public void kullaniciCepTelefonuGirer() {
    }
    @And("kullanici sabit telefon girer")
    public void kullaniciSabitTelefonGirer() {
    }
    @And("kullanici TC Kimlik No girer")
    public void kullaniciTCKimlikNoGirer() {
    }
    @And("kullanici devam et butonuna tiklar")
    public void kullaniciDevamEtButonunaTiklar() {
        ReusableMethods.clickByJS(indexPage.devamEtButonSeciliAdresIndex);
    }
    @And("kullanici fatura adresinin olusturuldugunu gorur")
    public void kullaniciFaturaAdresininOlusturuldugunuGorur() {
        Assert.assertTrue(indexPage.textAdresBilgilerimIndex.isDisplayed());
    }
    @And("kullanici kart ile odeme sayfasini gorur")
    public void kullaniciKartIleOdemeSayfasiniGorur() {
        Assert.assertTrue(indexPage.textKartNumarasiIndex.isDisplayed());
    }
    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
         Driver.closeDriver();
    }


}

