package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;
import static utilities.ReusableMethods.scrollIntoViewJS;

public class US04_KitapYurduHomeStepDefs {
    int sayi=Faker.instance().number().numberBetween(100,999);
    Actions actions=new Actions(Driver.getDriver());    AllPages allPages=new AllPages();
    @And("kullanici anasayfanin en altina gelir")
    public void kullaniciAnasayfaninEnAltinaGelir() {
        scrollIntoViewJS(allPages.homePage().sinavKitaplariLinkSayfaAltiHome);
        //allPages.homePage().enAltaInYonButonHome.click();
    }
    @And("kullanici anasayfanin en üst kismina gider")
    public void kullaniciAnasayfaninEnÜstKisminaGider() {
        allPages.homePage().enUsteCikYonButonHome.click();
    }
    @And("kullanici bir saniye bekler")
    public void kullaniciBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(1000);
    }
    @Given("kullanici sag yon tusuna tiklar")
    public void kullaniciSagYonTusunaTiklar() {
        for (int i=1;i<allPages.homePage().anasayfaKaydiriciResimlerHome.size();i++){
            allPages.homePage().sagYonKaydiriciButonHome.click();
        }
    }
    @When("kullanici sag yon tusunun erisilebilir oldugunu dogrular")
    public void kullaniciSagYonTusununErisilebilirOldugunuDogrular() {
        assert allPages.homePage().sagYonKaydiriciButonHome.isEnabled();
    }
    @And("kullanici sol yon tusuna tiklar")
    public void kullaniciSolYonTusunaTiklar() {
        for (int i=1;i<allPages.homePage().anasayfaKaydiriciResimlerHome.size();i++) {
            allPages.homePage().solYonKaydiriciButonHome.click();
        }
    }
    @And("kullanici sol yon tusunun erisilebilir oldugunu dogrular")
    public void kullaniciSolYonTusununErisilebilirOldugunuDogrular() {
        assert allPages.homePage().solYonKaydiriciButonHome.isEnabled();
    }
    @And("kullanici anasayfada birden fazla resim oldugunu dogrular")
    public void kullaniciAnasayfadaOnBesAdetKaydiriciOldugunuDogrular() {
       Assert.assertTrue(allPages.homePage().anasayfaKaydiriciResimlerHome.size()>1);
    }
    @Given("kullanici anasayfadaki ilk urune tiklar")
    public void kullaniciAnasayfadakiIlkUruneTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        clickByJS(allPages.homePage().anasayfaIlkUrunHome);
    }
    @When("kullanici secilen urunun sayfada goruntulendigini dogrular")
    public void kullaniciSecilenUrununSayfadaGoruntulendiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kavanozda");
    }
    @And("kullanici urunun yaninda aciklama yazisini goruntuler")
    public void kullaniciUrununYanindaAciklamaYazisiniGoruntuler() {
        assert allPages.kitapPage().ilkUrunDescriptionTextKitap.isDisplayed();
    }
    @And("kullanici urunun altinda yorum bolumunu goruntuler")
    public void kullaniciUrununAltindaYorumBolumunuGoruntuler() {
        assert allPages.kitapPage().ilkUrunYorumlarKitap.isDisplayed();
    }
    @And("kullanici urunle ilgili aciklamanin altinda temel bilgileri \\(sayfa,cilt) goruntuler")
    public void kullaniciUrunleIlgiliAciklamaninAltindaTemelBilgileriSayfaCiltGoruntuler() {
        assert allPages.kitapPage().ilkUrunKitapBilgileriKitap.isDisplayed();
    }
    @And("kullanici urunun yaninda fiyat bilgisini goruntuler")
    public void kullaniciUrununYanindaFiyatBilgisiniGoruntuler() {
        assert allPages.kitapPage().urunFiyatiKitap.isDisplayed();
    }
    @And("kullanici sepete git butonua tiklar")
    public void kullaniciSepeteGitButonuaTiklar() {
        allPages.kitapPage().sepeteGitButonKitap.click();
    }
    @And("kullanici sectigi urunun sepete eklendigini goruntuler")
    public void kullaniciSectigiUrununSepeteEklendiginiGoruntuler() {
        assert allPages.indexPage().secilenUrunKitap.isDisplayed();
    }
    @And("kullanici urun basliginin yanindaki radio butonu tiklar")
    public void kullaniciUrunBasligininYanindakiRadioButonuTiklar() {
        allPages.indexPage().secilenUrunCheckboxAltIndex.click();
    }
    @And("kullanici urun gorselinin yanindaki radio butonu tiklar")
    public void kullaniciUrunGorselininYanindakiRadioButonuTiklar() {
        allPages.indexPage().secilenUrunCheckboxUstIndex.click();
    }
    @And("kullanici urunun altinda alisveris sonrasi kazanacagi puani goruntuler")
    public void kullaniciUrununAltindaAlisverisSonrasiKazanacagiPuaniGoruntuler() {
        assert allPages.indexPage().secilenUrunKazanacaginizPuanKitap.isDisplayed();
    }
    @And("kullanici urun miktarini goruntuler")
    public void kullaniciUrunMiktariniGoruntuler() {
        assert allPages.indexPage().secilenUrunMiktarIndex.isDisplayed();
    }
    @And("kullanici tedarik suresini goruntuler")
    public void kullaniciTedarikSuresiniGoruntuler() {
        assert allPages.indexPage().secilenUrunTedarikSuresiIndex.isDisplayed();
    }
    @And("kullanici birim fiyati goruntuler")
    public void kullaniciBirimFiyatiGoruntuler() {
        assert allPages.indexPage().secilenUrunBirimFiyatiIndex.isDisplayed();
    }
    @And("kullanici toplam fiyati goruntuler")
    public void kullaniciToplamFiyatiGoruntuler() {
        assert allPages.indexPage().secilenUrunToplamIndex.isDisplayed();
    }
    @And("kullanici secili urunu sepetten kaldirmak icin x e tiklar")
    public void kullaniciSeciliUrunuSepettenKaldirmakIcinXETiklar() {
        allPages.indexPage().secilenUrunListedenKaldirIndex.click();
    }
    @When("kullanici secilen Urunun sepetten Cikarildigini dogrular")
    public void kullaniciSecilenUrununSepettenCikarildiginiDogrular() {
        assert allPages.indexPage().secilenUrunSepetinizdenCikariliyorAlertIndex.isDisplayed();
    }
    @Given("kullanici fikrinizi bizimle paylasir misiniz sembolune tiklar")
    public void kullaniciFikriniziBizimlePaylasirMisinizSemboluneTiklar() {
        clickByJS(allPages.homePage().fikriniziPaylasirmisinizSembolButonHome);
    }
    @When("kullanici onerim var formunun acildigini dogrular")
    public void kullaniciOnerimVarFormununAcildiginiDogrular() {
        assert allPages.homePage().onerimVarTextHome.isDisplayed();
    }
    @And("kullanici ad-soyad alanina {string} girer")
    public void kullaniciAdSoyadAlaninaGirer(String string) {
        allPages.homePage().onerimVarAdSoyadHome.sendKeys(Faker.instance().name().fullName());
    }
    @And("kullanici e-posta alanina {string} girer")
    public void kullaniciEPostaAlaninaGirer(String string) {
        allPages.homePage().onerimVarEmailHome.sendKeys(Faker.instance().internet().emailAddress());
    }
    @And("kullanici seciniz kismindan oneriyi secer")
    public void kullaniciSecinizKismindanOneriyiSecer() {
        new Select(allPages.homePage().onerimVarSecinizDropDownHome).selectByVisibleText("Öneri");
    }
    @And("kullanici gorusunuz alanina {string} girer")
    public void kullaniciGorusunuzAlaninaGirer(String string) {
        allPages.homePage().onerimVarGorusunuzHome.sendKeys(Faker.instance().lorem().paragraph());
    }
    @And("kullanici dogrulama kodu kismina alti haneli sayi girer")
    public void kullaniciDogrulamaKoduKisminaAltiHaneliSayiGirer() {
        allPages.homePage().onerimVarDogrulamaKoduHome.sendKeys(""+sayi+sayi);
    }
    @And("kullanici gonder butonuna tiklar")
    public void kullaniciGonderButonunaTiklar() {
        clickByJS(allPages.homePage().onerimVarGonderButonHome);
    }
    @When("kullanici girmis oldugunuz dogrulama kodu hatalidir uyarisini gorur")
    public void kullaniciGirmisOldugunuzDogrulamaKoduHatalidirUyarisiniGorur() {
        assert allPages.homePage().onerimVarHataliKodMesajiHome.isDisplayed();
    }
    @When("kullanici iletisim linkine tiklar")
    public void kullaniciIletisimLinkineTiklar() {
        clickByJS(allPages.homePage().iletisimLinkHome);
    }
    @And("kullanici seciniz dropdownindan oneri secer")
    public void kullaniciSecinizDropdownindanOneriSecer() {
        new Select(allPages.iletisimPage().secinizDropDownIletisim).selectByVisibleText("Öneri");
    }
    @And("kullanici adiniz alanina {string} girer")
    public void kullaniciAdinizAlaninaGirer(String string) {
        allPages.iletisimPage().adinizTextBoxIletisim.sendKeys(Faker.instance().name().fullName());
    }
    @And("kullanici e-posta adresiniz {string} girer")
    public void kullaniciEPostaAdresinizGirer(String string) {
        allPages.iletisimPage().emailTextBoxIletisim.sendKeys(Faker.instance().internet().emailAddress());
    }
    @And("kullanici mesajiniz alanina {string} girer")
    public void kullaniciMesajinizAlaninaGirer(String string) {
        allPages.iletisimPage().mesajinizTextBoxIletisim.sendKeys(Faker.instance().lorem().paragraph());
    }
    @And("kullanici dogrulama kodu alanina {string} girer")
    public void kullaniciDogrulamaKoduAlaninaGirer(String string) {
        allPages.iletisimPage().dogrulamaKodunuzTextBoxIletisim.sendKeys(""+sayi+sayi);
    }
    @When("kullanici gonder butona tiklar")
    public void kullaniciGonderButonaTiklar() {
        clickByJS(allPages.iletisimPage().gonderButonIletisim);
    }
    @Then("kullanici dogrulama kodu yanlis uyarisini gorur")
    public void kullaniciDogrulamaKoduYanlisUyarisiniGorur() {
        assert allPages.iletisimPage().dogrulamKoduYanlisHataMesajiIletisim.isDisplayed();
    }
    @Given("kullanici dil dropdownindan English secer")
    public void kullaniciDilDropdownindanEnglishSecer() {
        actions.moveToElement(allPages.homePage().turkceDilSecenegiHome).perform();
        clickByJS(allPages.homePage().englishDilSecenegiHome);
    }
    @When("kullanici anasayfada dilin ingilizce oldugunu dogrular")
    public void kullaniciAnasayfadaDilinIngilizceOldugunuDogrular() {
        assert allPages.homePage().tumKategorilerLinkHome.getText().contains("All Categories");
    }

    @And("kullanici dil dropdownindan Deutsch secer")
    public void kullaniciDilDropdownindanDeutschSecer() {
        actions.moveToElement(allPages.homePage().turkceDilSecenegiHome).perform();
        clickByJS(allPages.homePage().almancaDilSecenegiHome);
    }

    @And("kullanici anasayfada dilin Almanca oldugunu dogrular")
    public void kullaniciAnasayfadaDilinAlmancaOldugunuDogrular() {
        assert allPages.homePage().tumKategorilerLinkHome.getText().contains("Alle Kategorien");
    }

    @And("kullanici dil dropdownindan Turkce secer")
    public void kullaniciDilDropdownindanTurkceSecer() {
        actions.moveToElement(allPages.homePage().englishDilSecenegiHome).perform();
        clickByJS(allPages.homePage().turkceDilSecenegiHome);
    }

    @And("kullanici anasayfada dilin Turkce oldugunu dogrular")
    public void kullaniciAnasayfadaDilinTurkceOldugunuDogrular() {
        assert allPages.homePage().tumKategorilerLinkHome.getText().equals("Tüm Kategoriler");
    }

    @Given("kullanici cok satan kitaplar basliginin uzerine gelir")
    public void kullaniciCokSatanKitaplarBasligininUzerineGelir() {
        actions.moveToElement(allPages.homePage().cokSatanKitaplarTextHome).perform();
    }
    @When("kullanici haftalik cok satan kitaplar basligina tiklar")
    public void kullaniciHaftalikCokSatanKitaplarBasliginaTiklar() {
        clickByJS(allPages.haftalikPage().haftalikCokSatanKitaplarTextHome);
    }
    @And("kullanici haftalik cok satan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikCokSatanKitaplarSayfasininAcildiginiDogrular() {
        assert allPages.haftalikPage().cokSatanlarHaftalikTextHaftalik.isDisplayed();
    }
    @And("kullanici yeni cikan kitaplar basligini uzerine gelir")
    public void kullaniciYeniCikanKitaplarBasliginiUzerineGelir() {
        actions.moveToElement(allPages.homePage().yeniCikanKitaplarTextHome).perform();
    }
    @And("Kullanici haftalik yeni cikan kitaplar basligina tiklar")
    public void kullaniciHaftalikYeniCikanKitaplarBasliginaTiklar() {
        clickByJS(allPages.homePage().haftalikYeniCikanKitaplarTextHome);
    }
    @And("kullanici haftalik yeni cikan kitaplar sayfasinin acildigini dogrular")
    public void kullaniciHaftalikYeniCikanKitaplarSayfasininAcildiginiDogrular() {
        assert allPages.haftalikPage().yeniCikanlarHaftalikTextHaftalik.isDisplayed();
    }
    @And("kullanici tum kitaplar basliginin uzerine gelir")
    public void kullaniciTumKitaplarBasligininUzerineGelir() {
        actions.moveToElement(allPages.homePage().tumKitaplarTextHome).perform();
    }
    @And("kullanici tum kitaplar basliginin altinda edebiyat secenegine tiklar")
    public void kullaniciTumKitaplarBasligininAltindaEdebiyatSecenegineTiklar() {
        clickByJS(allPages.homePage().tumKitaplarEdebiyatTextHome);
    }
    @And("kullanici edebiyat sayfasinin acildigini dogrular")
    public void kullaniciEdebiyatSayfasininAcildiginiDogrular() {
        assert allPages.kategoriPage().edebiyatTextKitap.isDisplayed();
    }
    @And("kullanici yayincilar basligina tiklar")
    public void kullaniciYayincilarBasliginaTiklar() {
        clickByJS(allPages.homePage().yayincilarTextHome);
    }
    @And("kullanici yayincilar sayfasinin acildigini dogrular")
    public void kullaniciYayincilarSayfasininAcildiginiDogrular() {
        assert allPages.yayincilarPage().favoriYayinciniziBulunTextYayincilar.isDisplayed();
    }
    @And("kullanici yazarlar basligina tiklar")
    public void kullaniciYazarlarBasliginaTiklar() {
        clickByJS(allPages.homePage().yazarlarTextHome);
    }
    @And("kullanici yazarlar sayfasinin acildigini dogrular")
    public void kullaniciYazarlarSayfasininAcildiginiDogrular() {
        assert allPages.yazarlarPage().yazarligaMerhabaDiyenlerTextYazarlar.isDisplayed();
    }
    @And("kullanici cocuk kitaplari basligina tiklar")
    public void kullaniciCocukKitaplariBasliginaTiklar() {
        clickByJS(allPages.homePage().cocukKitaplariTextHome);
    }
    @And("kullanici cocuk kitaplari sayfasinin acildigini dogrular")
    public void kullaniciCocukKitaplariSayfasininAcildiginiDogrular() {
        assert allPages.cocukKitaplariPage().cocukKitaplariTextCocukKitaplari.isDisplayed();
    }
    @And("kullanici sinav kitaplari basligina tiklar")
    public void kullaniciSinavKitaplariBasliginaTiklar() {
        clickByJS(allPages.homePage().sinavKitaplariTextHome);
    }
    @And("kullanici sinav kitaplari sayfasinin acildigini dogrular")
    public void kullaniciSinavKitaplariSayfasininAcildiginiDogrular() {
        assert allPages.sinavKitaplariPage().sinavKitaplariTextSinavKitaplari.isDisplayed();
    }
    @And("kullanici ne okusam basligina tiklar")
    public void kullaniciNeOkusamBasliginaTiklar() {
        clickByJS(allPages.homePage().neOkusamTextHome);
    }
    @When("kullanici ne okusam sayfasinin acildigini dogrular")
    public void kullaniciNeOkusamSayfasininAcildiginiDogrular() {
        assert allPages.neOkusamPage().neOkusamListeleriTextNeOkusam.isDisplayed();
    }
    @And("kullanici kitapYurduCom textine tiklar")
    public void kullaniciKitapYurduComTextineTiklar() {
        clickByJS(allPages.homePage().kitapYurduComTextHome);
    }
    @Given("kullanici dergi linkine tiklar")
    public void kullaniciDergiLinkineTiklar() {
        clickByJS(allPages.homePage().dergiLinkHome);
    }
    @When("kullanici dergi ile ilgili alanlarin acildigini dogrular")
    public void kullaniciDergiIleIlgiliAlanlarinAcildiginiDogrular() {
        assert allPages.homePage().edebiyatDergileriDropdownHome.isDisplayed();
    }
    @And("kullanici hobi_oyuncak linkine tiklar")
    public void kullaniciHobi_oyuncakLinkineTiklar() {
        clickByJS(allPages.homePage().hobiOyuncakLinkHome);
    }
    @And("kullanici hobi_oyuncak ile ilgili alanlarin acildigini dogrular")
    public void kullaniciHobi_oyuncakIleIlgiliAlanlarinAcildiginiDogrular() {
        assert allPages.homePage().oyunVeOyuncakDropdownHome.isDisplayed();
    }
    @And("kullanici kirtasiye linkine tiklar")
    public void kullaniciKirtasiyeLinkineTiklar() {
        clickByJS(allPages.homePage().kirtasiyeLinkHome);
    }
    @And("kullanici kirtasiye ile ilgili alanlarin acildigini dogrular")
    public void kullaniciKirtasiyeIleIlgiliAlanlarinAcildiginiDogrular() {
        assert allPages.homePage().kitapAksesuarlariDropdownHome.isDisplayed();
    }
    @And("kullanici kirkambar linkine tiklar")
    public void kullaniciKirkambarLinkineTiklar() {
        clickByJS(allPages.homePage().kirkambarLinkHome);
    }
    @And("kullanici temali ve lisansli urunler alaninin acildigini dogrular")
    public void kullaniciTemaliVeLisansliUrunlerAlanininAcildiginiDogrular() {
        assert allPages.homePage().temaliVeLisansliUrunlerDropdownHome.isDisplayed();
    }
    @And("kullanici tum kategoriler linkine tiklar")
    public void kullaniciTumKategorilerLinkineTiklar() {
        clickByJS(allPages.homePage().tumKategorilerLinkHome);
    }
    @And("kullanici tum kategori seceneklerinin gorunur oldugunu dogrular")
    public void kullaniciTumKategoriSeceneklerininGorunurOldugunuDogrular() {
        assert allPages.kategoriPage().tumKategorilerTextKategoriler.isDisplayed();
    }
    @And("kullanici kampanyalar linkine tiklar")
    public void kullaniciKampanyalarLinkineTiklar() {
        clickByJS(allPages.homePage().kampanyalarLinkHome);
    }
    @And("kullanici one cikan kampanyalari goruntuler")
    public void kullaniciOneCikanKampanyalariGoruntuler() {
        assert allPages.kampanyalarPage().tumKampanyalarTextKampanyalar.isDisplayed();
    }
    @And("kullanici puan katalogu linkine tiklar")
    public void kullaniciPuanKataloguLinkineTiklar() {
        clickByJS(allPages.homePage().puanKataloguLinkHome);
    }
    @When("kullanici puan katalogu sayfasinin acildigini dogrular")
    public void kullaniciPuanKataloguSayfasininAcildiginiDogrular() {
        assert allPages.puanKataloguPage().puanKataloguTextPuanKatalogu.isDisplayed();
    }
    @Given("kullanici listelerim linkine gelir")
    public void kullaniciListelerimLinkineGelir() {
        actions.moveToElement(allPages.homePage().listelerimLinkHome).perform();
    }
    @When("kullanici acilan listelerim alt secenekleri goruntuler")
    public void kullaniciAcilanListelerimAltSecenekleriGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().favorilerimSecenegiListelerimLinkHome.isDisplayed();
    }
    @And("kullanici siparis takibi linkine gelir")
    public void kullaniciSiparisTakibiLinkineGelir() {
        actions.moveToElement(allPages.homePage().siparisTakibiLinkHome).perform();
    }
    @And("kullanici acilan siparis takibi alt seceneklerini goruntuler")
    public void kullaniciAcilanSiparisTakibiAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().siparislerimSecenegiSiparisTakibiHome.isDisplayed();
    }
    @And("kullanici Turkce linkine gelir")
    public void kullaniciTurkceLinkineGelir() {
        actions.moveToElement(allPages.homePage().turkceDilSecenegiHome).perform();
    }
    @And("kullanici acilan Turkce alt seceneklerini goruntuler")
    public void kullaniciAcilanTurkceAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().englishDilSecenegiHome.isDisplayed();
    }
    @And("kullanici TL secenegini gelir")
    public void kullaniciTLSeceneginiGelir() {
        actions.moveToElement(allPages.homePage().tlSecenegiHome).perform();
    }
    @And("kullanici acilan TL alt seceneklerini goruntuler")
    public void kullaniciAcilanTLAltSecenekleriniGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().eurSecenegiHome.isDisplayed();
    }
    @And("kullanici yardim linkine gelir")
    public void kullaniciYardimLinkineGelir() {
        actions.moveToElement(allPages.homePage().yardimLinkHome).perform();
    }
    @And("kullanici yardim ve islem rehberi secenegini goruntuler")
    public void kullaniciYardimVeIslemRehberiSeceneginiGoruntuler() throws InterruptedException {
        Thread.sleep(1000);
        assert allPages.homePage().yardimVeIslemRehberiSecenegiYardimHome.isDisplayed();
    }
    @Given("kullanici anasayfadaki ilk urune gelir")
    public void kullaniciAnasayfadakiIlkUruneGelir() {
        scrollIntoViewJS(allPages.homePage().haftaninYayineviTextHome);
    }
    @When("kullanici sayfadaki ilk urunu sepete ekler")
    public void kullaniciSayfadakiIlkUrunuSepeteEkler() throws InterruptedException {
        actions.moveToElement(allPages.homePage().zeytindagiKitabiHome).perform();
        Thread.sleep(1000);
        clickByJS(allPages.homePage().alisverisListemeEkleLinkAnasayfaIlkUrunHome);
    }
    @And("kullanici urun alisveris listenize eklendi alertini gorur")
    public void kullaniciUrunAlisverisListenizeEklendiAlertiniGorur() {
        assert allPages.homePage().urunAlisverisListenizeEklendiAlertHome.isDisplayed();
    }
    @And("kullanici goruntulenen alerte tiklar")
    public void kullaniciGoruntulenenAlerteTiklar() {
        clickByJS(allPages.homePage().urunAlisverisListenizeEklendiAlertHome);
    }
    @And("kullanici sectigi urunu alisveris listesinde goruntuler")
    public void kullaniciSectigiUrunuAlisverisListesindeGoruntuler() {
        assert allPages.indexPage().zeytindagiKitabiFalihRifkiAtayIndex.isDisplayed();
    }
    @And("kullanici bir onceki sayfaya doner")
    public void kullaniciBirOncekiSayfayaDoner() {
        Driver.getDriver().navigate().back();
    }
    @When("kullanici eklemis oldugu urunun tekrar listeye eklenebilecegini dogrular")
    public void kullaniciEklemisOlduguUrununTekrarListeyeEklenebileceginiDogrular() {
        actions.moveToElement(allPages.homePage().zeytindagiKitabiHome).perform();
        clickByJS(allPages.homePage().alisverisListemeEkleLinkAnasayfaIlkUrunHome);
        assert allPages.homePage().urunAlisverisListenizeEklendiAlertHome.isDisplayed();
    }
}
