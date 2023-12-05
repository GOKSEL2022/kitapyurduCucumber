package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin

        features="src/test/resources/features",
        glue= {"stepdefinitions", "hooks"},
        tags="@alisveris_listesi"  ,

        dryRun= false
)

public class Runner {
}
/*
 @When("kullanici kategori basligini goruntuler")
    public void kullaniciKategoriBasliginiGoruntuler() {
        assert araPage.kategoriTextAra.isDisplayed();
    }
    @And("kullanici arama alanina gecerli sembol {string} girer")
    public void kullaniciAramaAlaninaGecerliSembolGirer(String string) {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici arama ile ilgili sonuc bulunamamistir yazisini goruntuler")
    public void kullaniciAramaIleIlgiliSonucBulunamamistirYazisiniGoruntuler() {
        assert araPage.sembolIleIlgiliSonucBulunamamistirTextAra.isDisplayed();
    }
 */
