package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YandexPage {
   public YandexPage (){
        PageFactory.initElements(Driver.getDriver(),this);

      }
    @FindBy(xpath = "//*[@name='text']")
    public WebElement aramaKutucugu;
   @FindBy(linkText = "iPhone - Yandex: 27 million results found")
    public WebElement iPhoneSonucTittle;

}
