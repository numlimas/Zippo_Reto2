package co.com.zippo.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\co.com.zippo.www.features\\homeExcel.feature",
        glue = "co.com.zippo.www\\stepsDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BuscarExcelRunner {
}
