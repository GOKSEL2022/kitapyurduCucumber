package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IndexPage {
    public IndexPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@id='product-455239'])[1]")
    public WebElement safahatImgIndex;

    @FindBy(xpath = "//*[@class='btn border border-1 border-gray-600 rounded-3 py-18px text-gray-800 bg-white w-100 mt-15px fs-18 fw-bold']")
    public WebElement uyeOlmadanDevamEtButonIndex;

    @FindBy(xpath = "//*[@id='shipping-company']")
    public WebElement adreseTeslimEtRadioButonIndex;

    @FindBy(xpath = "(//*[@class='border border-2 rounded-1 border-gray-300 d-flex justify-content-center align-items-center text-green-dark text-decoration-none'])[2]")
    public WebElement adresEkleTextBoxIndex;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement adinizTextBoxIndex;

    @FindBy(xpath = "//*[@id='description_text']")
    public WebElement descriptionSafahatKitap;

    @FindBy(xpath = "//*[@id='continue-button']")
    public WebElement devamEtButonIndex;

    @FindBy(xpath = "//*[@id='btn-modal-country']")
    public WebElement ulkeDropDownIndex;

    @FindBy(xpath = "(//*[@class='js-btn-open-modal border border-gray-300 rounded-1 bg-white btn d-flex justify-content-between align-items-center'])[1]")
    public WebElement ulkeDropDown2Index;

    @FindBy(xpath = "//*[@id='btn-modal-zone']")
    public WebElement sehirDropDownIndex;

    @FindBy(xpath = "(//*[@class='js-btn-open-modal border border-gray-300 rounded-1 bg-white btn d-flex justify-content-between align-items-center'])[2]")
    public WebElement sehirDropDown2Index;

    @FindBy(xpath = "//*[@class='mobile h-100 mobile-min-width bg-gray-250 tr']")
    public WebElement ilceDropDownIndex;

    @FindBy(xpath = "(//*[@class='js-btn-open-modal border border-gray-300 rounded-1 bg-white btn d-flex justify-content-between align-items-center'])[3]")
    public WebElement ilceDropDown2Index;

    @FindBy(xpath = "//*[@id='btn-modal-district']")
    public WebElement mahalleDropDownIndex;

    @FindBy(xpath = "(//*[@class='js-btn-open-modal border border-gray-300 rounded-1 bg-white btn d-flex justify-content-between align-items-center'])[4]")
    public WebElement mahalleDropDown2Index;


}
