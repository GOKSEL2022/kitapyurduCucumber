package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AllPages;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class TC06_KitapYurduHomeStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    int kartNo = Faker.instance().number().numberBetween(1000, 9999);
    int kullanimTarihi1=Faker.instance().number().numberBetween(1, 12);
    int kullanimTarihi2=Faker.instance().number().numberBetween(2000, 2030);
    int cvc=Faker.instance().number().numberBetween(100, 999);

    @And("kullanici e-posta alanina gecerli bir {string} girer.")
    public void kullaniciEPostaAlaninaGecerliBirGirer(String string) {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(string);
    }
    @And("kullanici sifre alanina kayitli sifresini {string} girer.")
    public void kullaniciSifreAlaninaKayitliSifresiniGirer(String string) {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(string);
    }
    @And("kullanici beni hatirla checkboxi tiklar.")
    public void kullaniciBeniHatirlaCheckboxiTiklar() {
        clickByJS(allPages.indexPage().checkBoxBeniHatirlaHosgeldinizIndex);
    }
    @And("kullanici giris yap butonuna tiklar.")
    public void kullaniciGirisYapButonunaTiklar() {
        clickByJS(allPages.indexPage().girisYapButonHosgeldinizIndex);
    }
    @And("kullanici sayfaya kayitli hesap ile girdigini dogrular")
    public void kullaniciSayfayaKayitliHesapIleGirdiginiDogrular() {
        assert allPages.homePage().merhabaYekpareBirAnKayitliKullaniciHome.getText().contains("yekpare bir an");
    }
    @And("kullanici edebiyat dergileri seceneginin uzerine gelir")
    public void kullaniciEdebiyatDergileriSecenegininUzerineGelir() {
        actions.moveToElement(allPages.homePage().edebiyatDergileriDropdownHome).perform();
    }
    @And("kullanici dil ve edebiyat secenegini tiklar")
    public void kullaniciDilVeEdebiyatSeceneginiTiklar() {
        clickWithTimeOut(allPages.homePage().dilVeEdebiyatSecenegiEdebiyatDergiHome,2);
    }
    @And("kullanici urunlerin listelendigi sayfada oldugunu dogrular")
    public void kullaniciUrunlerinListelendigiSayfadaOldugunuDogrular() {
        assert allPages.indexPage().urunListelendiTextIndex.getText().contains("ürün listelendi");
    }
    @And("kullanici anasayfadaki sayfadaki ilk urune tiklar")
    public void kullaniciAnasayfadakiSayfadakiIlkUruneTiklar() {
        clickByJS(allPages.indexPage().dilVeEdebiyatDergileriIlkUrunIndex);
    }
    @And("kullanici sayfadaki ilk urune tiklar")
    public void kullaniciSayfadakiIlkUruneTiklar() {
        clickByJS(allPages.indexPage().dilVeEdebiyatDergileriIlkUrunIndex);
    }
    @And("kullanici favorilerime ekle secenegini tiklar")
    public void kullaniciFavorilerimeEkleSeceneginiTiklar() throws InterruptedException {
        scrollIntoViewJS(allPages.dergiPage().favorilerimeEkleLinkDergi);
        Thread.sleep(1000);
        clickByJS(allPages.dergiPage().favorilerimeEkleLinkDergi);
    }
    @And("kullanici urun basarili sekilde favorilerinize eklenedi mesajini gorur")
    public void kullaniciUrunBasariliSekildeFavorilerinizeEklenediMesajiniGorur() {
        assert allPages.dergiPage().urunBasariliSekildeFavorilerinizeEklendiAlertDergi.isDisplayed();
    }
    @And("kullanici listelerim linkinde favorilerim secenegini tiklar")
    public void kullaniciListelerimLinkindeFavorilerimSeceneginiTiklar() {
        clickByJS(allPages.homePage().favorilerimSecenegiListelerimLinkHome);
    }
    @And("kullanici favorilere ekledigi urunun favori listesinde oldugunu goruntuler")
    public void kullaniciFavorilereEkledigiUrununFavoriListesindeOldugunuGoruntuler() {
        assert allPages.indexPage().favorilerimEklenenUrunIndex.isDisplayed();
    }
    @And("kullanici ayni sayfadaki ilk urune tiklar")
    public void kullaniciAyniSayfadakiIlkUruneTiklar() {
        clickByJS(allPages.indexPage().dergiSayfasiIlkUrunIndex);
    }
    @And("kullanici fatura turu olarak sahis olarak sahis secer")
    public void kullaniciFaturaTuruOlarakSahisOlarakSahisSecer() {
        clickByJS(allPages.indexPage().sahisCheckBoxIndex);
    }
    @And("kullanici satin al_index butonuna tiklar")
    public void kullaniciSatinAl_indexButonunaTiklar() {
        clickByJS(allPages.indexPage().satinAlButonIndex);
    }
    @And("kullanici Adres Ekle sayfasinin acildigini dogrular")
    public void kullaniciAdresEkleSayfasininAcildiginiDogrular() {
        assert allPages.indexPage().adresEkleTextIndex.isDisplayed();
    }
    @And("kullanici adres ekle sayfasina adres basligi girer")
    public void kullaniciAdresEkleSayfasinaAdresBasligiGirer() {
        try {
            allPages.indexPage().adresBasligiTextBoxIndex.sendKeys("İşyeri adresi",
                    Keys.TAB, "Celik Holding", Keys.TAB, "Patron");
        }catch (Exception e) {
        }
        try {
            clickByJS(allPages.indexPage().yeniAdresEkleIndex);
            allPages.indexPage().adresBasligiTextBoxIndex.sendKeys("İşyeri adresi",
                    Keys.TAB, "Celik Holding", Keys.TAB, "Patron");
        } catch (Exception e){
        }
    }
    @And("kullanici ad_sirketAdi girer")
    public void kullaniciAd_sirketAdiGirer() {
    }
    @And("kullanici soyad_unvan girer")
    public void kullaniciSoyad_unvanGirer() {
    }
    @And("kullanici ulke girer")
    public void kullaniciUlkeGirer() {
        new Select(allPages.indexPage().ulkeDropDownIndex).selectByVisibleText("Türkiye");
    }
    @And("kullanici sehir girer")
    public void kullaniciSehirGirer() {
        new Select(allPages.indexPage().sehirDropDownIndex).selectByVisibleText("Samsun");
    }
    @And("kullanici ilce girer")
    public void kullaniciIlceGirer() {
        new Select(allPages.indexPage().ilceDropDownIndex).selectByVisibleText("ÇARŞAMBA");
    }
    @And("kullanici mahalle girer")
    public void kullaniciMahalleGirer() {
        allPages.indexPage().mahalleTextBoxIndex.sendKeys("Kirazlikçay Mahallesi",
                Keys.TAB, Faker.instance().address().fullAddress(),
                Keys.TAB,"55500",Keys.TAB,"5445499495",Keys.TAB,"3628333333",
                Keys.TAB,Keys.SPACE,Keys.TAB,"12098055722",Keys.TAB,Keys.ENTER);
    }
    @And("kullanici posta_kodu girer")
    public void kullaniciPosta_koduGirer() {
    }
    @And("kullanici cep_telefonu girer")
    public void kullaniciCep_telefonuGirer() {
    }
    @And("kullanici sabit_telefon girer")
    public void kullaniciSabit_telefonGirer() {
    }
    @And("kullanici fatura_turu secer")
    public void kullaniciFatura_turuSecer() {
    }
    @And("kullanici TC kimlik no girer")
    public void kullaniciTCKimlikNoGirer() {
    }
    @And("kullanici kaydet butonuna tiklar")
    public void kullaniciKaydetButonunaTiklar() {
        try {
            clickByJS(allPages.indexPage().kaydetButonIndex);
        }catch (Exception e) {
        }
        try {
           clickByJS(allPages.indexPage().devamEtButonIndex);
        } catch (Exception e){
        }
    }
    @And("kullanici adres ekle butonuna tiklar.")
    public void kullaniciAdresEkleButonunaTiklar() {
        allPages.indexPage().yeniAdresEkleIndex.click();
    }
    @And("kullanici kart ile ode basligini goruntuler")
    public void kullaniciKartIleOdeBasliginiGoruntuler() {
        assert allPages.indexPage().kartIleOdeCheckboxIndex.isDisplayed();
    }
    @And("kullanici rastgele kart numarasi girer")
    public void kullaniciRastgeleKartNumarasiGirer() {
        allPages.indexPage().kartNumarasiTextBoxIndex.sendKeys(kartNo+""+kartNo+""+kartNo+""+kartNo+"",
                Keys.TAB,Faker.instance().name().fullName(),Keys.TAB,kullanimTarihi1+""+kullanimTarihi2,Keys.TAB,cvc+"",Keys.TAB,Keys.SPACE);
    }
    @And("kullanici kart uzerindeki isim girer")
    public void kullaniciKartUzerindekiIsimGirer() {
    }
    @And("kullanici son kullanma tarihi girer")
    public void kullaniciSonKullanmaTarihiGirer() {
    }
    @And("kullanici CVC girer")
    public void kullaniciCVCGirer() {
    }
    @And("kullanici toplam tutari goruntuler")
    public void kullaniciToplamTutariGoruntuler() {
        assert allPages.indexPage().toplamTutarTextIndex.isDisplayed();
    }
    @When("kullanici kart numarasi gecersiz kontrol ediniz alertini gorur")
    public void kullaniciKartNumarasiGecersizKontrolEdinizAlertiniGorur() {
        clickByJS(allPages.indexPage().devamEtButonIndex);
        waitForVisibility(allPages.indexPage().kartNoGecersizKontrolEdinizAlertIndex,5);
    }
    @Given("kullanici kitapYurdu_com textine tiklar")
    public void kullaniciKitapYurdu_comTextineTiklar() {
        clickByJS(allPages.homePage().kitapYurduComTextHome);
    }
    @Given("kullanici kelepir ara textBoxina gelir")
    public void kullaniciKelepirAraTextBoxinaGelir() {
        //ReusableMethods.scrollIntoViewJS(homePage.konuButunKonularDropDownHome);
    }
    @And("kullanici konu dropdownindan cocuk kitaplarini secer")
    public void kullaniciKonuDropdownindanCocukKitaplariniSecer() {
        new Select(allPages.homePage().konuButunKonularDropDownHome).selectByVisibleText("Çocuk Kitapları");
    }
    @And("kullanici fiyat ust sinir textboxina ucret olarak yuz elli girer")
    public void kullaniciFiyatUstSinirTextboxinaUcretOlarakYuzElliGirer() {
        allPages.homePage().fiyatUstSinirTextBoxHome.sendKeys("150");
    }
    @And("kullanici indirim alt sinir dropdownindan yuzde yetmisi secer")
    public void kullaniciIndirimAltSinirDropdownindanYuzdeYetmisiSecer() {
        new Select(allPages.homePage().indirimAltSinirDropDownHome).selectByVisibleText("% 70");
    }
    @And("kullanici kelepir ara butonuna tiklar")
    public void kullaniciKelepirAraButonunaTiklar() {
        clickByJS(allPages.homePage().kelepirAraButtonHome);
    }
    @And("kullanici listelenen urun sayisini gorur")
    public void kullaniciListelenenUrunSayisiniGorur() {
        assert allPages.indexPage().altiUrunListelendiUrunSayisiTextIndex.getText().contains("6 ürün listelendi");
        //assert indexPage.altiUrunListelendiUrunSayisiTextIndex.isDisplayed();
    }
    @And("kullanici sayfada bulunan urunlerin hepsini sepete ekler")
    public void kullaniciSayfadaBulunanUrunlerinHepsiniSepeteEkler() {
        actions.moveToElement(allPages.indexPage().cocukKitaplariIlkUrunIndex).perform();
        clickByJS(allPages.indexPage().ilkUrunSepeteEkleIndex);
        actions.moveToElement(allPages.indexPage().cocukKitaplariIkinciUrunIndex).perform();
        clickByJS(allPages.indexPage().ikinciUrunSepeteEkleIndex);
        actions.moveToElement(allPages.indexPage().cocukKitaplariUcuncuUrunIndex).perform();
        clickByJS(allPages.indexPage().ucuncuUrunSepeteEkleIndex);
        actions.moveToElement(allPages.indexPage().cocukKitaplariDorduncuUrunIndex).perform();
        clickByJS(allPages.indexPage().dorduncuUrunSepeteEkleIndex);
        actions.moveToElement(allPages.indexPage().cocukKitaplariBesinciUrunIndex).perform();
        clickByJS(allPages.indexPage().besinciUrunSepeteEkleIndex);
        actions.moveToElement(allPages.indexPage().cocukKitaplariAltinciUrunIndex).perform();
        clickByJS(allPages.indexPage().altinciUrunSepeteEkleIndex);
    }
    @And("kullanici secili urunleri sepetten kaldirmak icin x e tiklar")
    public void kullaniciSeciliUrunleriSepettenKaldirmakIcinXETiklar() throws InterruptedException {
        for (int i=1;i<allPages.indexPage().tumKaldirIsaretleriIndex.size();i++){
            allPages.indexPage().tumKaldirIsaretleriIndex.get(i).click();
            Thread.sleep(1000);
        }
    }
    @When("kullanici alisveris sepetiniz bos yazisini gorur")
    public void kullaniciAlisverisSepetinizBosYazisiniGorur() throws InterruptedException {
        for (int i=1;i<allPages.indexPage().tumKaldirIsaretleriIndex.size();i++){
            allPages.indexPage().tumKaldirIsaretleriIndex.get(i).click();
            Thread.sleep(1000);
        }
    }
    }



