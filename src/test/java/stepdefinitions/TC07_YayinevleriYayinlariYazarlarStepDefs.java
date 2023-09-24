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
}
