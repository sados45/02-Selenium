package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty->konsolda scenariolar ile ilgili ayrıntılı bilgi verir
                          "html:target/default-cucumber-reports.html",
                          "json:target/json-reports/cucumber.json",
                          "junit:target/xml-report/cucumber.xml"},
                 features = "src/test/resources/features", //features package'ının yolu (content root)
                 glue = "stepDefinitions", //stepDefinitions package ismi
                 tags = "@arac3", //Hangi scenarioları bu tag'ı belirtirsek o scenariolar çalışır
                 dryRun = false, //true seçersek scenariolari kontrol eder browser'ı çalıştırmaz
                 monochrome = true//-->true kullanırsak konsoldaki çıktıları tek renk(siyah) olarak verir
)



public class Runner {
    /*
        @CucumberOptions() bu notasyon sayesinde hangi scenariolari çalıştıracağımızı ve hangi raporları
    alacağımızı belirtiriz
        dryRun parametresi eğer true seçilirse scenariolari çalıştırmadan feature file daki steplerin
    stepDefinition class'ındaki methodlar ile uyuşuğ uyuşmadığını kontrol eder ve browser'ı çalıştırmaz
     */

}
