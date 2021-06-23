package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;

public class EditordatatablesnetPage {
    public EditordatatablesnetPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newButtonu;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;
    @FindBy(id="DTE_Field_last_name")
    public WebElement lastName;
    @FindBy(id="DTE_Field_position")
    public WebElement position;
    @FindBy(id="DTE_Field_office")
    public WebElement office;
    @FindBy(id="DTE_Field_extn")
    public WebElement extension;
    @FindBy(id="DTE_Field_start_date")
    public WebElement startDate;
    @FindBy(id="DTE_Field_salary")
    public WebElement salary;
    @FindBy(xpath = "//*[@class='btn']")
    public WebElement creatButton;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement search;
}
