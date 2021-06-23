package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditordatatablesnetPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditordatatablesnetDefinition {

    EditordatatablesnetPage editordatatablesnetPage=new EditordatatablesnetPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
       editordatatablesnetPage.newButtonu.click();
    }

    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        editordatatablesnetPage.firstName.sendKeys(ConfigReader.getProperty("firts_name"));
        editordatatablesnetPage.lastName.sendKeys(ConfigReader.getProperty("last_name"));
        editordatatablesnetPage.position.sendKeys(ConfigReader.getProperty("position"));
        editordatatablesnetPage.office.sendKeys(ConfigReader.getProperty("office"));
        editordatatablesnetPage.extension.sendKeys(ConfigReader.getProperty("extension"));
        editordatatablesnetPage.startDate.sendKeys(ConfigReader.getProperty("start_date"));
        editordatatablesnetPage.salary.sendKeys(ConfigReader.getProperty("salary"));

//       Actions actions=new Actions(Driver.getDriver());
//         actions.click(editordatatablesnetPage.firstName).
//                 sendKeys(ConfigReader.getProperty("first_name")).
//                 sendKeys(Keys.TAB).
//                 sendKeys(ConfigReader.getProperty("last_name")).
//                 sendKeys(Keys.TAB).
//                 sendKeys(ConfigReader.getProperty("position")).
//                 sendKeys(Keys.TAB).
//                 sendKeys(ConfigReader.getProperty("office")).
//                 sendKeys(Keys.PAGE_DOWN).
//                 sendKeys(Keys.TAB).
//                 sendKeys(ConfigReader.getProperty("start_date")).
//                 sendKeys(Keys.TAB).
//                 sendKeys(ConfigReader.getProperty("salary")).
//                 perform();
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editordatatablesnetPage.creatButton.click();
    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
      //  editordatatablesnetPage.search.click();
        editordatatablesnetPage.search.sendKeys(ConfigReader.getProperty("firts_name")+Keys.ENTER);

            }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
      Assert.assertEquals(ConfigReader.getProperty("sonuc_url"),Driver.getDriver().getCurrentUrl());
    }


}
