package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = "seleniumgluecode"
)
public class TestRunner {
    @Before
    private void setSystemProp() {
        System.setProperty( "webdriver.chrome.driver","/src/test/resources/chromedriver/chromedriver");
    }
}
