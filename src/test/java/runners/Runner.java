package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features="src/test/resources/features",
        glue= {"stepdefinitions", "hooks"},
        tags="@TC02_01"  ,

        dryRun= false
)

public class Runner {
}
