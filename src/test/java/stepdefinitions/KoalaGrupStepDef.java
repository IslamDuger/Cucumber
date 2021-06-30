package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KoalaResortPage;
import utilities.ConfigReader;

public class KoalaGrupStepDef {
KoalaResortPage koalaResortPage=new KoalaResortPage();
    @Then("clicks on log button")
    public void clicks_on_log_button() {

        koalaResortPage.ilkLoginLinki.click();
    }
    @Then("user enters manager_id {string}")
    public void user_enters_manager_id(String name) {
        koalaResortPage.userTextBox.sendKeys(ConfigReader.getProperty(name));
       }
    @Then("user enters manager_password {string}")
    public void user_enters_manager_password(String pasword) {
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty(pasword));
    }
    @Then("clicks on login button")
    public void clicks_on_login_button() {

        koalaResortPage.loginButonu.click();
    }
    @Then("verify login {string} is displayed")
    public void verify_login_is_displayed(String string) {
        Assert.assertTrue(koalaResortPage.loginError.isDisplayed());   }


}
