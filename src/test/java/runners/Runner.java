package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  // spark report plugini
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "./src/test/resources/features",//features folder path
        glue = {"stepdefinitions"},   //stepdefinitions path
        tags = "@US03",
        dryRun = false
)
public class Runner {
}