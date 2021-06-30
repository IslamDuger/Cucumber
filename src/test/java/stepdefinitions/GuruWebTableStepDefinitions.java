package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.GuruWebTablesPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.List;

public class GuruWebTableStepDefinitions {
    GuruWebTablesPage guruWebTablesPage=new GuruWebTablesPage();

    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {

        ReusableMethods.getElementsTextTum(guruWebTablesPage.satirlarinIkinciSutunu);


    }

    @Then("DCB Bank'in listede oldugunu test eder")
    public void dcb_bank_in_listede_oldugunu_test_eder() {
        List<WebElement> elements=guruWebTablesPage.satirlarinIkinciSutunu;
        Assert.assertTrue(elements.contains(ConfigReader.getProperty("bankIsmi")));


    }


}
