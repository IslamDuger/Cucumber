package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruWebTablesPage {
    public GuruWebTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//tbody//tr//td[1]")
    public List<WebElement> satirlarinIkinciSutunu;
}
