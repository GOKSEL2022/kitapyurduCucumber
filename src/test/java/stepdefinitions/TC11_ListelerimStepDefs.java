package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class TC11_ListelerimStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());

    @And("kullanici naneyi yedik lokantasi adli eseri favorileme ekler")
    public void kullaniciNaneyiYedikLokantasiAdliEseriFavorilemeEkler() {
        scrollIntoViewJS(allPages.homePage().naneyiYedikLokantasiFavorilerimeEkleButonHome);
        clickWithTimeOut(allPages.homePage().naneyiYedikLokantasiFavorilerimeEkleButonHome,3);
    }
    @And("kullanici listelerim dropdown uzerine gelir")
    public void kullaniciListelerimDropdownUzerineGelir() {
        scrollTopJS();
        actions.moveToElement(allPages.homePage().listelerimLinkHome).perform();
    }

    @And("kullanici acilan menuden favorilerimi secer")
    public void kullaniciAcilanMenudenFavorilerimiSecer() {
        clickByJS(allPages.homePage().favorilerimSecenegiListelerimLinkHome);
    }
    @And("kullanici favorilerime ekli urunleri gorur")
    public void kullaniciFavorilerimeEkliUrunleriGorur() {
        assert allPages.indexPage().naneyiYedikLokantasiFavorilerimeEkliUrunIndex.getText().contains("Naneyi Yedik Lokantası");
    }
    @And("kullanici secilen urunleri favori listesinden siler")
    public void kullaniciSecilenUrunleriFavoriListesindenSiler() {
        actions.moveToElement(allPages.indexPage().naneyiYedikLokantasiFavorilerimeEkliUrunIndex).perform();
        clickByJS(allPages.indexPage().favorilerimdenSilNaneyiYedikLokantasiIndex);
    }
    @And("kullanici favorilere ekledigi urunun favori listesinden silindigini dogrular")
    public void kullaniciFavorilereEkledigiUrununFavoriListesindenSilindiginiDogrular() {
    }
    /*
    @And("kullanici acilan menuden alisveris listemi secer")
    public void kullaniciAcilanMenudenAlisverisListemiSecer() {
    }

     */
}
