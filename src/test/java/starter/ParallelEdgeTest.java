package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features="src/test/resources/features/search/search_by_keyword.feature"
//        features = "classpath:features"
)
public class ParallelEdgeTest extends BrowserStackSerenityTest {}
