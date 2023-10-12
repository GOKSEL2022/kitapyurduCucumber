package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.IndexPage;
import utilities.Driver;

public class TC09_KategorilerStepDefs {
    HomePage homePage=new HomePage();
    IndexPage indexPage=new IndexPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici kategoriler basligina gelir")
    public void kullaniciKategorilerBasliginaGelir() {
    }

    @When("kullanici yedi kez tumunu goster ileri tusuna tiklar")
    public void kullaniciYediKezTumunuGosterIleriTusunaTiklar() {
    }

    @And("kullanici kategoriler tumunu goster linkine tiklar")
    public void kullaniciKategorilerTumunuGosterLinkineTiklar() {
    }

    @And("kullanici acilan sayfada tum kategorileri goruntuler")
    public void kullaniciAcilanSayfadaTumKategorileriGoruntuler() {
    }

    @And("kullanici tum kategoriler icinden edebiyata tiklar")
    public void kullaniciTumKategorilerIcindenEdebiyataTiklar() {
    }

    @And("kullanici acilan sayfada edebiyat urunleri oldugunu dogrular")
    public void kullaniciAcilanSayfadaEdebiyatUrunleriOldugunuDogrular() {
    }

    @And("kullanici alt kategorilerden belgesel romana tiklar")
    public void kullaniciAltKategorilerdenBelgeselRomanaTiklar() {
    }

    @And("kullanici acilan sayfada belgesel roman basligini goruntuler")
    public void kullaniciAcilanSayfadaBelgeselRomanBasliginiGoruntuler() {
    }

    @And("kullanici listeyi daralt menuden Ayse Kulin i  secer")
    public void kullaniciListeyiDaraltMenudenAyseKulinISecer() {
    }

    @And("kullanici acilan sayfada Ayse Kulin in romanlarini goruntuler")
    public void kullaniciAcilanSayfadaAyseKulinInRomanlariniGoruntuler() {
    }

    @And("kullanici sayfadaki urunleri sepete ekler")
    public void kullaniciSayfadakiUrunleriSepeteEkler() {
    }
}
