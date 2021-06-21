package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YandexPage;
import utilities.ConfigReader;
import utilities.Driver;

public class YandexStepDefinitions {
    YandexPage yandexPage=new YandexPage();

    @Given("Kullanici Yandex anasafaya gider")
    public void kullaniciYandexSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("yandex_url"));

    }

    @When("Yandexde IPhone arama yapar")
    public void yandexde_i_phone_arama_yapar() {
        yandexPage.aramaKutucugu.sendKeys("iPhone"+ Keys.ENTER);

       }

    @Then("Yandexde sonuclarin iPhone icerdigini test eder")
    public void yandexde_sonuclarin_i_phone_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
       }


    @When("Yandexde flower arama yapar")
    public void yandexde_flower_arama_yapar() {
        yandexPage.aramaKutucugu.sendKeys("flower"+ Keys.ENTER);

    }

    @Then("Yandexde sonuclarin flower icerdigini test eder")
    public void yandexde_sonuclarin_flower_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("flower"));
       }



}