package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IletisimPage {
    public IletisimPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//select[@name='contact_subject_id']")
    public WebElement secinizDropDownIletisim;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement adinizTextBoxIletisim;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailTextBoxIletisim;

    @FindBy(xpath = "//*[@name='enquiry']")
    public WebElement mesajinizTextBoxIletisim;

    @FindBy(xpath = "//*[@name='captcha']")
    public WebElement dogrulamaKodunuzTextBoxIletisim;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement gonderButonIletisim;

    @FindBy(xpath = "//*[@class='error']")
    public WebElement dogrulamKoduYanlisHataMesajiIletisim;

}
