package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class TC11_ListelerimStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());

    @And("kullanici naneyi yedik lokantasi adli eseri favorileme ekler")
    public void kullaniciNaneyiYedikLokantasiAdliEseriFavorilemeEkler() {
        scrollIntoViewJS(allPages.homePage().cokSatanlarNaneyiYedikLokantasiHome);
        waitFor(2);
        actions.moveToElement(allPages.homePage().naneyiYedikLokantasiHome).perform();
        clickByJS(allPages.homePage().naneyiYedikLokantasiFavorilerimeEkleButonHome);
    }
    @And("kullanici listelerim dropdown uzerine gelir")
    public void kullaniciListelerimDropdownUzerineGelir() {
        scrollIntoViewJS(allPages.homePage().listelerimLinkHome);
        actions.moveToElement(allPages.homePage().listelerimLinkHome).perform();
    }

    @And("kullanici acilan menuden favorilerimi secer")
    public void kullaniciAcilanMenudenFavorilerimiSecer() {
        actions.moveToElement(allPages.homePage().listelerimLinkHome).perform();
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
        assert allPages.indexPage().favorilerimdenSilNaneyiYedikLokantasiIndex.isDisplayed();
    }

    @And("kullanici acilan menuden alisveris listemi secer")
    public void kullaniciAcilanMenudenAlisverisListemiSecer() {
        actions.moveToElement(allPages.homePage().listelerimLinkHome).perform();
        clickByJS(allPages.homePage().alisverisListemSecenegiListelerimDropdownHome);
    }

    @And("kullanici acilan menuden okuma listelerimi secer")
    public void kullaniciAcilanMenudenOkumaListelerimiSecer() {
        actions.moveToElement(allPages.homePage().listelerimLinkHome).perform();
        clickByJS(allPages.homePage().okumaListemSecenegiListelerimDropdownHome);
    }

    @And("kullanici alisveris listem sayfasinda ekli urunleri goruntuler")
    public void kullaniciAlisverisListemSayfasindaEkliUrunleriGoruntuler() {
    }

    @And("kullanici alisveris listem sayfasindaki ekli urunleri siler")
    public void kullaniciAlisverisListemSayfasindakiEkliUrunleriSiler() {
    }

    @And("kullanici alisveris listeme ekledigi urunun alisveris listesinden silindigini dogrular")
    public void kullaniciAlisverisListemeEkledigiUrununAlisverisListesindenSilindiginiDogrular() {
    }


}
