package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.IndexPage;
import pages.KitapPage;

public class TC08_IlgiGorenlerStepDefs {
    KitapPage kitapPage=new KitapPage();
    IndexPage indexPage=new IndexPage();
    @Given("kullanici ilgi gorenler basligina gelir")
    public void kullaniciIlgiGorenlerBasliginaGelir() {
    }

    @When("kullanici ilgi gorenler tumunu goster linkine tiklar")
    public void kullaniciIlgiGorenlerTumunuGosterLinkineTiklar() {
    }

    @And("kullanici acilan sayfada ilgi gorenler basligini goruntuler")
    public void kullaniciAcilanSayfadaIlgiGorenlerBasliginiGoruntuler() {
    }

    @And("kullanici ilgi gorenler kategorilerden edebiyati secer")
    public void kullaniciIlgiGorenlerKategorilerdenEdebiyatiSecer() {
    }

    @And("kullanici edebiyat alanindan anlati secenegine tiklar")
    public void kullaniciEdebiyatAlanindanAnlatiSecenegineTiklar() {
    }
}
