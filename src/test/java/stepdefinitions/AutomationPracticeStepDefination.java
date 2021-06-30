package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationPracticePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationPracticeStepDefination {
    AutomationPracticePage automationPractice=new AutomationPracticePage();


    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {

        automationPractice.singButtonu.click();
    }

    @Given("user Create and account bölümüne email adresi girer")
    public void user_create_and_account_bölümüne_email_adresi_girer() {
    automationPractice.emailCreate.sendKeys(ConfigReader.getProperty("email"));



    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {

        automationPractice.creatButtonu.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        automationPractice.bayButtonu.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(automationPractice.firstName,ConfigReader.getProperty("firts_name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("last_name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("email")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("password")).
                perform();
        Select day=new Select(automationPractice.daysForm);
        day.selectByIndex(21);
        Select month=new Select(automationPractice.manthsForm);
        month.selectByValue("2");
        Select year=new Select(automationPractice.yearsForm);
        year.selectByValue("1985");
        automationPractice.newsletterForm.isSelected();
        actions.sendKeys(automationPractice.firstNameAdress,ConfigReader.getProperty("firts_name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("last_name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("office")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("adress")).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("extension")).
                sendKeys(Keys.TAB).perform();

        Select state=new Select(automationPractice.state);
        state.selectByVisibleText("Florida");
        automationPractice.postcodeForm.sendKeys(ConfigReader.getProperty("postCode"));
        Select contry=new Select(automationPractice.contry);
        contry.selectByIndex(1);
        actions.sendKeys(automationPractice.additionalInformation,ConfigReader.getProperty("yorum")).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("telephoneNummer")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("extension")).
                sendKeys(Keys.TAB).
                perform();



    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
    automationPractice.register.click();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
       Assert.assertTrue(automationPractice.singOut.isDisplayed());
    }


    @Given("email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar")
    public void email_kutusuna_isareti_olmayan_email_adresi_yazar_ve_enter_a_tiklar() throws InterruptedException {
     automationPractice.userEmail.sendKeys(ConfigReader.getProperty("gecersizEmail"));
     automationPractice.userPassword.sendKeys(ConfigReader.getProperty("password"));
     automationPractice.submitButtonu.click();
     Thread.sleep(20000);
    }
    @Then("error mesajinin “Invalid email address” oldugunu dogrulayin")
    public void error_mesajinin_invalid_email_address_oldugunu_dogrulayin() throws InterruptedException {
     String expectedYazi="Invalid email address";
     String actualYazi=automationPractice.invalidEmail.getText();


     Assert.assertTrue(actualYazi.contains(expectedYazi));

    }



}

