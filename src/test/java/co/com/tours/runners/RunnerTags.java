package co.com.tours.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/pruebas_tour.feature",
        tags = "@stories",
        glue = "co.com.tours.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
