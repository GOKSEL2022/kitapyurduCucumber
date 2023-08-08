package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.IndexPage;
import pages.KitapPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TC04_KitapYurduHomeStepDefs {
    HomePage homePage=new HomePage();
    KitapPage kitapPage=new KitapPage();
    IndexPage indexPage=new IndexPage();

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
}
