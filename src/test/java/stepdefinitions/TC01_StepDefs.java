package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
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
        kitapPage.satinAlButonKitap.click();
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
                Keys.TAB,faker.name().lastName(),Keys.TAB,faker.internet().emailAddress(),
                Keys.TAB,faker.company().name(),Keys.TAB,faker.internet().domainName());
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
      ReusableMethods.clickByJS(indexPage.ulkeDropDownIndex);
      Select ulke=new Select(indexPage.ulkeDropDown2Index);
      ulke.selectByVisibleText("Türkiye");
    }
    @And("kullanici sehir olarak Samsun secer")
    public void kullaniciSehirOlarakSamsunSecer() {
        ReusableMethods.clickByJS(indexPage.sehirDropDownIndex);
        Select sehir=new Select(indexPage.sehirDropDown2Index);
        sehir.selectByVisibleText("Samsun");
    }
    @And("kullanici ilce olarak Carsamba secer")
    public void kullaniciIlceOlarakCarsambaSecer() {
        ReusableMethods.clickByJS(indexPage.ilceDropDownIndex);
        Select ilce=new Select(indexPage.ilceDropDown2Index);
        ilce.selectByVisibleText("ÇARŞAMBA");
    }
    @And("kullanici mahalle olarak Sarıcalı Mah secer")
    public void kullaniciMahalleOlarakSarıcalıMahSecer() {
        ReusableMethods.clickByJS(indexPage.mahalleDropDownIndex);
        Select mahalle=new Select(indexPage.mahalleDropDown2Index);
        mahalle.selectByVisibleText("SARICALI MAH");
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
    }
}

