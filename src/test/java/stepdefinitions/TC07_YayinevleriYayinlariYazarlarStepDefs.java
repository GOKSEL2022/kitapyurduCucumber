package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.IndexPage;
import pages.YazarlarPage;

public class TC07_YayinevleriYayinlariYazarlarStepDefs {
    HomePage homePage=new HomePage();
    IndexPage indexPage=new IndexPage();
    YazarlarPage yazarlarPage=new YazarlarPage();

    @Given("kullanici haftanin yayinevi basligina gelir")
    public void kullaniciHaftaninYayineviBasliginaGelir() {
    }

    @When("kullanici secilen yayinevini goruntuler")
    public void kullaniciSecilenYayineviniGoruntuler() {
    }

    @And("kullanici yapilan indirim miktarini goruntuler")
    public void kullaniciYapilanIndirimMiktariniGoruntuler() {
    }

    @And("kullanici tumunu goster linkine tiklar")
    public void kullaniciTumunuGosterLinkineTiklar() {
    }

    @And("kullanici acilan sayfada haftanin yayinevinin adini goruntuler")
    public void kullaniciAcilanSayfadaHaftaninYayinevininAdiniGoruntuler() {
    }

    @And("kullanici cok satanlar icindeki ilk urune tiklar")
    public void kullaniciCokSatanlarIcindekiIlkUruneTiklar() {
    }

    @When("kullanici acilan urunun ayni yayinevine ait oldugunu dogrular")
    public void kullaniciAcilanUrununAyniYayinevineAitOldugunuDogrular() {
    }
}
