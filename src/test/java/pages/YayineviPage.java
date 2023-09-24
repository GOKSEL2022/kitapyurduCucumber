package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YayineviPage {
    public YayineviPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[text()='NEFES YAYINLARI']")
    public WebElement tumunuGosterSecilenYayineviNefesYayinlariTextYayinevi;

    @FindBy(xpath = "(//*[@href='https://www.kitapyurdu.com/kitap/besmele-bismillahirrahmanirrahim-serhi/645497.html&publisher_id=2197'])[1]")
    public WebElement nefesYayinlariIlkUrunYayinevi;
}
