package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;

public class DataTableStepDefinition {
    DataTablePage tablePage = new DataTablePage();
    @Then("kullanici sayfadaki tabloda new butonuna basar")
    public void kullaniciSayfadakiTablodaNewButonunaBasar() {
        tablePage.newButton.click();
    }

    @Then("kullanici verilen bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciVerilenBilgileriGirer(String name, String lastName, String position, String office, String ext, String date, String salary) {
        tablePage.firstName.sendKeys(name,Keys.TAB,lastName,Keys.TAB,position,Keys.TAB,office,Keys.TAB,ext,Keys.TAB,date,Keys.TAB,salary);
    }

    @And("create buttonuna basar")
    public void createButtonunaBasar() {
        tablePage.createButton.click();
    }

    @Then("kullanici search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String name) {
        tablePage.searchBox.sendKeys(name);
    }

    @And("kullanici {string} ile basirili bir kayit yapildigini dogrular")
    public void kullaniciIleBasiriliBirKayitYapildiginiDogrular(String name) {
        Assert.assertTrue(tablePage.searchVerify.getText().contains(name));
    }
}
