package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountPage {
    public MyAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='username']")
    public WebElement textBoxUsernameSigninMyAccount;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement textBoxPasswordSigninMyAccount;

    @FindBy(xpath = "//*[@id='rememberme']")
    public WebElement checkboxRememberMeSigninMyAccount;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement signinButtonMyAccount;

    @FindBy(xpath = "//*[@class='woocommerce-error']")
    public WebElement errorMessageAlertSigninMyAccount;

    @FindBy(xpath = "//a[@href='signup']")
    public WebElement textSignupMyAccount;

    @FindBy(xpath = "//*[@id='reg_username']")
    public WebElement usernameSignupRegister;

    @FindBy(xpath = "(//*[@name='email'])[1]")
    public WebElement emailSignupRegister;

    @FindBy(xpath = "//*[@id='reg_password']")
    public WebElement passwordSignupRegister;

    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
    public WebElement checkboxSignupRegister;

    @FindBy(xpath = "//*[@name='register']")
    public WebElement signupButtonSignupRegister;

    @FindBy(xpath = "//*[.='Please enter a valid account username.']")
    public WebElement textPleaseEnterAValidAccountUsername;
}
