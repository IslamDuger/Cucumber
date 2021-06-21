package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //bu notasyonun gorevi feature dosyalarim ile stepdefinition dosyalarini birlestirmek
        features="src/test/resources/features",
        glue="stepdefinitions",
        //boylece package leri bir birine bagliyoruz
        //bu iki paket altinda kactane class olursa olsun
        //herhangi bir class da yazilan her adim diger classlardaki
        // adimlarla uyusursa yeni adim olusturmaya gerek kalmaz
        tags="@smoke",//work in progress

        //birden fazla tags kullanmak istersek Or veya And kullanilir.
        //@testNg deki gibi group gibi calisir
        //eger sadece 1 Feature veya 1 Scenario calistircaksa,gidip feature dosyasindan calistiririz.
        //Birden fazla Feature veya Scenario calistirmak istedigimizde
        //calistiracagimiz F veya S lara ortak bir tag atamamiz ve bu tagi runner da belirtmemiz gerekir.


        dryRun=true)


public class Runners {


}
