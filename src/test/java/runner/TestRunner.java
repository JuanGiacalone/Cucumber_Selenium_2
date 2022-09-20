package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = "seleniumgluecode",

        plugin= {"json:target/RunCuke/cucumber.json",
                "pretty","html:target/RunCuke/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:resources/cucumbers-reports/report.html"}

        // plugin = "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:resources/cucumber-reports/Run_<Current Time Stamp>/report.html",
)
public class TestRunner {

    public void setup () {

    }

}
