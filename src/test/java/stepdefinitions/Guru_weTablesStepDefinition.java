package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Guru_weTablesPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class Guru_weTablesStepDefinition {
    Guru_weTablesPage guru_weTablesPage=new Guru_weTablesPage();
    @Then("Company listesini consola yazdirir.")
    public void company_listesini_consola_yazdirir() {
        ReusableMethods.getElementsTextTum(guru_weTablesPage.campanyNames);


    }
    @Then("DCB Bank'in listede oldugunu test eder.")
    public void dcb_bank_in_listede_oldugunu_test_eder() {
        List<String >campanyNamess=new ArrayList<>(ReusableMethods.getElementsTextTum(guru_weTablesPage.campanyNames));
       // campanyNamess=ReusableMethods.getElementsTextTum(guru_weTablesPage.campanyNames);
        Assert.assertTrue(campanyNamess.contains("Capital First"));

    }
}
