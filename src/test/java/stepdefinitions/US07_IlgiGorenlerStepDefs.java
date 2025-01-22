package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;
public class US07_IlgiGorenlerStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici ilgi gorenler basligina gelir")
    public void kullaniciIlgiGorenlerBasliginaGelir() {
        actions.moveToElement(allPages.homePage().ilgiGorenlerTextHome).perform();
    }
    @When("kullanici ilgi gorenler tumunu goster linkine tiklar")
    public void kullaniciIlgiGorenlerTumunuGosterLinkineTiklar() {
       clickByJS(allPages.homePage().ilgiGorenlerTumunuGosterLinkHome);
    }
    @And("kullanici acilan sayfada ilgi gorenler basligini goruntuler")
    public void kullaniciAcilanSayfadaIlgiGorenlerBasliginiGoruntuler() {
        assert allPages.indexPage().ilgiGorenlerTextIndex.isDisplayed();
    }
    @And("kullanici ilgi gorenler kategorilerden edebiyati secer")
    public void kullaniciIlgiGorenlerKategorilerdenEdebiyatiSecer() {
        clickByJS(allPages.indexPage().edebiyatLinkKategoriListeyiDaraltIndex);
    }
    @And("kullanici edebiyat alanindan anlati secenegine tiklar")
    public void kullaniciEdebiyatAlanindanAnlatiSecenegineTiklar() {
        clickByJS(allPages.indexPage().anlatiLinkEdebiyatKategoriListeyiDaraltIndex);
    }
    @And("kullanici listeyiDaralt tum kategoriler linke tiklar")
    public void kullaniciListeyiDaraltTumKategorilerLinkeTiklar() {
        clickByJS(allPages.indexPage().tumKategorilerLinkListeyiDaraltIndex);
    }
    @And("kullanici kategorilerTarih kisisel gelisim linke tiklar")
    public void kullaniciKategorilerTarihKisiselGelisimLinkeTiklar() {
        clickByJS(allPages.indexPage().kisiselGelisimLinkTarihKategoriListeyiDaraltIndex);
    }
    @And("kullanici listelenen urun sayisi ile sayfadaki urun sayisinin esit oldugunu dogrular")
    public void kullaniciListelenenUrunSayisiIleSayfadakiUrunSayisininEsitOldugunuDogrular() {
        String dortUrunListelendi=allPages.indexPage().dortUrunListelendiTextIndex.getText();
        dortUrunListelendi=dortUrunListelendi.replaceAll("\\D","");
        int listelenenUrunSayisiDort=Integer.parseInt(dortUrunListelendi);
        assert allPages.indexPage().sayfadakiUrunListesiIndex.size() == Integer.parseInt(dortUrunListelendi);
    }
}
