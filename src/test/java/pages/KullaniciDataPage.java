package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KullaniciDataPage {
    public KullaniciDataPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newButton;
    @FindBy(id = "DTE_Field_first_name")
    public WebElement first_name;
    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createButton;
    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchButton;



}
