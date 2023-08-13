package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='search-input']")
    public WebElement searchTextBoxHome;

    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=account/register']")
    public WebElement uyeOlLinkHome;

    @FindBy(xpath = "//*[@class='menu-top-button login']")
    public WebElement girisYapLinkHome;

    @FindBy(xpath = "//*[@id='bottom-button']")
    public WebElement enAltaInYonButonHome;

    @FindBy(xpath = "//*[@id='top-button']")
    public WebElement enUsteCikYonButonHome;

    @FindBy(xpath = "//img[@class='swiper-lazy swiper-lazy-loaded']")
    public List<WebElement> anasayfaKaydiriciResimlerHome;

    @FindBy(xpath = "//*[@class='swiper-button-next common-sprite desktop-banner-next']")
    public WebElement sagYonKaydiriciButonHome;

    @FindBy(xpath = "//*[@class='swiper-button-prev common-sprite desktop-banner-prev']")
    public WebElement solYonKaydiriciButonHome;

    @FindBy(xpath = "(//*[@alt='Kavanozda'])[1]")
    public WebElement anasayfaIlkUrunHome;

    @FindBy(xpath = "//*[@id='suggest-button']")
    public WebElement fikriniziPaylasirmisinizSembolButonHome;

    @FindBy(xpath = "(//h2[text()='Önerim Var'])[1]")
    public WebElement onerimVarTextHome;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement onerimVarAdSoyadHome;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement onerimVarEmailHome;

    @FindBy(xpath = "//select[@name='subject']")
    public WebElement onerimVarSecinizDropDownHome;

    @FindBy(xpath = "//*[@name='enquiry']")
    public WebElement onerimVarGorusunuzHome;

    @FindBy(xpath = "//*[@id='feedback_captcha']")
    public WebElement onerimVarDogrulamaKoduHome;

    @FindBy(xpath = "//*[@class='button']")
    public WebElement onerimVarGonderButonHome;

    @FindBy(xpath = "//*[.='Girmiş olduğunuz doğrulama kodu hatalıdır.']")
    public WebElement onerimVarHataliKodMesajiHome;

    @FindBy(xpath = "(//*[@class='bottom-item'])[2]")
    public WebElement iletisimLinkHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[1]")
    public WebElement cokSatanKitaplarTextHome;

    @FindBy(xpath = "(//*[@class='mn-icon icon-angleRight'])[1]")
    public WebElement haftalikCokSatanKitaplarTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[2]")
    public WebElement yeniCikanKitaplarTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[3]")
    public WebElement tumKitaplarTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[4]")
    public WebElement yayincilarTextHome;

    @FindBy(xpath = "(//*[@class='mn-strong common-sprite'])[5]")
    public WebElement yazarlarTextHome;









}
