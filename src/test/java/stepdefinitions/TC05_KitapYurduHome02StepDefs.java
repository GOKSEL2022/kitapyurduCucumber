package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.IletisimPage;
import pages.IndexPage;
import pages.KitapPage;

public class TC05_KitapYurduHome02StepDefs {
    HomePage homePage=new HomePage();
    KitapPage kitapPage=new KitapPage();
    IndexPage indexPage=new IndexPage();
    IletisimPage iletisimPage=new IletisimPage();
    @Given("kullanici cok satan kitaplar basliginin uzerine gelir")
    public void kullaniciCokSatanKitaplarBasligininUzerineGelir() {
    }

    @When("kullanici haftalik cok satan kitaplar basligina tiklar")
    public void kullaniciHaftalikCokSatanKitaplarBasliginaTiklar() {
    }

    @And("kullanici haftalik cok satan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikCokSatanKitaplarSayfasininAcildiginiDogrular() {
    }

    @And("kullanici yeni cikan kitaplar basligini uzerine gelir")
    public void kullaniciYeniCikanKitaplarBasliginiUzerineGelir() {
    }

    @And("Kullanici haftalik yeni cikan kitaplar basligina tiklar")
    public void kullaniciHaftalikYeniCikanKitaplarBasliginaTiklar() {
    }

    @And("kullanici haftalik yeni cikan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikYeniCikanKitaplarSayfasininAcildiginiDogrular() {
    }

    @And("kullanici tum kitaplar basliginin uzerine gelir")
    public void kullaniciTumKitaplarBasligininUzerineGelir() {
    }

    @And("kullanici tum kitaplar basliginin altinda edebiyat secenegine tiklar")
    public void kullaniciTumKitaplarBasligininAltindaEdebiyatSecenegineTiklar() {
    }

    @And("kullanici edebiyat sayfasinin acildigini dogrular")
    public void kullaniciEdebiyatSayfasininAcildiginiDogrular() {
    }

    @And("kullanici yayincilar basligina tiklar")
    public void kullaniciYayincilarBasliginaTiklar() {
    }

    @And("kullanici yayincilar sayfasinin acildigini dogrular")
    public void kullaniciYayincilarSayfasininAcildiginiDogrular() {
    }

    @And("kullanici yazarlar basligina tiklar")
    public void kullaniciYazarlarBasliginaTiklar() {
    }

    @And("kullanici yazarlar sayfasinin acildigini dogrular")
    public void kullaniciYazarlarSayfasininAcildiginiDogrular() {
    }

    @And("kullanici cocuk kitaplari basligina tiklar")
    public void kullaniciCocukKitaplariBasliginaTiklar() {
    }

    @And("kullanici cocuk kitaplari sayfasinin acildigini dogrular")
    public void kullaniciCocukKitaplariSayfasininAcildiginiDogrular() {
    }

    @And("kullanici sinav kitaplari basligina tiklar")
    public void kullaniciSinavKitaplariBasliginaTiklar() {
    }

    @And("kullanici sinav kitaplari sayfasinin acildigini dogrular")
    public void kullaniciSinavKitaplariSayfasininAcildiginiDogrular() {
    }

    @And("kullanici ne okusam basligina tiklar")
    public void kullaniciNeOkusamBasliginaTiklar() {
    }

    @When("kullanici ne okusam sayfasinin acildigini dogrular")
    public void kullaniciNeOkusamSayfasininAcildiginiDogrular() {
    }
}
