package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.IndexPage;
import pages.KitapPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC08_IlgiGorenlerStepDefs {
    HomePage homePage=new HomePage();
    KitapPage kitapPage=new KitapPage();
    IndexPage indexPage=new IndexPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici ilgi gorenler basligina gelir")
    public void kullaniciIlgiGorenlerBasliginaGelir() {
        actions.moveToElement(homePage.ilgiGorenlerTextHome).perform();
    }

    @When("kullanici ilgi gorenler tumunu goster linkine tiklar")
    public void kullaniciIlgiGorenlerTumunuGosterLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.ilgiGorenlerTumunuGosterLinkHome);
    }

    @And("kullanici acilan sayfada ilgi gorenler basligini goruntuler")
    public void kullaniciAcilanSayfadaIlgiGorenlerBasliginiGoruntuler() {
        assert indexPage.ilgiGorenlerTextIndex.isDisplayed();
    }

    @And("kullanici ilgi gorenler kategorilerden edebiyati secer")
    public void kullaniciIlgiGorenlerKategorilerdenEdebiyatiSecer() {
        ReusableMethods.clickByJS(indexPage.edebiyatLinkKategoriListeyiDaraltIndex);
    }

    @And("kullanici edebiyat alanindan anlati secenegine tiklar")
    public void kullaniciEdebiyatAlanindanAnlatiSecenegineTiklar() {
        ReusableMethods.clickByJS(indexPage.anlatiLinkEdebiyatKategoriListeyiDaraltIndex);
    }

    @And("kullanici listeyiDaralt tum kategoriler linke tiklar")
    public void kullaniciListeyiDaraltTumKategorilerLinkeTiklar() {
        ReusableMethods.clickByJS(indexPage.tumKategorilerLinkListeyiDaraltIndex);
    }

    @And("kullanici kategorilerTarih kisisel gelisim linke tiklar")
    public void kullaniciKategorilerTarihKisiselGelisimLinkeTiklar() {
        ReusableMethods.clickByJS(indexPage.kisiselGelisimLinkTarihKategoriListeyiDaraltIndex);
    }

    @And("kullanici listelenen urun sayisi ile sayfadaki urun sayisinin esit oldugunu dogrular")
    public void kullaniciListelenenUrunSayisiIleSayfadakiUrunSayisininEsitOldugunuDogrular() {
        String dortUrunListelendi=indexPage.dortUrunListelendiTextIndex.getText();
        dortUrunListelendi=dortUrunListelendi.replaceAll("\\D","");
        int listelenenUrunSayisiDort=Integer.parseInt(dortUrunListelendi);
        //System.out.println("indexPage.sayfadakiUrunListesiIndex.size() = " + indexPage.sayfadakiUrunListesiIndex.size());
        //System.out.println("listelenenUrunSayisiDort = " + listelenenUrunSayisiDort);
        Assert.assertTrue(indexPage.sayfadakiUrunListesiIndex.size()==Integer.parseInt(dortUrunListelendi));
    }


}
