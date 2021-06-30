package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticePage {
    public AutomationPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='login']")
    public WebElement singButtonu;
    @FindBy(id = "email_create")
    public WebElement emailCreate;
    @FindBy(id="SubmitCreate")
    public WebElement creatButtonu;
    @FindBy(id = "id_gender1")
    public WebElement bayButtonu;
    @FindBy(id = "customer_firstname")
    public WebElement firstName;
    @FindBy(id="customer_lastname")
    public WebElement lastName;
    @FindBy(id="email")
    public WebElement emailForm;
    @FindBy(id="passwd")
    public WebElement passwordForm;
    @FindBy(id="days")
    public WebElement daysForm;
    @FindBy(id="months")
    public WebElement manthsForm;
    @FindBy(id="years")
    public WebElement yearsForm;
    @FindBy(id="newsletter")
    public WebElement newsletterForm;
    @FindBy(xpath="//*[@id='firstname']")
    public WebElement firstNameAdress;
    @FindBy(id="id_state")
    public WebElement state;
    @FindBy(id="other")
    public WebElement additionalInformation;
    @FindBy(id="submitAccount")
    public WebElement register;
    @FindBy(id="postcode")
    public WebElement postcodeForm;
    @FindBy(id="id_country")
    public WebElement contry;
    @FindBy(partialLinkText = "Sign out")
    public WebElement singOut;
    @FindBy(id = "email")
    public WebElement userEmail;
    @FindBy(id="passwd")
    public WebElement userPassword;
    @FindBy(id = "SubmitLogin")
    public WebElement submitButtonu;
    @FindBy(xpath = "//li[text()='Invalid email address.']")
    public WebElement invalidEmail;














}
