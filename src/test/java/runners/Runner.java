package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features="src/test/resources/features",
        glue= {"stepdefinitions", "hooks"},
        tags="@invalid_sifre"  ,

        dryRun= false
)

public class Runner {
}
