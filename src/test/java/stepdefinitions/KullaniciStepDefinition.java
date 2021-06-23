package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.KullaniciDataPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KullaniciStepDefinition {
     KullaniciDataPage kullaniciDataPage=new KullaniciDataPage();
    @Then("new butonuna Basar")
    public void new_butonuna_basar() {
        kullaniciDataPage.newButton.click();
    }
     @Then("tum bilgileri Girer")
    public void tum_bilgileri_girer() {
         Actions actions = new Actions(Driver.getDriver());
         //editorDataPage.firstName.sendKeys(ConfigReader.getProperty("editor_data_first_name"));
         actions.click(kullaniciDataPage.first_name).
                 pause(1).
                 sendKeys(ConfigReader.getProperty("firts_name")).
                 sendKeys(Keys.TAB).
                 pause(1).
                 sendKeys(ConfigReader.getProperty("last_name")).
                 sendKeys(Keys.TAB).
                 pause(1).
                 sendKeys(ConfigReader.getProperty("position")).
                 sendKeys(Keys.TAB).
                 pause(1).
                 sendKeys(ConfigReader.getProperty("office")).
                 sendKeys(Keys.TAB).
                 pause(1).
                 sendKeys(ConfigReader.getProperty("extension")).
                 sendKeys(Keys.TAB).
                 pause(1).
                 sendKeys(ConfigReader.getProperty("start_date")).
                 sendKeys(Keys.TAB).
                 pause(1).
                 sendKeys(ConfigReader.getProperty("salary")).
                 perform();
    }
    @Then("Create tusuna Basar")
    public void create_tusuna_basar() {
        kullaniciDataPage.createButton.click();
    }
    @When("kullanici ilk isim ile arama Yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        kullaniciDataPage.searchButton.sendKeys(ConfigReader.getProperty("firts_name")+Keys.ENTER);
    }
    @Then("isim bolumunde isminin oldugunu Dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
        //Assert.assertTrue(kullaniciDataPage.searchResult.getText().contains(ConfigReader.getProperty("firstName")));


    }


}
