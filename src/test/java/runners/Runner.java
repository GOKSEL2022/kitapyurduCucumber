package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features="src/test/resources/features",
        glue= {"stepdefinitions", "hooks"},
        tags="@valid_hesap_girisi"  ,

        dryRun= false
)

public class Runner {
}
