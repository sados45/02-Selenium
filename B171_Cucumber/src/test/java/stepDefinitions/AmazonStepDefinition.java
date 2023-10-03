package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanici arama kutusunda iphone aratir")
    public void kullanici_arama_kutusunda_iphone_aratir() {

        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @Then("kullanici arama kutusunda samsung aratir")
    public void kullanici_arama_kutusunda_samsung_aratir() {

        amazonPage.aramaKutusu.sendKeys("samsung", Keys.ENTER);
    }

    @Given("kullanici parametreli method ile {string} sayfasina gider")
    public void kullaniciParametreliMethodIleSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("kullanici arama kutusunda {string} aratir")
    public void kullaniciAramaKutusundaAratir(String str) {
        amazonPage.aramaKutusu.sendKeys(str,Keys.ENTER);
    }
}
