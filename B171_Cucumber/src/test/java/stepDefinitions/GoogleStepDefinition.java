package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefinition {

    GooglePage googlePage = new GooglePage();
    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String arac) {

        googlePage.aramaKutusu.sendKeys(arac, Keys.ENTER);
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Given("kullanici parametreli method ile propertiesden {string} sayfasina gider")
    public void kullaniciParametreliMethodIlePropertiesdenSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Then("arama kutusunda propertiesden {string} aratir")
    public void aramaKutusundaPropertiesdenAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(arac),Keys.ENTER);
    }

    @And("sayfa basliginin propertiesden {string} icerdigini test eder")
    public void sayfaBasligininPropertiesdenIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(arac)));
    }

    @Then("arama kutusunda scenarioOutline ile {string} aratir")
    public void aramaKutusundaScenarioOutlineIleAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(arac,Keys.ENTER);
    }

    @And("sayfa basliginin scenarioOutline ile {string} icerdigini test eder")
    public void sayfaBasligininScenarioOutlineIleIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @Then("arama kutusunda scenarioOutline ile propertiesden {string} aratir")
    public void aramaKutusundaScenarioOutlineIlePropertiesdenAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(arac),Keys.ENTER);

    }

    @And("sayfa basliginin scenarioOutline ile propertiesden {string} icerdigini test eder")
    public void sayfaBasligininScenarioOutlineIlePropertiesdenIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(arac)));
    }

    @Then("kullanici verilen bilgiler ile arama yapar")
    public void kullaniciVerilenBilgilerIleAramaYapar(DataTable data) {
        System.out.println(data.asList());//[Araclar, volvo, audi, bmw]
        for (int i = 1; i < data.asList().size(); i++) {
            googlePage.aramaKutusu.sendKeys(data.asList().get(i),Keys.ENTER);
            ReusableMethods.bekle(2);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));
            ReusableMethods.bekle(2);
            googlePage.aramaKutusu.clear();
        }
    }
}
